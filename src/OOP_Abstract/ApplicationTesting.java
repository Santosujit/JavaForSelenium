package OOP_Abstract;

public class ApplicationTesting {

	public static void main(String[] args) {
		
		//I want to test WhatsApp class, so create object of WhatsApp class
		
		WhatsApp wt = new WhatsApp();
		
		wt.dbSetup();
		wt.serverSetup();
		wt.envSetup();
		
		wt.UILayerComponents();

	}

}
