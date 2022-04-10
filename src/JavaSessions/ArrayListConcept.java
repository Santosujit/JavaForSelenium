package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

// diff class name like ArrayListConcept and Array List, never make the name same

	// without ArrayList you can't automate using selenium or cypress due to it's
// dynamic behaviour

// we don't have to bother about size of the array ---
// it will decrease or increase accordingly just by adding or removing the values 
//size will increase or decrease automatically or dynamically
// Default capacity of ArrayList is 10
//Default capacity of HasMap is 16
//ArrayList is Order Based or index based
//HashMap is Orderless or no index is there, meaning the 1st element may not be stored in 0th position

	public static void main(String[] args) {

		// ArrayList --- Dynamic Array - It is a class already available in Java --so
		// you have to create object of this ArrayList class
		// static array ---

		// short cut for import - ctrl+shift+o
		// Short cut to format the codes or align the codes is ctrl+shift+F (F or S
		// Confused)

		// 1st you have to Create object of ArrayList first

		// It's a index based collection or linear collection
		// 1st value will be given at 0 position

		ArrayList ar = new ArrayList();

		// here Physical capacity is 0, Virtual capacity is 10
		// new is a keyword to create object of ArrayList class
		// no need to define the size, It will be increased or decresed automatically
		// you can also give the size

		System.out.println(ar.size());// Here Physical capacity is zero(bits or bytes). Virtual capacity is 10(10
										// memory locations are available)
		// ArrayList ar = new ArrayList(20);//Virtual Capacity will be 20 as you have
		// specified
		// after entering 10 values, it will again give 5 virtual locations

		ar.add(100);
		ar.add(200);

		System.out.println(ar.size());// 2

		ar.add(300);
		ar.add(400);

		System.out.println(ar.size());// size is increasing automatically --- this is the Physical capacity

		// How ArrayList works internally --- concept

		// .length() method is for static array, and .size() method is for ArrayList

		ar.add(500);
		ar.add(600);
		ar.add(700);

		System.out.println(ar.size());// 7 --- Pc

		ar.add(800);
		ar.add(900);
		ar.add(1000);

		System.out.println(ar.size());// 10 ---Pc

		ar.add(1100);// Pc = 11
		ar.add(1200);

		System.out.println(ar.size());// 13

		System.out.println("how to print all the values from ArrayList:- use for loop");

		for (int i = 0; i < ar.size(); i++) {// here less than not less than equal to
			System.out.println(ar.get(i));
		}

		System.out.println("Print all values using forEach Loop");

		for (Object e : ar) {
			System.out.println(e);
		}

	}

}
