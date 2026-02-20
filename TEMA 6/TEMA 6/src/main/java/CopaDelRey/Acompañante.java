package CopaDelRey;

public class Acompañante extends MutxamielFC{

    private Jugador integrante;
    private String parentesco;

    public Acompañante(String nombre, int edad) {
        super(nombre, edad);
    }

    public void animarEquipo(){

    }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " concentrandose para el partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {

    }

    @Override
    public String toString() {
        return "Acompañante{" +
                "integrante=" + integrante +
                ", parentesco='" + parentesco + '\'' +
                '}';
    }
}
