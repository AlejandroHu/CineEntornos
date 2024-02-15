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
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAforo() {
        return aforo;
    }
    public void setAforo(int aforo) {
        this.aforo = aforo;
    }
    public Sala[] getSalas() {
        return salas;
    }
    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }

    public int getContadorPersonas() {
        return contadorPersonas;
    }
    public void setContadorPersonas(int contadorPersonas) {
        this.contadorPersonas = contadorPersonas;
    }
}
