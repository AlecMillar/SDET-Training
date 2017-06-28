package com.TrainingRite;

public class Car {
	// Properties - State - Adjectives
	String colorType;
	double horsePower;
	String interiorMaterial;
	
	//Constructors are unique methods:
	/*
	 * 1. They are the same name as the class itself
	 * 2. They run implicitly at time of object instantiation
	 * 3. Used to initialize properties
	 * 4. No return type
	 */
	public Car() {
		System.out.println("NEW CAR CREATED!");
	}
	//Method Overloading: Same Name -- Different Arguments
	public Car(String carType) {
		System.out.println("NEW CAR CREATED OF TYPE: " + carType);
	}
	public Car(int numberOfCars) {
		System.out.println("CREATED NEW CARS, QTY: " + numberOfCars);
	}
	public Car(int numberOfCars, String carType) {
		System.out.println("CREATING " + numberOfCars + " NEW CARS OF TYPE " + carType);
	}
	
	// Actions - Behavior - Verbs
	public void starts() {
		System.out.println("Car is starting");
	}
	
	public void brake() {
		System.out.println("Car is braking");
	}
	
	public void accelerate() {
		System.out.println("Car is accelerating");
	}
	
	public void honkHorn() {
		System.out.println("Car is honking horn");
	}

	

}
