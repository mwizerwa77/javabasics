package com.learning.javabasics.utils;

public class Student {
	
	//properties
	private String firstName;
    
	private String lastName;
    
	private String studentNumber;
    
	private int age;
	
	private double accountBalance;
	
	
	
	public Student() {
	}

	public Student(String firstName, String lastName, String studentNumber, int age, double accountBalance) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNumber = studentNumber;
		this.age = age;
		this.accountBalance = accountBalance;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
