package ExceptionHandling;

public class ThrowsKeyword {

//	I have a query, If we are throws key word then why we are using Catch block

	// throws keyword is used to pass the exception from one method to another
	// methods
	// method can pass the exception to main method as well
	// main method can also pass the exception to JVM
	// It is not a good practice to use throws keyword in programming - performance
	// issue

	// practical use case of Throws keyword
	// Login then search then add cart then payment ---then payment is communicating
	// with
	// HDFC API - some exception in HDFC API Lets say --
	// then all methods will throws the exception---
	// then finally it will display user info, and failed message

	public void m1() throws ArithmeticException {
		System.out.println("m1 method");
		m2();// m1 method can call m2 method directly, no need to create object for it, as
//		two non-static methods can call each other directly 
//		beccause they stay in the same amemory area
	}

	public void m2() throws ArithmeticException {
		System.out.println("m2 method");
		m3();
	}

	public void m3() throws ArithmeticException {
		System.out.println("m3 method");
		m4();
	}

	public void m4() throws ArithmeticException {
		System.out.println("m4 method");
		int i = 9 / 0;// m4 method throws the exception to m3 method, then m3 to m2, then
						// m2 to m1, and m1 to main method
						// main method can also throw this exception to JVM
	}

	public static void main(String[] args) {

		ThrowsKeyword obj = new ThrowsKeyword();

		try {
			obj.m1();
		}

		catch (ArithmeticException e) {
			System.out.println("ArithmeticException is coming...");
			e.printStackTrace();
		}

		System.out.println("Bye....");

	}

}
