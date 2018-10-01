package strategy_pattern.concrete_behavior.fly;

import strategy_pattern.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can fly with rocket!");
	}
	
}
