package com.TrainingRite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OneOnOne {

	public static void main(String[] args) {
		int array[] = new int[10];
		//1. Read the file
		//2. find the sum
		//3. print result
		String filename = "C:\\Users\\Alec\\Google Drive\\Work\\SDET Training\\numbers.txt";
		readFile(filename, array);
		int sumOfNumbers = sumNumbers(array);
		showSum(sumOfNumbers);

	}
	
	public static void readFile(String filename, int array[]) {
		File file = new File(filename);
		String numbers = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for(int i = 0; i < 10; i++ ) {
				numbers = br.readLine();
				array[i] = Integer.parseInt(numbers);
				//System.out.println(array[i]);
			}
		}
		catch (FileNotFoundException e){
			System.out.println("The file was not found. " + e.toString());
		}
		catch (IOException e) {
			System.out.println("There was an error reading the file. " + e.toString());
		}
		System.out.println("The file was read.");
	}
	
	public static int sumNumbers(int array[]) {
		int sum = 0;
		for (int value : array) {
			try {
				System.out.println(value);
			sum = sum + value;
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index is out of bounds.");
			}
		}
		System.out.println(sum);
		return sum;
	}
	public static void showSum(int sum) {
		System.out.println("The total sum of the numbers is " + sum);
	}
}
