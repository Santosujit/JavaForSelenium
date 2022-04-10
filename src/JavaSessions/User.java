package JavaSessions;

public class User {

	String name;
	int age;
	String city;

	public static void main(String[] args) {

		// Interview Question

		User u1 = new User();
		u1.name = "Santosh";
		u1.age = 28;
		u1.city = "Bangalore";

		User u2 = new User();
		u2.name = "Puneet";
		u2.age = 27;
		u2.city = "Mumbai";

		User u3 = new User();
		u3.name = "Akshya";
		u3.age = 22;
		u3.city = "Kakatpur";

		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

		u1 = u2;
//		u1 will cut the reference to it's object, u1 will now point to object referred by u2

		System.out.println("****************");

		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

		u2 = u3;
//		u2 will cut the reference to it's object, u2 will now point to object referred by u3

		System.out.println("****************");

		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

		u3 = u1;

//      u3 will cut the reference to it's object, u3 will now point to object referred by u1
//        But u1 is reffering to the 2nd object now, so u3 and u1 will refer to the 2nd object

		System.out.println("****************");

		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

	}

}
