package decorator_pattern.concrete_condiment;

import decorator_pattern.abstract_classes.Beverage;
import decorator_pattern.abstract_classes.CondimentDecorator;

public class Milk extends CondimentDecorator{
	
	private Beverage beverage;
	
	public Milk(Beverage beverage) {
		super("Milk");
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.description + ", " + beverage.getDescription();
	}	

	@Override
	public double cost() {
		return 0.10 + beverage.cost();
	}

}
