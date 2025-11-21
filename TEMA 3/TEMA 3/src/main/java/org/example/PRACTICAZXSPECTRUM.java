package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class PRACTICAZXSPECTRUM {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("******* VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM *******");

        System.out.println("Introduce la resolución de tu pantalla (ancho x alto) ...");

        System.out.println("Ancho:");
        int ancho = teclado.nextInt();

        System.out.println("Alto");
        int alto = teclado.nextInt();

        String matriz [][] = new String[ancho][alto];

        System.out.println("Introduce (línea a línea) los colores de tu imagen para cada píxel:");

        for (int i = 0; i < matriz.length; i++) {

            String color[] = teclado.next().split("");

            if (color.length==matriz[i].length){
                for (int j = 0; j < matriz[i].length; j++) {

                    matriz[i][j] = color[j];

                }
            }else {
                System.out.println("El tamaño es incorrecto...");
                i--;
            }
        }

        for (String fila[] : matriz){
            System.out.println(fila);
        }

    }
}
