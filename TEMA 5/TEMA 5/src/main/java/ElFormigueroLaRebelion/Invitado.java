package ElFormigueroLaRebelion;

import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {

    static Scanner teclado = new Scanner(System.in);

    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada){
        this.nombre = nombre;
        this.profesion = profesion;
        fecha_visita = LocalDate.now();
        this.temporada = temporada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public LocalDate getFecha_visita() {
        //System.out.println("Introduzca la la fecha de la visita: ");
        //LocalDate fecha_visita = teclado.

        return fecha_visita;
    }

//    public void setFecha_visita(LocalDate fecha_visita) {
//        this.fecha_visita = fecha_visita;
//    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }
}
