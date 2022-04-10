package JavaSessions;

public class Employee {

//	class variables - global scope  - 
//	we can use these class variables inside the class wherever we want
//	This is a template - every employee should have a name, age, salary, and isActive status
//	Using template we can create multiple objects

	String name;
	int age;
	double salary;
	boolean isActive;

	@Override
	public void finalize() {
		System.out.println("inside the Employee class finalize method....");
	}

	public static void main(String[] args) {

		// create object of this class
		// new keyword is used to create object

		Employee e1 = new Employee();

//		e1 is not the object It is the object reference, e1 is stored in stack memory, not in Heap
//		Object References are stored in Stack memory - RS
//		Stack memory operates as per LIFO
//		RHS of above equation or new Employee() is the object
//		e1 is the name of the object just like Naveen is my name, I can change the name
//		One person can have multiple names, so as one object
//		one reference variable can point to multiple objects
//		Naveen or e1 is the name of the object, but it is not the object
//	    Photo Copy of class variables will be stored inside each object

		// System.out.println(name); we can't access name directly

		System.out.println("*********Default values of data types**********");

		System.out.println(e1.name);// default values of String is null
		System.out.println(e1.age);// default values of integer is 0
		System.out.println(e1.salary);// default values of double is 0.0
		System.out.println(e1.isActive);// default values of boolean is false

		System.out.println("**********Initialization*************");

		e1.name = "Santosh";
		e1.age = 30;
		e1.salary = 67.00;
		e1.isActive = true;

		System.out.println(e1.name);// Santosh
		System.out.println(e1.age);// 30
		System.out.println(e1.salary);// 67.00
		System.out.println(e1.isActive);// true

		// object reference can not be duplicate

		System.out.println("*******create a new object**********");

		Employee e2 = new Employee();

		e2.name = "Dabulu";
		e2.age = 38;
		e2.salary = 67.00;
		e2.isActive = false;

		System.out.println(e2.name + " " + e2.age + " " + e2.salary + " " + e2.isActive);

		// Can I create an object without any object name or object reference

		new Employee();// not a good practice -- object without any object name

		Employee e3 = new Employee();
		e3 = null;// object with null reference

		e3.name = "Testing";

		// System.out.println(e3.name);//It will give NullPointerException

		// System.gc();//If JVM is not understanding that heap memory is full,
		// then you can gc by yourself -- only for heap memory

	}

}
