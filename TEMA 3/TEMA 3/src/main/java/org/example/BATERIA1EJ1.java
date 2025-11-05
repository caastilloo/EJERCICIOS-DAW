package org.example;

import java.util.Arrays;
import java.util.Random;

public class BATERIA1EJ1 {

    static void main() {

        Random aleatorio = new Random();
        int numeros [] = new int[8];
        int sum = 0;

        for (int i = 0; i<numeros.length; i++){
            numeros[i] = aleatorio.nextInt(500)+1; // (500-0+1)+0;
            sum += numeros[i];
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println("El resultado es: " + sum);

    }
}
