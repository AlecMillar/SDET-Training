package com.TrainingRite;

public class Methods {

	public static void main(String[] args) {
		// 
		message();
		computeSum(5,10);
		double avg = computeAverage(12,20);
		System.out.println("The average between numbers 12 and 20 is " + avg);
		//String testResult = doTest();
		System.out.println(doTest());
	}
/*
 *												 METHODS
 */
	public static void message() {
		System.out.println("Here is my message");
	}
	
	public static void computeSum(int numA, int numB) {
		// Compute the sum of two numbers
		int sum = numA + numB;
		System.out.println("The sum of numbers " + numA + " and " + numB + " is " + sum);
	}
	
	public static double computeAverage(int numA, int numB) {
		double averageValue = (numA + numB)/2;
		return averageValue;
	}
	
	public static String doTest() {
		// Business Logic for test steps
		//IF THEN ELSE
		return "Test Passed";
	}
}
