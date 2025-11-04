package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Vectores {

    static void main() {

        int vector_numeros [] = {8,7,0,1,3,4};
        String vector_string [] = {"Patri", "Kiko", "Ismael"};

        vector_numeros[0]=10;
        vector_numeros[2]=3;
        vector_numeros[4]=25;

        System.out.println(Arrays.toString(vector_numeros));
        System.out.println(Arrays.toString(vector_string));

        System.out.println("---------------------------------------------------");

        int vector2_numeros [] = new int[6];
        String vector2_string [] = new String[6];

        System.out.println(Arrays.toString(vector2_numeros));
        System.out.println(Arrays.toString(vector2_string));

        System.out.println("---------------------------------------------------");

        vector_numeros=vector2_numeros.clone();

        vector2_numeros[3]=5;
        vector2_numeros[1]=3;

        System.out.println(Arrays.toString(vector_numeros));
        System.out.println(Arrays.toString(vector2_numeros));

        System.out.println("---------------------------------------------------");

        System.out.println(vector_numeros.length);

        System.out.println("---------------------------------------------------");

        for (int i = 0; i<vector2_numeros.length; i++){
            System.out.println("Numerito: " + vector2_numeros[i]);
        }

        System.out.println("---------------------------------------------------");

        for (int i = vector2_numeros.length-1; i >= 0; i--){
            System.out.println("Numerito: " + vector2_numeros[i]);
        }

        System.out.println("---------------------------------------------------");

        Random aleatorio = new Random();
        int numeros [] = new int[8];
        int sum = 0;

        for (int i = 0; i<numeros.length; i++){
            numeros[i] = aleatorio.nextInt(500)+1; // (500-0+1)+0;
            sum += numeros[i];
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println("El resultado es: " + sum);

        System.out.println("---------------------------------------------------");

        int vector[] = {3,4,2,5,6};
        int aux = 0;

        for (int i = 0; i<vector.length/2;i++){
            aux = vector[i];
            vector[i]=vector[vector.length-1-i];
            vector[vector.length-1-i]=aux;
        }

        System.out.println("Vector invertido: " + Arrays.toString(vector));

        System.out.println("---------------------------------------------------");

        Scanner teclado = new Scanner(System.in);
        int num[] = new int[25];

        for (int i = 0; i<num.length-1;i++){
            num[i] = aleatorio.nextInt(100)+1;
        }

        System.out.println("Ingrese un número [0-100]:");
        int numero_usuario = teclado.nextInt();

        int contador = 0;

        for (int i = 0; i<num.length-1;i++){
            if (i==numero_usuario){
                contador++;
            }
        }

        System.out.println("El número " + numero_usuario + " aparece " + contador + " en el array.");

    }
}
