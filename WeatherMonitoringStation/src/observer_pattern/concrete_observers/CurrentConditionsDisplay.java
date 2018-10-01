package observer_pattern.concrete_observers;

import observer_pattern.interfaces.DisplayElement;
import observer_pattern.interfaces.Observer;
import observer_pattern.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

	private Subject weatherData;
	private double temperature;
	private double humidity;
	private double pressure;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		setWeatherData(weatherData);
	}
	
	public void setWeatherData(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions : " + temperature + "F degrees and " + humidity + "% humidity and pressure " + pressure + "Pa");
	}

	@Override
	public void update(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
