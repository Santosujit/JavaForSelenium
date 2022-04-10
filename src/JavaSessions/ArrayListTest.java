package JavaSessions;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		System.out.println("*******Integer Array***********");

		ArrayList ar = new ArrayList();

		// short cut to import --- ctrl+shift+O for windows or command+shift+O for mac

		ar.add(100);
		ar.add("Testing");
		ar.add(100);
		ar.add('M');
		ar.add(12.33);// raw type

		System.out.println(ar.get(1));
		// testing
		// .add method to add values, and .get method to fetch values from the ArrayList
		// get() method to retrieve the values from the ArrayList
		// Collections means which collects the Data

		// generics --- define our collection --- what kind of data we can collect

		// integer type of ArrayList
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		// ArrayList<int> marksList = new ArrayList<int>() --- wrong ArrayList can't
		// hold primitive data types

		marksList.add(100);

		// marksList.add(12.22); --- you can't add double

		//

		System.out.println("****Object Array******");

		ArrayList<Object> gradeList = new ArrayList<Object>();// you can store multiple data types

		gradeList.add(100);// 0th Index
		gradeList.add(200);// 1st Index
		gradeList.add(300);// 2nd Index

		System.out.println(gradeList.get(1));// 200
		// System.out.println(gradeList.get(4));//Highest Index is 2, you are trying
		// access 3
		// IndexOutOfBoundException

		// System.out.println(gradeList.get(-1));--- no negative indexing in Java so
		// exception

		ArrayList<String> namesList = new ArrayList<String>();// only you can add String type of data

		namesList.add("Tom");// 0 th position
		namesList.add("Peter");// 1
		namesList.add("KK");// 2
		namesList.add("Parag");// 3
								// Highest Index is 3, and lowest index is 0

		System.out.println(namesList.size());

		// namesList.remove(1);

//		namesList.remove(index)

		System.out.println(namesList.size());// size got decreased automatically

		System.out.println(namesList.get(1));// 2nd position will be shifted upwards

		System.out.println("Print all the values - using for loop");

		for (int i = 0; i < namesList.size(); i++) {
			System.out.println(namesList.get(i));
		}

		System.out.println("Print all the values - using forEach loop");

		for (String e : namesList) {
			System.out.println(e);
		}

		System.out.println("Print all the values - If inside ");

		for (String e : namesList) {
			System.out.println(e);

			if (e.equals("Peter")) {
				System.out.println("Peter is found...");
			}
		}

	}

}
