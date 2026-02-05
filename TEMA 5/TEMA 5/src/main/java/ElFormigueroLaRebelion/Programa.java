package ElFormigueroLaRebelion;

import java.util.ArrayList;
import java.util.Arrays;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporadas = 0;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena, int temporadas, Empleado director){
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = temporadas;
        listaEmpleados = new ArrayList<>();
        listaInvitados = new ArrayList<>();
        this.director = director;
    }

    public Programa(String nombre, Cadena cadena){
        this.nombre = nombre;
        this.cadena = cadena;

    }

    public void invitadosTemporada(int temporada){
        this.temporadas = temporada;
        System.out.println("Han acudido un total de " + listaInvitados.size());
    }

    public boolean buscarInvitado(String nombre){
        if (listaInvitados.contains(Arrays.asList(nombre))){
            return true;
        }else {
            return false;
        }
    }

//    public void invitadosTemporada(int temporada){
//        System.out.println("Han acudido un total de " + listaInvitados.size());
//        System.out.println("INVITADO:");
//        System.out.println("-> " + );
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena='" + cadena + '\'' +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director +
                '}';
    }
}
