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

    public void calentar(){
        System.out.printf(getNombre() + " está calentando.");
    }

    public void descansar(){
        System.out.printf(getNombre() + " está descansando.");
    }

    public void marcarGol(){
        System.out.printf(getNombre() + " ha marcado un GOL!");
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador[" +
                "Nombre: " + getNombre() +
                ", Edad: " + getEdad() +
                ", Categoria: " + categoria +
                ", Dorsal: " + dorsal +
                ", Posicion: " + posicion +
                ']';
    }
}
