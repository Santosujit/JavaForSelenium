package JavaSessions;

//Before garbage collector destroys objects, finalize method will be called automatically
//In Java each and every class's parent class is Object class.
//so you can override finalize() method

public class FinalizeConcept {

	public static void main(String[] args) {

		FinalizeConcept obj = new FinalizeConcept();// this class finalize
													// method will be called
		obj = null;

		Employee e1 = new Employee();// Employe class finalize method will be called
		e1 = null;

		System.gc();// garbage collecgtor will be called
					// In the meantime it will print Bye
					// but beofore it destroys the object finalize method
					// will be called automatically

		System.out.println("Bye!!");

	}

	@Override
	public void finalize() {
		System.out.println("inside the FinalizeConcept class finalize method....");
	}

}
