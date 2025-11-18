package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrices {

    static void main() {

        // Forma 1
        int matriz1 [][] = {{1,2,3},{4,5,6},{7,8,9}};

        // Forma 2
        int matriz2 [][] = new int[3][3];

        // int matriz [filas][columnas] = {---}

        System.out.println(matriz1[1][2]);
        System.out.println(matriz1[2][0]);

        // matriz.length te da las filas
        // matriz[0].length te da las columnas (da igual poner 0, 1, 2 ...)

        // Recorro las filas
        for (int i = 0; i < matriz1.length; i++) {

            // Recorro las columnas
            for (int j = 0; j < matriz1[i].length; j++) { // [i] -> podrias poner 0, 1, 2 ...
                System.out.print(matriz1[i][j] + " "); // Quitar ln del print

            }
            System.out.println();

        }

        // for each -> Para imprimir || fors anidados -> Recorrer posiciones

        // for each - VECTORES
        int vector [] = {1,2,3,4};

        // No utilizar si quiero recorrer posiciones, solo si quiero saber los valores del vector (solo acceso al valor no a la posición.
        for (int num : vector){
            System.out.println(num);
        }

        // for each - MATRIZ
        for (int fila[] : matriz1){
            System.out.println(Arrays.toString(fila));
        }

        // Lo mismo que los for de anidados, pero con un for each
        for (int fila[] : matriz1){

            for (int nums : fila){ // Numeros de la fila
                System.out.println(nums);

            }
            System.out.println();

        }


    }
}
