package strategy_pattern.concrete_ducks;

import strategy_pattern.Duck;
import strategy_pattern.concrete_behavior.fly.FlyNoWay;
import strategy_pattern.concrete_behavior.quack.Squeak;

public class ModelDuck extends Duck{

	public ModelDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Squeak());
		display();
	}
	
	@Override
	public void display() {
		System.out.println("I am just a beautiful duck");
	}
	
}
