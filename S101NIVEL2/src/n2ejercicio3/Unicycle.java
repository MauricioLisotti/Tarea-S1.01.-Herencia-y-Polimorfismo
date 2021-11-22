package n2ejercicio3;

public class Unicycle extends Cycle {
	public Unicycle() {
		super(1);
	}
	
	public void ride() {
		super.ride();
		System.out.println("Unicycle ride.");
	}
	
	public void balance() {
		super.balance();
		System.out.println("El unicycle esta balanceandose.");
	}
}
