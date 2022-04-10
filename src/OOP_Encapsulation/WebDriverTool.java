package OOP_Encapsulation;

//part of 12th class - encapsulation, getter and setter
//best example of data hiding or encapsulation is
//when you call driver.quit() method, selenium may be calling hundreds of methods internally
//but you dont know about these internal methods
//Selenium has hided the internal implementaion from the user
//click driver.quit(), and browser gets closed thats what only user has access

public class WebDriverTool {

	public void launchBrowser(String browser) {

		if (browser.equals("chrome")) {

			launchChrome();

		} else if (browser.equals("firefox")) {

			launchFirefox();

		} else {
			System.out.println("please pass the correct browser");
		}

	}

	private void launchChrome() {
		System.out.println("checking Chrome version");
		System.out.println("checking OS version");
		System.out.println("launch Chrome");
	}

	private void launchFirefox() {
		System.out.println("checking fireFox version");
		System.out.println("checking OS version");
		System.out.println("launch fireFox");
	}

}
