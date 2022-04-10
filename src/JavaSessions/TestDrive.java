package JavaSessions;

import java.io.ObjectInputStream.GetField;

public class TestDrive {

	//part of 10th video
	
	public static void main(String[] args) {
		
		//Try to access variables and methods from CarDesign Class
		//so we have to create object of that carDesign class only
		
		CarDesign c1 = new CarDesign();
		c1.name = "Tesla";
		c1.color = "White";
		c1.price = 80;
		
		c1.steering();//accessing steering method from another class
		
		CarDesign.CarInfo();
		
		
		CarDesign c2 = new CarDesign();
		c2.name = "BMW";
		c2.color = "Blue";
		c2.price = 70;
		
		CarDesign c3 = new CarDesign();
		c3.name = "Audi";
		c3.color = "White";
		c3.price = 91;
		
		System.out.println(c1.name+" "+c1.color+" "+c1.price+" "+CarDesign.wheels);
		System.out.println(c2.name+" "+c2.color+" "+c2.price+" "+CarDesign.wheels);
		System.out.println(c3.name+" "+c3.color+" "+c3.price+" "+CarDesign.wheels);


	}

}
