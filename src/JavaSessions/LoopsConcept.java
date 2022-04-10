package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		// If I want to print 1-10
		// worst way is to write println(1) to println(10)

		// 1. while Loop

		System.out.println("****while Loop***");

		int i = 1;// Initialization
		while (i <= 10) {// condition checking
			System.out.println(i);// print statements
			// i=i+1;//Increment or Decrement
			// i++;
			++i;

		}

		// practical use of infinite loop
		// In a restaurant 24*7 Welcome message is printed always

		// welcome to my Hotel

		// while(true) {
		System.out.println("welcome to my Hotel!");
		// }

		// 2. for loop
		// print 1-10

		System.out.println("*****For Loop******");

		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
		}
		System.out.println("*********");
		for (int k = 1; k <= 10;) {
			System.out.println(k);
			k++;

		}

		System.out.println("*********");
		int l = 1;
		for (l = 1; l <= 10; l++) {
			System.out.println(l);

		}

		// for(; ;) {
		// System.out.println("Hello");//It will lead to infinite loop
		// bydefault it will assume that conditions are always true
		// }

		System.out.println("*********");
		char c = 'a';
		for (c = 'a'; c <= 'z'; c++) {
			System.out.println(c);
		}

		System.out.println("*********");

		double d = 1.1;
		for (d = 1.1; d <= 10; d++) {
			System.out.println(d);
		}

		// dead code or unreachable code
		// it will never go to the println line, as it is always false

		// while(false) {
		// System.out.println("Hi");
		// }

		// the below is not a dead code like above
		// here you can change the flag variable to true anywhere

		boolean flag = false;
		while (flag) {
			System.out.println("Hi");
		}

		// 3. do-while loop
		System.out.println("do-while loop");
		int m = 1;
		do {
			System.out.println(m);
			m++;
		} while (m <= 10);

		// 4. for-each loop
		// streams:JDK 8 for ArrayList
		// forEach loop method - JDK 8

		// Array

		System.out.println("Array");
		int marks[] = new int[5];
		marks[0] = 100;
		marks[1] = 200;
		marks[2] = 300;
		marks[3] = 400;
		marks[4] = 500;

		for (int a = 0; a <= 4; a++) {
			System.out.println(marks[a]);
		}

		// forEach loop

		System.out.println("forEach loop");// e will go to the array one by one
		for (Integer e : marks) {// you can write Integer or int
			System.out.println(e);
		}

		// WAP: to print even numbers from 1-10
		
		System.out.println("**********");
		for (int even = 2; even <= 10; even = even + 2) {
			System.out.println(even);
		}

		// WAP to print odd numbers from 1-10
		
		System.out.println("**********");
		for (int odd = 1; odd < 10; odd = odd + 2) {
			System.out.println(odd);
		}

		// for loop with if conditions
		// WAP to print 1-100 but when any number is divisible by 5, then print Hi

		System.out.println("WAP to print 1-100 but when any number is divisible by 5, then print Hi");
		for (int n = 1; n <= 100; n++) {
			System.out.println(n);
			if (n % 5 == 0) {
				System.out.println("Hi");
			}

			System.out.println("Use break inside for loop");
			for (int o = 1; o <= 100; o++) {
				System.out.println(o);
				if (o % 5 == 0) {
					System.out.println("Hi");
					break;
					
					// it will come out of for loop when 1st number is found which is divisble by 5.
//					this break is part of for loop only
					// inside if loops we can not use break
					// opposite of break is continue
				}

			}

		}

	}
}
