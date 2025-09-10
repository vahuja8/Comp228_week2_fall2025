package com.va.week2.exampl2;

import java.util.Scanner;

public class UserDriver {
	
	public static void main(String args[])
	{
	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Ask user to enter name");
			String username= sc.next();
			
			System.out.println("Ask user to enter password");
			String password= sc.next();
			
			
			User u1 = new User(); // object of the class. 
			u1.setUserName(username);  // setting values in the setters..
			u1.setPassword(password);
			
			System.out.println(u1.getUserName());
			System.out.println(u1.getPassword());
			
			sc.close();
		}
	
		
	
	
		
	}

}
