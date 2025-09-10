package com.va.week2.ex5;

import java.util.Currency;
import java.util.Scanner;

public class CurrencyExchange {

	    public static void main(String[] args) {
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	    			/*
	    			 * Scan the inputs from the user.! 
	    			 * Show the currency code.. 
	    			 * Convert the currency using the exchange rate given.. -- refer to google for that..
	    			 * AFter the conversion--  Show the applicable conversion for other currency..
	    			 * // Display the currency code
	    			 *   // Display the currency symbol
	    			 *   
	    			 *   .. close the scanner.. object.. 
	    			 *   
	    			 */
	    	
	    	
	        // Create a Currency instance for CAD
	        Currency currency = Currency.getInstance("CAD");

	        // Display the currency code
	        System.out.println("Currency Code: " + currency.getCurrencyCode());

	        // Display the currency symbol
	        System.out.println("Symbol: " + currency.getSymbol());

	        // Display the currency display name
	        System.out.println("Display Name: " + currency.getDisplayName());
	    }
	}