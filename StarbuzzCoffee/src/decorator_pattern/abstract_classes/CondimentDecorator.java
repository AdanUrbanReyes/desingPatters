package decorator_pattern.abstract_classes;

public abstract class CondimentDecorator extends Beverage{
	
	public CondimentDecorator(String description) {
		super(description);
	}

	public abstract String getDescription();
}
