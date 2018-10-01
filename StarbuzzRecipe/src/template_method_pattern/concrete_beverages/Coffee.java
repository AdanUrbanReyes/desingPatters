package template_method_pattern.concrete_beverages;

import template_method_pattern.abstract_classes.CaffeineBeverage;

public abstract class Coffee extends CaffeineBeverage{

	@Override
	protected void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding Suggar and Milk");
	}
	
	@Override
	public abstract boolean customerWantsCondiments();
	
}
