package org.example;

import java.util.Arrays;

public class BATERIA1EJ7 {

    static void main() {

        int array1 [] = {1,2,3};
        int array2 [] = {4,5,6};

        System.arraycopy(array1,0,array2,3,0);
        System.out.println(Arrays.toString(array1));

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 1: " + Arrays.toString(array2));
        System.out.println("Array combinado: " );

    }
}
