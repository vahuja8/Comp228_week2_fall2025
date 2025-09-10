package com.va.week2.ex4;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

	
	try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Enter the principal amount:");
		double principal = scanner.nextDouble();


		System.out.println("Enter the rate of interest per annum (as a percentage):");
		double rate = scanner.nextDouble();
		rate = rate /100;  // get rate to decimal notation.
		
		System.out.println("Enter the time in years:");
		double time = scanner.nextDouble();
		
        System.out.println("Enter the number of times interest applied per year:");
        int compoundPeriod = scanner.nextInt();
	
		double compoundInterest = principal * Math.pow(1 + rate / compoundPeriod, compoundPeriod * time) - principal;
        System.out.printf("The compound interest is: %.2f\n", compoundInterest);

	}
}

}