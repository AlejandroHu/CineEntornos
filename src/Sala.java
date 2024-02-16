/**
 * La clase Sala representa una sala con un numero que es el id de la sala, las butacas de una sala
 * y la pelicula que llama a la clase Pelicula
 * @author AlejandroHu
 */
public class Sala {
    /**
     * Atributo numero, es un int y es el identificativo de cada sala(id)
     */
    private int numero;
    /**
     * Atributo pelicula, es un atributo que llama a la clase Pelicula, se usa para
     * llamar a los atributos de la clase Pelicula
     */
    private Pelicula pelicula;
    /**
     * Atributo butacas, es una matriz de Strings que se usa para representar las
     * las butacas de una sala
     */
    private String [][] butacas;

    /**
     * Construye una nueva instancia de la clase Sala con el numero que es el
     * identificativo de cada sala y las butacas tendran un tamaño definido de 5x8
     * y el valor predeterminado que es null
     * @param numero Esto es un int para indicar el numero(id) de la sala
     */
    public Sala(int numero) {
        this.numero = numero;
        this.butacas = new String[5][8];
    }

    /**
     * Obtiene el int numero que es el numero(id) de la sala
     * @return el numero de la sala
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Sirve para establecer el numero(id) de la sala, es un int de valor
     * de 0 a cantidad de salas sin superar el numero de salas.
     * @param numero tienes que introducir un numero entre 0 y la cantidad de salas
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtiene los atributos de la clase Pelicula
     * @return los atributos de la Pelicula
     */
    public Pelicula getPelicula() {
        return pelicula;
    }

    /**
     * Sirve para establecer la pelicula de cada sala, que se
     * hara en el main
     * @param pelicula tienes que introducir un valor segun el numero de peliculas que haya
     */
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    /**
     * Obtiene la matriz de String butacas que representa la cantidad de asientos que hay en una sala
     * @return la matriz  de Strings que es la cantidad de asientos que hay en la sala
     */
    public String[][] getButacas() {
        return butacas;
    }

    /**
     * Imprime información sobre la sala, incluyendo su número y la película que se proyecta, así como
     * la disposición de las butacas. Recorre la matriz y si la butaca no es null se imprime [x] y si no se imprime []
     * esto quiere decir que si el asiento esta ocupado imprime [x] y si esta libre []
     */
    public void infoSala() {
        System.out.println("Sala: " + numero + ": " + pelicula.getTitulo());
        for (int i = 0; i < butacas.length;i++) {
            for (int j = 0; j < butacas[i].length;j++) {
                if (butacas[i][j]!=null) {
                    System.out.print("[X] ");
                }else {
                    System.out.print("[] ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Reserva una butaca en la sala, especificando la fila, la columna y el correo electrónico del cliente.
     * Si la posicion de la matriz de la posicion indicada es null la matriz en la posicion indicada sera igual al
     * email introducido por lo que ya estara asignado y si esta ocupado se mostrara el email de la persona a la que
     * pertenece la butaca, si introduces datos fuera del rango de la matriz, saldra el mensaje de fuera de rango
     * @param fila fila de la butaca a reservar, es un int y tiene que ser mayor igual a 0 y que sea menor que la
     *             longitud de la matriz
     * @param columna columna de la butaca a reservar, es un int y tiene que ser mayor igual a 0 y que sea menor que la
     *             longitud una fila de la matriz
     * @param email correo electronico del usuario que va a reservar, es un String
     */
    public void reservarButacas(int fila,int columna,String email) {
        if ((fila >= 0 && fila < butacas.length) && (columna >= 0 && columna < butacas[0].length)) {
            System.out.println("Sala: " + numero);
            if (butacas[fila][columna]==null) {
                butacas[fila][columna]=email;
                System.out.println("Reserva realizada en la sala: " + numero);
            }else {
                System.out.println("Butaca ocupada por: " + butacas[fila][columna]);
            }
        }else {
            System.out.println("Asientos fuera de rango");
        }
    }
}