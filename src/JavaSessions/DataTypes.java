package JavaSessions;

//Part of 1st Session - 1A

//package is a keyword. all the keyword in java starts with a small letter.

//every statement in java should end with a semi-colon - ;

public class DataTypes {
//public means everybody can access it even outside class, and from outside of package too. public is also a small keyword.
//class is also a keyword
//every class has a class body. Double click on it, it will highlight the complete class.

	public static void main(String[] args) {
		
		//data types:
				//primitive data types:
				//Integer family: byte, short, long, int
				//floating family: double, float
				//character: char
				//boolean: boolean - true/false
				

		// main method is the heart of any java program
		// without main method no java program can be executed

		// 1st create a Java Project. You can create maven project, gradle project, ant
		// project etc
		// once you create a project automatically JAR files (Java Archived Files) will
		// be added.
		// Java can't give u 1000 classes to download to use in your program.
		// Instead java bundles all the collections, and classes under a JAR file,
//		all the Date classes are bundled under another JAR file
		// src means source code folder
		// create a package under project
		// create a class under package
		// each and every code is written inside a class in java
		// use proper naming convention. use camel case. e.g in DataTypes D capital, T
		// capital

		// Data Types means the types of data
		// primitive data types, as soon as u declare they will take the memory
		// non-primitive data types: classes, hashmap, array, arraylist, strings.
		// without object I can't use non-primitive data types
		// primitive data types
		// Integer family: byte, short, long, int --- you can't store point values
		// floating family: double, float --- you can store integer and point values as
		// well
		// characters : char, only one character
		// boolean: true, false

		// 1.byte
		// size: 8 bits = 1 byte
		// Range: -128 to +127
		//
		byte b = 10;
//		byte b = 20; Duplicate values are not allowed
//		b=30; allowed
		// out of 16 GB RAM, 1 GB RAM is reserved for Java Programs
		// memory management: data will be stored in the form of bytes and bits

		// byte b = 20;//duplicate variable can't be created

		b = 20;// the latest value of b is 20 now

		byte b1 = 0;
		byte b2 = -10;

		// byte b3 = 150;max positive value can be stored is 127

		// 2. short
		// size: 16 bits = 2 bytes
		// Range: -32768 to +32767

		short s = 10;

		// 3. int
		// size; 4 bytes = 32 bits
		// Range: -2^31 to 2^32

		int i = 10;
		int j = -10;
		int k = 0;

		// 4. long
		// size: 8 bytes = 64 bits
		// Range: -2^63 to 2^63-1

		// 1 GB = 1000 MB, 1 MB = 1000 bytes , 1 byte = 8 bits

		long ph = 99999999;
		long distnacefromMonn = 333333;
		long e = 10;// not good practice as far as memory management point of view
					// when you write 10000 lines of code, then you will not have any memory if you
					// don't follow proper memory management
//		for Bank account number, store them in string variable, as you are not doing any arithmetic operation

		// 5. float
		// size; 4 bytes = 32 bits
		// Range: after point value it can upto 7 digits
		float f = 12.33f;
		float g = (float) 34.44;

		// 6. double
		// size: 8 bytes = 64 bits
		// Range: after point It can take upto 15 digits

		double d = 14.555555;
		double d1 = -10.44;
		double d3 = 100; // 100 will be treated as 100.00

		System.out.println(d);
		System.out.println(d1);

		// yellow line warning on d3 is because unused variable.

//		Shortcut to Print Statement in Java
//		Type only: syso -> Press control+space

		// 7. char
		// size: 2 bytes = 16 bits
		// range:
		// char means a single digit value, and stored inside a single quote

		char c = 'a';
		char c1 = '1';
		char c3 = '$';

		// char c4='aa' no aa only single digit value

		char gender = 'M';
		System.out.println(gender);

		// 8. boolean
		// true or false
		// size; around 1 bit
		// Range: No Range for boolean
		
//		default value of boolean is false

		boolean flag = true;
		boolean flag1 = false;// even true and false are keywords so start with small letter
								// but in Python true and false are in capital letter

		System.out.println(flag);
		System.out.println(flag1);
		// System is a default class, out is a variable name which returns printscreen
		// class, println is a method

		System.out.println(100);// 100 will be printed

		// These things will hep you in heap meory, stack memory concepts

	}

}
