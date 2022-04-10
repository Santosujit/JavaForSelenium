package OOP_Encapsulation;

//part of 12th class - encapsulation, getter and setter

public class TestComp {

	public static void main(String[] args) {
		
		Company c1 = new Company();
		//I can access Company class variables and methods through c1
		
		c1.name = "Amazon";
		c1.empCount = 1000000;
		
		System.out.println(c1.name);
		System.out.println(c1.empCount);
		//c1.sharePrice ; can't access this private variable from another class
		
		c1.getCEOName();
		//c1.totalSharePrice -- can't access this private method from another class
		
		Employee e1 = new Employee();
		//I can access Employee class public variables and public methods through e1
		
		e1.setSalary(100000);
		System.out.println(e1.getSalary());
		
		e1.setAddress("S1/46/Niladri Vihar");
		System.out.println(e1.getAddress());
		
		

	}

}
