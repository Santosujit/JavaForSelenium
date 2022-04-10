package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		// Create the Object of FortisHospital, and call all the methods

		fh.cardioServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.gyncServices();

		fh.pathologyServices();
		fh.medicalInsurance();
		fh.totalDoctors(100);

		USMedical.hospitalAdmin();// Its a static method so calling by it's class name

		fh.medicalTraining();

		fh.covidTest();

		fh.billing();// overridden method will be given preference

		fh.medicalResearch();

		System.out.println(USMedical.min_fee);

		// USMedical.min_fee=20; all the variables inside Interface are static and final
		// in nature

		// Top Casting
		USMedical us = new FortisHospital();
		// child class object can be referred by parent interface reference variable

		// able to access all the methods and variables declared inside USMedical class,
		// overridden methods will be given preference

		us.orthoServices();
		us.physioServices();
		us.cardioServices();
		us.emergencyServices();
		us.billing();
		us.covidTest();
		us.totalDoctors(100);

		// public void gyncServices();
		// us is not able to access IndianMedical methods, and UKMedical methods
		// As Reference type check is failing
		// It will say I am coming from USA, so can't access Indian or UK's methods

		// down casting: is not allowed in case of interface
		// as you can't create object of Interface
		// FortisHospital fh1 = new USMedical();

	}

}
