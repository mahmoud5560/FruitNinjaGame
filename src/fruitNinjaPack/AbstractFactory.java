package fruitNinjaPack;


public abstract class AbstractFactory {
	public abstract Dangerous getDangerous(String name);

    public abstract NormalFruit getNormalFruit(String name);

    public abstract SpecialFruits getSpecialFruit(String name);
}
