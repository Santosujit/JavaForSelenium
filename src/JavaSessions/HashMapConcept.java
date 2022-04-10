package JavaSessions;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {

		// most frequently used collection
		// ArrayList stores the data in linear format - indexing
		// HashMap stores the values in key, value pair
		// HaspMap is a class
		// HashMap stores the values in key-value format
		// HashMap is a Class so we have to create the object of HashMap
		// HashMap doesn't maintain any order while storing or no indexing in case of
		// HashMap

		HashMap<String, String> empMap = new HashMap<String, String>();

		// key is String as well as value
		// Here in HashMap Put and Get method no add method like in ArrayList

		empMap.put("A", "Tom");
		empMap.put("B", "Peter");
		empMap.put("C", "Santosh");
		empMap.put("D", "Dablu");

		System.out.println(empMap); // {A=Tom, B=Peter, C=Santosh, D=Dablu}

		System.out.println(empMap.get("C"));// Give me the Key, I will give you the value
//		Pass the key and get the value
		System.out.println(empMap.size());

		// default virtual capacity of HashMap is 16, not 10 like ArrayList

	}

}
