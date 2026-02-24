package CopaDelRey;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMantenimiento {

    static Scanner teclado = new Scanner(System.in);

    static void main() {

        menuPrincipal();

    }

    public static void menuPrincipal(){

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

        System.out.println();

        System.out.println("================================================");

        System.out.println();

        System.out.println("Seleccione una opción ->");
        char opcion = teclado.next().charAt(0);

        validacionMenu(opcion);
    }

    public static void validacionMenu(char opcion){

        switch (opcion){
            case '1':
                mantenimientoJugadores();
                break;
            case '2':
                break;
            case '3':
                break;
            case '4':
                consultaEquipos();
            case 'X':
                break;
            default:
                System.out.println("Seleccione una opción válida.");
                break;
        }

    }

    // EQUIPOS (CONSULTAS)

    public static void consultaEquipos(){
        System.out.println("=== Consulta de Equipos ===");

        System.out.println();

        System.out.println("Seleccione un equipo a consultar:");

        System.out.println();

        System.out.println("[1]. BENJAMÍN");
        System.out.println("[2]. ALEVÍN");
        System.out.println("[3]. INFANTIL");
        System.out.println("[4]. CADETE");
        System.out.println("[5]. JUVENIL");
        System.out.println("[6]. SENIOR");
        System.out.println("[X]. Salir al menú principal");

        System.out.println();

        System.out.println("================================================");

        System.out.println("Seleccione una opción ->");
        CopaDelRey.Equipos equipo = Equipos.valueOf(teclado.next());

        validarConsulta(equipo);

    }

    public static void validarConsulta(Equipos equipo){

        switch (equipo){
            case BENJAMIN:
                equipo.toString();
                break;
            case ALEVIN:
                equipo.toString();
                break;
            case INFANTIL:
                equipo.toString();
                break;
            case CADETE:
                equipo.toString();
                break;
            case JUVENIL:
                equipo.toString();
                break;
            case SENIOR:
                equipo.toString();
                break;
            default:
                System.out.println("Seleccione una opción válida.");
                break;
        }
    }

    // JUGADORES (MANTENIMIENTO)

    public static void mantenimientoJugadores(){

        System.out.println("=== Mantenimiento de Jugadores ===");

        System.out.println();

        System.out.println("[1]. Añadir nuevo jugador");
        System.out.println("[2]. Modificar los datos de jugador existente");
        System.out.println("[3]. Crear acompañantes (sólo seniors)");
        System.out.println("[X]. Volver al menú principal");

        System.out.println();

        System.out.println("================================================");

        System.out.println();

        System.out.println("Seleccione una opción ->");
        char opcion = teclado.next().charAt(0);

        validarMantenimientoJugadores(opcion);
    }

    public static void validarMantenimientoJugadores(char opcion){

        switch (opcion){
            case '1':
                menuAnyadirJugador();
                break;
            case '2':
                menuModificarDatosJugador();
                break;
            case '3':
                menuCrearAcompanyantes();
                break;
            case 'X':
                menuPrincipal();
                break;
            default:
                System.out.println("Seleccione una opción válida.");
                break;
        }
    }

    public static void menuModificarDatosJugador(){

        System.out.println("=== Mantenimiento de Jugadores. Modificar datos de jugador existente ===");

        System.out.println();

        System.out.println("¿De qué jugador quieres hacer cambios?");

        System.out.println();

//        for (Jugador jugador : listaJugadores){
//            System.out.println(jugador);
//        }

        System.out.println();

        System.out.println("================================================");

        System.out.println();

        System.out.println("Seleccione una opción ->");


//        menuModificarAtributos();

    }

    public static void menuModificarAtributos(Jugador jugador){

        System.out.println("=== Mantenimiento de Jugadores. Modificar datos de jugador existente ===");

        System.out.println();

        System.out.println("Modificando jugador: " + jugador);
        System.out.println();

        System.out.println("¿Qué quieres modificar? [nombre, edad, categoria, dorsal, posicion]:");

        System.out.println();

        System.out.println("================================================");

        System.out.println("Seleccione una opción ->");
        String opcion = teclado.next().toLowerCase();

        validarModificacionAtributos(opcion, jugador);

    }

    public static void validarModificacionAtributos(String opcion, Jugador jugador){

        switch (opcion){
            case "nombre":
                System.out.print("Nuevo nombre -> ");
                String nombre_nuevo = teclado.nextLine();
                jugador.setNombre(nombre_nuevo);
                break;
            case "edad":
                System.out.print("Nueva edad -> ");
                int edad_nueva = teclado.nextInt();
                jugador.setEdad(edad_nueva);
                break;
            case "categoria":
                System.out.print("Nueva categoría -> ");
                Equipos categoria_nueva = Equipos.valueOf(teclado.next());
                jugador.setCategoria(categoria_nueva);
                break;
            case "dorsal":
                System.out.print("Nuevo dorsal -> ");
                int dorsal_nuevo = teclado.nextInt();
                jugador.setDorsal(dorsal_nuevo);
                break;
            case "posicion":
                System.out.print("Nueva posición -> ");
                Posiciones posicion_nueva = Posiciones.valueOf(teclado.next());
                jugador.setPosicion(posicion_nueva);
                break;
            default:
                System.out.print("Seleccione una opción válida.");
                break;
        }
    }

    public static void menuCrearAcompanyantes(){
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

    public static void menuAnyadirJugador(){

        System.out.println("=== Mantenimiento de Jugadores. Añadir un nuevo Jugador ===");

        System.out.println();

        System.out.println("INTRODUZCA LOS SIGUIENTES DATOS:");
        System.out.print("[1]. Introduce el nombre -> ");
        String nombre = teclado.nextLine();

        System.out.print("[1]. Introduce la edad -> ");
        int edad = teclado.nextInt();

        System.out.print("[1]. Introduce la categoría -> ");
        Equipos categoria = Equipos.valueOf(teclado.next());

        System.out.print("[1]. Introduce el dorsal -> ");
        int dorsal = teclado.nextInt();

        System.out.print("[1]. Introduce la posición -> ");
        Posiciones posicion = Posiciones.valueOf(teclado.next());

        // Añadir jugador

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
