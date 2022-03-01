package fruitNinjaPack;


public class DangerousFactory extends AbstractFactory {
    @Override
    public Dangerous getDangerous(String name) {
        if (name.equals("RedBomb")) {
            return new RedBomb();
        }
        if (name.equals("Bomb"))
        {
        	return new NormalBomb();
        }
        return null;
    }

    @Override
    public NormalFruit getNormalFruit(String name) {
        return null;
    }

	@Override
	public SpecialFruits getSpecialFruit(String name) {
		return null;
	}
}
