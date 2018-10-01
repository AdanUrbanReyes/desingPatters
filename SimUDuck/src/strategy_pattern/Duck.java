package strategy_pattern;

import strategy_pattern.interfaces.FlyBehavior;
import strategy_pattern.interfaces.QuackBehavior;

public abstract class Duck {
	
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	protected void swim() {
		System.out.print("all ducks can swim");
	}
	
	public abstract void display();
	
}
