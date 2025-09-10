package com.va.week2.ex3;

import java.util.Scanner;

/** 
 * @author Vivek Ahuja
 * @since 2025-09-10
 * Collect input values for principal, rate, and time.
*  Calculate the simple interest using the formula.
 * 
 */

public class SIExample {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the principal amount:");
			double principal = scanner.nextDouble();


			System.out.println("Enter the rate of interest per annum (as a percentage):");
			double rate = scanner.nextDouble();
			rate = rate /100;  // get rate to decimal notation.
			
			System.out.println("Enter the time in years:");
			double time = scanner.nextDouble();
			
			double simpleInterest = principal * rate * time;
			System.out.printf("The simple interest is: %.2f\n", simpleInterest);
			
			scanner.close();
		}



	}

}
