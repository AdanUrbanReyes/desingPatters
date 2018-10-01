package simulators;

import java.util.ArrayList;
import java.util.Enumeration;

import concrete_ducks.MallardDuck;
import concrete_turkeys.WildTurkey;
import interfaces.Duck;
import interfaces.Turkey;
import objects_adapters.DuckAdapter;
import objects_adapters.IteratorEnumerationAdapter;
import objects_adapters.TurkeyAdapter;

public class TestDrive {

	/*
	 * Adapter Pattern
	 * Definition: converts the interface of a class
	 * into another interface the client expect.
	 * Adapter lets classes work together that
	 * couln't otherwise because of incompatible interfaces
	 * */
	
	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
	
	public static void testTurkey(Turkey turkey) {
		turkey.gobble();
		turkey.fly();
	}
	
	public static void main(String []args) {
		MallardDuck mallarDuck = new MallardDuck();
		WildTurkey wildTurkey = new WildTurkey();
		Duck duckAdapted = new TurkeyAdapter(wildTurkey);
		Turkey turkeyAdapted = new DuckAdapter(mallarDuck);
		System.out.println("The wild turkey says...");
		testTurkey(wildTurkey);
		System.out.println("The mallard duck says...");
		testDuck(mallarDuck);
		System.out.println("The tukey adapted to a duck says...");
		testDuck(duckAdapted);
		System.out.println("The duck adapted to a turkey says...");
		testTurkey(turkeyAdapted);
		
		
		ArrayList<String> beutyGirls = new ArrayList<String>();
		beutyGirls.add("Kelly");
		beutyGirls.add("Tania");
		beutyGirls.add("Areli");

		Enumeration<String> enumerationAdapted = new IteratorEnumerationAdapter<String>(beutyGirls.iterator());
		
		System.out.println("List of beauty girl who work in Grupo Salinas");
		while(enumerationAdapted.hasMoreElements()) {
			System.out.println(enumerationAdapted.nextElement());
		}
		
		
	}
	
}
