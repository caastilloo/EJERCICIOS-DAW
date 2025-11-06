package org.example;

import java.util.Arrays;

public class BATERIA1EJ5 {

    static void main() {

        int [] vector = {1,2,3,4,5};
        int aux = vector[0];

        for (int i = 0; i<vector.length-1;i++){
            vector[i]=vector[i+1];
        }

        vector[vector.length-1] = aux;

        System.out.println(Arrays.toString(vector));

    }
}
