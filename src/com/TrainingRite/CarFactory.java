package com.TrainingRite;

public class CarFactory {
	//Properties
	private String color;
	
	//Constructor
	public CarFactory() {
		System.out.println("NEW CAR");
	}
	
	//Methods
	public void on() {
		System.out.println("The car is turning on!");
	}
	
	public void off() {
		System.out.println("The car is turning off!");
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}

//Child class of CarFactory
class BMW extends CarFactory {
	//Can add additional properties to child class
	public void bluetoothGPS() {
		System.out.println("Navigating with Bluetooth");
	}
	
	//Override Methods - overrides the on() method of the parent class
	@Override
	public void on() {
		System.out.println("The BMW is turning on!");
	}
}