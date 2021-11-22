package n2ejercicio3;

public class App {
	public static void main(String[]args) {
		Unicycle unicycle1 = new Unicycle();
		Bicycle bicycle1 = new Bicycle();
		Tricycle tricycle1 = new Tricycle();
		
		unicycle1.ride();
		bicycle1.ride();
		tricycle1.ride();
		
		Cycle[] baseDeDatosCyclos = new Cycle[3];
		baseDeDatosCyclos[0] = unicycle1;
		baseDeDatosCyclos[1] = bicycle1;
		baseDeDatosCyclos[2] = tricycle1;
		
		for (int i=0; i < baseDeDatosCyclos.length; i++) {
			if (baseDeDatosCyclos[i] instanceof Unicycle) {
				baseDeDatosCyclos[i].balance();
			} else if (baseDeDatosCyclos[i] instanceof Bicycle){
				baseDeDatosCyclos[i].balance();
			}
		}
	}
}
