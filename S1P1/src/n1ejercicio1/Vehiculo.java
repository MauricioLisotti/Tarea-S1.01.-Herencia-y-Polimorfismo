package n1ejercicio1;

/*
Ejercicio 1. Crea una clase Vehículo con 2 métodos: un constructor
y un método llamado 'Iniciar', que es invocado por el 'main()'
(este método puede estar en la misma clase o en una clase aparte)
Demuestre la secuencia de ejecución de los métodos de la clase
(por ejemplo, enviando un mensaje a la consola).

*/

public class Vehiculo {

    public Vehiculo(){
        System.out.println("Este es el metodo constructor.");
    }

    public void Iniciar(){
        System.out.println("El vehiculo se ha encendido.");
    }
}
