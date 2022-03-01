package fruitNinjaPack;


import java.io.File;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Controller {
	
	Player player = Player.getInstance();
	public void onPressPlay(ActionEvent event) throws IOException
	{
		
		player.setLives(3);
		player.setScore(0);
		Parent userPage = FXMLLoader.load(getClass().getResource("Difficulty.fxml"));
		Scene userScene = new Scene(userPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(userScene);
		window.show();
	}
	
	public void onPressLoadPlay(ActionEvent event) throws IOException
	{
		SAXBuilder builder = new SAXBuilder();
	     try{
	         Document readDoc = builder.build(new File ("./src/FruitNinja_saveFile.xml"));

	     String lives=    readDoc.getRootElement().getChild("scene").getChild("save_info").getAttributeValue("lives");
	     String score=    readDoc.getRootElement().getChild("scene").getChild("save_info").getAttributeValue("score");

	     player.setLives(Integer.parseInt(lives));
	     player.setScore(Integer.parseInt(score));
	     
	     }
	     catch(Exception ex){
	         ex.printStackTrace();
	     }
		// load game
		Parent userPage = FXMLLoader.load(getClass().getResource("Difficulty.fxml"));
		Scene userScene = new Scene(userPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(userScene);
		window.show();
	}
	
	public void onPressExit(ActionEvent event)  throws IOException{
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.close();	
	}
	
}