
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
