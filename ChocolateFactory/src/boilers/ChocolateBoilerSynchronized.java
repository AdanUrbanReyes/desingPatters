package boilers;

public class ChocolateBoilerSynchronized {
	private boolean empty, boiled;
	private volatile static ChocolateBoilerSynchronized instance;
	
	private ChocolateBoilerSynchronized() {
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoilerSynchronized getInstance() {
		if(instance == null) {
			synchronized(ChocolateBoilerSynchronized.class){
				if(instance == null) {
					instance = new ChocolateBoilerSynchronized();
				}
			}
		}
		return instance;
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
	
	public void fill() {
		if(isEmpty()) {
			System.out.println("filling the boiler with milk and chocolate");
			empty = boiled = false;
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			System.out.print("draining the boiled milk and chocolate");
			empty = true;
		}
	}
	
	public void boild() {
		if(!isEmpty() && !isBoiled()) {
			System.out.println("bringing the contents to a boil");
			boiled = true;
		}
	}

}
