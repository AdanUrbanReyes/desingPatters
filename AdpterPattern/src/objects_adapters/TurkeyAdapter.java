package objects_adapters;

import interfaces.Duck;
import interfaces.Turkey;

public class TurkeyAdapter implements Duck{

	public final byte relationFly = 5;
	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	@Override
	public void fly() {
		int i;
		for(i = 0; i < relationFly; i++) {
			turkey.fly();
		}
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

}
