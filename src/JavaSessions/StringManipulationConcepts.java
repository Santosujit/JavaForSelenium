package JavaSessions;

public class StringManipulationConcepts {

	public static void main(String[] args) {

		// String is not a primitive data type
		// String is a collection of characters
		// String is available in Java in the form of class
		// String internally maintains a character array

		String str = "This is my java code and I am so happy";

		// how to calculate length of the above string, calculate the blank space too
		// manually calculate or use inbuilt methods

		// The lowest index in any string is zero
		// The highest index of any string is length of the string -1

		System.out.println(str.length());// 38

		int len = str.length();
		System.out.println(len);// 38

		int li = 0;// lowest index
		System.out.println(li);// 0

		int hi = len - 1;// highest index
		System.out.println(hi);// 37

		System.out.println(str.charAt(3));// s// character present at a particular index

//		str.charAt(index)
//		str.indexOf(ch)
//		str.indexOf(str)

		// System.out.println(str.charAt(38));//StringIndexOutOfBoundsException

		System.out.println(str.indexOf('T'));// 0
		System.out.println(str.indexOf('s'));// 3// multiple s are there
												// so it will give you the index of
												// 1st occurrence of s

		// str.indexOf(ch, fromIndex)
		System.out.println(str.indexOf("s", str.indexOf('s') + 1));// 6// 2nd occurrence of
		// It will calculate 1st occurence of s, add 1, then calculate the 2nd
		// occurrence of s

		System.out.println(str.indexOf("java"));// 11// will give u the index when java starts

		System.out.println(str.indexOf("hello"));// -1// as hello is not present
													// so will return -1

		String mesg = "Welcome admin";

		// I want to know whether the admin string is present or not
		// position of the string does not matter
		// just want to check the presence of the string

		if (mesg.indexOf("admin") >= 0) {// equals to 0 as it can start at beginning too
			System.out.println("string is present");

		}

		// if you want that admin should start at 8th position
		// meaning position of the string is important
		// then calculate manually the position
		// and write logic accordingly

		if (mesg.indexOf("admin") == 8) {
			System.out.println("string is at correct position");
		}

		// when you want to convert the string to lower case

		System.out.println(mesg.toLowerCase());

		// when you want to convert the string to upper case

		System.out.println(mesg.toUpperCase());

		// trim method: It will remove space from the corner only

		String s = "    hello world    ";
		System.out.println(s.trim());

		String text = "   1234";
		System.out.println(text.trim());// It will remove the blank spaces from the ends

		String st = "1234   ";
		System.out.println(st.trim());

		// replace method: you can replace character and string too
		// e.g. replace jave with python, and replace hypen with forward slash

		String dob = "01-01-1990";
		System.out.println(dob.replace('-', '/'));
		
//		str.replace(oldChar, newChar)
//		str.replace(target, replacement)

		String dob1 = "20/07/1982";
		System.out.println(dob1.replace('/', '-'));

		String s1 = "Hello Java and happy with Java";
		System.out.println(s1.replace("Java", "Python"));// replave Java with Python

		// contains method: a value is available in a string or not
		String s2 = "welcome admin";
		System.out.println(s2.contains("admin"));
		// if admin is found, will return true or else false

		// concat method:concats two or more strings

		String s11 = "Hello";
		String s12 = " Selenium";

		System.out.println(s11.concat(s12).concat(" TestAutomation").concat(" ").concat("is very lucrative"));

		// comparison: equals method --- compares two strings --- space also matters

		String s3 = "this is my java code";
		String s4 = "this is my Java code";
		// s3.concat(str).concat(str);

		System.out.println(s3.equals(s4));// case sensitive j is small and caps in both
		System.out.println(s3.equalsIgnoreCase(s4));

		// substring: used to fetch a small string from a large string

		String s5 = "this is my order id 12345";

		// s5.substring(beginIndex);
		// s5.replace(oldChar, newChar)
		// s5.substring(beginIndex, endIndex);
		
//		str.subSequence(beginIndex, endIndex)
//		str.substring(beginIndex)

		System.out.println(s5.substring(11));// fetch the substring from index 11

		System.out.println(s5.substring(0, 9));// substring from index 0 to index 9 not including 9

		// I want to print only order id 12345

		System.out.println(s5.substring(s5.indexOf("id") + 3, s5.length()));

		// split:
		// space is not equal to Null is not equal to Nothing

		String test = "Java;Python;JavaScript;Ruby";

		// split the string with ;
		// It will return a String array

		String arr[] = test.split(";");

		System.out.println(arr[0]);

		// Print all the values of the array

		System.out.println("********");
		for (String e : arr) {
			System.out.println(e);
		}

		System.out.println("********");
		String userData = "Tom:peter:30:London:UK:999999:IBM";

		String user[] = userData.split(":");

		// Now print all the values of the array

		for (int i = 0; i < user.length; i++) {
			System.out.println(user[i]);
		}

		System.out.println("********");

		String data = "xXtestingXxXxJavaxXselenium";
		String dataArr[] = data.split("xX");// It will remove xX combination

		System.out.println("0th value: " + dataArr[0]);// oth value is blank
		System.out.println("1st value: " + dataArr[1]);
		System.out.println("2nd value: " + dataArr[2]);
		System.out.println("2nd value: " + dataArr[3]);

		// String to int coversion:

		System.out.println("********");

		String x = "100";
		System.out.println(x + 20);// 10020

		int i = Integer.parseInt(x);// 100

		// Integer is a class in Java
		// parseInt is a static method
		// as we are not creating object of Integer class to parseInt

		System.out.println(i + 20);

		String y = "200testing";
		System.out.println(y + 20);

		// int p = Integer.parseInt(y);//NumberFormatException
		// System.out.println(p+20);

		// String to double conversion: parseDouble method

		String ds = "12.33";
		System.out.println(ds + 100);// 12.33100
		// 112.33

		double d = Double.parseDouble(ds);
		System.out.println(d + 100);

		// int to String conversion: valueOf method

		int total = 1000;
		System.out.println(total + 20);

		// 100020
		System.out.println(total + "" + 20);

		String tt = String.valueOf(total); // "1000"
		System.out.println(tt + 20);

		// parseInt method is used to convert string to integer
		// valueOf method is used to convert integer to string
		// ParseInt(x) will give the integer equivalent of string x
		// valueof(a) will return integer a as string 1

	}
}
