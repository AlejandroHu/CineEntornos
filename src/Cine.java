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

    public void verTodas() {
        System.out.println("CARTELERA");
        for (int i = 0; i < salas.length;i++) {
            System.out.println("sala " + salas[i].getNumero() + ": " + salas[i].getPelicula().getTitulo() + " " + salas[i].getPelicula().getDuracion() + " min");
        }
    }

    public void verSalas(int numSalas) {
        if (numSalas > 0 && numSalas <= salas.length) {
            numSalas = numSalas - 1;
            salas[numSalas].infoSala();
        }else {
            System.out.println("numero de sala invalida");
        }
    }

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
