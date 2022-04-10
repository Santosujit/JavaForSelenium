package OOP_Abstract;

//LoginPage == LP

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("LoginPage -- constructor...");
	}

	//all the abstract methods should be implemented or should have method body
	//with business logic inside child class	
	
	@Override
	public void title() {
		System.out.println("LP - title");
	}

	@Override
	public void url() {
		System.out.println("LP - url - > http://www.xyz.com");

	}

	@Override
	public void loading() {
		System.out.println("LP - loading");
	}
	
	//as well as child class can have it's own methods
	
	public void doLogin(String un, String pwd) {//own method of LoginPage class
		System.out.println("login with : " + un +" "+ pwd);
	}

	public void doLogin(String un, String pwd, String emailId) {//method overloading
		System.out.println("login with : " + un +" "+pwd +" "+ emailId);
	}

}
