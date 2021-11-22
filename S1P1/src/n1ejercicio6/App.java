package n1ejercicio6;
/*
Ejercicio 6. Crea una clase denominada Amphibian e
 incluye una serie de métodos: mover, respirar y comer.
 Define una nueva clase denominada Frog que herede de la anterior.
  En 'main()' crea un objeto Frog y realiza una generalización en
  Amphibian, demostrando que todos los métodos siguen funcionando
 */
public class App {
    public static void main(String[]args){
        Frog ranaFrog = new Frog();
        Anfibio ranaAnfibio = (Anfibio) ranaFrog ;

        ranaFrog.comer();
        ranaFrog.mover();
        ranaFrog.respirar();

        ranaAnfibio.comer();
        ranaAnfibio.mover();
        ranaAnfibio.respirar();


    }

}
