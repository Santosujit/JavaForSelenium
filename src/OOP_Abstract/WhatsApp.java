package OOP_Abstract;

public class WhatsApp extends Application {

	@Override
	public void serverSetup() {
		
		System.out.println("whatsApp - child class - serverSetup");
		
	}

	@Override
	public void dbSetup() {
		System.out.println("whatsApp - child class - dbSetup");
		
	}

	@Override
	public void envSetup() {
		System.out.println("whatsApp - child class - envSetup");
		
	}
	
	

}
