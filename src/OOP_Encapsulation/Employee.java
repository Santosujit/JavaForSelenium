package OOP_Encapsulation;

//part of 12th class - encapsulation, getter and setter

//as shown below salary and address are private variables
//I dont want to give external user direct access to private variables and private methods
//so I will create public layer over private variables in the form of setter and getter methods
//so external user can approach public layer first to set and get the values of the private layers
//shortcut for getter and setter
//right click->source->Generate getter and setter

public class Employee {

	public String name;
	public int age;
	private int salary;// salary needs to be a private variable,
	// not everybody should access salary variable
	private String address;

	// public setter and getter methods create for ur private variables, even for
	// public u can create
	// 1st u set the value then get the values
	// 1st set the private variable, then access the private variable

	public int getSalary() {
		return salary;//this salary is the class variable salary
	}
	
	

	public void setSalary(int salary) {
		this.salary = salary;// this.salary is class variable but salary is local variable
//		Give me the salary, I will give this salary value to the salary class variable
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {

	}

}
