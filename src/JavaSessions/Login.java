package JavaSessions;

public class Login {

	// String username = "dabulu@gmail.com";//hard coded values - not a good
	// practice

	String username;
	String password;
	String title;
	String url;

	public static void main(String[] args) {

		Login googleLogin = new Login();// googleLogin is the object reference here

		googleLogin.username = "admin";
		googleLogin.password = "admin123";
		googleLogin.title = "Login";
		googleLogin.url = "https://www.google.com";

		System.out.println(googleLogin.username);
		System.out.println(googleLogin.password);
		System.out.println(googleLogin.title);
		System.out.println(googleLogin.url);

		// now you can create for amazon using the shared class variables

		System.out.println("******Create amazon log in info*******");

		Login amazonLogin = new Login();
		// It will create a object with all 4 shared class variables inside it

		amazonLogin.username = "santosh";
		amazonLogin.password = "santosh123";
		amazonLogin.url = "https://www.amazon.in";
		// I have not given the values of title,
		// but title variable will be stored inside object bhaving no values

		System.out.println(amazonLogin.username);
		System.out.println(amazonLogin.password);
		System.out.println(amazonLogin.url);
		System.out.println(amazonLogin.title);// null

	}

}
