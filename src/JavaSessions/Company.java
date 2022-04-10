package JavaSessions;

import java.util.ArrayList;

public class Company {

	String name;
	int empCount;

	// you can create methods below the main method or above the main method
	// just you have to create objects inside main method
	// and using object reference you have to call methods
	// main method does not return anything, so always main method is void
	// no business logic is written inside main methood
	// no return keyword is allowed inside main method
	// return and void can not co-exits together

	public String getCEOName() {

		return "Tom";
	}

	public int getTotalCounnt() {
		System.out.println("get total count of the shares");
		int totalShare = 2000;

		return totalShare;

	}

	public String[] getCoFounders() {// return type is array of string type

		System.out.println("get CoFounders");

		String founder[] = new String[3];
		founder[0] = "Tom";
		founder[1] = "Peter";
		founder[2] = "Krishna";

		return founder;

	}

	public ArrayList<String> getCustomerLists() {// return type is arraylist of string type
		System.out.println("customer lists");

		// customer list is dyanamic in nature, so we have to create a ArrayList

		ArrayList<String> custList = new ArrayList<String>();

		custList.add("WholeFoods");
		custList.add("Microsoft");
		custList.add("Amazon");
		custList.add("Google");

		return custList;

	}

	public static void main(String[] args) {

		Company comp = new Company();

		System.out.println(comp.getCEOName());// bad practice

		String c = comp.getCEOName();
		System.out.println(c);// better practice as variable c can be reused

		System.out.println(comp.getTotalCounnt());// bad practice

		int share = comp.getTotalCounnt();// good practice
		System.out.println(share);

		for (String e : comp.getCoFounders()) { // Bad practice
			System.out.println(e);
		}

		String founderArray[] = comp.getCoFounders();

		// comp.getCoFounders() will return an Array, store this array in array variable
		// founderArray
		// then iterate founderArray with forEach Loop

		System.out.println(founderArray.length);// 3 --- Good practice
		for (String e : founderArray) {
			System.out.println(e);
		}

		ArrayList<String> ar = comp.getCustomerLists();// ar is not variable rather it is object reference variable
		System.out.println("total no of customers is: " + ar.size());
		for (String e : ar) {
			System.out.println(e);
		}

	}

}
