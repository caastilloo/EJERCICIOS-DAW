package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BATERIA1EJ3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int num[] = new int[25];

        for (int i = 0; i<num.length;i++){
            num[i] = aleatorio.nextInt(100)+1;
        }

        System.out.println(Arrays.toString(num));

        System.out.println("Ingrese un número [0-100]:");
        int numero_usuario = teclado.nextInt();

        int contador = 0;
        int v = 0;

        for (int i = 0; i<num.length;i++){
            v=num[i];
            if (v==numero_usuario){
                contador++;
            }
        }

        System.out.println("El número " + numero_usuario + " aparece " + contador + " en el array.");

    }
}
