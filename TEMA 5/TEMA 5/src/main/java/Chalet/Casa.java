package Chalet;

import java.util.ArrayList;

public class Casa {

    private String direccion;
    private ArrayList<Habitacion> listaHabitaciones;

    public Casa (String direccion){
        this.direccion = direccion;
        listaHabitaciones = new ArrayList<>();
    }

    public void crearHabitacion(String nombre, double metros){

        for (Habitacion habitacion : listaHabitaciones){
            if (habitacion.getNombre().equals(nombre)){
                System.out.println("La habitación " + nombre + " ya existe.");
                return;
            }
        }

        Habitacion habitacion = new Habitacion(nombre, metros);
        listaHabitaciones.add(habitacion);
    }

    public void borrarHabitacion(){

    }

    public void mostarHabitaciones(){
        System.out.println("Hay " + listaHabitaciones.size() + " habitaciones en la casa, de la dirección " + direccion);
        for (Habitacion habitacion : listaHabitaciones){
            System.out.println("-> " + habitacion.getNombre() + " con " + habitacion.getMetros() + "m2");
        }
    }

    public Habitacion getHabitacionGrande(){
        Habitacion maximo = listaHabitaciones.get(0);

        for (Habitacion habitacion : listaHabitaciones){
            if (maximo.getMetros() < habitacion.getMetros()){
                maximo = habitacion;
            }
        }

//        for (int i = 0; i < listaHabitaciones.size(); i++) {
//            if (listaHabitaciones.get(i).getNombre())>
//        }

        return maximo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                '}';
    }


}
