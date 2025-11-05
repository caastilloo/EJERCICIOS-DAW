package org.example;

import java.util.Arrays;

public class BATERIA1EJ2 {

    static void main() {

        int vector[] = {3,4,2,5,6};
        int aux = 0;

        for (int i = 0; i<vector.length/2;i++){
            aux = vector[i];
            vector[i]=vector[vector.length-1-i];
            vector[vector.length-1-i]=aux;
        }

        System.out.println("Vector invertido: " + Arrays.toString(vector));
    }
}
