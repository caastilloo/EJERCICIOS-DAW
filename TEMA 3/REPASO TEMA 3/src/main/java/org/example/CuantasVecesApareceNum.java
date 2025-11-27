package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CuantasVecesApareceNum {

    static void main() {

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        int array [] = new int[25];

        for (int i = 0; i < array.length; i++) {

            array[i] = aleatorio.nextInt(100);

        }

        System.out.println(Arrays.toString(array));

        System.out.println("Ingresa un número para buscar [0-100]: ");
        int numero = teclado.nextInt();

        int contador = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i]==numero){
                contador++;
            }
        }

        System.out.println("El numero " + numero + " aparece " + contador + " veces en el array.");






    }
}
