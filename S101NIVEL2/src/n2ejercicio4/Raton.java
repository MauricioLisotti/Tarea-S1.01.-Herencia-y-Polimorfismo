package n2ejercicio4;

public class Raton extends Roedor {

	public Raton(String especie) {
		super("Raton");
	}
	
    public void comer() {
    	super.comer();
		System.out.println(" queso.");
	}
	
	public void oler() {
		super.oler();
		System.out.println(" comida.");
	}

	public void correr() {
		super.correr();
		System.out.println(" en el parque.");
	}
}
