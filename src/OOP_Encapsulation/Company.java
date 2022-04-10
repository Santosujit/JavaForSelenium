package OOP_Encapsulation;

//part of 12th class - encapsulation, getter and setter

public class Company {

	public String name;
	public int empCount;
	private int sharePrice;// private method --- can only be accessed inside same class only
	// outside this class this class private variables and methods can't be accessed

	public String getCEOName() {
		return "Tom";
	}

	private int totalSharePrice() {
		return 1000;
	}

	public static void main(String[] args) {

		Company comp = new Company();
		// I can access Company class variables and methods through comp
		//Photo copies of class variables is shared accross all the Objects

		comp.name = "Infosys";
		System.out.println(comp.name);
		comp.empCount = 100000;
		System.out.println(comp.empCount);
		comp.sharePrice = 10000;// can access the private variable inside the same class only
		System.out.println(comp.sharePrice);

		System.out.println(comp.getCEOName());
		System.out.println(comp.totalSharePrice());

	}

}
