package org.example;

import java.util.Arrays;

public class BATERIA1EJ8 {

    static void main() {

        int vector [] = {1,2,3,5};
        int nuevo [] = new int[5];

        int num = 4;

        for (int i = 0; i < num; i++) {

            vector[i]=nuevo[i];

            if (num == vector[i]){
                vector[i]=num;
                break;
            }

        }

        System.out.println(Arrays.toString(nuevo));


    }
}
