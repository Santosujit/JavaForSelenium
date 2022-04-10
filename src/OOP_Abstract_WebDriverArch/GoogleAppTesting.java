package OOP_Abstract_WebDriverArch;

public class GoogleAppTesting {
	
	static WebDriver driver;//class variable
	                        //made it static as I want to access it directly
	                        //don't want to create object for it

	public static void main(String[] args) {
		
//		ChromeDriver driver = new ChromeDriver();
//		
//		//FirefoxDriver driver = new FirefoxDriver();
//		
//		//SafariDriver driver = new SafariDriver();

		// top casting: Cross browser testing
		//child class object referred by parent interface reference variable
		//WebDriver driver = new ChromeDriver();
		String browser = "chrome";

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("please pass the correct browser...");
		}

		driver.get("http://www.google.com");
		driver.getTitle();
		driver.getPageUrl();
		driver.findElement("username");
		driver.quit();

	}

}
