package JavaSessions;

public class ReverseString {

	public static void main(String[] args) {

//		String str = "Selenium"; // reverse the string --- muineleS
		// reverse method is not available in String class

		System.out.println(reverseString("santosujitMohanty"));

		// reverseString(s);

		System.out.println("******************");

		// StringBuffer class is mutable
		// StringBuffer is not equal to String
		// reverse is a function of StringBuffer class, not of String

		String str1 = "HareKrishna";// reverse the String
		StringBuffer sb = new StringBuffer(str1);
		StringBuffer s1 = sb.reverse();// But reverse method is available in StringBuffer class
		System.out.println(s1);

		System.out.println("***************");

		System.out.println(reverseString("AshokJhulu"));

	}

	// create a function to reverse the String
	// s = "Welcome"

	public static String reverseString(String s) {

		// optimise the code --- if single letter string no need to come inside for
		// loop,
		// just return that

		int len = s.length();

		if (s == null) {
			System.out.println("you are passing a null value....");
			return null;
		}

		if (len == 1) {
			return s;
		}

		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		return rev;
	}

}
