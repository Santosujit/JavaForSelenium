package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayArrayListAssignment {

	public static void main(String[] args) {

//		Question 1: Write a program to print the following pattern using for loop:
//
//			00 01 02 03 04 05 06 07 08 09 
//			10 11 12 13 14 15 16 17 18 19 
//			20 21 22 23 24 25 26 27 28 29 
//			30 31 32 33 34 35 36 37 38 39 

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}

		System.out.println("-----------------");

//		Question 2: Write a program to create a static Array, having following cricket data:
//			--name, age, team name, DOB, gender, Strike Rate
//			--Try to create multiple Object Arrays for different players 
//			--Try to print all the values of each player on the console

		Object teamIndia1[] = new Object[6];
		teamIndia1[0] = "Dhoni";
		teamIndia1[1] = 38;
		teamIndia1[3] = 20071982;
		teamIndia1[4] = 'M';
		teamIndia1[5] = 50;

		System.out.println("1st Player details");

		for (Object e : teamIndia1) {

			System.out.println(e);
		}

		System.out.println("-----------------");

		Object teamIndia2[] = new Object[6];
		teamIndia2[0] = "Ganguly";
		teamIndia2[1] = 38;
		teamIndia2[3] = 20071982;
		teamIndia2[4] = 'M';
		teamIndia2[5] = 52;

		System.out.println("2nd Player details");

		for (int i = 0; i < teamIndia2.length; i++) {

			System.out.println(teamIndia2[i]);
		}

		System.out.println("-----------------");
		
//		Question 3: Try to print the following pattern on the console:
//			n = 4
//			n = 3
//			n = 2
//			n = 1
//			n = 0
		
		for(int i=4;i>=0;i--) {
			System.out.println("n = "+i);
		}
		
//		ArrayList:
//			1. Write a Java program to create a new array list, add some colors (string) and print out the collection
//
//			2. Write a Java program to insert an element into the array list at the first and last positions.
//
//			3. Write a Java program to retrieve an element (at a specified index) from a given array list.
//
//			4. Write a Java program to update specific array element by given element.
//
//			5. Write a Java program to remove the third element from a array list. 
//
//			6. Write a Java program to search an element in a array list.
//
//			7. Write a Java program to reverse elements in a array list
//
//			8. Write a Java program to extract a portion of a array list.
//
//			9. Write a Java program of swap two elements in an array list.
//
//			10. Write a Java program to empty an array list.
//
//			11. Write a Java program to trim the virtual capacity of an array list the current list size.
//
//			12. Write a Java program to print all the elements of a ArrayList using the position of the elements
		
		System.out.println("------------------");
		
//		1. Write a Java program to create a new array list, add some colors (string) and print out the collection
		
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Yellow");
		color.add("Green");
		color.add("Blue");
		color.add("Red");
		color.add("Black");
		color.add("White");
		
		for(String e:color) {
			System.out.println(e);
		}
		
		System.out.println("---------------");
		
		System.out.println(color);
		
		System.out.println(color.get(1));
		
		System.out.println("---------------");
		
		for(int i=0;i<=5;i++) {
			System.out.println(color.get(i));
		}
		
		System.out.println("-------------------");
		
//		2. Write a Java program to insert an element into the array list at the first and last positions.
		
		//[Yellow, Green, Blue, Red, Black, White]
		
		color.add(0, "velvet");
		color.add(7, "purple");
		System.out.println(color);
		
		System.out.println("-------------------");
		
//		3. Write a Java program to retrieve an element (at a specified index) from a given array list.
		System.out.println(color.get(7));
		
		System.out.println("-----------------");
		
//		4. Write a Java program to update specific array element by given element.
		
		color.set(4, "offwhite");
		System.out.println(color);
		
		System.out.println("-------------");
		
//		5. Write a Java program to remove the third element from a array list. 
		
		color.remove(2);
		System.out.println(color);
		
		System.out.println("-------------");
		
//		6. Write a Java program to search an element in a array list.
		
		if(color.contains("velvet")) {
			System.out.println("element is found");
		}
		else {
			System.out.println("element is not found");
		}
		
		if(color.contains("OMSai")) {
			System.out.println("element is found");
		}
		else {
			System.out.println("element is not found");
		}
		
//		7. Write a Java program to reverse elements in a array list
		
		System.out.println(color);
		Collections.reverse(color);
		System.out.println(color);
		Collections.sort(color);
	    System.out.println(color);
	    
//	    8. Write a Java program to extract a portion of a array list.
	    
//	    subList(int fromIndex, int toIndex)
//	    Here fromIndex is inclusive and toIndex is exclusive.
//	    The subList() method of java.util.ArrayList class is used to return a view of the portion of this list 
//	    between the specified fromIndex, 
//	    inclusive, and toIndex, exclusive. 
//	    (If fromIndex and toIndex are equal, the returned list is empty.)
	    
	    System.out.println("-------------");
	    System.out.println(color);
	    List<String> subList = color.subList(0, 5);
	    System.out.println(subList);
	    
	    System.out.println("---------------------");
	    
//	    9. Write a Java program of swap two elements in an array list.
	    
//	    We can swap two elements of Array List using Collections.swap() method. 
//	    This method accepts three arguments. The first argument is the ArrayList 
//	    and the other two arguments are the indices of the elements. 
//	    This method returns nothing. 

	    System.out.println(color);
	    Collections.swap(color, 0, 2);
	    System.out.println(color);
	    
//	    10. Write a Java program to empty an array list.
	    
//	    ArrayList clear()
//	    he clear() method of ArrayList in Java is used to remove all the elements from a list. 
//	    The list will be empty after this call returns.
	    
//	    The method does not return any value. 
//	    It removes all the elements in the list and makes it empty.
//	    removeAll() methos is also there for this purpose
//	    Parameters: This method takes collection c as a parameter containing elements to be removed from this list.
//
//	    Return Value: This method returns true if this list changed as a result of the call.

	    System.out.println("---------------");
	    System.out.println(color);
//	    color.clear();
//	    System.out.println(color);
	    
//	    color.removeAll(color);
//	    System.out.println(color);
	    
//	    11. Write a Java program to trim the virtual capacity of an array list the current list size.
//	    
//	    The trimToSize() method of ArrayList in Java trims the capacity of an ArrayList instance 
//	    to be the list’s current size. This method is used to trim an ArrayList instance to the number of elements it contains.
//
//	    Syntax:
//
//	    trimToSize()
//	    Parameter: It does not accepts any parameter.
	    
//	    trimToSize() method is used for memory optimization. 
//	    It trims the capacity of ArrayList to the current list size. 
//	    For e.g. An arraylist is having capacity of 15 but there are only 5 elements in it,
//	    calling trimToSize() method on this ArrayList would change the capacity from 15 to 5.
	    
	    System.out.println("-----------------");
	    System.out.println(color);
	    System.out.println(color.size());
//	    color.remove(4);
//	    System.out.println(color.size());
	    
//	    12. Write a Java program to print all the elements of a ArrayList 
//	    using the position of the elements
	    
	    System.out.println("-----------------");
	    System.out.println(color);
	    System.out.println("-----------------");
	    
	    for(int i=0;i<color.size();i++) {
	    	System.out.println(color.get(i));
	    }
	  
	}
	
}