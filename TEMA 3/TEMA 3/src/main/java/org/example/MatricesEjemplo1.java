package org.example;

import java.util.Arrays;
import java.util.Random;

public class MatricesEjemplo1 {

    static void main() {

        Random aleatorio = new Random();

        // Variable del tamaño para hacerlo aleatorio
        int tamanyo = aleatorio.nextInt(8)+2; // Random de 2 a 9

        // Variable de la matriz con un tamaño de fila aleatorio y un tamaño de columna aleatorio
        int matriz [][] = new int[tamanyo][tamanyo];

        // Filas
        for (int i = 0; i < matriz.length; i++) {

            // Columnas
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(5)+1;
            }
        }

        for (int fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (i==j){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }





    }
}
