package n2ejercicio4;

public class Jerbo extends Roedor {

	public Jerbo(String especie) {
		super("Jerbo");
	}
	
	public void comer() {
    	super.comer();
		System.out.println(" lechuga.");
	}
	
	public void oler() {
		super.oler();
		System.out.println(" una flor.");	
	}

	public void correr() {
		super.correr();
		System.out.println(" en el campo.");		
	}
}
