package n2ejercicio2;

public class Cycle {
	private int cantRuedas;
	
	public Cycle (int cantRuedas) {
		this.cantRuedas = cantRuedas;
	}
	
	public void ride() {
		System.out.println("El Cycle tiene " + wheels() + "ruedas.");
	}
	
	public int wheels() {
		return cantRuedas;
	}
}
