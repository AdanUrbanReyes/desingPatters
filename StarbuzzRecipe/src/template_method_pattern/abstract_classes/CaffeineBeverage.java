package template_method_pattern.abstract_classes;

public abstract class CaffeineBeverage {
	
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) {
			addCondiments();	
		}
	}
	
	protected abstract void brew();
	
	protected abstract void addCondiments();
	
	private void boilWater() {
		System.out.println("Boiling water");
	}
	
	private void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	/***
	 * This is a hook it does not nothing, but clients can override it
	 * @return
	 */
	public boolean customerWantsCondiments() {
		return true;
	}
	
}
