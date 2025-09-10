package com.va.week2.ex6;

/**
 * @author Vivek Ahuja
 * @serial 2025-09-10
 * This is Student class that maintains student Info attributes. 
 * has Getters/setters, constructors to set  and validate the inputs. 
 * this would be driven by DriverClass
 * 
 * This would connect with Grade Class.  
 * 
 * 
 */

public class Student {
	
	private String fullName;
	private int sid;
	private String address;
	private int age;
	
	
	public String getFullName() {
		return fullName;
	}
	public int getSid() {
		return sid;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String fullName, int sid, String address, int age) {
		super();
		this.fullName = fullName;
		this.sid = sid;
		this.address = address;
		this.age = age;
	}
	
	
}
