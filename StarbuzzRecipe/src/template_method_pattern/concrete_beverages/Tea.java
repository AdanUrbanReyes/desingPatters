package template_method_pattern.concrete_beverages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import template_method_pattern.abstract_classes.CaffeineBeverage;

public class Tea extends CaffeineBeverage{

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
	protected void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding Lemon");
	}

	@Override
	public boolean customerWantsCondiments() {
		return (getUserInput().startsWith("y")) ? true : false;	
	}
	
}
