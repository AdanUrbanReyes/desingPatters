package simulators;

import strategy_pattern.concrete_behavior.fly.FlyRocketPowered;
import strategy_pattern.concrete_ducks.MallardDuck;
import strategy_pattern.concrete_ducks.ModelDuck;

/*
 * STRATEGY PATTERN
 * Definition:
 * Define a family of algorithms, encapsulate each one,
 * and makes them interchangeable.
 * Strategy lets the algorithm vary independently from
 * client that use it. 
 * 
 * Design Principles: 
 * 
 * Identify the aspects of your application that vary
 * and separate them from what stays the same.
 * 
 * Program to an interface, not an implementation.
 * 
 * Favor composition over inheritance
 * */

public class MiniDuckSimulator {

	public static void main(String []args) {
		MallardDuck mallardDuck_md = new MallardDuck();
		mallardDuck_md.performFly();
		mallardDuck_md.performQuack();
		
		ModelDuck modelDuck_md = new ModelDuck();
		modelDuck_md.performFly();
		modelDuck_md.performQuack();
		modelDuck_md.setFlyBehavior(new FlyRocketPowered());
		modelDuck_md.performFly();
		
	}
	
}
