package org.example;

import java.util.Arrays;

public class EliminarDuplicados1 {

    static void main() {

        int vector [] = {1,2,2,3,4,4,4,5,5,6}; //Vector original
        int auxiliar [] = new int[vector.length]; //Vector auxiliar

        int contador = 1; //Vemos el tamaño que tiene el vector nuevo

        auxiliar[0]=vector[0];

        for (int i = 1; i < vector.length; i++) {

            if (vector[i]!=vector[i-1]){
                auxiliar[i] = vector[i];
                contador++;
            }
        }

        System.out.println(Arrays.toString(auxiliar));

        int limpio [] = new int[contador];

        int j = 0;

        for (int i = 0; i < auxiliar.length; i++) {

            if (auxiliar[i]!=0){
                limpio[j] = auxiliar[i];
                j++;
            }

        }

        System.out.println(Arrays.toString(limpio));

    }
}
