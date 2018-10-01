package decorator_pattern.concrete_beverage;

import decorator_pattern.abstract_classes.Beverage;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		super("HouseBlend");
	}
	
	
	@Override
	public double cost() {
		return 0.89;
	}

}
