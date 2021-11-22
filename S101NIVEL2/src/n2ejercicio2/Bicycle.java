package n2ejercicio2;

public class Bicycle extends Cycle {
	public Bicycle() {
		super(2);
	}
	
	public void ride() {
		super.ride();
		System.out.println("Bicycle ride.");
	}
}
