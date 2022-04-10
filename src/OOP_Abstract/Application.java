package OOP_Abstract;

public abstract class Application {

	//Inside Interface all the methods are abstract in nature by default
	//no non abstract methods inside Interface
	//100% abstraction is also possible
	
	// as shown below abstract class or Interface are just like guidelines to be followed by 
	//child class
	//Application abstract class as shown below is saying that
	//any child class should have serverSetup, dbSetup, envSetup
	
	//but how the child class is going to do serverSetup, dbSetup, envSetup is the 
	//responsibility of child class -- it has to write business logic 
	//overriding these methods
	
	//This is partial abstraction
	
	//so zero to hundred % abstractionn is possible
	
	//but in case of Interface only 100% abstraction is possible
	
	
	public abstract void serverSetup();
	public abstract void dbSetup();
	public abstract void envSetup();
	
	//But as shown below abstract class can have it's non-abstract method as well
	//It wants every child class should obey same UILayerComponents
	
	//as shown below you can have non-abstract methods (like methods having method body)
	//inside abstract class
	
	
	public void UILayerComponents() {
		System.out.println("Application - UILayerComponents");
	}
	
}
