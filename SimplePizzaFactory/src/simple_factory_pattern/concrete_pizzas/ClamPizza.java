package simple_factory_pattern.concrete_pizzas;

import simple_factory_pattern.interfaces.Pizza;

public class ClamPizza implements Pizza{

	@Override
	public void prepare() {
		System.out.println("Adding ingredients to Clam Pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking at 70 degress");
	}

	@Override
	public void cut() {
		System.out.println("Cutting circlely");
	}

	@Override
	public void box() {
		System.out.println("Boxing at 3.5*3.5 box");
	}

}
