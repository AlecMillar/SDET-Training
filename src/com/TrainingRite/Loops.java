package com.TrainingRite;

public class Loops {

	public static void main(String[] args) {
		// DO LOOP - iterate through at least once, then repeat upon true condition (test comes at end)
		int caseNum = 0;
		do {
			caseNum = caseNum+1;
			System.out.println("Running test case " + caseNum);
		} while (caseNum !=5);
		
		// WHILE LOOP - iterates through based upon condition (test comes at start)
		String result = "FAIL";
		while (result == "FAIL") {
			if (caseNum == 10) {
				result = "PASS";
				System.out.println("Pass!");
			}
			else {
				System.out.println("Fail");
			}
			caseNum++;
		}
		
		// FOR LOOP - combines popular incremental loop
		for (int i = 1; i <= 10; i++) {
			System.out.println("Running test #" + i);
		}

	}

}
