package JavaSessions;

public class FinalKeyword {

	// If a class is declared as final, then it can't be a parent class, inheritance
	// is not allowed
	// If a method is declared as final, then that method can't be overridden
	// so final keywords prevents inheritance of class, and overriding od methods
//	If a variable is declareed as final, It behaves as a constant, you can't change the value

	public static void main(String[] args) {

		// to provide the constant values
		final int a = 10;// no one can change the value of a, It's constant
		// a=12; you can not write this line
		// System.out.println(a++ or ++a); --- you can't write like this as well

		final int days = 7;// total no of days in a week is constant
		int salary = days * 10;

		System.out.println(salary);

		// prevent the overridding and inheritance

	}

}
