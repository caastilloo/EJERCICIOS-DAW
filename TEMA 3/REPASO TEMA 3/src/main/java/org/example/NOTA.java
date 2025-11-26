package org.example;

import java.util.Random;
import java.util.Scanner;

public class NOTA {

    static void main() {

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        int matriz[][] = {{3,4,5},{0,1,2}};

        int posicion_alumno= matriz[0][0];
        int posicion_profesor;
        int posicion_notita;

        boolean correcto = false;

        while (!correcto){
            System.out.println("Posición alumno: " + posicion_alumno);
            posicion_profesor = matriz[aleatorio.nextInt(2)][aleatorio.nextInt(3)];
            System.out.println("Posición profesor: " + posicion_profesor);
            posicion_notita = matriz[aleatorio.nextInt(2)][aleatorio.nextInt(3)];
            System.out.println("Posición notita: " + posicion_notita);

            if (posicion_profesor!=posicion_notita && posicion_notita!=posicion_alumno && posicion_profesor!=posicion_alumno){
                correcto=true;
            }

        }

        System.out.println();

        boolean pillado = false;

        int fila = 0;
        int columna = 0;

        do {

            System.out.println("Escoge una dirección [N: Norte, E: Este, S: Sur, O: Oeste]");
            char direccion = Character.toUpperCase(teclado.next().charAt(0));

            switch (direccion){

                case 'N':
                    posicion_alumno =matriz[fila][columna++];
                    break;

                case 'E':
                    posicion_alumno = matriz[fila++][columna];
                    break;

                case 'S':
                    posicion_alumno = matriz[fila][columna--];
                    break;

                case 'O':
                    posicion_alumno = matriz[fila--][columna];
                    break;

                default:
                    System.out.println("ERROR");

            }

            System.out.println("Te mueves a la habitación " + matriz[fila][columna]);

        }while(!pillado);

        System.out.println("Escoge una dirección [N: Norte, E: Este, S: Sur, O: Oeste]");
        char direccion = Character.toUpperCase(teclado.next().charAt(0));

        System.out.println("Te mueves a la habitación: " );

        System.out.println();

        System.out.println("Estás en la habitación: ");
        System.out.println("¿A dónde quieres ir?");




//        do {
//
//            int posicion_alumno = matriz[0][0];
//            int posicion_profesor = matriz[aleatorio.nextInt(2)][aleatorio.nextInt(3)];
//            int posicion_notita = matriz[aleatorio.nextInt(2)][aleatorio.nextInt(3)];
//
//            System.out.println(posicion_alumno);
//            System.out.println(posicion_profesor);
//            System.out.println(posicion_notita);
//
//            if (posicion_profesor==posicion_alumno && posicion_notita==posicion_profesor){
//                correcto=true;
//            }else {
//                correcto=false;
//            }
//
//        }while(correcto==true);










    }
}
