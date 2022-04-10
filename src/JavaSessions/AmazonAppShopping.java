package JavaSessions;

//This is called builder pattern or method chaining
//It is used in workflow based application
//you can create multiple use cases based on your workflows
//you can log in and log out directly - one workflow
//you can log in, add to cart, make payment, log out - 2nd workflow
//you can log in and make payment and log out 
//(in case product is already in the cart - 3rd workflow
//meaning you can log in then directly go to the cart
//meaning you can log in then directly log out

public class AmazonAppShopping {

	public static void main(String[] args) {

		AmazonApp shop = new AmazonApp();
		
		shop.login(99922229, 999)
			.search("Apple MacBook Pro")
			.addToCart("Apple MacBook Pro")
			.payment("12121 2121 2121 2121")
			.logout();
		
		System.out.println("-----");
		
		shop.login("naveen@gmail.com", "naveen123")
			.addToCart("Samsung s10")
			.payment("12121 21212 121 212")
			.logout();
		
		System.out.println("-----");
		
		shop.login("naveen@gmail.com", "naveen123")
			.logout();
		
		System.out.println("-----");

	}

}