package decorator_pattern.concrete_condiment;

import decorator_pattern.abstract_classes.Beverage;
import decorator_pattern.abstract_classes.CondimentDecorator;

public class Mocha extends CondimentDecorator{

	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		super("Mocha");
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.description + ", " + beverage.getDescription();
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}
