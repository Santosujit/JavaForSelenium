package Assignments;

public class StringAssignment {

	public static void main(String[] args) {

//		Write a program to check two different strings equality.

		String s1 = "Santosujit";
		String s2 = "SANTOSUJIT";

		if (s1.equals(s2)) {
			System.out.println("Both Strings are equal");
		} else {
			System.out.println("Btoh strings are not equal");
		}

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Both Strings are equal");
		} else {
			System.out.println("Btoh strings are not equal");
		}

//		2. Remove all  spaces in a String . 
//		 
//		  For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.

		String s = "         Hello      Everyone       ";
		String s3 = s.trim();
		System.out.println(s3);

//		3. Write a program that will  print out the last character and first character of a word.

		String s4 = "Java Selenium to Infosys";
		System.out.println(s4.charAt(0));
		int len = s4.length();
		System.out.println(s4.charAt(len - 1));
		
//		4. Write a program to verify a word or a character contained in the sentence.
		
		String s5 = "Amazon rocks";
		if(s5.contains("Amazon")) {
			System.out.println("word is present inside the sentence");
		}
		else {
			System.out.println("word is not present inside the sentence");
		}

//		5.Write a function/ method to reverse your own name.
		
//		using Stringbuffer class
		String str = "Dabulu";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
//		using for loop
		
		String str1 = "Tipu";
		int length = str1.length();
		String rev = "";
		for(int i=length-1;i>=0;i--) {
			rev = rev+str1.charAt(i);
			
		}
		System.out.println(rev);
		
//		6. Write a program that gives you the last half of the string.
		
		String s6 = "Americarocks";
		int len1 = s6.length();
		String second_half = s6.substring(len1/2);
		System.out.println(second_half);
		
//		7.Write a program to get the 3rd  “ e “ of the string .
//		 For example: “Welcome to Naveen Automation Labs ! “.
		
		
//       String s7 = "Welcome to Naveen Automation Labs";
//       s7.indexOf('e', (s7.indexOf('e')+8);
		
//		8. Write a method which gives an index of (-1) if string is not available. . 
//		it should return integer. if String is present, 
//		then it should return the specific index.
		
		
//		9. Write a program that breaks a whole string into small strings, 
//		and prints out its all values . (Hint: split, loop) .
		
//		10. Assume that a string consists of 3 words, print out the middle one. 
		
//		11. get only numeric part from this String:
//			String s = "your transaction id is: 12345 and reference id is 34567";
//       
		

	}

}
