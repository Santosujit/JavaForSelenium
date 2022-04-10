package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();
		// generics is String
		// so you can store only Strings in above ArrayList

		ar.add("A");
		ar.add("B");
		ar.add("C");

		System.out.println(ar);// output --- [A, B, C]

		System.out.println(ar.size());// 3

		ar.clear();// It will create the contents of the array list,
		// it will not delete the ArrayList

		System.out.println(ar);
		System.out.println(ar.size());

		System.out.println("******************");

		ArrayList<String> ar1 = new ArrayList<String>();

		ar1.add("A");
		ar1.add("B");
		ar1.add("C");
		ar1.add("D");

		System.out.println(ar1);

		// I want to create a copy of ar1 array list, so use ar1.clone() method
		// shallow copy means exact copy
		// deep copy is not supported by Java

		System.out.println("Cloning");

		// ar1.clone();

		ArrayList<String> ar2 = (ArrayList<String>) ar1.clone();

		// ar1.clone() is giving you an object,
		// u have to convert it to arraylist of string type,
		// then store it in another arraylist

		System.out.println(ar2);

		// contains method

		// Our ArrayList --- [A, B, C, D]

		System.out.println(ar1.contains("D"));// It will return true or false --- true
		System.out.println(ar1.contains("W"));// false

		System.out.println("Indexof Method");

		System.out.println(ar1.indexOf("B"));
		System.out.println(ar1.indexOf("B") > 0);

		ArrayList<String> ar3 = new ArrayList<String>(2);
		// virtual capacity of ArrayList is by deafult 10, but here it is 2
		// as we have explicitly specified

		ar3.add("Test");
		ar3.add("Selenium");

		System.out.println(ar3);

		// How to increase the virtual capacity of ArrayList using ensureCapacity()
		// method

		ar3.ensureCapacity(15);// Now the virtual capacity will increased to 15

		// why we need virtual capacity ---
		// Java can't give you free memory --- for memory management
		// In case ArrayList they give you virtual capacity 10
		// In case HashMap they give you virtual capacity 16
		// If you create 100 ArrayList, they will create 100*10 virtual capacity

		// forEach --- JDK 1.8 with Lambda

		System.out.println("forEach method");

		// forEach method will behave like forEach loop
		// e is any variable which will go to the ArrayList ar1
		// one by one and will supply values to println using -> lambda

		ar1.forEach(e -> System.out.println(e));

		ar1.forEach(name -> System.out.println(name));

		ar1.forEach(e -> System.out.println(e.toLowerCase()));

		ArrayList<String> EmpList = new ArrayList<String>();

		EmpList.add("Tom");
		EmpList.add("Peter");
		EmpList.add("Naveen");
		EmpList.add("Ruchi");

		System.out.println(EmpList);

		// sorting
		// Collections is a class where sort method is present

		Collections.sort(EmpList);
		System.out.println(EmpList);

		Collections.sort(EmpList, Collections.reverseOrder());
		System.out.println(EmpList);

		// Lambda does magic, It shrinks your code

		System.out.println(EmpList.indexOf("W"));

		// indexOf() method returns -1 if element is not found in the ArrayList

//		ArrayList.contains() method
//		Method is used to check whether an element is exists in the ArrayList or not, 
//		this method return "false" if element is not found, 
//		and returns "true" if element exists in the ArrayList.

		if (EmpList.contains("OMSai")) {
			System.out.println("Element is found");
		} else {
			System.out.println("Element is not Found");
		}

		if (EmpList.contains("Tom")) {
			System.out.println("Element is found");
		} else {
			System.out.println("Element is not Found");
		}

	}

}
