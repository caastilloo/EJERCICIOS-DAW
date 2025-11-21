package org.example;

import java.util.Scanner;

public class BATERIA3EJ3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola! Cuántos estudiantes tienes?");
        int numero_estudiantes = teclado.nextInt();

        System.out.println("Cuántas asignaturas tienes?");
        int numero_asignaturas = teclado.nextInt();

        String matriz [][] = new String[numero_estudiantes+1][numero_asignaturas+1];



//        do {
//            System.out.println("Introduce el nombre del estudiante " + i);
//            matriz[i][j] = teclado.next();
//        }while (i<numero_estudiantes);


//        for (int i = 0; i < numero_estudiantes; i++) {
//
//            System.out.println("Introduce el nombre del estudiante " + i);
//
//        }
//        for (int i = 0; i < matriz.length; i++) {
//
//
//            for (int j = 0; j < matriz[i].length; j++) {
//
//
//
//            }
//
//        }

    }
}
