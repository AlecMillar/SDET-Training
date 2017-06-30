package homework.PasswordReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PasswordReaderApp {

	public static void main(String[] args) {
		// Properties & Initializations
		ArrayList<String> passwordList = new ArrayList<String>();
		ArrayList<String> failedPasswords = new ArrayList<String>();
		System.out.print("Enter full password file path: ");
		Scanner in = new Scanner(System.in);
		String fileInput = in.nextLine();
		String fileOutput = "C:\\Users\\Alec\\Google Drive\\Work\\SDET Training\\FailedPasswords.txt";
		String result = null;

		// Step 1. Read passwords into ArrayList
		passwordList = readPasswords(fileInput);
		System.out.println(passwordList);

		// Step 2. Test data for special character (i.e. ! @ # $ % &) (Done with verifyPassword() method)
		//		2a. Return Pass or Fail for each password based on whether it meets criteria
		for (String entry : passwordList) {
			System.out.println("\nPassword is: " + entry);
			result = verifyPassword(entry);
			System.out.println("Result: " + result);
			if (result == "FAILED") {
				failedPasswords.add(entry);
			}
		}

		// Step 3. Output failed passwords to a file
		System.out.println(failedPasswords);
		writeFailedPasswords(fileOutput, failedPasswords);
	}

	/*
	 * 		*****METHODS*****
	 */
	// Method to read passwords into an ArrayList
	public static ArrayList<String> readPasswords(String filename) {
		// Definition of local variables
		ArrayList<String> passwords = new ArrayList<String>();
		File file = new File(filename);
		String entry = null;

		//Read passwords into file
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			//Inputs each password into the ArrayList until end of file.
			while ((entry = br.readLine()) != null) {
				passwords.add(entry);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return passwords;
	}
	// Method to verify passwords.
	// Returns PASS if password meets criteria.
	// Returns FAIL if password does not meet criteria.
	public static String verifyPassword(String password) {
		String result = null;
		if(password.contains("!") == true ||
				password.contains("@") == true ||
				password.contains("#") == true ||
				password.contains("$") == true ||
				password.contains("%") == true ||
				password.contains("&") == true) {
			result = "PASSED";
		} else {
			result = "FAILED";
		}
		return result;
	}
	// Method to write failed passwords to a file.
	public static void writeFailedPasswords(String filename, ArrayList<String> passwords) {
		File file = new File(filename);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			// Outputs failed passwords into a file
			for (String entry : passwords) {
				bw.write(entry);
				bw.newLine();
			}
			// Push & close file
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
