package SuperKeyword;

//LoginPage is the child class of Page class
//super keyword behaves as a parent class reference variable
//using super keyword, from child class
//you can call parent class variable or method without creating the object of parent class

//super keyword can be used inside constructor as well as methods
//with the help of super keyword one can access parent class property
//super keyword should be the 1st statement inside the child class construtor
//so you can't have two super keywords

public class LoginPage extends Page {
	
	public LoginPage(int time) {
		super(time);
		System.out.println("LoginPage Const.....");
	}
	
	
	int loadTime = 20;
	
	void loading() {
		System.out.println("login page load time: " + loadTime);
		System.out.println("page load time: " + super.loadTime);
		//calling parent class loadTime variable
		//without creating the parent class object
		
		pageTitle();
		super.pageTitle();
		//calling parent class method without creating the parent class object
		
	}

	public void pageTitle() {
		System.out.println("Login page title");
	}

}
