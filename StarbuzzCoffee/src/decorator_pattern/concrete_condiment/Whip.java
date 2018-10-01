package decorator_pattern.concrete_condiment;

import decorator_pattern.abstract_classes.Beverage;
import decorator_pattern.abstract_classes.CondimentDecorator;

public class Whip extends CondimentDecorator{

	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		super("Whip");
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
