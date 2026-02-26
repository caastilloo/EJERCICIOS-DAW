package CopaDelRey;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMantenimiento {

    static Scanner teclado = new Scanner(System.in);

    static ArrayList<Jugador> listaJugadores = new ArrayList<>();
    static ArrayList<Entrenador> listaEntrenadores = new ArrayList<>();
    static ArrayList<Masajista> listaMasajistas = new ArrayList<>();
    static ArrayList<Acompanyante> listaAcompanyantes = new ArrayList<>();

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

        System.out.print("Seleccione una opción -> ");
        char opcion = teclado.next().toUpperCase().charAt(0);

        System.out.println();

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
                break;
            case 'X':
                break;
            default:
                System.out.println("Seleccione una opción válida.");
                menuPrincipal();
                break;
        }

    }

    // EQUIPOS (CONSULTAS)
    public static void consultaEquipos(){
        System.out.println("=== Consulta de Equipos ===");

        System.out.println();

        System.out.println("Introduzca el nombre del equipo a consultar:");
        Equipos equipo_consulta = Equipos.valueOf(teclado.next().toUpperCase());

        for (Jugador jugador : listaJugadores){
            if (equipo_consulta == jugador.getCategoria()){
                System.out.println(jugador);
            }
        }

        System.out.println();

//        System.out.println("- BENJAMÍN");
//        System.out.println("- ALEVÍN");
//        System.out.println("- INFANTIL");
//        System.out.println("- CADETE");
//        System.out.println("- JUVENIL");
//        System.out.println("- SENIOR");

//        System.out.println();
//
//        System.out.println("================================================");
//
//        System.out.println("Seleccione una opción ->");
//        char opcion = teclado.next().toUpperCase().charAt(0);

//        validarConsulta(opcion);

    }

//    public static void validarConsulta(char opcion){
//
//        switch (opcion){
//            case '1':
//                Equipos.BENJAMIN;
//                break;
//            case ALEVIN:
//                equipo.toString();
//                break;
//            case INFANTIL:
//                equipo.toString();
//                break;
//            case CADETE:
//                equipo.toString();
//                break;
//            case JUVENIL:
//                equipo.toString();
//                break;
//            case SENIOR:
//                equipo.toString();
//                break;
//            default:
//                System.out.println("Seleccione una opción válida.");
//                break;
//        }
//    }

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

        System.out.print("Seleccione una opción ->");
        char opcion = teclado.next().toUpperCase().charAt(0);

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
                mantenimientoJugadores();
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

        for (int i = 0; i < listaJugadores.size(); i++) {
            System.out.println("[" + i + "] " + listaJugadores.get(i));
        }

        System.out.println();

        System.out.println("================================================");

        System.out.println();

        System.out.println("Seleccione una opción ->");
        int opcion = teclado.nextInt();

        if (opcion < 0 || opcion > listaJugadores.size()){
            System.out.println("ERROR. Introduce una opción válida.");
            mantenimientoJugadores();
        }

        menuModificarAtributos(listaJugadores.get(opcion));

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
        mantenimientoJugadores();

    }

    public static void validarModificacionAtributos(String opcion, Jugador jugador){

        switch (opcion){
            case "nombre":
                System.out.print("Nuevo nombre -> ");
                String nombre_nuevo = teclado.nextLine();
                jugador.setNombre(nombre_nuevo);

                System.out.println("Nombre actualizado correctamente.");
                break;
            case "edad":
                System.out.print("Nueva edad -> ");
                int edad_nueva = teclado.nextInt();
                jugador.setEdad(edad_nueva);

                System.out.println("Edad actualizada correctamente.");
                break;
            case "categoria":
                System.out.print("Nueva categoría -> ");
                Equipos categoria_nueva = Equipos.valueOf(teclado.next());
                jugador.setCategoria(categoria_nueva);

                System.out.println("Categoría actualizada correctamente.");
                break;
            case "dorsal":
                System.out.print("Nuevo dorsal -> ");
                int dorsal_nuevo = teclado.nextInt();
                jugador.setDorsal(dorsal_nuevo);

                System.out.println("Dorsal actualizado correctamente.");
                break;
            case "posicion":
                System.out.print("Nueva posición -> ");
                Posiciones posicion_nueva = Posiciones.valueOf(teclado.next());
                jugador.setPosicion(posicion_nueva);

                System.out.println("Posición actualizada correctamente.");
                break;
            default:
                System.out.print("Seleccione una opción válida.");
                break;
        }
    }

    public static void menuCrearAcompanyantes(){
        System.out.println("=== Mantenimiento de Jugadores. Modificar datos de jugador existente ===");
        System.out.println();

        for (int i = 0; i < listaJugadores.size(); i++) {
            System.out.println("[" + i + "] " + listaJugadores.get(i));
        }

        System.out.println();

        System.out.println("================================================");

        System.out.println();

        System.out.print("- Introduce el jugador al que acompaña -> ");
        int opcion = teclado.nextInt();

        Jugador jugador = listaJugadores.get(opcion);

        System.out.println();

        if (jugador.getCategoria() != Equipos.SENIOR){
            System.out.println("Solo se pueden crear acompañantes para SENIOR");
            mantenimientoJugadores();
            return;
        }

        System.out.println("INTRODUZCA LOS SIGUIENTES DATOS:");
        System.out.println("[1]. Introduce el nombre del acompañante: ");
        String nombre = teclado.next();

        System.out.println("[2]. Introduce la edad del acompañante: ");
        int edad = teclado.nextInt();

        System.out.println("[3]. Introduce el parentesco que tenga el acompañante con el jugador: ");
        String parentesco = teclado.nextLine();

        Acompanyante acompanyante = new Acompanyante(nombre, edad, jugador, parentesco);
        listaAcompanyantes.add(acompanyante);

        System.out.println("Acompañante creado correctamente.");
        System.out.println();
        mantenimientoJugadores();
    }

    public static void menuAnyadirJugador(){

        System.out.println("=== Mantenimiento de Jugadores. Añadir un nuevo Jugador ===");

        System.out.println();

        System.out.println("INTRODUZCA LOS SIGUIENTES DATOS:");
        System.out.println();

        System.out.println("[1]. Introduce el nombre: ");
        String nombre = teclado.next();

        System.out.println("[2]. Introduce la edad: ");
        int edad = teclado.nextInt();

        System.out.println("[3]. Introduce la categoría: ");
        Equipos categoria = Equipos.valueOf(teclado.next());

        System.out.println("[4]. Introduce el dorsal: ");
        int dorsal = teclado.nextInt();

        System.out.println("[5]. Introduce la posición: ");
        Posiciones posicion = Posiciones.valueOf(teclado.next().toUpperCase());

        for (Jugador jugador : listaJugadores){
            if (dorsal == jugador.getDorsal()){
                throw new MismoDorsalException("Este dorsal ya está ocupado en el equipo " + categoria);
            }
        }

        // Añadir jugador
        Jugador jugador = new Jugador(nombre, edad, categoria, dorsal, posicion);
        listaJugadores.add(jugador);

        System.out.println("Jugador añadido correctamente.");
        System.out.println();
        mantenimientoJugadores();

    }
}
