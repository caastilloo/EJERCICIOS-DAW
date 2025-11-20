package org.example;

import java.util.Arrays;

public class MatricesEjemplo2 {

    static void main() {

        int matrizA [][] = {{1,2,3},{6,7,8},{10,8,15}};
        int matrizB [][] = {{5,1,4},{7,3,11},{11,12,13}};

        int matrizM [][] = new int[matrizA.length][matrizA[0].length];

        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA[i].length; j++) {

                int numA = matrizA[i][j];
                int numB = matrizB[i][j];

                if (numA>numB){
                    matrizM[i][j]=matrizA[i][j];
                    System.out.print(matrizM[i][j] + " ");
                }else {
                    matrizM[i][j]=matrizB[i][j];
                    System.out.print(matrizM[i][j] + " ");
                }

            }

            System.out.println();
        }

        // Otra manera de imprimirlo (con for each)
        for (int fila[] : matrizM){
            System.out.println(Arrays.toString(fila));
        }

    }
}
