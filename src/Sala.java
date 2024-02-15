public class Sala {
    private int numero;
    private Pelicula pelicula;
    private String [][] butacas;
    public Sala(int numero) {
        this.numero = numero;
        this.butacas = new String[5][8];
    }
}
