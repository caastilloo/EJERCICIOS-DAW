package CopaDelRey;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMantenimiento {

    Scanner teclado = new Scanner(System.in);

    public void menuPrincipal(){

        System.out.println("=== App de mantenimiento del MUTXAMEL FC ===");

        System.out.println();

        System.out.println("[1]. Mantenimiento de jugadores");
        System.out.println("     Dentro podremos añadir jugadores, modificar sus datos y añadir acompañantes (sólo SENIORS).");

        System.out.println("[2]. Mantenimiento de entrenadores (añadir-modificar-salir)");
        System.out.println("     Dentro podremos añadir entrenadores y modificar sus datos.");

        System.out.println("[3]. Mantenimiento de masajistas (añadir-modificar-salir)");
        System.out.println("     Dentro podremos añadir masajistas y modificar sus datos.");

        System.out.println("[4]. Consultar equipos");
        System.out.println("     Dentro se deben listar los tipos de equipos del club y eligir uno.");

        System.out.println("[X]. Salir");

        System.out.println("==============================");

        System.out.println("Seleccione una opción");
        char opcion = teclado.next().charAt(0);
    }

    public void validacionMenu(char opcion){

        System.out.println("================================================");

        System.out.println();

        System.out.println("Seleccione una opción ->");
        char opcion = teclado.next().charAt(0);

        switch (opcion){
            case 1:
                System.out.println("Introduce el nombre del jugador a añadir:");
                String nombre = teclado.nextLine();

                System.out.println("Introduce la edad del jugador a añadir:");
                int edad = teclado.nextInt();

                System.out.println("Introduce la categoría del jugador a añadir:");


//                Jugador jugador = new Jugador(nombre, edad, );
            case 2:
                System.out.println("¿De que jugador quieres hacer cambios?");

//                for (Jugador jugador1 :)

                System.out.println("================================================");

                System.out.println("Seleccione una opción ->");


        }
    }

    public void mantenimientoJugadores(){

        System.out.println("=== Mantenimiento de Jugadores ===");

        System.out.println();

        System.out.println("[1]. Añadir nuevo jugador");
        System.out.println("[2]. Modificar los datos de jugador existente");
        System.out.println("[3]. Crear acompañantes (sólo seniors)");
        System.out.println("[X]. Volver al menú principal");

        System.out.println();
    }

    public void menuAnyadirJugador(){
        System.out.println("=== Mantenimiento de Jugadores. Modificar datos de jugador existente ===");

        System.out.println();

        System.out.println("¿De qué jugador quieres hacer cambios?");

        System.out.println();

//        for (Jugador jugador : listaJugadores){
//            System.out.println(jugador);
//        }

        System.out.println();
    }

    public void menuModificarDatosJugador(){
        System.out.println("=== Mantenimiento de Jugadores. Modificar datos de jugador existente ===");

        System.out.println();

        System.out.println("Modificando jugador: ");
        System.out.println();

        System.out.println("¿Qué quieres modificar? [nombre, edad, categoria, dorsal, posicion]:");

        System.out.println();

        System.out.println("================================================");

        System.out.println("Seleccione una opción ->");
        String opcion = teclado.next().toLowerCase();

    }

    public void menuCrearAcompanyantes(){
        System.out.println("=== Mantenimiento de Jugadores. Modificar datos de jugador existente ===");
        System.out.println();

        System.out.println("Introduce el nombre del acompañante: ");
        String nombre = teclado.nextLine();

        System.out.println("Introduce la edad del acompañante: ");
        int edad = teclado.nextInt();

        System.out.println("Introduce el jugador al que acompaña: ");
        // COMPLETAR

        System.out.println("Introduce el parentesco que tenga el acompañante con el jugador: ");
        String parentesco = teclado.nextLine();

        ArrayList<Acompanyante> listaAcompanyantes = new ArrayList<>();

        // COMPLETAR
        //listaAcompanyantes.add(nombre, edad, , parentesco);


    }

    public void menuModificarAtributos(String opcion){

        switch (opcion){
            case "nombre":
                System.out.println("Introduzca el nombre a modificar: ");
//                Jugador.setNombre
                break;
            case "edad":
                System.out.println("Introduzca la edad a modificar: ");
                break;
            case "categoria":
                System.out.println("Introduzca la categoría a modificar: ");
                break;
            case "dorsal":
                System.out.println("Introduzca el dorsal a modificar: ");
                break;
            case "posicion":
                System.out.println("Introduzca la posición a modificar: ");
                break;
            default:
                System.out.println("ERROR. Esa opción no es válida.");
                break;
        }
    }



//    public void anyadirEntrenador(){
//        System.out.println("Introduce el nombre del entrenador:");
//        String nombre = teclado.nextLine();
//
//        System.out.println("Introduce la edad del entrenador:");
//        int edad = teclado.nextInt();
//
//        Entrenador entrenador = new Entrenador(nombre, edad);
//
//    }

}
