package n1ejercicio8;

/*
Ejercicio 8. Modifique el ejercicio anterior para que el objeto
Frog sustituya las definiciones de métodos de la clase base
(proporcione nuevas definiciones utilizando las mismas firmas de
métodos)n()'. Demuestre que ocurre en el método 'main()',
si mantiene la generalización anterior o no.
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

     //   Anfibio.saltar();
        ranaFrog.saltar();

    }

}
