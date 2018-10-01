package observer_pattern.concrete_observers;

import observer_pattern.interfaces.DisplayElement;
import observer_pattern.interfaces.Observer;
import observer_pattern.interfaces.Subject;

public class WeatherStats implements Observer, DisplayElement{

	private Subject weatherData;
	private double temperature;
	
	public WeatherStats(Subject weatherData) {
		setWeatherData(weatherData);
	}

	public void setWeatherData(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Weather Status : " + (temperature - .5) + "min " + temperature + "avg " + (temperature + .5) + "max");
	}

	@Override
	public void update(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		display();
	}

}
