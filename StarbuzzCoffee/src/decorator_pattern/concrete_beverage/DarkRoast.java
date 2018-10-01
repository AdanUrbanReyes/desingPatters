package decorator_pattern.concrete_beverage;

import decorator_pattern.abstract_classes.Beverage;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		super("Dark Roast");
	}
	
	@Override
	public double cost() {
		return 0.99;
	}

}
