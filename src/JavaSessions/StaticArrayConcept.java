package JavaSessions;

public class StaticArrayConcept {

	// static array : limitations
	// 1. size is fixed ---
	// 2. only similar data types you can store ---
	// 3.

	// Practical Use Cases: static array example --- total no days in a week
	// month , week array are examples of constant array

	// dyanamic array -- use collection concept

	public static void main(String[] args) {

		// int array - only you can store similar data types, here only integer data
		//

		int i[] = new int[4];// new keyword will instruct that we want to create an array
								// then what kind of array --- int array
								// size of the array
								// []i also true

		// i[-1] = 5;//-ve indexing is not there in Java, Python supports it
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println("Li = " + 0);
		System.out.println("Hi = " + 3);

		int len = i.length;// i.length is the length of the array, where to store, in len variable

		System.out.println("length is " + len);
		System.out.println("Hi = " + (len - 1));

		// Extract the values

		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		// System.out.println(i[4]);//compile time no error, but run time error or
		// exception
		// System.out.println(i[-1]);//exception ...python supports reverse indexing but
		// not in java

		// Lowest index Li is always zero

		// How to print all the values from an Array ---- Use for loop

		System.out.println("Print the values of the Array");
		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);
		}

		System.out.println("Print the values of the Array");
		for (int k = 0; k <= i.length - 1; k++) {
			System.out.println(i[k]);
		}

		// forEach loop --- more elegent
		System.out.println("Print the values of the array using forEach loop");

		for (Integer e : i) {
			System.out.println(e);// what types of values in the array - Integer
									// declare a variable e or any variable
									// what is the name of the array or our collection --- i
									// e will go to each and every location of the array i, then will print it

		}

		// double array

		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 11.33;

		// char array

		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';

		// String array
		System.out.println("String array using forEach loop");
		String lang[] = new String[3];// I want to store three strings
		lang[0] = "Java";
		lang[1] = "Python";
		lang[2] = "Javascript";

		for (String e : lang) {
			System.out.println(e);
		}

		System.out.println("String array using for loop");
		for (int p = 0; p < lang.length; p++) {
			System.out.println(lang[p]);
		}

		// object array --- can store diff data types but fixed in size
		// Object is the super class of all the classes

		System.out.println("object array");
		Object ob[] = new Object[5];
		ob[0] = "Santosh";
		ob[1] = 'M';
		ob[2] = 28;
		ob[3] = 164.4;
		ob[4] = true;// permanent emplyee means true

		for (Object e : ob) {
			System.out.println(e);
		}

	}

}
