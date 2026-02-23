package CopaDelRey;

import java.util.ArrayList;

public class AppMutxamelFC {

    static void main() {

        // Lista jugadores (SENIOR)
        ArrayList<Jugador> listaJugadores = new ArrayList<>();

        // Jugadores (SENIOR)
        Jugador jugador1 = new Jugador("Jose", 19, Equipos.SENIOR, 20, Posiciones.CENTROCAMPISTA);
        Jugador jugador2 = new Jugador("Pablo", 18, Equipos.SENIOR, 7, Posiciones.DELANTERO );
        Jugador jugador3 = new Jugador("Izan", 21, Equipos.SENIOR, 4, Posiciones.DEFENSA );
        Jugador jugador4 = new Jugador("Ivan", 25, Equipos.SENIOR, 5, Posiciones.DEFENSA );
        Jugador jugador5 = new Jugador("Jose Luis", 19, Equipos.SENIOR, 12, Posiciones.CENTROCAMPISTA );
        Jugador jugador6 = new Jugador("Alejandro", 26, Equipos.SENIOR, 25, Posiciones.CENTROCAMPISTA );
        Jugador jugador7 = new Jugador("Ismael", 21, Equipos.SENIOR, 11, Posiciones.DELANTERO );

        // Entrenador (SENIOR)
        Entrenador entrenador = new Entrenador("Pepe", 59, Equipos.SENIOR, "4-3-3");

        // Masajistas (SENIOR)
        Masajista masajista1 = new Masajista("Pedro", 30, "Fisio", 8);
        Masajista masajista2 = new Masajista("Paco", 28, "Fisio", 5);

        // Acompañantes (SENIOR)
        Acompanyante acompanyante1 = new Acompanyante("Elena", 19, jugador1, "Pareja");
        Acompanyante acompanyante2 = new Acompanyante("Pilar", 50, jugador2, "Madre");

        // Concentrarse

        // Entrenar
        jugador1.entrenar();
        entrenador.entrenar();

        // Dar masaje algun jugador
        masajista1.darMasaje(jugador1);
        masajista2.darMasaje(jugador2);

        // Viajar a Madrid
        jugador3.viajar("Madrid");
        entrenador.viajar("Madrid");
        masajista1.viajar("Madrid");
        acompanyante2.viajar("Madrid");

        // Planificar entrenamiento
        entrenador.planificarEntrenamiento();

        // Entrenar
        jugador1.entrenar();
        entrenador.entrenar();

        // Descansar
        jugador1.descansar();

        // Calentar
        jugador1.calentar();

        // Jugar partido
        jugador1.jugarPartido("Real Madrid");
        entrenador.jugarPartido("Real Madrid");

        // Animar equipo
        acompanyante2.animarEquipo();
        acompanyante1.animarEquipo();

        // Hacer cambios
        entrenador.hacerCambios();

        // Marcar gol
        jugador1.marcarGol();
        jugador2.marcarGol();

        // Celbrar gol
        jugador3.celebrarGol();
        jugador1.celebrarGol();

        // Dar masaje a varios jugadores

        // Viajar a Mutxamel

        // Descansar

    }
}
