package ExceptionHandling;

public class ThrowKeyword {
	
	//throw keyword is used to throw user made Exception
	
	public static void main(String[] args) {

		// throw -- is used to generate the exception deliberately

//		try {
//			throw new Exception("Naveen Exception");
//		} catch (Exception e) {
//			System.out.println("Some exception is coming....");
//		}

		String data = " ";

		if (data.equals(" ")) {//" " means blank
			
			//after throw you have to create object of Exception class

			try {
				throw new Exception("EXCEL DATA IS Blank");//you may not pass
				                                           //parameters too
				                                           //passing 4 readability
			} catch (Exception e) {
				System.out.println("EXCEL DATA IS Blank EXCEPTION");
			}
		}

	}

}
