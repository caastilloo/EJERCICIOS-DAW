package Chalet;

public class ChaletApp {

    static void main() {

        Casa pisito = new Casa("Calle Falsa 123");

        pisito.crearHabitacion("Cocina", 12.5);
        pisito.crearHabitacion("Terraza", 4);
        pisito.crearHabitacion("Despacho", 13);
        pisito.crearHabitacion("Despacho", 13);

        pisito.mostarHabitaciones();

        System.out.println("La habitación más grande es: " + pisito.getHabitacionGrande().getNombre());

    }
}
