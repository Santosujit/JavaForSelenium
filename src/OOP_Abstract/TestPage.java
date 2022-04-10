package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();

		// abstract class constructor will be called when we create object of child
		// class
		// But parent class constructor will be called 1st, then child class constructor
		// will be called

		// as shown above, constructor is called when a new object is created
		// child class object is created, it will go to child class, where it will see
		// that child class extends to a parent class
		// so parent class constructor will be called 1st, then child class constructor
		// will be called

		lp.header();

		// as shown below, the below three methods you should have
		// that is declared in the parent class, but how you will access it
		// will be defined in the method body in the child class

		lp.title();
		lp.url();
		lp.loading();

		lp.doLogin("santosh", "ruchi");
		lp.doLogin("arup", "luku", "gopal@gmail.com");

		Page.logo();// logo is same for all child class so made it static
					// if child class wants it's own logo, it can have separate method

		System.out.println("-----Top-casting-----");

		// Top-casting

		Page p1 = new LoginPage();// child class object can be referred by parent class
									// reference variable

		p1.title();
		p1.url();
		p1.loading();

		p1.header();
		p1.logo();

		// p1.doLogin(); can't access
		// as shown above parent class reference variable can access it's own parent
		// class's
		// methods, and variables
		// parent class reference variable can also access it's overridden methods
		// present in child class

		// but when parent class reference variable tries to access child class's own
		// methods, then child class will ask where are you from
		// are you from child class - NO, then if you are parent class reference
		// variable
		// then how can you access child class's methods - Not possible

		// down casting --- parent class object accessed by child class reference
		// variable
		// but here you can't create parent class (abstract class) object as per Java
		// so down casting is not allowed
	}

}
