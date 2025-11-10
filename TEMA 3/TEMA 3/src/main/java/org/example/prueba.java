package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int[] equipo1 = new int[7];
        int[] equipo2 = new int[7];

        // Este bucle pide los dos equipos, uno tras otro
        for (int e = 1; e <= 2; e++) {

            boolean sumaCorrecta = false;
            int[] equipoActual; // aquí guardamos el equipo que estamos completando

            if (e == 1) {
                equipoActual = equipo1;
            } else {
                equipoActual = equipo2;
            }

            do {
                System.out.println("EQUIPO " + e + ":");
                System.out.println("> Introduce la potencia de los samuráis (7 números separados por espacio):");
                String linea = teclado.nextLine();
                String[] partes = linea.split(" ");

                if (partes.length != 7) {
                    System.out.println("Debes introducir exactamente 7 potencias.");
                    continue;
                }

                int suma = 0;
                for (int i = 0; i < 7; i++) {
                    equipoActual[i] = Integer.parseInt(partes[i]);
                    suma += equipoActual[i];
                }

                if (suma == 30) {
                    sumaCorrecta = true;
                    System.out.println("Equipo completado correctamente.\n");
                } else {
                    System.out.println("ERROR. La potencia total no suma 30.\n");
                }

            } while (!sumaCorrecta);
        }

        // Mostramos ambos equipos
        System.out.println("Equipo 1: " + Arrays.toString(equipo1));
        System.out.println("Equipo 2: " + Arrays.toString(equipo2));

        // Aquí haremos la batalla después
    }
}
