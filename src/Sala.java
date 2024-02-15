public class Sala {
    private int numero;
    private Pelicula pelicula;
    private String [][] butacas;
    public Sala(int numero) {
        this.numero = numero;
        this.butacas = new String[5][8];
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Pelicula getPelicula() {
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    public String[][] getButacas() {
        return butacas;
    }
    public void setButacas(String[][] butacas) {
        this.butacas = butacas;
    }
}
