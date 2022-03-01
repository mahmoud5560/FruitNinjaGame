package fruitNinjaPack;

public class NormalFruitFactory extends AbstractFactory{
	@Override
    public Dangerous getDangerous(String name) {
		return null;
    }

    @Override
    public NormalFruit getNormalFruit(String name) {
    	if (name.equals("Bannana")) {
            return new Bannana();
        }
        if (name.equals("Apple"))
        {
        	return new Apple();
        }
        if (name.equals("Watermelon"))
        {
        	return new Watermelon();
        }
    	return null;
    }

	@Override
	public SpecialFruits getSpecialFruit(String name) {
		
        return null;
	}
}
