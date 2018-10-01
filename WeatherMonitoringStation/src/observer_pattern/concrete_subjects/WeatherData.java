package observer_pattern.concrete_subjects;

import java.util.ArrayList;

import observer_pattern.interfaces.Observer;
import observer_pattern.interfaces.Subject;

public class WeatherData implements Subject{

	private ArrayList<Observer> observers;
	private double temperature;
	private double humidity;
	private double pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	public double getTemperature() {
		return 1.5;
	}
	
	public double getHumidity() {
		return 1.5;
	}
	
	public double getPressure() {
		return 1.5;
	}
	
	public void setMeasurements(double temperature, double humidity, double pressure) {
		this.temperature = temperature; 
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		int i;
		for(i=0; i < observers.size(); i++) {
			observers.get(i).update(temperature, humidity, pressure);
		}
	}	

}
