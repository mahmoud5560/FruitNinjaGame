package fruitNinjaPack;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FruitNinjaGame extends Application {

	public static void main (String[]args)
	{
       launch (args);		
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("GameMainMenu.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public static List<Objects> returnObjects( )
	{
		List<Objects> list = new ArrayList<>();
		ObjectsFactory factory = new ObjectsFactory();
		list.add(factory.getObjects("Apple"));
		list.add(factory.getObjects("Bannana"));
		list.add(factory.getObjects("Watermelon"));
		list.add(factory.getObjects("NormalBomb"));
		list.add(factory.getObjects("RedBomb"));
		list.add(factory.getObjects("GoldApple"));
		list.add(factory.getObjects("GoldMango"));
	    
		return list;
	}
	
	public static void addScore(Objects obj)
	{
		Player player =Player.getInstance();
		player.setScore(player.getScore()+obj.getScore());
		
	}
	
	public static void loseLives(Objects obj)
	{
		Player player = Player.getInstance();
		player.setLives(player.getLives()-obj.getDanger());
	}
	
	

}
