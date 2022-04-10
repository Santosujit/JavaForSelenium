package OOP_Abstract_WebDriverArch;

public interface WebDriver {
	
	//It's an Interface - so 100% abstraction
	//all the below methods are by default abstract in nature - no method body
	//child class has to implement these methods
	//implement means - child class has to override these methods with their own 
	//business logic
	
	//WebDriver defined the rules as shown below
	//but how exactly the ChromeDriver wants to quit is their responsibility
	//ChromeDriver will write it's own business logic

	public void get(String url);

	public void getTitle();

	public void getPageUrl();

	public void findElement(String locator);

	public void quit();
	
}
