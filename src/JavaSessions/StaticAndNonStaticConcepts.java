package JavaSessions;

public class StaticAndNonStaticConcepts {

	String name;
	static int age;

	public void getName() {
		System.out.println("get Name --- Non-static method");
	}

	public static void getInfo() {
		System.out.println("get Info --- Static method");
	}

	public static void main(String[] args) {

		StaticAndNonStaticConcepts obj = new StaticAndNonStaticConcepts();

		obj.name = "Gopal";
		System.out.println(obj.name);

		obj.getName();

		age = 38;
		System.out.println(age);

		StaticAndNonStaticConcepts.age = 40;
		System.out.println(age);

		getInfo();
		// static methods and variables can be called directly without using class name
		// inside the same class

		StaticAndNonStaticConcepts.getInfo();// can be called using class name as well

	}

}
