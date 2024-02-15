public class Cine{
    private String nombre;
    private int aforo;
    private Sala[]salas;
    private int contadorPersonas;
    public Cine(String nombre, int aforo, int numSala) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.salas = new Sala[numSala];
        for (int i = 0; i < numSala; i++) {
            this.salas[i] = new Sala(i + 1);
        }

    }
}
