package Assignments;

import java.util.ArrayList;

public class ConstructorAssignment1 {

	String name;
	String country;
	String establishedDate;
	ArrayList<String> courseList;

	public static void main(String[] args) {

//		1. Design a University class template with the following features:
//			 variables:
//			name
//			country
//			stablishedDate
//			List of course provided in Array List<String>
//
//			--Design the constructor of this class with different parameters and all parameters.
//
//			--Write the get method of each variable with return keyword. 
		
		ConstructorAssignment1 univ = new ConstructorAssignment1("KiiT","India","21-21-1991");
		System.out.println(univ.country);
		
		ArrayList<String> CL = new ArrayList<String>();
		CL.add("ETC");
		CL.add("CS");
		CL.add("Mechanical");
		
		ConstructorAssignment1 fullDetails = new ConstructorAssignment1("ITER","India","21-21-2000", CL);
        System.out.println(fullDetails.name+" "+fullDetails.country+fullDetails.establishedDate+" "+fullDetails.courseList);
        String s1 = CL.get(0);
        System.out.println(s1);
        
    
        
	}
	

	public ConstructorAssignment1(String name, String country, String establishedDate, ArrayList<String> courseList) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.courseList = courseList;
	}

	public ConstructorAssignment1(String name, String country, String establishedDate) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
	}
	

}
