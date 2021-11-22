package n1ejercicio7;

/*
Ejercicio 7. En el ejercicio anterior crea un nuevo método saltar
 a la clase Frog y llámalo desde el main, después de realizar la
 generalización en Amphibian. Demuestra que la llamada a este método
 saltar da error
 */
public class App {
    public static void main(String[]args){
        Frog ranaFrog = new Frog();
        Anfibio ranaAnfibio = (Anfibio) ranaFrog;

        ranaFrog.comer();
        ranaFrog.mover();
        ranaFrog.respirar();

        ranaAnfibio.comer();
        ranaAnfibio.mover();
        ranaAnfibio.respirar();

      //  ranaAnfibio.saltar();



    }

}
