package simulators;

import observer_pattern.concrete_observers.CurrentConditionsDisplay;
import observer_pattern.concrete_observers.WeatherStats;
import observer_pattern.concrete_subjects.WeatherData;

/*
 * THE OBSERVER PATTERN
 * Definition:
 * Define a one-to-many dependency between objects
 * so that when one object changes state, all of
 * its dependents are notified and updated automatically.
 * 
 * Design Principles:
 * 
 * Strive for loosely coupled designs
 * between objects that interact.
 * 
 * */

public class WeatherStation {

	public static void main(String []args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		WeatherStats weatherStats = new WeatherStats(weatherData);
		
		weatherData.setMeasurements(1,3,7);
		weatherData.setMeasurements(1.3,3.3,7.3);
		weatherData.removeObserver(currentConditionsDisplay);
		weatherData.setMeasurements(1.7,3.7,7.7);
		weatherData.removeObserver(weatherStats);
		weatherData.setMeasurements(1.1,3.1,7.1);
	}
	
}
