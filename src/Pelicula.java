/**
 * La clase Pelicula representa una pelicula con un titulo y una duracion en minutos
 * @author AlejandroHu
 */
public class Pelicula {
    /**
     * Atributo titulo, es un String que se utiliza para ponerle nombre a cada pelicula
     */
    private String titulo;
    /**
     * Atributo duracion, int para indicar la duracion de cada pelicula
     */
    private int duracion;

    /**
     * Construye una nueva instancia de la clase Pelicula con el título y la duración especificados
     * @param titulo Esto es un String para indicar el titulo de la pelicula
     * @param duracion Esto es un int para indicar la duracion de la pelicula
     */
    public Pelicula(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    /**
     * Obtiene el String titulo que es el titulo de la pelicula
     * @return el titulo de la pelicula
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Sirve para establecer el titulo de la pelicula, es un String de valor predeterminado,
     * que puedes poner el nombre que quieras
     * @param titulo tienes que introducir una cadena que no este vacia
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el int duracion que es la duracion de la pelicula en minutos
     * @return es la duracion en minutos de la pelicula
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Sirve para establecer la duracion en minutos de la pelicula, es un int con valor predeterminado,
     * para poner la duracion que quieras
     * @param duracion es recomendable introducir un valor mayor a 30 y menor a 400 para que sea mas realista
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
