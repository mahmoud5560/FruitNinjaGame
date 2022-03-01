package fruitNinjaPack;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class levelController  {
	
	static int counter;
	Player player = Player.getInstance();
	@FXML
	ImageView lose;
	Image fruit1Image ;
	@FXML
	ImageView live1;
	
	@FXML
	ImageView live2;
	
	@FXML
	ImageView live3;
	
	@FXML
	ImageView fruitImage1;
	
	@FXML
	ImageView bannanaImage;
	
	@FXML
	ImageView slicedappleImageleft;
	
	@FXML
	ImageView slicedappleImageright;
	
	@FXML 
	ImageView gold;
	
	@FXML
	ImageView slicedbannanaImageleft;
	
	@FXML
	ImageView slicedbannanaImageright;
	
	@FXML
	ImageView watermelon;
	
	@FXML
	ImageView slicedWatermelon;
	
	@FXML
	ImageView goldApple;
	
	@FXML
	ImageView goldMango;
	
	@FXML
	ImageView bombImage;
	
    @FXML
	ImageView redBombImage;
	
	@FXML 
	AnchorPane ap;
	
	@FXML
    Label score;
	
	@FXML
	Label highScore;
	
	@FXML
	ImageView boom;
	
	SwipeAction swipe;
	
	int time=DifficultyController.time;
	
	 final Duration SEC_Whole = Duration.millis(time);
	 final Duration SEC_Sliced_Fall = Duration.millis(750);
	 final Duration SEC_Slice = Duration.millis(750);
	  
	 Timeline timeline = new Timeline();
     DoubleProperty yValue = new SimpleDoubleProperty();

	
	public void initialize() {
		
		counter=-1;
	
		System.out.println(player.getLives()+"afdsrhdfj");
		if(player.getLives()==3)
		{
			live1.setVisible(true);
			live2.setVisible(true);
			live3.setVisible(true);
		}
		else if(player.getLives()==2)
		{

			live1.setVisible(false);
			live2.setVisible(true);
			live3.setVisible(true);
		}
		else if (player.getLives()==1)
		{
			live1.setVisible(false);
			live2.setVisible(false);
			live3.setVisible(true);
		}
		else
		{
			live1.setVisible(false);
			live2.setVisible(false);
			live3.setVisible(false);
		}
		if(live3.isVisible())
		{
		player.setScore(player.getScore());
		System.out.println("aaaaaaaaa"+ player.getLives());
		player.setLives(player.getLives());
     score.setText(player.getScore()+"");
     
     SAXBuilder builder = new SAXBuilder();
     try{
         Document readDoc = builder.build(new File ("./src/FruitNinja_saveFile.xml"));

     String high=    readDoc.getRootElement().getChild("scene").getChild("save_info").getAttributeValue("highscore");

     player.setHighScore(Integer.parseInt(high));
     highScore.setText(player.getHighScore()+"");
     

     }
     catch(Exception ex){
         ex.printStackTrace();
     }
		click();		
		}
		else
		{
			player.setLives(0);
			lose.setVisible(true);
		}
	}
	
	
	Objects fruit;
	String s;
	int x;
	Random rand;
	ObjectsFactory object;
	List<String> list;
public void click() {
	System.out.println(player.getLives()+"<><><>><<>");
	if(player.getLives()==3)
	{
		live1.setVisible(true);
		live2.setVisible(true);
		live3.setVisible(true);
	}
	else if(player.getLives()==2)
	{

		live1.setVisible(false);
		live2.setVisible(true);
		live3.setVisible(true);
	}
	else if (player.getLives()==1)
	{
		live1.setVisible(false);
		live2.setVisible(false);
		live3.setVisible(true);
	}
	else
	{
		live1.setVisible(false);
		live2.setVisible(false);
	    live3.setVisible(false);
	    
	
	}
    if(player.getLives()<0)
    {
    	player.setLives(0);
    }
	
	if(player.getLives()!=0)
	{
		System.out.println(counter+"dgfhsdgn");
	System.out.println("Lives:"+player.getLives()); 
	object = new ObjectsFactory();
	 list = new ArrayList<String>();
    list.add("Bannana");
    list.add("Apple");
    list.add("GoldApple");     
    list.add("GoldMango");                                             
    list.add("RedBomb");                                              
    list.add("NormalBomb");                                           
    list.add("Watermelon");     
    list.add("Heart");
    rand = new Random();
    x =rand.nextInt(8);
    s = list.get(x);
 fruit = object.getObjects(s);
    switch (fruit.getImage()) {//
	case "appleImage":
	{
		
			fruit1Image = new Image(getClass().getResourceAsStream("/fruitNinjaPack/Images/fullRedApples1.png"));
			fruitImage1.setImage(fruit1Image);
			counter=1;
		
		break;
	}
		case "bannanaImage":
		{
			fruit1Image = new Image(getClass().getResourceAsStream("/fruitNinjaPack/Images/fullBannana.png"));
			fruitImage1.setImage(fruit1Image);
			counter=2;
			break;
		}	
		case "watermelonImage":
		{
			fruit1Image = new Image(getClass().getResourceAsStream("/fruitNinjaPack/Images/fullWatermelon.png"));
			fruitImage1.setImage(fruit1Image);
			counter=3;
			break;
		}	
		case "goldAppleImage":
		{
			fruit1Image = new Image(getClass().getResourceAsStream("/fruitNinjaPack/Images/fullGoldApples.png"));
			fruitImage1.setImage(fruit1Image);
			counter=4;
			break;
		}	
		case "goldMangoImage":
		{
			fruit1Image = new Image(getClass().getResourceAsStream("/fruitNinjaPack/Images/fullGoldMango.png"));
			fruitImage1.setImage(fruit1Image);	
			counter=5;
			break;
		}	
		case "bombImage":
		{
			fruit1Image = new Image(getClass().getResourceAsStream("/fruitNinjaPack/Images/bomb.png"));
			fruitImage1.setImage(fruit1Image);	
			counter=6;
			break;
		}	
		case "redBombImage":
		{
			fruit1Image = new Image(getClass().getResourceAsStream("/fruitNinjaPack/Images/RedBomb.png"));
			fruitImage1.setImage(fruit1Image);	
			counter=7;
			break;
		}
		case "heartImage":
		{
			fruit1Image = new Image(getClass().getResourceAsStream("/fruitNinjaPack/Images/heart.ngsversion.1396531395268.adapt.1900.png"));
			fruitImage1.setImage(fruit1Image);	
			counter=8;
			break;
		}
		default:
		break;
	}
    if(counter<6)
    {
    	player.setLives(player.getLives()-1);
    }
	slicedappleImageleft.setVisible(false);
	slicedappleImageright.setVisible(false);
	
	Random randx=new Random();
	fruitImage1.setX(((double)randx.nextInt(750))-350);
	
	
	fruitImage1.setY(0);
	fruitImage1.setVisible(true);

	KeyFrame Whole_fall = new KeyFrame(SEC_Whole,
              new KeyValue(fruitImage1.yProperty(), 600));
      

      timeline.getKeyFrames().add(Whole_fall);
      timeline.play();
//      timelineTimer.setCycleCount(Timeline.INDEFINITE);
//      timelineTimer.getKeyFrames().add(
//    	
	    yValue.bind(fruitImage1.yProperty());


	  
	  

yValue.addListener((observable, oldvalue, newvalue) ->{	 
});
System.out.println("dsgfhgfghdfdgs----->"+fruit.getDanger());


timeline.setOnFinished(e->click()); 
	}
	else
	{
		player.setLives(0);
		lose.setVisible(true);
	}
}



public void SliceObject(Event event) throws IOException {
	
	System.out.println(player.getLives());
	player.setLives(player.getLives()+fruit.getDanger());
	System.out.println(player.getLives());
	swipe = new SwipeAction(fruit);
	Label1 labelOb = new Label1(score);
	swipe.register(labelOb);
	swipe.increase();
	if (player.getScore()>player.getHighScore())
	{
		player.setHighScore(player.getScore());
		highScore.setText(player.getScore()+"");
	}
	if(player.getLives()==3)
	{
		live1.setVisible(true);
		live2.setVisible(true);
		live3.setVisible(true);
	}
	else if(player.getLives()==2)
	{

		live1.setVisible(false);
		live2.setVisible(true);
		live3.setVisible(true);
	}
	else if (player.getLives()==1)
	{
		live1.setVisible(false);
		live2.setVisible(false);
		live3.setVisible(true);
	}
	else
	{
		live1.setVisible(false);
		live2.setVisible(false);
	    live3.setVisible(false);
	    
	
	}
	
	Timeline Slice_time = new Timeline();
	Timeline Slice_fall_time = new Timeline();
    timeline.stop();
    fruitImage1= (ImageView) event.getSource();
    if(counter==1)
    {
    slicedappleImageleft.setY(fruitImage1.getY());
    slicedappleImageright.setY(fruitImage1.getY());
    slicedappleImageleft.setX(fruitImage1.getX()+1);
    slicedappleImageright.setX(fruitImage1.getX()-1);
	slicedappleImageleft.setVisible(true);
	slicedappleImageright.setVisible(true);
	player.setLives(player.getLives()+1);
    }
    if(counter==2)
    {
    slicedbannanaImageleft.setY(fruitImage1.getY());
    slicedbannanaImageright.setY(fruitImage1.getY());
    slicedbannanaImageleft.setX(fruitImage1.getX()+1);
    slicedbannanaImageright.setX(fruitImage1.getX()-1);
    slicedbannanaImageleft.setVisible(true);
	slicedbannanaImageright.setVisible(true);
	player.setLives(player.getLives()+1);
    }
    if(counter==3)
    {
    slicedWatermelon.setY(fruitImage1.getY());
    slicedWatermelon.setX(fruitImage1.getX()+1);
    slicedWatermelon.setVisible(true);   
    player.setLives(player.getLives()+1);
    }
    if(counter==4)
    {
    	gold.setY(fruitImage1.getY());
        gold.setX(fruitImage1.getX()+1);
        gold.setVisible(true);   
        player.setLives(player.getLives()+1);
        }
    if(counter==5)
    {
   gold.setY(fruitImage1.getY());
    gold.setX(fruitImage1.getX()+1);
    gold.setVisible(true);   
    player.setLives(player.getLives()+1);
    }
    if(counter==6)
    {
    boom.setY(fruitImage1.getY());
    boom.setX(fruitImage1.getX()+1);
    boom.setVisible(true);   
    }
    if(counter==7)
    {
        boom.setY(fruitImage1.getY());
        boom.setX(fruitImage1.getX()+1);
        boom.setVisible(true);
        }
    if(counter==8)
    {
    	if(player.getLives()<3)
    	{
    	player.setLives(player.getLives()+1);
    	}
    }
    if(player.getLives()==3)
	{
		live1.setVisible(true);
		live2.setVisible(true);
		live3.setVisible(true);
	}
	else if(player.getLives()==2)
	{

		live1.setVisible(false);
		live2.setVisible(true);
		live3.setVisible(true);
	}
	else if (player.getLives()==1)
	{
		live1.setVisible(false);
		live2.setVisible(false);
		live3.setVisible(true);
	}
	else
	{
		live1.setVisible(false);
		live2.setVisible(false);
	    live3.setVisible(false);
	    
	
	}
	fruitImage1.setVisible(false);
       KeyFrame Slice = new KeyFrame(SEC_Slice,
               new KeyValue(slicedappleImageleft.xProperty(), -35),
               new KeyValue(slicedbannanaImageleft.xProperty(), -35),
               new KeyValue(slicedappleImageright.xProperty(), 35),
               new KeyValue(slicedbannanaImageright.xProperty(), 35),
               new KeyValue(slicedWatermelon.xProperty(), 35),
               new KeyValue(boom.xProperty(), 35),
       new KeyValue(gold.xProperty(), 35));
       Slice_time.getKeyFrames().add(Slice);
       Slice_time.play();
	
	KeyFrame Sliced_Fall = new KeyFrame(SEC_Sliced_Fall,
               new KeyValue(slicedappleImageleft.yProperty(), 500),
               new KeyValue(slicedappleImageright.yProperty(), 500),
	new KeyValue(slicedbannanaImageleft.yProperty(), 580),
    new KeyValue(slicedbannanaImageright.yProperty(), 580),
    new KeyValue(slicedWatermelon.yProperty(), 580),
    new KeyValue(gold.yProperty(), 580),
    new KeyValue(boom.yProperty(), 580));
	Slice_fall_time.getKeyFrames().add(Sliced_Fall);
       Slice_fall_time.play();
   
     Slice_fall_time.setOnFinished(e->click());  
} 



public void onPressSave(ActionEvent event) throws IOException{
	timeline.stop();
	if (counter<6)
	{
		player.setLives(player.getLives()+1);
	}
	Care_taker caretaker=new Care_taker();
	Originator orig=new Originator();
	ArrayList<Integer> testList=new ArrayList<Integer>();
	
	
	Save saveobj=new Save(player.getLives(),player.getScore(),player.getHighScore());
	
saveobj.writeXML();

Parent userPage = FXMLLoader.load(getClass().getResource("GameMainMenu.fxml"));
Scene userScene = new Scene(userPage);
Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
window.setScene(userScene);
window.show();
}

		
	}	


	
	


