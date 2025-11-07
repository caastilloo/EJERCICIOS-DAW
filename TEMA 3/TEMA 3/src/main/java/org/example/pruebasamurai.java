package org.example;

import java.util.Random;
import java.util.Scanner;

public class pruebasamurai {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        boolean igual30 = false;
        int contador = 0;


        System.out.println("EQUIPO 1:");

        while (contador<2){
            do {

                System.out.println("> Introduce la potencia de los samurais: ");
                String equipo1 = teclado.nextLine();

                String vector_equipo1 [] = equipo1.split(" ");

                int suma = 0;

                for (int i = 0; i < vector_equipo1.length; i++) {
                    int numero = Integer.parseInt(vector_equipo1[i]);
                    suma+=numero;
                }

                if (suma!=30){
                    System.out.println("ERROR. La potencia total no suma 30");
                    igual30=false;
                }else {
                    System.out.println("Equipo completado.");
                    contador++;
                    igual30=true;
                }

            }while(igual30=false);
        }


        System.out.println("EQUIPO 2:");



        int samurai_inicial = aleatorio.nextInt(7)+1;

        System.out.println("¡Empieza la batalla!");
        System.out.println("La batalla inicia con el Samurai 3.");

    }
}


