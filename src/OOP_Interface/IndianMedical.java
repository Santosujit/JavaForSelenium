package OOP_Interface;

//  If FortisHospital wants to open a branch in India, then It has to implement
//	IndiaMedical methods
//	Meaning FortisHospital has to provide gyncServices,
//	neuroServices,oncologyServices, emergencyServices to Indian
//	customers

public interface IndianMedical extends WHO {

	public void gyncServices();

	public void neuroServices();

	public void oncologyServices();

	public void emergencyServices();

}
