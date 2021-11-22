package n1ejercicio4;

public class Vehiculo {

    public Vehiculo(){
        System.out.println("Este es el metodo constructor.");
    }

    public void iniciar(){
        System.out.println("El vehiculo se ha encendido.");
    }

    public static void parar(){
        System.out.println("El vehiculo se ha detenido.");
    }

    public void acelerar(){
        System.out.println("El vehiculo ha acelerado.");
    }

    static final void primero(){
        System.out.println("metodo primero: static final.");
    }
    final void segundo(){
        System.out.println("metodo segundo: final.");
    }

    static void tercero(){
        System.out.println("metodo tercero: static.");
    }

}
