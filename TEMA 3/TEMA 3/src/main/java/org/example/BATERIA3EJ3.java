package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BATERIA3EJ3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola! Cuántos estudiantes tienes?");
        int numero_estudiantes = teclado.nextInt();

        System.out.println("Cuántas asignaturas tienes?");
        int numero_asignaturas = teclado.nextInt();

        String matriz [][] = new String[numero_estudiantes+1][numero_asignaturas+1];

        matriz[0][0] = "Estudiantes";

        int contador = 1;
        for (int i = 1; i <= numero_estudiantes; i++) { //Se puede hacer con matriz.length
            System.out.println("Introduce el nombre del estudiante " + contador);
            matriz[i][0] = teclado.next();
            contador++;
        }

//        VERSION DE PATRI
//        for (int i = 1; i < matriz.length; i++) {
//            System.out.println("----------" + i);
//            matriz[i][0] = teclado.next();
//        }

        System.out.println();

        int contador_asignaturas = 1;
        for (int i = 1; i <= numero_asignaturas; i++) {
            System.out.println("Introduce el nombre de la asignatra " + contador_asignaturas);
            matriz[0][i] = teclado.next();
            contador_asignaturas++;
        }

//        VERSION DE PATRI
//        for (int i = 1; i < matriz[0].length; i++) {
//            System.out.println("----------" + i);
//            matriz[0][j] = teclado.next();
//        }

        //filas
        for (int i = 1; i < matriz.length; i++) {

            //columnas
            for (int j = 1; j < matriz[i].length; j++) {
                String fila = matriz[i][0];
                String columna = matriz[0][j];

                System.out.println("Inserta la nota de " + fila + " para la asignatura de " + columna);
                matriz[i][j] = teclado.next();

            }
        }

        System.out.println();

        for (String fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }

        System.out.println();

        int suma_notas = 0;
        for (int i = 1; i < matriz.length; i++) {
            suma_notas = 0; // Cada vuelta se reinicia el contador a 0
            for (int j = 1; j < matriz[i].length; j++) {

                suma_notas += Integer.parseInt(matriz[i][j]);

            }

            System.out.println("La media de " + matriz[i][0] + " es " + (double) (suma_notas/numero_asignaturas));
        }

        for (int j = 1; j < matriz[0].length; j++) {

            suma_notas = 0;
            for (int i = 1; i < matriz.length; i++) {

                suma_notas += Integer.parseInt(matriz[i][j]);

            }

            System.out.println("La media de " + matriz[0][j] + " es " + (double) (suma_notas/numero_estudiantes));
        }

//        FORMA DE PATRI
//        for (int i = 1; i < matriz[0].length; i++) {
//
//            suma_notas = 0;
//            for (int j = 0; j < matriz.length; j++) {
//
//                suma_notas += Integer.parseInt(matriz[j][i]);
//            }
//
//            System.out.println("La media de " + matriz[0][i] + " es " + (double) (suma_notas/numero_estudiantes));
//        }
    }
}
