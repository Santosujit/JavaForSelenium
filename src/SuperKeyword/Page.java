package SuperKeyword;

public class Page {
	
	public Page() {
		System.out.println("Page const....");
		//parent class default constructor
	}
	
	public Page(int time) {
		System.out.println("Page const....with time : " + time);
		//parent class parametarised constrcutor
	}
	
	
	int loadTime = 30;
	
	public void pageTitle() {
		System.out.println("Page title");
	}

}
