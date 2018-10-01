package strategy_pattern.concrete_behavior.quack;

import strategy_pattern.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("squeak squeak");
	}
	
}
