package factory_pattern.abstract_classes;

import java.util.ArrayList;

public abstract class Pizza {
	
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<String>(); 
	
	public Pizza(String name, String dough, String sauce) {
		this.name = name;
		this.dough = dough;
		this.sauce = sauce;
	}
	
	public void prepare() {
		int i;
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for(i=0; i < toppings.size() ; i++) {
			System.out.println("\t" + toppings.get(i));	
		}
	}
	
	public abstract void bake();
	
	public abstract void cut();
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
}
