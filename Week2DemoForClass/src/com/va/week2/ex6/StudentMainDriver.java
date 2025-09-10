package com.va.week2.ex6;

import java.util.Scanner;

public class StudentMainDriver {
	
	public static void main(String args[])
	{
		/*
		 * 1. Creating objects for Student Class and Course class. 
		 * 2. binding inputs from user using Scanner library to Student fields and 
		 * course fields using the objects.
		 * 3. Validating the inputs and calling the getters/setters.
		 * 4. Implement validation.. 
		 * 	 * 
		 * 
		 */
		
		/*
		 * Do for 3 objects for Student Class and 3 objects for courses.. 
		 */
		
		Course c1 = new Course("comp228", 90.2);
		// replace the parms with scanner inputs variables.. 
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Name");
			String name = sc.next();
			//.. all params.. 
			
			Student s1 = new Student(name, 123456, "1 Progress Ave Toronto", 21);
			
		// do this for taking inputs for different courses.. 
			System.out.println("Enter the course you wish to register");
			String coursecode = sc.next();
			c1.setCourseCode(coursecode);
			
		//..  complete this for all courses.. 
		
		
			
			
			
		}
		
		
	}

}
