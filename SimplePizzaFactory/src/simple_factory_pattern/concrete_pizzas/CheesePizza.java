package simple_factory_pattern.concrete_pizzas;

import simple_factory_pattern.interfaces.Pizza;

public class CheesePizza implements Pizza{

	@Override
	public void prepare() {
		System.out.println("Adding ingredients to Cheese Pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking at 50 degress");
	}

	@Override
	public void cut() {
		System.out.println("Cutting trianglely");
	}

	@Override
	public void box() {
		System.out.println("Boxing at 3*3 box");
	}

}
