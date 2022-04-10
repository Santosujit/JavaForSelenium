package JavaSessions;

public class SwitchCase {

	public static void main(String[] args) {

		// switch:case --- both switch and case are keywords so should start with small
		// letter

		String browser = "safari";// Here the program will not go to chrome block or firefox block or any other
									// block
									// only it will go to safari block and it will exit the switch case
									// If you remove break statement it wil be have like normal multiple if else-if
									// blocks
		switch (browser) {
		case "chrome":
			System.out.println("Launch chrome");
			break;
		case "firefox":
			System.out.println("Launch firefox");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;
		case "IE":
			System.out.println("Launch IE");
			break;

		default:
			System.out.println("Pls enter proper browser");
			break;
		}

		System.out.println("**********");

//		switch (key) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}

		switch (browser) {
		case "chrome":
			System.out.println("Launch chrome");

		case "firefox":
			System.out.println("Launch firefox");

		case "safari":
			System.out.println("Launch safari");

		case "IE":
			System.out.println("Launch IE");

		default:
			System.out.println("Pls enter proper browser");

		}

		System.out.println("***************");

		int marks = 100;
		int discount = 0;
		switch (marks) {
		case 100:
			System.out.println("Grade A");
			discount = 1000;

			break;
		case 90:
			System.out.println("Grade B");
			discount = 800;

			break;
		case 80:
			System.out.println("Grade C");
			discount = 500;

			break;

		default:
			break;
		}

		System.out.println("Your marks: " + marks + " and discount is : " + discount);

		// switch case are not allowed for floating and double values...
		// only allowed for integer, Strings, and char

		// double d = 12.33;
		// switch (d) {
		// case 12.33:

		// break;

		// default:
		// break;

	}

}
