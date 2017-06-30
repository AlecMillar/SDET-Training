package homework.NumbersFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFactoryApp {

	public static void main(String[] args) {
		
		//Defines Array List to store numbers into
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		// Sets the amount of numbers to be put into the ArrayList
		// And generates the ArrayList
		System.out.print("Enter the amount of numbers to be generated in the list: ");
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		numberList = generateList(amount);
		System.out.println("Array: " + numberList);
		
		// Finds the maximum value
		int max = findMax(numberList);
		System.out.println(max);
		
		//Sort Array
		int k;
		int length = numberList.size();
		for (int m = 0; m <= length; m++) {
			for (int i = 0; i<length-1; i++) {
				k = i + 1;
				if (numberList.get(i).intValue() > numberList.get(k).intValue()) {
					int temp = numberList.get(i).intValue();
					numberList.set(i, numberList.get(k).intValue());
					numberList.set(k, temp);
					System.out.println("Swapping " + numberList.get(i)+ " and " + numberList.get(k));
					System.out.println("New Array: " + numberList + "\n");
				}
			}
		}
		
		// Finds median of ArrayList
		int median = findMedian(numberList);
		System.out.println("The median is: " + median);
		
		// Finds average of ArrayList
		double average = findAverage(numberList);
		System.out.println("The average is: " + average);
		
		// Finds number of duplicate numbers in ArrayList
		int duplicate = 0;
		for (int a = 0; a <= length; a++) {
			for(int i = a+1; i<length; i++) {
				if (numberList.get(a).intValue() == numberList.get(i).intValue()) {
					duplicate++;
				}
			}
		}
		// If there are duplicates, this if-else will report how many
		// If there are no duplicates, it will say so.
		if (duplicate > 0) {
			System.out.println("There is(are) " + duplicate + " duplicated number(s) in the list.");
		}
		else {
			System.out.println("There are no duplicated numbers in the list.");
		}
	}
	
	/*
	 * *****METHODS*****
	 */
	
	// Method to randomly fill an ArrayList
	public static ArrayList<Integer> generateList(int j) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < j; i++) {
			list.add((int) (Math.random()*100));
		}
		return list;
	}
	// Method to determine maximum value of ArrayList
	public static int findMax(ArrayList<Integer> list) {
		int max = list.get(0);
		for (int i : list) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
	// Method to determine median value of ArrayList.
	// With an even amount of numbers, method will
	// Return the first of the two middle numbers.
	public static int findMedian(ArrayList<Integer> list) {
		int length = list.size();
		int medianPos = length/2;
		int median = list.get(medianPos);
		return median;
	}
	// Method to find the average value of ArrayList
	public static double findAverage(ArrayList<Integer> list) {
		double sum = 0;
		double length = list.size();
		for(int value : list) {
			sum = sum + value;
		}
		return sum/length; 
	}
}
