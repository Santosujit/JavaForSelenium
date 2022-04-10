package OOP_Interface;

public interface UKMedical extends WHO {

	// If FortisHospital wants to open a branch in UK, then It has to implement
	// UKMedical methods
	// Meaning FortisHospital has to provide pediaServices,
	// ENTServices,emergencyServices to UK
	// customers

	public void pediaServices();

	public void ENTServices();

	public void emergencyServices();
}
