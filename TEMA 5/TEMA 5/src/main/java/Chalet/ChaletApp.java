package Chalet;

public class ChaletApp {

    static void main() {

        Casa pisito = new Casa("Calle Falsa 123");

        System.out.println(pisito.getPropietario());

        pisito.crearHabitacion("Cocina", 12.5);
        pisito.crearHabitacion("Terraza", 4);
        pisito.crearHabitacion("Despacho", 13);
        pisito.crearHabitacion("Despacho", 13);

        pisito.borrarHabitacion("Despacho");
        pisito.crearHabitacion("Despacho", 5);

        pisito.mostarHabitaciones();

        System.out.println("La habitación más grande es: " + pisito.getHabitacionGrande().getNombre());

    }
}
