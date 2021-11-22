package n1ejercicio4;

public class Main {

    public static void main(String[] args){
        Vehiculo v1 = new Vehiculo();

        v1.iniciar();
        v1.acelerar();

        Vehiculo.parar();

        Vehiculo.primero();
        v1.segundo();//se puede inicializar desde el constructor
        Vehiculo.tercero();
    }
}
