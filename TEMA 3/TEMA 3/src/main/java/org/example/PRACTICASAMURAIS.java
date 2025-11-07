package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PRACTICASAMURAIS {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        boolean igual30 = false;

        System.out.println("EQUIPO 1:");

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
                igual30=true;
            }

        } while (igual30=true);


        System.out.println("EQUIPO 2:");

        do {

            System.out.println("> Introduce la potencia de los samurais: ");
            String equipo2 = teclado.nextLine();

            String vector_equipo2 [] = equipo2.split(" ");

            int suma = 0;

            for (int i = 0; i < vector_equipo2.length; i++) {
                int numero = Integer.parseInt(vector_equipo2[i]);
                suma+=numero;
            }

            if (suma!=30){
                System.out.println("ERROR. La potencia total no suma 30");
                igual30=false;
            }else {
                System.out.println("Equipo completado.");
                igual30=true;
            }

        }while(igual30==false);


        int samurai_inicial = aleatorio.nextInt(7)+1;

        System.out.println("¡Empieza la batalla!");
        System.out.println("La batalla inicia con el Samurai " + samurai_inicial + ".");


        for (int i = 0; i < 7; i++) {

        }







//        System.out.println(vector_equipo1[0]);
//        int numero1 = Integer.parseInt(vector_equipo1[0]);
//        System.out.println(numero1);


//        do {
//
//            System.out.println("> Introduce la potencia de los samurais: ");
//            String equipo2 = teclado.nextLine();
//
//            String vector_equipo2 [] = equipo2.split(" ");
//
//            int suma = 0;
//
//            for (int i = 0; i < vector_equipo2.length; i++) {
//                int numero = Integer.parseInt(vector_equipo2[i]);
//                suma+=numero;
//            }
//
//            if (suma!=30){
//                System.out.println("ERROR. La potencia total no suma 30");
//                igual30=false;
//            }else {
//                System.out.println("Equipo completado.");
//                igual30=true;
//            }
//
//        }while(igual30==false);




    }
}
