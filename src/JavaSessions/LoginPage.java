package JavaSessions;

public class LoginPage {

	public static void main(String[] args) {

		// duplicate methods are not allowed in Java,
		// but same method name with diff parameters are allowed

		// same method but diff forms --- poly+morphism --- leads to reusablity, and
		// flexibility

		// Method overloading defination -

//		inside the same class
//		diff methods, but having the same method name
//		diff input parameters
//		sequence of parameters also different
//		type of parameters also important

		// method overloading examples ---
		// search, doPayment, log in, vending machine, user registration page
		// user registration method having 0/1/2 parameters ---
		// userid/password/city/gender
		// booking a cab
		// booking(mini or suv or ac or without AC or whole day)
		// booking a movie ticket
		// log in using un, pwd, otp etc
		// do Payment using cc,dc,UPI, wallet etc

		// declare method and write business logic inside the method, but outside main
		// method
		// then create object inside your main method,
		// and call method one by one using object created inside main method

		LoginPage lp = new LoginPage();

		lp.login("santosh", "mummy");

		lp.search("Apple", 150000);

		lp.doPayment(12345678, 256);

	}

	public void login() {// 0 parameter
		System.out.println("log in to app");
	}

	public void login(int a) {// 1 parameter
		System.out.println("log in to app");
	}

	public void login(int a, int b) {
		System.out.println("log in to app");
	}

	public void login(int a, String b) {
		System.out.println("log in to app");
	}

	public void login(String a, int b) {
		System.out.println("log in to app");
	}

	public void login(String UserName, String PWD) {// Log in through user name and password
		System.out.println("log in with user name: " + UserName + " and  password: " + PWD);
	}

	public void login(String UserName, String PWD, int OTP) {// log in through user name, password, and OTP
		System.out.println("log in to app");
	}

	// practical example of method overloading ---
	// searching by diff ways
	// search method is overloaded

	public void search() {

	}

	public void search(String ProdName) {// search with product name

	}

	public void search(String ProdName, int Price) {// search with product name, and price
		System.out.println("search with product name: " + ProdName + " and Price " + Price);
	}

	public void search(String ProdName, int Price, boolean avalaibility) {// search with product name, and price, and
																			// avalability

	}

	public void search(String ProdName, int Price, String Colour) {// search with product name, and price, and colour

	}

	// payment method is overloaded

	public void doPayment(String UPI) {// do payment using UPI

	}

	public void doPayment(String UPI, long Phone) {// do payment using UPI, and Phone

	}

	public void doPayment(long cc, int cvv) {// do payment using credit card and cvv
		System.out.println("Make paymeny using credit card " + cc + " and cvv " + cvv);
	}

	public void doPayment(long Phone, String PWD) {

	}

}
