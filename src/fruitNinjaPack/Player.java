package fruitNinjaPack;


public class Player {
	private static int lives;
	private static int score;
	private static int highScore;
private static Player instance;
	
	private Player(){
		
	}

	public static Player getInstance (){

		if (instance == null)

		instance = new Player();

		return instance;

		}
	public int getLives()
	{
		return lives;
	}
	public int getScore()
	{
		return score;
	}
	public void setScore(int scr)
	{
		score=scr;
	}
	public void setLives(int liv)
	{
		lives=liv;
	}
	public int getHighScore()
	{
		return highScore;
	}
	public void setHighScore(int highScr)
	{
		highScore=highScr;
	}
}
