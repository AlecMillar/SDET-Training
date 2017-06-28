package com.TrainingRite.Collections;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<String> stringArray = new ArrayList<String>();
		stringArray.add("New York");
		stringArray.add("San Fransico");
		stringArray.add("Dallas");
		stringArray.sort(null);
		System.out.println(stringArray);
		
		// Defining a List
		ArrayList<Integer> myarray = new ArrayList<Integer>();
		// CollectionUtilities.speedTest(myarray,  "Array List");
		/* ArrayList<Integer> myarray = new ArrayList<Integer>();
		myarray.add(30);
		myarray.add(45);
		myarray.add(20);
		
		int size = myarray.size();
		
		// ArrayList: add & get method
		
		for (int i = 0; i < size; i++) {
			System.out.println(myarray.get(i));
		}
		
		System.out.println("****************");
		
		myarray.add(55);
		myarray.add(83);
		myarray.add(27);
		
		for (int index : myarray) {
			System.out.println(index);
		}
		
		System.out.println("Your list has " + size + " elements.");
	*/
	}

}
