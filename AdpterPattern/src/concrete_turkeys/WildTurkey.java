package concrete_turkeys;

import interfaces.Turkey;

public class WildTurkey implements Turkey{

	@Override
	public void fly() {
		System.out.println("I am flying a short distance");
	}

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	
}
