package OOP_Interface;

public class FortisHospital  extends MedicalAssociation implements USMedical, UKMedical, IndianMedical {
	
	//If FortisHospital wants to open a branch in USA,UK, and India 
	//then It has to implement USAMedical Interface, UKMedical methods
	//IndianMedical interface methods
	
	//FortisHospital has to define method body and business logic given in respective interfaces
	//it is implementing
	//FortisHospital can override the respective interface methods as per it's own requirements
	
	//no method body inside interface, but method has to be defined inside implementing child class
	
	//all 3 interfaces (USMedical, UKMedical, IndianMedical) extends to WHO
	
//	class to class - extends
//	interface to interface --- extends
//	class to interface --- implements
	
	//FortisHospital extends MedicalAssociation, and MedicalAssociation extends MedicalOrg --- 
	//multi level inheritance
	
	//It's a class's responsibilty to provide method body, and business logic
	//Even the child class can have it's own methods
	//You can't create the object of the Interface
	//all the variables inside the interface are static and final in nature
	
	//After JDK1.8 --- we can have static methods with method body inside the interface
	//And as you know static methods can't be overridden
	//we can have default methods with method body inside the interface as well
	//default keyword is only allowed inside Interface not inside class
	//An Interface can't have a super class, instead it can have a super interface
	
	
	
	// USA:
		@Override
		public void orthoServices() {
			System.out.println("FH -- orthoServices");//overridden method
		}

		@Override
		public void physioServices() {
			System.out.println("FH -- physioServices");

		}

		@Override
		public void cardioServices() {
			System.out.println("FH -- cardioServices");

		}
		
		@Override
		public void totalDoctors(int count) {
			System.out.println("total doctors= " + count);
		}

		// UK:
		@Override
		public void pediaServices() {
			System.out.println("FH -- pediaServices");

		}

		@Override
		public void ENTServices() {
			System.out.println("FH -- ENTServices");

		}
		
		@Override
		public void emergencyServices() {
			System.out.println("FH -- emergencyServices");
		}

		// India:
		@Override
		public void gyncServices() {
			System.out.println("FH -- gyncServices");

		}

		@Override
		public void neuroServices() {
			System.out.println("FH -- neuroServices");

		}

		@Override
		public void oncologyServices() {
			System.out.println("FH -- oncologyServices");
		}
		
		
		//Fortis's own methods
		
		public void pathologyServices() {
			System.out.println("FH -- pathologyServices");
		}
		
		public void medicalInsurance() {
			System.out.println("FH -- medicalInsurance");

		}
		
		//default method of USMedical
		
		@Override
		public void billing() {
			System.out.println("FH - billing");
		}

		//WHO
		
		@Override		
		public void covidTest() {
			System.out.println("FH -- Covid 19 test");
			
		

}
		
}
