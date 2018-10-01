package simulators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import template_method_pattern.concrete_beverages.Coffee;
import template_method_pattern.concrete_beverages.Tea;

public class StarbuzzCaffeine {

	/*
	 * Template Method Pattern
	 * Definition: Defines the skeleton of an algorithm
	 * in a method, deferring some steps to subclasses.
	 * Template Method lets subclasses redefine certain
	 * steps of an algorithm without changing the 
	 * algorithm's structure.
	 * */
	
	public static void main(String[] args) {
		Coffee coffee = new Coffee() {
			
			public String getUserInput() {
				String answer = "no";
				System.out.println("Would you like milk and suggar with your coffee (y/n)? ");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				try {
					answer = br.readLine();
				}catch(IOException ioe) {
					System.out.println("IO error trying to read your answer");
				}
				return answer;
			}			
			
			@Override
			public boolean customerWantsCondiments() {
				return (getUserInput().startsWith("y")) ? true : false;
			}
		};
		coffee.prepareRecipe();
		Tea tea = new Tea();
		tea.prepareRecipe();
	}
	
}
