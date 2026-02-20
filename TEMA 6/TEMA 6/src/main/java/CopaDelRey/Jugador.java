package CopaDelRey;

public class Jugador extends MutxamielFC implements AccionesDeportivas{

    public Jugador(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " concentrandose para el partido");
    }

    @Override
    public void viajar(String ciudad) {

    }

    @Override
    public void celebrarGol() {

    }

    @Override
    public void entrenar() {

    }

    @Override
    public void jugarPartido(String rival) {

    }
}
