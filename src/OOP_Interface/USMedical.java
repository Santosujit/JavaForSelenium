package OOP_Interface;

public interface USMedical extends WHO, UN {

	int min_fee = 10;

	// Methods inside Interface can not have method body
    //Interface is 100% abstraction where as Abstract class is 0 to 100% abstraction
	// Inside Interface only method prototype or
	// only method declaration is allowed
	// you can not create the object of Interface
	// all the variables in Interface are static and final by default

	// If FortisHospital wants to open a branch in USA, then It has to implement
	// USAMedical methods
	// FortisHospital can override these methods too

	// FortisHospital has to provide orthoServices,
//but how It will provide, how many doctors, machines it will use
	// that depends upon FortisHospital, so FortisHospital will override it

	public void orthoServices();// no method body is allowed

	public void physioServices();

	public void cardioServices();

	public void emergencyServices();// this method is common in all three interfaces,
	// but can be overridden only once in child class

	public void totalDoctors(int count);// you can have method with parameter inside interface

	// after JDK 1.8:
	// 1. we can have static methods in Interface with method body:

	public static void hospitalAdmin() {
		System.out.println("US - hospitalAdmin");// static method can't be overridden
	}

	// 2. Interface can have default method:

	public default void billing() {
		System.out.println("US - billing");
	}

}
