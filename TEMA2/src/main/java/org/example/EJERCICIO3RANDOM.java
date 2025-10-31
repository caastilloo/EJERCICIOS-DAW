package org.example;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIO3RANDOM {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int max = 0;
        int min = 0;

        do{
            System.out.println("Introduzca el rango mínimo:");
            min = teclado.nextInt();

            System.out.println("Introduzca el rango máximo:");
            max = teclado.nextInt();

            if (min >= max){
                System.out.println("ERROR. EL MINIMO TIENE QUE SER MENOR QUE LE MAXIMO.");
            }

        }while (min>=max);

        System.out.println("Cuantos numeros aleatorios quieres:");
        int numero_aleatorios = teclado.nextInt();

        for (int i = 0; i<numero_aleatorios; i++){
            int num = aleatorio.nextInt(max - min + 1) + min;
            System.out.println(num);
        }

    }
}
