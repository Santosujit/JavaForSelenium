package Assignments;

import java.util.ArrayList;

public class ConstructorAssignment2 {

	String browserName;
	String vendorName;
	double currentVersion;
	ArrayList<String> plugins;

	public static void main(String[] args) {

//		2. Design a browser class template with the following features:
//			 variables:
//			browserName
//			vendorName
//			currentVersion
//			List of plugins supported by Browser in Array List<String>
//
//			--Design the constructor of this class with different parameters and all parameters.
//
//			--Write the get method of each variable with return keyword. 

		ConstructorAssignment2 browser1 = new ConstructorAssignment2("chrome", "Google");
		System.out.println(browser1.browserName + browser1.currentVersion + browser1.vendorName + browser1.plugins);

		ArrayList<String> pluginsSupport = new ArrayList<String>();
		pluginsSupport.add("Print");
		pluginsSupport.add("FxVideo");
		pluginsSupport.add("Weather");

		ConstructorAssignment2 browser2 = new ConstructorAssignment2("Mozila", "Firefox", 15.50, pluginsSupport);
		System.out.println(browser2.browserName + browser2.currentVersion + browser2.vendorName + browser2.plugins);

		String s2 = browser2.plugins.get(0);
		System.out.println(s2);
	}

	public ConstructorAssignment2(String browserName, String vendorName, double currentVersion,
			ArrayList<String> plugins) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.plugins = plugins;
	}

	public ConstructorAssignment2(String browserName, String vendorName) {
		this.browserName = browserName;
		this.vendorName = vendorName;
	}

}
