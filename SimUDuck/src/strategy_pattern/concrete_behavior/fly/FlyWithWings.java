package strategy_pattern.concrete_behavior.fly;

import strategy_pattern.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("flying with wings!");
	}

	
}
