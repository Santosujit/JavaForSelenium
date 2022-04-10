package OOP_Encapsulation;

//part of 12th class - encapsulation, getter and setter
//To test Users class, we created this UserTest class

public class UserTest {

	public static void main(String[] args) {

		Users user = new Users();

		// how many ways we can set values for the class variables --- 3 ways
		// 1st way - direct access

		user.name = "Shreys";
		System.out.println(user.name);

		// 2nd way --- using construcors - Best approach

		Users u1 = new Users("Ruchi", 28, 15694);// u1 is one object or one user or one employee.
		System.out.println(u1.name + " " + u1.age + " " + u1.id);

		// 3rd way -- using getter and setter

		Users u2 = new Users();

		u2.setName("Ankita");
		u2.setAge(29);
		u2.setId(111);

		// after setting the class variables, how many ways you can get the values --- 2
		// ways

		// 1st way --- getter

		System.out.println(u2.getName() + " " + u2.getAge() + " " + u2.getId());

		// 2nd way --- direct access

		System.out.println(u2.name + " " + u2.age + " " + u2.id);

		// accessing static variables

		System.out.println(user.compName);
		System.out.println(Users.compName);
	}

}
