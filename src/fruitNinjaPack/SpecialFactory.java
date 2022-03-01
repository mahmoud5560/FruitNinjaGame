package fruitNinjaPack;

public class SpecialFactory extends AbstractFactory {
	@Override
    public Dangerous getDangerous(String name) {
		return null;
    }

    @Override
    public NormalFruit getNormalFruit(String name) {
        return null;
    }

	@Override
	public SpecialFruits getSpecialFruit(String name) {
		if (name.equals("GoldMango")) {
            return new GoldMango();
        }
        if (name.equals("GoldApple"))
        {
        	return new GoldApple();
        }
        if (name.equals("Heart"))
        {
        	return new Heart();
        }
        return null;
	}
}
