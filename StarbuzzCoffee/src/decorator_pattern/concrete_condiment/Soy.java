package decorator_pattern.concrete_condiment;

import decorator_pattern.abstract_classes.Beverage;
import decorator_pattern.abstract_classes.CondimentDecorator;

public class Soy extends CondimentDecorator{

	private Beverage beverage;
	
	public Soy(Beverage beverage) {
		super("Soy");
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.description + ", " + beverage.getDescription();
	}

	@Override
	public double cost() {
		return 0.15 + beverage.cost();
	}

}
