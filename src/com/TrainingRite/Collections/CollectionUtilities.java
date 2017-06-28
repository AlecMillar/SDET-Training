package com.TrainingRite.Collections;

import java.util.List;

public class CollectionUtilities {
	
	// Test the speed of collections
	public static void speedTest(List<Integer> list, String listType) {
		System.out.println("Working with List Type: " + listType);
		// Get the start time
		long start = System.currentTimeMillis();
		
		// Add elements to the end of the list
		for (int i = 0; i < 100000; i++) {
			//list.add(i);
			list.add(0,  i);
		}
		
		// Get the end time
		long stop = System.currentTimeMillis();
		// Calculate and print result
		long time = stop - start;
		System.out.println(time);
	}

}
