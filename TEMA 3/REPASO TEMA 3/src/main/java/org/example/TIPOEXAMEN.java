package org.example;

import java.util.Arrays;
import java.util.Random;

public class TIPOEXAMEN {

    static void main() {

        Random aleatorio = new Random();

        int vector[] = new int[25];

        for (int i = 0; i < vector.length; i++) {
            vector[i]= aleatorio.nextInt(100)+1;
        }

        System.out.println(Arrays.toString(vector));
        int array_sinduplicados [] = Arrays.stream(vector).distinct().toArray();
        System.out.println(Arrays.toString(array_sinduplicados));






    }
}
