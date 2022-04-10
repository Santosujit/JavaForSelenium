package Practice;

public class Addition extends Manipulation {

	
		public void add(){//No Parameter
			System.out.println("Child class add method");
			}
		public void add(int a){ //integer parameter
			 System.out.println("child class parameterized add method");
			}
		
		public static void main(String args[]){
			Addition addition = new Addition();
			addition.add();
			
			}
	

}
