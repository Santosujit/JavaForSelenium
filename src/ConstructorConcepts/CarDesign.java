	package ConstructorConcepts;

import java.util.ArrayList;

//part of 11th session
//Constructors are used to initialise or give values to class variables from the constructor variables
//Constructors are used to design the Objects

public class CarDesign {

	//we are going create a template here, so remove the main method
	
	String name;
	String color;
	int price;
	double mileage;
	boolean isElectric;
	char isAvailable;
	ArrayList<String> featureList;//
	
	public CarDesign(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public CarDesign(String name, String color, int price, char isAvailable) {
		
		this.name = name;
		this.color = color;
		this.price = price;
		this.isAvailable = isAvailable;
	}

	public CarDesign(String name, String color, int price, double mileage, boolean isElectric, char isAvailable,
			ArrayList<String> featureList) {
		
		this.name = name;
		this.color = color;
		this.price = price;
		this.mileage = mileage;
		this.isElectric = isElectric;
		this.isAvailable = isAvailable;
		this.featureList = featureList;
	}
	
	
	
	
	
	
	
  

}
