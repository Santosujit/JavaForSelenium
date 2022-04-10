package JavaSessions;

public class StringImmutable {

	public static void main(String[] args) {

		String s1 = new String("naveen");// one object will be created
		String s2 = new String("naveen");// another object will be created

		// Two objects got created, s1 points to 1st object, s2 points to 2nd object, s1
		// is not equal to s2
		// but both the strings are equal as contents are equal

		// String is immutable, String is constant, you can't change the value of the
		// String
		// So no reverse method is available in String class
		// StringBuffer is mutable, so reverse method is available in StringBuffer class

		System.out.println(s1 == s2);//false as it compares the object references
		System.out.println(s1.equals(s2));//true as it compares the contents

		System.out.println("***************");

		String s3 = "naveen";// stored inside string pool inside heap memory, no object creation
		String s4 = "naveen";// stored inside string pool inside heap memory, no object creation
//		here inside string pool only in one location naveen will be stored

		// here inside heap memory, in the string pool in one location naveen will be
		// stored
		// multiple reference variable will point to the same location only

		System.out.println(s3 == s4);// true
		System.out.println(s3.equals(s4));// true

		System.out.println("-----------Concat-------------");
		s3 = s3.concat(s4);
		System.out.println(s3);

		System.out.println(s3 == s4);// false
		System.out.println(s3.equals(s4));// false

		System.out.println("***************************");

		String str2 = "Selenium";// Selenium is stored in one memory location, referred by str2
		System.out.println(str2);
		str2.concat("Testing");// SeleniumTesting is stored in another memory location
		// referred by None
		// no reference variable
		System.out.println(str2);

		str2 = str2.concat("Selenium");// SeleniumSelenium will be stored in another memory location
										// referred by str2
										// str2 will not refer to SeleniumSelenium now
										// It will refer to SeleniumSelenium location now
		System.out.println(str2);

	}

}
