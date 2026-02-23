package CopaDelRey;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMantenimiento {

    static Scanner teclado = new Scanner(System.in);

    static void main() {

        ArrayList<Jugador> listaJugadores = new ArrayList<>();



    }

    public void mantenimientoJugadores(){
        System.out.printf("=== Mantenimiento de Jugadores ===");
        System.out.printf("");
        System.out.printf("[1]. Añadir nuevo jugador");
        System.out.printf("[2]. Modificar los datos de jugador existente");
        System.out.printf("[3]. Crear acompañantes (sólo seniors)");
        System.out.printf("[X]. Volver al menú principal");

        System.out.printf("================================================");

        System.out.printf("Seleccione una opción ->");
        char opcion = teclado.next().charAt(0);

        switch (opcion){
            case 1:
                System.out.printf("Introduce el nombre del jugador a añadir:");
                String nombre = teclado.nextLine();

                System.out.printf("Introduce la edad del jugador a añadir:");
                int edad = teclado.nextInt();

                System.out.printf("Introduce la categoría del jugador a añadir:");


                Jugador jugador = new Jugador(nombre, edad, );
            case 2:
                System.out.printf("¿De que jugador quieres hacer cambios?");

//                for (Jugador jugador1 :)

                System.out.printf("================================================");

                System.out.printf("Seleccione una opción ->");


        }

    }

    public void anyadirEntrenador(){
        System.out.printf("Introduce el nombre del entrenador:");
        String nombre = teclado.nextLine();

        System.out.printf("Introduce la edad del entrenador:");
        int edad = teclado.nextInt();

        Entrenador entrenador = new Entrenador(nombre, edad);

    }

}
