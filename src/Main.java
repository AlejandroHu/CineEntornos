import java.util.Scanner;
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
        while(continuar == true) {
            System.out.println("Selecciona una opcion:\n"
                    + "1. Ver cartelera\n"
                    + "2. Ver Sala\n"
                    + "3. Comprar entradas\n"
                    + "4. Salir"
            );
            int opcion = entrada.nextInt();
            switch(opcion) {
                case 1:
                    cine.verTodas();
                    break;
                case 2:
                    System.out.println("Introduce numero de sala: ");
                    numSalas = entrada.nextInt();
                    cine.verSalas(numSalas);
                    break;
                case 3:
                    System.out.println("Introduce numero de sala: ");
                    numSalas = entrada.nextInt();
                    System.out.println("Introduce la fila: ");
                    fila = entrada.nextInt();
                    System.out.println("Introduce la columna: ");
                    columna = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Introduce el correo electronico: ");
                    email = entrada.nextLine();
                    cine.comprarEntrada(numSalas, fila, columna, email);
                    break;
                case 4:
                    System.out.println("Saliendo");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }

    }
}