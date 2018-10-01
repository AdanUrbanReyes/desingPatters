package simple_factory_pattern.concrete_pizzas;

import simple_factory_pattern.interfaces.Pizza;

public class PepperoniPizza implements Pizza{

	@Override
	public void prepare() {
		System.out.println("Adding ingredients to Pepperoni Pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking at 100 degress");
	}

	@Override
	public void cut() {
		System.out.println("Cutting rectangularily");
	}

	@Override
	public void box() {
		System.out.println("Boxing at 4.5*4.5 box");
	}

}
