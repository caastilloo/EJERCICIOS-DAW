package org.example;

import java.util.Arrays;
import java.util.Random;

public class RellenarYSumarArray {

    static void main() {

        Random aleatorio = new Random();

        int array [] = new int[8];
        System.out.println(Arrays.toString(array));

        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(500);
            suma+= array[i];
        }

        System.out.println("La suma del array:" + Arrays.toString(array) + " es: " + suma);





    }
}
