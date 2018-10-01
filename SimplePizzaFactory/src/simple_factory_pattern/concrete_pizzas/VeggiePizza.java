package simple_factory_pattern.concrete_pizzas;

import simple_factory_pattern.interfaces.Pizza;

public class VeggiePizza implements Pizza{

	@Override
	public void prepare() {
		System.out.println("Adding ingredients to Veggie Pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking at 30 degress");
	}

	@Override
	public void cut() {
		System.out.println("Cutting quarely");
	}

	@Override
	public void box() {
		System.out.println("Boxing at 4*4 box");
	}

}
