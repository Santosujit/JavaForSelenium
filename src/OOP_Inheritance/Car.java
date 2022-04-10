package OOP_Inheritance;

//Car is the parent class, and BMW is the child class
//car's parent is vehicle
//vehicle class is the grand parent of BMW class
//a parent can have multiple child classes
//but a child can't have multiple parents

public class Car extends Vehicle {

//  if you make this class final then it can't be inherited
//	Final classes can't be parents class
//	Final class can't be inherited
//	Final methods can't be overridden
//	Final variable can't be changed
//	finally and finalize are used for clean up code, meaning resource deallocation like
//	closing DB connection, closing network connection

//	finallly block is used with try-catch block
//	finally block is executed whether there is exeception or not, 
//	whether exception is handles or not
//	finally block can be used with one try block also, catch block is not compulsory

//	finalize method is called just before garbage collector destroys the object

//	finally is a block but finalize is a method

//	BMW class has a start(), stop(),refuel(), sunRoof() methods

	int engine = 10;

	public void start() {
		System.out.println("Car --- Start");
		// if you make this method final then It can't be overridden
	}

	public void stop() {
		System.out.println("Car --- Stop");
	}

	public void refuel() {
		System.out.println("Car --- Refuel");
	}

	public static void sunRoof() {
		System.out.println("Car --- sunRoof");
	}

}
