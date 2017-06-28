package com.TrainingRite;

public class ControlStatements {
	
	public static void main(String[] args) {
		
		//Conditional Logic
		/*
		 * The IF statement - if-then, if-then-else if-else
		 * Switch Statement
		 */
		int temperature = 70;
		if (temperature > 80) {
			System.out.println("Wear sandals");
		}
		else if (temperature <40) {
			System.out.println("Wear a coat");
		}
		else if (temperature == 70) {
			System.out.println("It's your lucky day!");
		}
		else {
			System.out.println("Nice Day");
		}
	}

}
