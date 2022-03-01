package fruitNinjaPack;

public class Difficulty_chooser {
	
private Command command;
public void setcommand(Command setcommand) {
	
	command=setcommand;
	
}
public void doCommand() {
	
	command.execute();
}

}
