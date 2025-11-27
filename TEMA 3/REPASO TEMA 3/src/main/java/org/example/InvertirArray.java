package org.example;

import java.util.Arrays;

public class InvertirArray {

    static void main() {

        int array [] = {1,2,3,4,5};

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length-1; i++) {

            for (int j = i+1; j < array.length; j++) {

                if (array[i] < array[j]){
                    int aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;

                }
            }
        }

        System.out.println(Arrays.toString(array));




    }
}
