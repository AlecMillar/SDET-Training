package com.TrainingRite;

public class NumbersFactory {

	static int localArray[] = {5, 10, 20, 15, 35, 2, 75, 40};
	
	public static void main(String[] args) {
		
		//Find the maximum value
		int arrayMax = findMax(localArray);
		System.out.println("The maximum number in the array is: " + arrayMax);
		
		//Sort array
		int k;
		int length = localArray.length;
		for (int m=length; m >= 0; m--) {
			for (int i=0; i<length-1; i++) {
				k = i + 1;
				if (localArray[i] > localArray[k]) {
					int low = localArray[k];
					int high = localArray[i];
					System.out.print(high + " is greater than " + low + "\n");
					System.out.println("Swap " + high + " with " + low);
					swap(i, k);
					showArray();
				}
			}
		}

	}

	public static int findMax(int array[]) {
		//Set the initial max to the first item
		int max = array[0];
		for (int i : array) {
			if (i > max) {
				max = i;
			}
		}
		
		return max;
	}
	
	public static void swap(int a, int b) {
		int temp = localArray[a];
		localArray[a] = localArray[b];
		localArray[b] = temp;
	}
	
	public static void showArray() {
		for (int value : localArray){
			System.out.print(value + "  ");
		}
	}
	
}
