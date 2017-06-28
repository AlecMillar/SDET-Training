package com.TrainingRite;

public class CarApp {

	public static void main(String[] args) {
		Car BMW = new Car();
		BMW.colorType = "Yellow";
		System.out.println("The color is " + BMW.colorType);
		BMW.starts();
		BMW.accelerate();
		BMW.brake();
		BMW.honkHorn();
		
		System.out.println("*****************\n");
		
		Car Mercedes = new Car("Mercedes");
		Mercedes.colorType = "Black";
		System.out.println("The color is " + Mercedes.colorType);
		Mercedes.starts();
		Mercedes.accelerate();
		
		System.out.println("*****************\n");
		
		Car Jeep = new Car(10);
		
		System.out.println("*****************\n");
		
		Car Honda = new Car(5, "Honda");
	}

}
