package com.va.week2.ex6;

public class Course {
	
	private String courseCode;
	private double courseScore;
	

	public double getCourseScore() {
		return courseScore;
	}

	public void setCourseScore(float courseScore) {
		this.courseScore = courseScore;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public Course(String courseCode, double d)
	{
		if (courseCode ==null || courseCode.isEmpty())
		{
			throw new IllegalArgumentException ("courseCode cannot be null or empty");
		}
		
		// check for other conditions... 
		
		this.courseCode = courseCode;
		this.courseScore = d;

		}
	}
	
