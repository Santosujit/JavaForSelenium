package JavaSessions;

//whether there is exception or not, catching the exception or not, 
//finally block will always be executed
//finally block can't be written alone. It should be written with the try- block
//with try block, you can have a finally block without a catch block - It's OK
//sometimes finally block value will override the value of catch block

public class FinallyConcept {

	public static void main(String[] args) {

		int p = 10;

		try {
			int div = p / 3;// change it to divide by 2 and test
		} catch (ArithmeticException e) {// change it to nullpointerException and test
			System.out.println("AE is coming...");
		}

		finally {
			System.out.println("in finally block....");
		}

		System.out.println("Bye!!!");

		System.out.println(getMarks("tom"));

	}

	public static int getMarks(String name) {

		// this method is all about - u give me name and I will give you marks

		if (name.equals("tom")) {
			try {
				int i = 9 / 0;
			}

			catch (ArithmeticException e) {
				return 98;
			}

			finally {
				System.out.println("Bye");
				return 100;
//				Catch block is returning 98, finally block returning 100
//				so I think finally block is overriding catch block
			}

		}

		else if (name.equals("peter")) {
			return 90;
		}

		else {
			System.out.println("name is not found");
			return -1;
		}

	}

}
