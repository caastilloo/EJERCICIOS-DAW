package CopaDelRey;

public class Jugador extends MutxamielFC implements AccionesDeportivas{


    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) {
        super(nombre, edad);
        this.categoria = categoria;
        this. dorsal = dorsal;
        this.posicion = posicion;
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " concentrandose para el partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.printf("El jugador " + getNombre() + " está viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.printf("El jugador " + getNombre() + " celebra el GOL");
    }

    @Override
    public void entrenar() {
        System.out.printf("El jugador " + getNombre() + " está entrenando");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.printf("El jugador " + getNombre() + " está jugando el partido contra " + rival);
    }
}
