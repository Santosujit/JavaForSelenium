package JavaSessions;

public class CarDesign {

	// part of 10th video

	String name;
	String color;
	int price;
	static int wheels;// static variables stored in CMA - Common Memory Allocation

	public void steering() {
		System.out.println("steering info");
	}

	public static void CarInfo() {
		System.out.println("get Car Info");
		engine();
		// one static method can call another static method as they reside in the same
		// CMA
		// inside it without creating object as they reside in same area of the memory
	}

	public static void engine() {
		System.out.println("engine info");
	}

	// name, color, and price are different for diff cars so we created 3 objects
	// for three cars
	// but wheels is a commmon for all the cars, so we created wheels as static
	// all objects will share the wheels variable

	public static void main(String[] args) {

		CarDesign c1 = new CarDesign();
		c1.name = "Tesla";
		c1.color = "White";
		c1.price = 80;

		CarDesign c2 = new CarDesign();
		c2.name = "BMW";
		c2.color = "Blue";
		c2.price = 70;

		CarDesign c3 = new CarDesign();
		c3.name = "Audi";
		c3.color = "White";
		c3.price = 91;

		System.out.println(c1.name + " " + c1.color + " " + c1.price + " " + CarDesign.wheels);
		System.out.println(c2.name + " " + c2.color + " " + c2.price + " " + wheels);
		System.out.println(c3.name + " " + c3.color + " " + c3.price + " " + wheels);

//		you can access wheels directly or by using class name

	}

}
