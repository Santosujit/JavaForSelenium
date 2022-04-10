package OOP_Abstract;

public abstract class Page {

	// You can not create the object of abstract class
	// You can not create object of Interface

	// page class constructor will be called when we create the object of child
	// class
	// but 1st parent class constructor, then child class constructor will be called
	// some abstract methods and some non abstract methods: partial abstraction -
	// advantage

	

	public Page() {
		System.out.println("Page -- constructor....");// you can create constructor of abstract classes
	}

	// abstract methods should not have method body, should be overridden inside
	// child class
	// Inside Interface all the methods are by default abstract in nature
	// abstract methods should only be defined under abstract classes

	public abstract void title();
	// abstract methods should not have method body, should be overridden inside
									// child class

	public abstract void url();// abstract methods should not have method body

	public abstract void loading();// abstract methods should not have method body

	public void header() {// abstract class can have it's own
							// non-abstract methods inside it
		System.out.println("Page -- header - Non-Abstract Method inside Abstract class");
	}

	public static final void logo() {// abstract class can have it's own
										// static methods inside it
		System.out.println("Page -- logo");
	}

}
