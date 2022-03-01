package fruitNinjaPack;


public class ObjectsFactory {
	public Objects getObjects(String name) {
        if (name.equals("Bannana")) {
            return new Bannana();
        }
        if (name.equals("Apple")) {
            return new Apple();
        }
        if (name.equals("Watermelon")) {
            return new Watermelon();
        }
        if (name.equals("NormalBomb")) {
            return new NormalBomb();
        }
        if (name.equals("RedBomb")) {
            return new RedBomb();
        }
        if (name.equals("GoldApple")) {
            return new GoldApple();
        }
        if (name.equals("GoldMango")) {
            return new GoldMango();            
            
        }
        if (name.equals("Heart")) {
            return new Heart();            
            
        }
        

        return null;
	}
}
