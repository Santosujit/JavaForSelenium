package Assignments;

public class DataTypesConditionalOperator {

	public static void main(String[] args) {

//		Data Types:
//		1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//		Expected Output :
//		Hello 
//		Naveen K

		System.out.println("Hello");
		System.out.println("Santosh");

//	2. Write a Java program to print the sum of two numbers. 
//	Test Data: 
//	74 + 36 
//	Expected Output :
//	110

		int num1 = 74;
		int num2 = 36;
		System.out.println(num1 + num2);

//	3. Write a Java program to divide two numbers and print on the screen. 
//	Test Data : 
//	50/3
//	Expected Output :
//	16

		int num3 = 50;
		int num4 = 3;
		System.out.println(num3 / num4);

//	4. Write a Java program to print the result of the following operations. Change your test data accordingly.
//	Test Data:
//	a. -5 + 8 * 6
//	b. (55+9) % 9 
//	c. 20 + -3*5 / 8 
//	d. 5 + 15 / 3 * 2 - 8 % 3 
//	Expected Output :
//	43 
//	1 
//	19 
//	13

		System.out.println(-5 + 8 * 6);
		System.out.println((55 + 9) % 9);
		System.out.println(20 + -3 * 5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);

//	5. Write a Java program to compute the specified expressions and print the output. Go to the editor
//	Test Data:
//	((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
//	Expected Output
//	2.138888888888889

		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

//	6. Try to concat "Hello Selenium" with a character 't'.

		System.out.println("Hello Selenium" + "t");

//	7. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
//	"Your Toal amount is. 3700".

		int x = 100;
		int y = 200;
		int z = 3400;

		System.out.println("Your Toal amount is. " + x + ".");
		System.out.println("Your Toal amount is. " + y + ".");
		System.out.println("Your Toal amount is. " + z + ".");

//		8. What should be the output for :
//
		byte b3 = 065;

		System.out.println(b3);

//		1. Take three numbers from the user and print the greatest number. 
//
//		Test Data
//		Input the 1st number: 25 
//		Input the 2nd number: 78 
//		Input the 3rd number: 87
//		Expected Output :
//		The greatest: 87

		int a = 25;
		int b = 78;
		int c = 87;

		if (a > b && a > c) {
			System.out.println("The Greatest: " + a);
		} else if (b > c) {
			System.out.println("The Greatest: " + b);
		} else {
			System.out.println("The Greatest: " + c);
		}

//		2. Write a Java program to test a number is positive or negative.
//
//		Test Data
//		Input number: 35 -- positive number
//		Input number: -11 -- negative number

		int number = 0;

		if (number > 0) {
			System.out.println(number + " is a positive number");
		} else if (number < 0) {
			System.out.println(number + " is a negative number");
		} else {
			System.out.println(number + " is neither positive nor negative");
		}

	}

}
