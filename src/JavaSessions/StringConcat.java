package JavaSessions;

public class StringConcat {

	public static void main(String[] args) {

		// String is not a primitive data type
		// String is a non-primitive data type
		// String is a class, not a key word so S is cap
		// String should be written inside double quotes ""

		String s1 = "Naveen I love you";
		System.out.println(s1);

		String s2 = "1000";// This 1000 is not an integer number, it's a String
		System.out.println(s2);

		int a = 100;
		int b = 200;

		String x = "Hello";
		String y = "Selenium";

		double d1 = 10.11;
		double d2 = 12.04;

		// Can I add two Strings?

		System.out.println(a + b);// + operator or mathematical operator
		System.out.println(x + y);// concatenation operator

		System.out.println(a + b + x + y);
		// execution always starts from left to right
		// a will be added to b, then the result 300 will be added to x, then 300Jay
		// string will be added to Jagannath
		// 300JayJagannath will be printed
		// integer can be concatenated with strings

		System.out.println(x + y + a + b);// JayJagannath100200
		System.out.println(x + y + (a + b));

		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);
		System.out.println("The sum is: " + a + b);
		System.out.println("The sum is: " + (a + b));

		System.out.println(d1 + d2);// 22.15
		System.out.println(a + b + d1 + d2);// 322.15 so integer can be added with double
		System.out.println(a + b + d1 + d2 + x + y);// 322.15HelloSelenium

		System.out.println(x + y + a + b + d1 + d2);// HelloSelenium10020010.1112.04

		char c = 'a';
		char c1 = 'b';
		System.out.println(c + c1);// 195 The ASCII value of a will be added to the ASCII value of b.
		System.out.println(c);// a It will take ASCII value in case of only arithmetic operation.
		System.out.println(c1 - c);
		System.out.println(c1 * c);
		// Google ASCII Table

		// a-z: 97-122
		// A-Z: 65-90
		// 0-9: 48-57

		// char c2 = '10';we can't write like this, it should be single character

		System.out.println(x + c);// It will not give you Hellloa

		System.out.println(4 / 2);
		System.out.println(5 / 2);// 5 and 2 is pure integers, so compiler will ignore .5
		System.out.println(5.0 / 2);// one number is double so output will be 2.5
		System.out.println(5 / 2.0);
		System.out.println(5.0 / 2.0);

		// System.out.println(9/0);//Exception , Java does not understand infinite

		System.out.println(0 / 10);// 0

		System.out.println(4 % 2);// modulus operator, it will give you remainder
		System.out.println(5 % 2);
		System.out.println(17 % 3);// 2

	}

}
