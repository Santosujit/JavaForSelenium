package JavaSessions;

public class IfElseConditional {

	public static void main(String[] args) {

		// In every programming language, there are some conditional operators like
		// written below:-
		// < <= > >= == !=

		int a = 10;// assignment operator is =
		int b = 20;
		System.out.println(a == b);// False
									// comparision operator is ==
//		for primitive data types comparision we use ==
//		character also included in primitive data types
//		for non primitive data types (strings,arrayList) comparision we use .equals() method

		if (a == b) {// inside the () bracket you can have only boolean values
			System.out.println("Hi");
		} else {
			System.out.println("Bye");
		}

		// if (a=10) {wrong syntax only boolean values are allowed

		// }

		// Dead Code

		if (true) {
			System.out.println("Testing");

		} else {
			System.out.println("Development");// alerts on line no 37, so it is dead code, or not reachable code, as
												// above is true always
		}

		if (false) {
			System.out.println("Testing");// here If block is Dead code, line number 41...ugliest practice
		} else {
			System.out.println("Development");
		}

		String s1 = "Selenium";// capital S
		String s2 = "selenium";// small s, Java is case sensitive

		// how to compare two string values
		// .equals() method is there

		if (s1.equals(s2)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}

		System.out.println("***********************");

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}

		// s1 == s2 will compare object references, not the values

		// Nested Ifs Condition
		// For every if, it is not compulsory to write else statement

		System.out.println("****************");
		int marks = 81;

		if (marks >= 60) {
//			if above if condition does not satisfy then it will not go to below two if
			System.out.println("C Grade");

			if (marks >= 70) {
				System.out.println("B Grade");
				if (marks >= 80) {
					System.out.println("A Grade");
				}
			}
		} else {
			System.out.println("FAIL");
		}

		System.out.println("**************");

		String browser = "safari";// even if you put chrome over here still it will check all the if statements

		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		}

		if (browser.equals("firefox")) {
			System.out.println("launch firefox");
		}

		if (browser.equals("safari")) {
			System.out.println("launch safari");
		}

		// Avoid multiple if conditions like shown above
		// In case of safari it will first check 1st two statements unnecesarily

		// if-elseif - to solve the above multiple if problems

		System.out.println("*************");
		browser = "firefox";
		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		} else if (browser.equals("firefox")) {
			System.out.println("launch firefox");
		} else if (browser.equals("safari")) {
			System.out.println("launch safari");
		} else {
			System.out.println("Please enter correct browser...");
		}
		// in the above also it is not checking all the if conditions like in 1st
		// multiple if scenarios.
		// but it is checking the 1st one unnecessarily
		// so if-else if is better than multiple if but is there a better way

		// If there are 100 if conditions, and 50th if condition is satisfied, then it
		// will execute upto 50 th if, including 50th one, also it will execute from 50
		// to 100 if

		// but in case of if-else if, if 50th condition is satisfied then it will
		// execute upto 50th if condition including 50th one, it will not execute
		// from50th to 100

		// is there even a better way than than the 2nd approach (if -else if) --- yes
		// it is switch case statements

		// WAP to find out the maximum numbers where three differennt numbers are given

		int x = 100;
		int y = 200;
		int z = 300;

		if (x > y && x > z) {// false && false = false
			System.out.println("x is the greatest number");
		} else if (y > z) {// false
			System.out.println("y is the greatest number");
		} else {// z
			System.out.println("z is the greatest number");
		}

		System.out.println("*******");
		double d1 = 12.33;
		double d2 = 12.33;

		if (d1 == d2) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		char c1 = 'a';
		char c2 = 'b';
		if (c1 == c2) {
			System.out.println("Hello");
		}

		if (c1 == 97) {
			System.out.println("Hey");
		}

	}

}
