package strategy_pattern.concrete_behavior.fly;

import strategy_pattern.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("fly no way");
	}
	
}
