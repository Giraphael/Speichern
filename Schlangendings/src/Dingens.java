
public class Dingens {
	
	public static void main(String []args) {
		
		Queue<Patient> Krankenhaus = new Queue<Patient> ();
	
	Patient Patient1 = new Patient("Nelson Mandela");
	Patient Patient2 = new Patient("Neil Armweak");
	Patient Patient3 = new Patient("James Harden");
	Patient Patient4 = new Patient("Sam Fisher");
	Patient Patient5 = new Patient("Martin Luther King jr.");
	
	Krankenhaus.enqueue(Patient1);
	Krankenhaus.enqueue(Patient2);
	Krankenhaus.enqueue(Patient3);
	Krankenhaus.enqueue(Patient4);
	Krankenhaus.enqueue(Patient5);
	
	
	while(!Krankenhaus.isEmpty()){
		System.out.println(Krankenhaus.front().getName());
		Krankenhaus.dequeue();		
	}
	
	
	
	}
}
