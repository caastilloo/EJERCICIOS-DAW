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

        System.out.println("Alto:");
        int alto = teclado.nextInt();

        String matriz [][] = new String[alto][ancho];

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
            System.out.println(Arrays.toString(fila));
        }
        
        String validador_bloque1 = "";
        int contador = 1;
        // FILAS
        for (int i = 0; i < matriz.length; i++) {

            validador_bloque1 = matriz[0][0];
            // COLUMNAS
            for (int j = 0; j < 8; j++) {
                
                if (matriz[i][j]!=validador_bloque1){
                    contador++;
                }

            }
        }

        int contador2 = 1;
        String validador_bloque2 = "";
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 8; j < 16; j++) {

                validador_bloque2 = matriz[0][8];
                if (matriz[i][j]!=validador_bloque2){
                    contador2++;
                }
            }
        }

        if (contador<=2 && contador2<=2){
            System.out.println("Es compatible con ZX Spectrum");
        }else {
            System.out.println("No es compatible con ZX Spectrum");
        }

    }
}
