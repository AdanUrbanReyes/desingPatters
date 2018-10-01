package decorator_pattern.concrete_beverage;

import decorator_pattern.abstract_classes.Beverage;

public class Decaf extends Beverage {

	public Decaf() {
		super("Decaf");
	}
	
	@Override
	public double cost() {
		return 1.05;
	}

}
