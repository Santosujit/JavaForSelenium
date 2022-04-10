package OOP_Encapsulation;

//part of 12th class - encapsulation, getter and setter

public class GoogleChrome {

	public void launchChrome() {

		// external user only see this launchChrome method
		// all other private methods are encapsulated within this public method
		// This is an example of data hiding

		System.out.println("checking chrome");

		CheckOSCompatibility();
		checkBrowserVersion();
		checkWindowsRAM();
		checkChromeUpdates();

		System.out.println("chrome launched");

	}

	private void CheckOSCompatibility() {
		
		// these methods can not be accessed by other class directly
		// these internal private methods will not be shown to the user to avoid
		// confusion
		
		System.out.println("CheckOSCompatibility");
	}

	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}

	private void checkWindowsRAM() {
		System.out.println("checkWindowsRAM");
	}

	private void checkChromeUpdates() {
		System.out.println("checkChromeUpdates");
	}

}
