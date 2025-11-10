package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PRACTICASAMURAIS {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int equipo1 [] = new int[7];
        int equipo2 [] = new int[7];


        for (int i = 1; i <= 2 ; i++) {

            boolean igual30 = false;
            int [] equipo_actual;

            if (i==1){
                equipo_actual=equipo1;
            }else{
                equipo_actual=equipo2;
            }

            do {

                System.out.println("EQUPO " + i + ":");
                System.out.println("> Introduce la potencia de los samurais: ");
                String numeros = teclado.nextLine();
                String numeros_vector [] = numeros.split(" ");

                if (numeros_vector.length != 7){
                    System.out.println("Debes introducir 7 numeros en la potencia");
                    continue;
                }

                int suma = 0;

                for (int e = 0; e < numeros_vector.length; e++) {
                    int numero = Integer.parseInt(numeros_vector[e]);
                    equipo_actual[e]=numero;
                    suma += equipo_actual[e];
                }

                if (suma==30){
                    System.out.println("Equipo completado.");
                    igual30=true;
                }else {
                    System.out.println("ERROR. La potencia total no suma 30");
                }

            } while (!igual30);
        }

        System.out.println("¡Empieza la batalla!");
        int samurai = aleatorio.nextInt(7)+1;
        System.out.println("La batalla inicia con el Samurai " + samurai + ".");

        int contador_equipo1 = 0;
        int contador_equipo2 = 0;

        int posicion = samurai-1;

        for (int j = 1; j <= 7 ; j++) {
            int numero_equipo1 = equipo1[posicion];
            int numero_equipo2 = equipo2[posicion];

            if (numero_equipo1>numero_equipo2){
                System.out.println("Samurai " + (posicion+1) + ". Gana Equipo 1 " + numero_equipo1 + " vs " + numero_equipo2);
                equipo2[posicion]=0;
                contador_equipo2++;
            } else if (numero_equipo1<numero_equipo2) {
                System.out.println("Samurai " + (posicion+1) + ". Gana Equipo 2 " + numero_equipo1 + " vs " + numero_equipo2);
                equipo1[posicion]=0;
                contador_equipo1++;
            }else {
                System.out.println("Empate. Ambos equipos mueren. " + numero_equipo1 + " vs " + numero_equipo2);
                equipo1[posicion]=0;
                equipo2[posicion]=0;
                contador_equipo1++;
                contador_equipo2++;
            }


            if (contador_equipo1>3){
                System.out.println("!Equipo 2 GANA! Equipo 1 ha tenido " + contador_equipo1 + " bajas.");
                break;
            }

            if (contador_equipo2>3){
                System.out.println("!Equipo 1 GANA! Equipo 2 ha tenido " + contador_equipo2 + " bajas.");
                break;
            }

            posicion++;
            if (posicion==7){
                posicion=0;
            }


        }

    }
}

