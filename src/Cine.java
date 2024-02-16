/**
 * La clase Cine representa un cine con un nombre, un aforo máximo, un conjunto de salas y un contador
 * de personas presentes en el cine.
 * Esta clase proporciona métodos para acceder y modificar el nombre del cine, el aforo, la lista de salas,
 * el contador de personas, ver la cartelera, ver información de una sala específica, y comprar entradas.
 *
 * @author AlejandroHu
 */
public class Cine{
    /**
     * Es el nombre del cine, se representa con un String
     */
    private String nombre;
    /**
     * Aforo maximo del cine, se representa con un int
     */
    private int aforo;
    /**
     * Es el conjunto de salas que hay en el cine, es un array de la clase Sala llamada salas
     */
    private Sala[]salas;
    /**
     * Es el contador de personas que hay en el cine, se representa con un int y tiene valor 0 ya que es un
     * contador
     */
    private int contadorPersonas = 0;

    /**
     * Construye una nueva instancia de la clase Cine con el nombre del cine, el aforo máximo y el número
     * de salas especificado. Se inicializan las salas con sus respectivos números utilizando un bucle for.
     *
     * @param nombre Nombre del cine.
     * @param aforo Aforo máximo del cine.
     * @param numSala Número de salas en el cine, numero variable.
     */
    public Cine(String nombre, int aforo, int numSala) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.salas = new Sala[numSala];
        for (int i = 0; i < numSala; i++) {
            this.salas[i] = new Sala(i + 1);
        }

    }

    /**
     * Obtienes el nombre del cine, representado con un String
     * @return El nombre del cine
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cine, es un String
     * @param nombre Nuevo nombre del cine, es un String, no dejar el campo en blanco
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el aforo máximo del cine, es un int
     * @return El aforo maximo del cine
     */
    public int getAforo() {
        return aforo;
    }

    /**
     * Establece el aforo maximo que puede tener el cine, es un int
     * @param aforo Nuevo aforo maximo del cine, tiene que ser un valor mayor a 0 y menor a MAX_AFORO
     */
    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    /**
     * Obtiene la lista de salas del cine, array de la clase Sala
     * @return la lista de salas del cine
     */
    public Sala[] getSalas() {
        return salas;
    }

    /**
     * Obtiene el contador de personas que hay dentro del cine
     * @return contador de personas del cine
     */

    public int getContadorPersonas() {
        return contadorPersonas;
    }

    /**
     * Muestra la cartelera del cine, indicando el número de salas, el título de las películas y sus duraciones.
     * un bucle del array salas que imprime todas las salas, cada sala con su numero y las peliculas y titulos de
     * cada sala, llamando a las diferentes clases
     */

    public void verTodas() {
        System.out.println("CARTELERA");
        for (int i = 0; i < salas.length;i++) {
            System.out.println("sala " + salas[i].getNumero() + ": " + salas[i].getPelicula().getTitulo() + " " + salas[i].getPelicula().getDuracion() + " min");
        }
    }

    /**
     * Muestra la información de una sala específica del cine, pidiendo el numero de sala que quieras, mostrandonos
     * los datos de la sala, con sus butacas ocupadas y libres, llamando a la clase Sala, utilizando el metodo de la
     * clase Sala, infoSala
     * @param numSalas es el numero de sala (id) que quieras ver, tiene que ser mayor que 0 y menor o igual que
     *                 longitud del array salas, sino se cumple te dara un mensaje de error
     */

    public void verSalas(int numSalas) {
        if (numSalas > 0 && numSalas <= salas.length) {
            numSalas = numSalas - 1;
            salas[numSalas].infoSala();
        }else {
            System.out.println("numero de sala invalida");
        }
    }

    /**
     * Permite comprar una entrada para una sala específica del cine, indicando la fila, la columna,
     * el correo electrónico del cliente y realiza la reserva de la butaca.
     * Si el contador de personas es mayor al aforo maximo dara un error de aforo completo, sino continua
     * si el email no esta vacio y si numero de sala (id) es mayor a 0 y menor o igual a la longitud de array
     * salas, le restamos 1 a numSalas, fila y columna para que el usuario introduzca a partir del 1,
     * incrementamos el contadorPersona y en el array salas colocamos el numSala que se ha introducido y llamamos
     * a la clase Sala y su funcion reservarButacas
     *
     * @param numSalas Número de la sala en la que se realizará la compra, tiene que ser mayor que 0 y menor o
     *                 igual a la longitud del array salas sino nos dara un error de numero de sala invalida
     * @param fila Fila de la butaca a reservar, tiene que ser mayor igual a 0 y que sea menor que la
     *             longitud de la matriz de la clase Sala, ya que sino te dara error, condiciones
     *             realizadas en la clase Sala
     * @param columna Columna de la butaca a reservar, tiene que ser mayor igual a 0 y que sea menor que la
     *                longitud una fila de la matriz de la clase Sala, ya que sino te dara error, condiciones
     *                realizadas en la clase Sala
     * @param email Correo electrónico del cliente que realiza la compra, tienes que introducir un valor ya que
     *              si introduces un valor vacio te saltara el error de email vacio
     */

    public void comprarEntrada(int numSalas, int fila, int columna, String email) {
        if (contadorPersonas < aforo) {

            if (!email.isEmpty()) {
                if (numSalas > 0 && numSalas <= salas.length) {
                    numSalas = numSalas - 1;
                    fila = fila - 1;
                    columna = columna - 1;
                    contadorPersonas++;
                    salas[numSalas].reservarButacas(fila, columna, email);
                }else {
                    System.out.println("numero de sala invalida");
                }
            }else {
                System.out.println("Has dejado el email vacio");
            }

        }else {
            System.out.println("AFORO COMPLETO");
        }
    }
}
