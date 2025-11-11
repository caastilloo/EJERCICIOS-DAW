package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ampliación {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra:");
        String palabra = teclado.next();

        System.out.println("Cantidad de letras:");
        String letras = teclado.next();

        String palabra_vector [] = palabra.split("");
        String letras_vector [] = letras.split("-");

        System.out.println(Arrays.toString(palabra_vector));
        System.out.println(Arrays.toString(letras_vector));

        if (palabra_vector.length==letras_vector.length){

            for (int i = 0; i < palabra_vector.length; i++) {

                for (int j = 0; j < Integer.parseInt(letras_vector[i]); j++) {

                    System.out.print(palabra_vector[i]);

                }

            }

        }else {
            System.out.println("No hay un número para cada letra.");
        }

        System.out.println("-------------------------------------------");

        Integer vector [] = {3,2,5,6,41,22,23};

        if (Arrays.asList(vector).contains(22)){
            System.out.println("Está");
        }else {
            System.out.println("No está");
        }

    }
}
