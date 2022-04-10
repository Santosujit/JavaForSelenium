package Assignments;

public class LoopsAssignment {

	public static void main(String[] args) {

//		1. WAP to print following output:
//			I am Batman
//
//			I am Batman
//
//			I am Batman
//
//			I am Batman
//
//			I am Batman

		for (int i = 1; i <= 5; i++) {
			System.out.println("I am Batman\n");
		}

		System.out.println("--------------------\n");

//		2. WAP to print following output:
//			I am Batman 1
//
//			I am Batman 2
//
//			I am Batman 3
//
//			I am Batman 4
//
//			I am Batman 5
//
//			I am Batman 6
//
//			I am Batman 7
//
//			I am Batman 8
//
//			I am Batman 9

		for (int i = 1; i <= 9; i++) {
			System.out.println("I am Batman " + i + "\n");
		}

		System.out.println("-------------for loop");

//		3. WAP to print 10 to 1 using for, while and do-while loop

//		using for loop

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("-----------while loop\n");
//		using while loop

		int i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}

		System.out.println("-----------do while loop\n");

		int j = 10;
		do {
			System.out.println(j);
			j--;
		} while (j >= 1);

//       4. Write a program in Java to print "Hello World" ten times using while loop
		System.out.println("-----------\n");
		for (i = 1; i <= 10; i++) {
			System.out.println("Hello World");
		}

//       5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		System.out.println("-----------\n");
		int k = 1;
		while (k <= 10) {
			System.out.println(k);
			if (k % 7 == 0)
				break;
			k++;
		}

	}

}
