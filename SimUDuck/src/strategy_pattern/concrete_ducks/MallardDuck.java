package strategy_pattern.concrete_ducks;

import strategy_pattern.Duck;
import strategy_pattern.concrete_behavior.fly.FlyWithWings;
import strategy_pattern.concrete_behavior.quack.Quack;

public class MallardDuck extends Duck{

	public MallardDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
		display();
	}
	
	@Override
	public void display() {
		System.out.println("I am a real mallard duck");
	} 
	
}
