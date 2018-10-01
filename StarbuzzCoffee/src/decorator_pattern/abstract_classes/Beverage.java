package decorator_pattern.abstract_classes;

public abstract class Beverage {

	protected String description;
	
	public Beverage(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
	
}
