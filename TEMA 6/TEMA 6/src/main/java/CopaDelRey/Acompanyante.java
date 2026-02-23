package CopaDelRey;

public class Acompanyante extends MutxamielFC{

    private Jugador integrante;
    private String parentesco;

    public Acompanyante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
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
        System.out.println("El acompañante " + getNombre() + " está concentrandose para el partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante " + getNombre() + "está viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.printf("El acompañante " + getNombre() + " está celebrando el GOL");
    }

    public void animarEquipo(){
        System.out.printf(getNombre() + " está animando a su equipo.");
    }

    @Override
    public String toString() {
        return "Acompañante{" +
                "integrante=" + integrante +
                ", parentesco='" + parentesco + '\'' +
                '}';
    }
}
