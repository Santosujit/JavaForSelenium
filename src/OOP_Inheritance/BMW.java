package OOP_Inheritance;

public class BMW extends Car {

//	here BMW extends Car class, so no need to create car class object, just
//	create BMW class object and access car class variables and methods

//	a child class can inherit methods, and variables from parent as well as grand parent
//	a child can't have more than one or multiple parents --- 
//	multiple inheritance is not allowed in Java --- It's called Diamond problem
//	but a child can access property of grand parent --- multi level inheritance is allowed in Java
//	
//	a child class may contain it's own methods, inherited methods, and overridden methods
//	
//	BMW Child class is accessing methods from Car, and vehicle class, 
//	so no need to write them again in the child BMW clsss --- advantage
//	
//	method overriding --- when we have a parent class having the same method with the same name, 
//	and same number of parameters
//	in child class --- is called method overriding

	@Override
	public void start() {
		System.out.println("BMW --- Start");// overridden method

	}

	public void autoParking() {
		System.out.println("BMW --- AutoParking");// own method of BMW

	}

	public static void sunRoof() {
		System.out.println("BMW --- sunRoof");// static method can't be overridden in Java
	}

//	method overloading --- poly+morphism --- compile time polymorphism
//	as complier is happy
//	compiler is able to decide which method to call

	public void musicSystem() {
		System.out.println("BMW --- Music System");
	}

	public void musicSystem(String CD) {
		System.out.println("BMW --- Music System " + CD);
	}

	public void musicSystem(String CD, double radioFrequency) {
		System.out.println("BMW --- Music System " + CD + " Frequency-> " + radioFrequency);
	}
}
