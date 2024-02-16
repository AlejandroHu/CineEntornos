import java.util.Scanner;
/**
 * La clase Main es la clase principal que contiene el método main para ejecutar el programa del cine.
 * Este programa simula la gestión de un cine, permitiendo ver la cartelera, información de salas
 * y comprar entradas.
 * El usuario puede seleccionar opciones como ver la cartelera, ver información de una sala específica
 * y comprar entradas. El programa continuará ejecutándose hasta que el usuario elija salir
 *
 * @author AlejandroHu
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Scanner llamado entrada para que el usuario pueda introducir datos
         */
        Scanner entrada = new Scanner (System.in);
        /**
         * Creamos cine de la clase Cine con su nombre, aforo maximo y num_de_salas
         */
        Cine cine = new Cine("Cines", 200, 5);
        /**
         * Creamos varias peliculas de la clase Pelicula y le añadimos un titulo y duracion
         */
        Pelicula p1 = new Pelicula("Halloween", 140);
        Pelicula p2 = new Pelicula("Scream", 115);
        Pelicula p3 = new Pelicula("Parasyte", 120);
        Pelicula p4 = new Pelicula("Gru", 135);
        /**
         * llamamos a las diferentes salas y le asignamos una pelicula, creada previamente
         */
        cine.getSalas()[0].setPelicula(p1);
        cine.getSalas()[1].setPelicula(p2);
        cine.getSalas()[2].setPelicula(p3);
        cine.getSalas()[3].setPelicula(p4);
        cine.getSalas()[4].setPelicula(p2);
        /**
         * Atributo numSalas para que el usuario elija la sala que quiera
         */
        int numSalas;
        /**
         * Atributo fila para que el usuario elija la fila que quiera
         */
        int fila;
        /**
         * Atributo columna para que el usuario elija la columna que quiera
         */
        int columna;
        /**
         * Atributo email para que el usuario introduzca su correo electronico
         */
        String email;
        /**
         * Atributo continuar en true para que si el usuario quiera salir, el boolean continuar se
         * vuelve false
         */
        boolean continuar = true;
        /**
         * Un bucle llamado continuar que si esta en true, se repita hasta que sea false
         */
        while(continuar == true) {
            /**
             * un syso para ver las opciones que tiene el usuario a elegir
             */
            System.out.println("Selecciona una opcion:\n"
                    + "1. Ver cartelera\n"
                    + "2. Ver Sala\n"
                    + "3. Comprar entradas\n"
                    + "4. Salir"
            );
            /**
             * Un switch que simula una aplicacion, en el case1 llamamos a la opcion de verTodas de la clase cine.
             * En el case 2 pedimos que introduzca el numero de sala que quiere ver y llamamos a verSalas de la clase
             * cine con el numSalas que ha introducido el usuario.
             * En el case 3 es para comprarEntrada, pedimos el numero de sala, la fila, la columna y el
             * correo electronico y llamamos al metodo comprarEntrada de la clase cine con todos los datos que ha
             * introducido el usuario previamente con el Scanner
             * En el case 4 sera para salir de la aplicacion y pone el bucle continuar en false
             * El default servira por si el usuario introduce una opcion que no esta en el switch y le dara un error
             */
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