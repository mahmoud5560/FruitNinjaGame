package fruitNinjaPack;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class DifficultyController {
	public static int time;
	
	@FXML
	Button easy;
	
	@FXML
	Button medium;
	
	@FXML
	Button hard;
	@FXML
	Label ChooseLabel;
	
	
	boolean easypressed=false;
	boolean mediumpressed=false;
	boolean hardpressed=false;

	Difficulty_chooser dc=new Difficulty_chooser();

public void onPressEasy(ActionEvent event) throws IOException{
Command easycommand=new easy_Difficulty();
dc.setcommand(easycommand);
dc.doCommand();

	easypressed=true;
	easy.setEffect(new InnerShadow());
	medium.setEffect(null);
hard.setEffect(null);
Parent userPage = FXMLLoader.load(getClass().getResource("Level.fxml"));
Scene userScene = new Scene(userPage);
Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
window.setScene(userScene);
window.show();

	
}
	
public void onPressMedium(ActionEvent event) throws IOException{
	Command mediumcommand=new medium_diificulty();
	dc.setcommand(mediumcommand);
	dc.doCommand();
	mediumpressed=true;
	medium.setEffect(new InnerShadow());
	easy.setEffect(null);
	hard.setEffect(null);
	Parent userPage = FXMLLoader.load(getClass().getResource("Level.fxml"));
	Scene userScene = new Scene(userPage);
	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	window.setScene(userScene);
	window.show();

}
public void onPressHard(ActionEvent event) throws IOException{
	Command Hardcommand=new Hard_difficulty();
	dc.setcommand(Hardcommand);
	dc.doCommand();
	hardpressed=true;
	hard.setEffect(new InnerShadow());
	easy.setEffect(null);
	medium.setEffect(null);
	Parent userPage = FXMLLoader.load(getClass().getResource("Level.fxml"));
	Scene userScene = new Scene(userPage);
	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	window.setScene(userScene);
	window.show();

}

}
