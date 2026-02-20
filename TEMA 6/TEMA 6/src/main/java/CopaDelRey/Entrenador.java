package CopaDelRey;

import java.awt.*;

public class Entrenador extends MutxamielFC implements AccionesDeportivas{

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad) {
        super(nombre, edad);
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
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

    @Override
    public String toString() {
        return "Entrenador{" +
                "equipo=" + equipo +
                ", formacionPreferida='" + formacionPreferida + '\'' +
                '}';
    }
}
