package ExceptionHandling;

public class TryCatchConcept {

	// Exception is an unwanted code
	// The moment exception arises, the program will terminate, will not
	// go to the next line if not handled propery

	// inside the try block write the exception generating code or the culprit code
	// then handle it within catch block

	// catch block will catch that particular exception
	// every exception is class, so inside catch block you have to write the
	// exception class name
	// then you have to mention any reference variable as well

	// if arithmetic exception is encountered and
	// you are handling with nullpointer exception inside catch block, it will not
	// be handled

	// if there is no exception inside try block, it will never go inside catch
	// block

	// In Java for every exception there is a corresponding class
	// Throwable is the parent of Exception and Error
	// Object is the parent of Throwable, but you can't have Object inside catch
	// block

	// Exception is due to coding error
	// Error is due to system issue like memory full, stackoverfolw,RAM Issue,
	// memory leakage

	// you can create two or more catch blocks inside one try block too

	String name = "Tom";

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {

			System.out.println("Hi");

			int i = 9 / 0;// divide by 3 and test the code
							// exception is coming on this line,
			// so it will jump to catch block and below of catch block if handled properly

			// but below three Hi and name Tom will never be displayed as it directly
			// jumped to catch block just after
			// getting the exception

			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");

			TryCatchConcept obj = new TryCatchConcept();
			System.out.println(obj.name);

		}

		// every exception is class, so inside catch block you have to write the
		// exception class
		// then you have to mention any reference variable

		catch (ArithmeticException e) {// Instead of ArithmeticException, u can write Throwable too
			System.out.println("ArithmeticException is coming....");
			e.printStackTrace();// this method is used to display the details about the exception
		}

		catch (NullPointerException e) {
			System.out.println("NullPointerException is coming....");
		}

		// if exception is handled properly, below three A will be displayed

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

	}
}
