package OOP_Encapsulation;

//part of 12th class - encapsulation, getter and setter
//external user will use this class to launch chrome and test chrome

public class ChromeTest {

	public static void main(String[] args) {

		GoogleChrome ch = new GoogleChrome();

		ch.launchChrome();

//only launchChrome() method will be shown to the user
//other internal technical methods will not be shown to the user directly to avoid confusion
//other internal technical methods will be encapsulated within the public launchChrome() method

	}

}
