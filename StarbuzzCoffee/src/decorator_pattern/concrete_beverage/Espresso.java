package decorator_pattern.concrete_beverage;

import decorator_pattern.abstract_classes.Beverage;

public class Espresso extends Beverage{

	public Espresso() {
		super("Espresso");
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
