package n2ejercicio4;

public class Roedor {
	
	private String especie;
	
	public Roedor(String especie) {
		this.especie = especie;
	}
	
	public void comer() {
		System.out.print("El " + especie + " est� comiendo");
	}
	
	public void oler() {
		System.out.print("El " + especie + " est� oliendo");
	}

	public void correr() {
		System.out.print("El " + especie + " est� corriendo");

	}
}
