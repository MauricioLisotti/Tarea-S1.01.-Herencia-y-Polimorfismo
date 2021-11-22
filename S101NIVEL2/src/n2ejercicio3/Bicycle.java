package n2ejercicio3;

public class Bicycle extends Cycle {
	public Bicycle() {
		super(2);
	}
	
	public void ride() {
		super.ride();
		System.out.println("Bicycle ride.");
	}
	
	public void balance() {
		super.balance();
		System.out.println("La bicycle esta balanceandose.");
	}
}
