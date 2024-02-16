import java.util.Scanner;
import Cine;
import Pelicula;
import Sala;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Cine cine = new Cine("Cines", 200, 5);
        Pelicula p1 = new Pelicula("Halloween", 140);
        Pelicula p2 = new Pelicula("Scream", 115);
        Pelicula p3 = new Pelicula("Parasyte", 120);
        Pelicula p4 = new Pelicula("Gru", 135);
        cine.getSalas()[0].setPelicula(p1);
        cine.getSalas()[1].setPelicula(p2);
        cine.getSalas()[2].setPelicula(p3);
        cine.getSalas()[3].setPelicula(p4);
        cine.getSalas()[4].setPelicula(p2);
        int numSalas;
        int fila;
        int columna;
        String email;
        boolean continuar = true;

    }
}