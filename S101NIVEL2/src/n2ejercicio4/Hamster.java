package n2ejercicio4;

public class Hamster extends Roedor {

	public Hamster(String especie) {
		super("Hamster");
	}
	
	public void comer() {
    	super.comer();
		System.out.println(" semillas.");
	}
	
	public void oler() {
		super.oler();
		System.out.println(" la jaula.");			
	}

	public void correr() {
		super.correr();
		System.out.println(" en la rueda.");					
	}
}
