package objects_adapters;

import interfaces.Duck;
import interfaces.Turkey;

public class DuckAdapter implements Turkey{
	
	public final byte relationFly = 5;
	private Duck duck;
	
	public DuckAdapter(Duck duck) {
		this.duck = duck;
	}
	
	@Override
	public void fly() {
		System.out.println("I'm flying just 1/" + relationFly + " of my capacity");
	}

	@Override
	public void gobble() {
		duck.quack();
	}

	
	
}
