package com.learning.javabasics.utils;

import java.util.ArrayList;
import java.util.List;

import com.learning.javabasics.model.Student;

public class Test {

	public static void main(String[] args) {

		// variable == rooms
		// data type = type of information to keep in the room
		int age = 12;// initialization
		// variable age of type int is initialized to value 12
		String firstName = "Mwizerwa";
		System.out.println("My name is:" + firstName + " and aged:" + age);//
		// concatenation

		// object data type
		Student student = new Student();//instance
		student.setFirstName("Mwizerwa");
		student.setLastName("Stanley");
		student.setAge(37);
		student.setAccountBalance(1000);

		System.out.println("I am " + student.getFirstName() + " " + student.getLastName() + " aged " + student.getAge()
				+ " networth:" + student.getAccountBalance());

		Kepler myKepler = new Kepler();

		myKepler.setAddress("Kiziba");
		myKepler.setCampus("Kiziba campus");
		myKepler.setContactNumber("078558585858");
		myKepler.setNumberOfPrograms(3);
		myKepler.setNumberOfStudent(100);

		System.out.println("Campus: " + myKepler.getCampus() + " address:" + myKepler.getAddress() + " contact number:"
				+ myKepler.getContactNumber() + " number of progrms:" + myKepler.getNumberOfPrograms()
				+ " number of students:" + myKepler.getNumberOfStudent());
		
		
		// operations
		
		int number1 =13;
		int number2 = 15;
		
		//arithmetic operations
		int sum =  number1 + number2;
		int diff = number1 - number2;
		int remind = number2 % number1;
		int divide =  number2/number1;
		
		System.out.println("Sum is "+sum);
		System.out.println("Difference is "+diff);
		System.out.println("remeinder is "+remind);
		System.out.println("divide result "+divide);
		
		int countSum=0;
		
		for(int i=1;i<11;i++) {
			countSum ++;
			
		}
		System.out.println("Sum of first 10 numbers is "+countSum);
		
		//casting
		int balance  = 1345;
		
		double intBalance = (double) balance;
		System.out.println("int balance: "+intBalance);
		
		//if statement
		
		if(myKepler.getNumberOfStudent()>10) {
			System.out.println("Kepler has many students");
		}else {
			System.out.println("Kepler is less popular");
		}
		
		//nested if
		int dayOfWeek = 40;
		if(dayOfWeek==1) {
			System.out.println("Monday");
		}else if(dayOfWeek==2) {
			System.out.println("Tuesday");
		}else if(dayOfWeek==3) {
			System.out.println("Wed");
		}else if(dayOfWeek==4) {
			System.out.println("Thurs");
		}else {
			System.out.println("Unknown day");
		}
		//for loops
		//Step : initialization
		//step 2: condition
		//step 3: increment
		for(int i = 0;i<10; i++) {
			
			System.out.println("For count "+i);
			if(i==8) {
				break;
			}
		}
	
		
		System.out.println("----------------------------------------");
		int i=0;//initialization
		while(i<10) {//condition
			System.out.println("While count "+i);
			i++;//increment
		}
		
		//arrays
		List<Integer> myList  =  new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(4);
		myList.add(10);
		for(Integer item: myList) {
			System.out.println("item "+item);
		}
		
		//instances
		//constructors help us to create instances from a class
		Student student1 = new Student();
		student1.setFirstName("Sebakungu");
		
		Student student2 = new Student();
		student2.setFirstName("mwizerwa");
		
		Student student3 = new Student("Munzea", "Enock", "w3", 4, 123);
		
	}
	


}
