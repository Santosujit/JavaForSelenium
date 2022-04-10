package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();//overridden method in the child class will be called
//		overridden start() method will be called in the above line of code
//		suppose BMW wants to use a diff start method defined in car class, 
//		so overriding it
		BMW.sunRoof();//overridden method will be called
		b.autoParking();// own method of BMW
		b.stop();// inherited method, no need to create car class object to call this method
		b.refuel();// inherited method
		System.out.println(b.engine);

		b.musicSystem();
		b.musicSystem("Bollywood");
		b.musicSystem("KishoreRafi", 94.3);

		b.engine();// accessing grand parent's property or method

		// b can't access heavyLoading method from Truck class as multiple parents not
		// allowed

		System.out.println("-----------------");

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		System.out.println(c.engine);
		c.engine();
		Car.sunRoof();

//		Top casting
//		child class object can be referred by parent class reference variable
//		parent class reference variable referring to child class object is called top casting

		System.out.println("-------------------");

		Car c1 = new BMW();// all BMWs are car so allowed

		c1.start();// start method is present both in car and BMW class
		c1.stop();
		c1.refuel();
		c1.sunRoof();

//		c1.autoParking(); --- Not allowed. As c1 will say that I am coming from Car
//		not from BMW. so reference check failed
//		Reference type check

//		down casting
//		child class reference variable can't refer parent class object
//
//		BMW b1 = (BMW)new Car();//no compile time error
//		all cars are not BMW, so not allowed
//		you are converting a maruti alto to BMW by painting, putting a BMW logo but
//		same alto engine
//		while BMW ref variable (driver) will run the car, it will know that It is a
//		Alto not a BMW
//		so it is run time exception
//		ClassCastException:
//		compile time it is ok

//		Mehtod Overloading is a compile time polymorphism as Compiler is able to decide
//		which methods to call as they are in the same class.a It is called 
//		static polymorphism
//		
//		Method Overriding is a run time polymorphism as Compiler is confused which method to call
//		It is decided at run time
	}

}
