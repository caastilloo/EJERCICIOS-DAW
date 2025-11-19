package org.example;

public class MatricesEjemplo2 {

    static void main() {

        int matrizA [][] = {{1,2,3},{6,7,8},{10,8,15}};
        int matrizB [][] = {{5,1,4},{7,3,11},{11,12,13}};

        int matrizM [][] = new int[3][3];

        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA[i].length; j++) {

                int numA = matrizA[i][j];
                int numB = matrizB[i][j];

                if (numA>numB){
                    System.out.print(matrizA[i][j] + " ");
                }else {
                    System.out.print(matrizB[i][j] + " ");
                }

            }

            System.out.println();
        }
    }

}
