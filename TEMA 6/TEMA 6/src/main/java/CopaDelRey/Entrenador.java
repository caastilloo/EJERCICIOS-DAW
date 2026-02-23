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
        System.out.printf("El entrenador " + getNombre() + " está viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.printf("El entrenador " + getNombre() + " está celebrando el GOL");
    }

    @Override
    public void entrenar() {
        System.out.printf("El entrenador " + getNombre() + " está entrenando a su equipo (" + equipo +  ")");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.printf("El entrenador " + getNombre() + " del equipo " + equipo + " está jugando contra " + rival);
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "equipo=" + equipo +
                ", formacionPreferida='" + formacionPreferida + '\'' +
                '}';
    }
}
