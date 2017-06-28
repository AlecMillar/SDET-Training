package com.TrainingRite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharacterSearch {

	public static void main(String[] args) {
		 // 1. Read a text file
		String filename = "C:\\Users\\Alec\\Google Drive\\Work\\SDET Training\\Quotable.txt";
		String text = readFile(filename);
		System.out.println(text);
		
		System.out.println("");
		 // 2. Ask the user for a letter to search
		System.out.print("Enter a letter to search: ");
		Scanner in = new Scanner(System.in);
		String ch = in.next();
		System.out.println("Searching for the letter " + ch);
		
		 // 3. Perform action to count the number of occurrences of that letter
		int totalMatches = findOccurrences(text, ch);
		System.out.println("Total number of matches is: " + totalMatches);
		

	}
	
	public static String readFile(String filename) {
		File file = new File(filename);
		String text = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			text = br.readLine();
		}
		catch (FileNotFoundException e) {
			System.out.println("The file was not found. " + e.toString());
		}
		catch (IOException e) {
			System.out.println("There was an error reading the file. " + e.toString());
		}
		
		return text;
	}
	
	public static int findOccurrences(String text, String ch) {
		int matches = 0;
		for (int i = 0; i < text.length(); i++) {
			if (ch.charAt(0) == text.charAt(i)) {
				matches++;
			}
		}
		
		return matches;
	}

}
