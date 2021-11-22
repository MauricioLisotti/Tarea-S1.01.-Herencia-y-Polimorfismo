package n2ejercicio3;

public class Cycle {
	private int cantRuedas;
	
	public Cycle (int cantRuedas) {
		this.cantRuedas = cantRuedas;
	}
	
	public void ride() {
		System.out.println("");
		System.out.println("El Cycle tiene " + wheels() + "ruedas.");
	}
	
	public int wheels() {
		return cantRuedas;
	}
	
	public void balance() {
		System.out.println("");
	}
}
