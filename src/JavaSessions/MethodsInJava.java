package JavaSessions;

public class MethodsInJava {

	// You can't create a method inside a method -- so you can't create a method
	// inside main method
	// always create methods outside main method
	// then create object inside main method and call methods using the object
	// reference
	// main method will be called directly by java, but other methods will be called
	// by object references
	// why main is void as main method does not return anything

	public static void main(String[] args) {

		// you have to call the function inside main method
		// to call the function you have to create the object

		MethodsInJava obj = new MethodsInJava();
		obj.test();
		int p = obj.getMarks();// p is the holding parameter to store the integer
		System.out.println(p);
		System.out.println(obj.getMarks());

		String val = obj.getName();
		System.out.println(val);

		int s1 = obj.sum(10, 20);
		System.out.println(s1);

		System.out.println(obj.sum(40, 50));// not a good practise

	}

	// 1. no input and no return method
	// void --- does not return any values
	// return type: void

	public void test() {
		System.out.println("test method");
	}

	// 2. no input but return
	// return type: int

	public int getMarks() {
		System.out.println("get marks method");
		int total = 100;
		int bonus = 50;
		int totalMarks = total + bonus;// 150

		return totalMarks;// return is a keyword so r is small
	}

	public String getName() {
		System.out.println("get name method");
		String s = "Naven";
		return s;
	}

	// 3. input and return

	public int sum(int a, int b) {
		System.out.println("sum method");
		int z = a + b;
		return z;
	}

}
