package newAccount;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/* Read SSNs into a Collection
 * Create an account # based on:
 * 2-Digit ID + Random 4-digit# + last 4 of SSN
 * Write the result to a text file
 * Push to GitHub
 */

public class NewAccountApp {

	// Initialize private 2-digit Id
	private static int Id = 22;

	public static void main(String[] args) {
		// 1. Define filename
		String filename = "C:\\Users\\Alec\\Google Drive\\Work\\SDET Training\\SSns.txt";
		String fileOutput = "C:\\Users\\Alec\\Google Drive\\Work\\SDET Training\\AccountNumbers.txt";

		// 2. Defining the local array
		ArrayList<String> ssN = new ArrayList<String>();

		// 3. Initializing local array
		ssN = readSsn(filename);

		// 6. Create an ArrayList of account numbers to export to a .txt file
		ArrayList<String> accNums = new ArrayList<String>();

		// Iterate through ssN collection
		for (String element : ssN) {
			// 4. For each account, assign an account number
			System.out.println("***************\n|NEW RECORD|");
			System.out.println("SSN Number Read: " + element);

			// a. Private 2-digit ID
			int twoDigitId = getId();
			System.out.println("Two Digit ID: " + twoDigitId);

			// b. Random 4-digit number
			int randomFour = getRandomNum(250, 750);
			System.out.println("Random 4-Digit # " + randomFour);

			// c. Last 4-digits of SSN
			String lastFour = trimSsn(element);
			System.out.println("Last 4-Digits of SSN: " + lastFour);

			// 5. Concatenate / Join / Merge the Pieces
			String accountNumber = concatAccount(twoDigitId, randomFour, lastFour);
			System.out.println("NEW ACCOUNT CREATED: " + accountNumber);

			// 6a. Add Account Number to the Account Numbers List (accNums)
			accNums.add(accountNumber);
		}

		// 7. Write account numbers to a file
		writeAccountNums(fileOutput, accNums);		
	}

	public static ArrayList<String> readSsn(String filename) {
		// Define local array
		ArrayList<String> localList = new ArrayList<String>();

		// Define file
		File file = new File(filename);
		String ssn;
		try {
			// Open the file
			BufferedReader br = new BufferedReader(new FileReader(file));

			// As long as the reader can read
			// As long as the reader is reading empty
			// Then, the reader will pass value into ssn
			while ((ssn = br.readLine()) != null) {
				localList.add(ssn);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found.");
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file.");
		}
		return localList;
	}

	public static void writeAccountNums(String filename, ArrayList<String> arr) {
		// Create file
		File file = new File(filename);
		try {
			// Create FileWriter
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			for (String accountNum : arr) {
				bw.write(accountNum);
				bw.newLine();
			}
			// Push & Close file
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Method to generate unique 2-digit ID
	public static int getId() {
		Id++;
		return Id;
	}

	// Method to generate 4-digit random ID
	public static int getRandomNum(int min, int max) {
		int rand = (int) ((Math.random() * ((max-min)*10)));
		rand = rand + min*10;
		return rand;
	}

	// Method to retrieve last 4 digits of SSN
	public static String trimSsn(String SSN) {
		return SSN.substring(5, 9);
	}

	// Method to concatenate account number into one number
	public static String concatAccount(int a2, int b4, String c4) {
		String accountNum;
		accountNum = Integer.toString(a2) + Integer.toString(b4) + c4;
		return accountNum;
	}
}