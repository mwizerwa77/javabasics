package com.learning.javabasics.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	//properties
	private String firstName;
    
	private String lastName;
    
	private String studentNumber;
    
	private int age;
	
	private double accountBalance;
	
	//HTTP METHODS -- HTTP STATUS  --
	//api to get students --- GET -- 200: OK
	//api to save new student ---- POST   -- 201: CREATED
	//api to update exisiting student  -- PUT -- 200:OK
	//api to delete student --- DELETE 200:OK
	
	//C:-create, R:read, -U:-update, D:delete
	
	//api which does not exist- return with 404: not found
	//api is protected and no credentials provided : 401: unauthorized
	//user is not allowed to access an api 403:forbidden
	//internal server error  500
	//bad request 400
	
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
