package JavaSessions;

public class MainMethodOverloading {
	
	//part of 10th video

	public static void main(String[] args) {
		
		System.out.println("Hello James Gosling");
		
		System.out.println(args.length);
		//System.out.println(args[0]); --- Exception as It has no value
		
		main(10);
		main(10,29);
		main("dablu",39);
		

	}
	
	public static void main(int a) {
		
		System.out.println(a);
		

	}
	
	public static void main(int a, int b) {
		
		System.out.println(a+b);
		

	}
	
	public static void main(String a, int b) {
		
		System.out.println(a+" is of age: "+b);
		

	}


	
	

}
