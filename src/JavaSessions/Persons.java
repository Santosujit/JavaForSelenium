package JavaSessions;

public class Persons {

	// part of 10th video

	public static void main(String[] args) {

		Persons p1 = new Persons();
		p1.getName();

	}

	public void getName() {
		System.out.println("get Name");
		getCity();
		System.out.println("Lets See");
		// one non-static method can call another non-static method inside it
		// without creating object as they reside in same area of the memory inside Heap
	}

	public void getCity() {
		System.out.println("California");
		getAddress();
		System.out.println("Again Lets see");

	}

	public void getAddress() {
		System.out.println("San Jose");
	}

	public void getPhone() {
		System.out.println("99999");
	}
}
