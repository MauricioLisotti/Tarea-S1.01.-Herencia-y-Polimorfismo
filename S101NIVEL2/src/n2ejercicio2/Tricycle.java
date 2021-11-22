package n2ejercicio2;

public class Tricycle extends Cycle {
	public Tricycle() {
		super(3);
	}
	
	public void ride() {
		super.ride();
		System.out.println("Tricycle ride.");
	}
}
