package ConstructorConcepts;

//part of 11th class

import java.util.ArrayList;

public class TestDrive {

	public static void main(String[] args) {
		
		//CarDesign car_aulto = new CarDesign(); error in this line as there is no default constructor
		//Nobody can create objects having zero parameter, constructor is restricting it --- advantage
		
		//we are designing diff Cars here by creating diff car objects
		
		//ArrayList is order based
		
		CarDesign car_aulto = new CarDesign("Aulto","Grey");
		System.out.println(car_aulto.name+" "+car_aulto.color+" "+car_aulto.mileage);
		
		CarDesign car_bmw = new CarDesign("BMW","Black",100,'Y');
		System.out.println(car_bmw.name+" "+car_bmw.color+" "+car_bmw.price+" "+car_bmw.isAvailable);
		System.out.println("Available or Not "+car_bmw.isAvailable);
		
		//diff car even if same audi has diff features
		//so we are adding features in this class, not in template class of carDesign class
		
		ArrayList<String> audiQ5Features = new ArrayList<String>();
		audiQ5Features.add("Automatic Parking");
		audiQ5Features.add("More Air Bags");
		audiQ5Features.add("Wide Sun Roof");
		audiQ5Features.add("Lane Assist");
		
		CarDesign audi_q5 = new CarDesign("Audi","White",81,12.25,false,'Y',audiQ5Features);
		System.out.println(audi_q5.name+" "+audi_q5.color+" "+audi_q5.price+audi_q5.mileage+audi_q5.isElectric+audi_q5.isAvailable+audi_q5.featureList);
		
		System.out.println(audi_q5.featureList);
		
		String f1 = audi_q5.featureList.get(0);
		System.out.println(f1);
		
		
	}

}
