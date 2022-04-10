package ConstructorConcepts;

public class Employee {

	String name;
	int age;
	String dob;
	String city;
	boolean isPermanent;

//right click->source->Generate Constructors using Fields

	public Employee() {// constructor name should be same as class name
						// this is default constructor having zero parameter
		System.out.println("default constructor");
	}

	public Employee(String name) {// here name is the local variable
		System.out.println("1 parameter constructor");
		this.name = name;// if you comment this line then it e2,name will print Null
		// this.name is the class variable, and name is the local variable inside this
		// Constructor
		
//		Give me the name, this is stored in this.name, then I will give it to class vriable name
	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Employee(String name, int age, String dob, String city, boolean isPermanent) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.city = city;
		this.isPermanent = isPermanent;
	}

	public static void main(String[] args) {

		Employee e1 = new Employee();// constructor is called on this line when object got created
//		In above case default constrcutor will be called

		Employee e2 = new Employee("Gopal");// Gopal 'll be given to local variable name,
		// then it 'll be given to class variable this.name
		System.out.println(e2.name);

		Employee e3 = new Employee("Shreyas", 12);
		System.out.println(e3.name + " " + e3.age + " " + e3.city + " " + e3.dob + " " + e3.isPermanent);
		// for above line 5 class variables will be stored inside the object when u
		// create an object,
		// but for three values null will be stored as u v not initialised them using
		// constructor
		// when object is created, photo copies of all class variables also gets stored
		// inside the object

		Employee e4 = new Employee("Dablu", 12, "20-07-1982", "Switzerland", true);
		System.out.println(e4.name + " " + e4.age + " " + e4.city + " " + e4.dob + " " + e4.isPermanent);

	}

}
