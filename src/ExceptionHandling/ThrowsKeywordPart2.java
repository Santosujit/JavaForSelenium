package ExceptionHandling;

public class ThrowsKeywordPart2 {

	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method");
		m4();
	}

	public void m4() {
		System.out.println("m4 method");

		//as shown below It is the best practice to use try - catch block
		//wherever we are encountering exception
		
		try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException is coming....");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		ThrowsKeywordPart2 obj = new ThrowsKeywordPart2();

		obj.m1();

		System.out.println("Bye....");

	}

}
