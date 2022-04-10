package OOP_Encapsulation;

//part of 12th class - encapsulation, getter and setter
//we are creating mann users or employees having diff name, id, age but of same company

public class Users {

	public String name;
	public int age;
	public int id;

	public static String compName = "Infosys";

//	we created company as static as all employees belong to Infosys in our case

	// create one default constructor, and another full parameterized constructor

	public Users() {// default constrcutor

	}

	public Users(String name, int age, int id) {// parameterized constructor

		this.name = name;
		this.age = age;
		this.id = id;
	}

	// create getter and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
