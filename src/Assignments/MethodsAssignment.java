package Assignments;

import java.util.Scanner;

public class MethodsAssignment {

	public static void main(String[] args) {
		MethodsAssignment m1= new MethodsAssignment();
		int sum = m1.add(10, 20);
		System.out.println(sum);
		
		int prodResult = m1.prod(10, 20);
		System.out.println(prodResult);
		
		System.out.println(m1.Area(10, 20));//area
		
		double cirCumference = m1.cirCumFer(10, 20);
		System.out.println(cirCumference);
		
		m1.findMax(10, 20,30);
		
		m1.findMin(10, 20, 30);
		
		m1.isEven(4);
		m1.isEven(5);
		
		m1.isEligible4Vote(18);
		m1.isEligible4Vote(17);
		m1.isEligible4Vote(20);
		
		m1.displayGrade(50);
		
	}
	
//	1.
//	Write a program to print the sum of two numbers entered by user by defining your own method.
	
	public int add(int a, int b) {
		return a+b;
	}
	
//	2. Define a method that returns the product of two numbers entered by user.
	
	public int prod(int a, int b) {
		return a*b;
	}
	
//	3.
//	Write a program to print the circumference and area of a circle of 
//	radius entered by user by defining your own method.
//	Answer
	
	public double Area(int a, int b) {
		return 3.14*a*b;
	}
	
	public double cirCumFer(int a, int b) {
		return 2*3.141*a*b;
	}

//	4. Define two methods to print the maximum and the minimum number respectively 
//	among three numbers entered by user.
	
	public void findMax(int a, int b, int c) {
		if(a>=b && a>=c) {
			System.out.println(a+" is the largest number");
		}
		else if(b>=a && b>=c) {
			System.out.println(b+" is the largest number");
		}
		else {
			System.out.println(c+" is the largest number");
		}
	}
	
	public void findMin(int a, int b, int c) {
		if(a<=b && a<=c) {
			System.out.println(a+" is the lowest number");
		}
		else if(b<=a && b<=c) {
			System.out.println(b+" is the lowest number");
		}
		else {
			System.out.println(c+" is the lowest number");
		}
	}
	
//	5. Define a program to find out whether a given number is even or odd.
	
	public void isEven(int a) {
		if(a%2 == 0) {
			System.out.println(a+" is a even number");
		}
		else {
			System.out.println(a+" is an odd number");
		}
	}
	
//	6. A person is elligible to vote if his/her age is greater than or equal to 18. 
//	Define a method to find out if he/she is elligible to vote.
	
	public void isEligible4Vote(int age) {
		if(age >=18) {
			System.out.println("Eligible for Vote");
		}
		
		else {
			System.out.println("NOT Eligible for Vote");
		}
	}
	
//	7. Define a method to find out if number is prime or not.
//	Answer
//	A prime number is a natural number greater than 1, which is only divisible by 1 and itself. 
//	First few prime numbers are : 2 3 5 7 11 13 17 19 23 …..
	
	
	
	
//	8. Write a program which will ask the user to enter his/her marks (out of 100). 
//	Define a method that will display grades according to the marks entered as below:
//		Marks        Grade
//		91-100         AA
//		81-90          AB
//		71-80          BB
//		61-70          BC
//		51-60          CD
//		41-50          DD
//		<=40          Fail

	public void displayGrade(int marks) {
		Scanner input = new Scanner(System.in);		
		System.out.println("Enter your marks obtained in the Test");		
		input.nextInt();
		input.close();
		
		if(marks>=91 && marks<=100) {
			System.out.println("AA Grade");
		}
		if(marks>=81 && marks<=90) {
			System.out.println("AB Grade");
		}
		if(marks>=71 && marks<=80) {
			System.out.println("BB Grade");
		}
		if(marks>=61 && marks<=70) {
			System.out.println("BC Grade");
		}
		if(marks>=51 && marks<=60) {
			System.out.println("CD Grade");
		}
		if(marks>=41 && marks<=50) {
			System.out.println("DD Grade");
		}
		if(marks<=40) {
			System.out.println("Fail");
		}
		
		
		
	}
	
}

