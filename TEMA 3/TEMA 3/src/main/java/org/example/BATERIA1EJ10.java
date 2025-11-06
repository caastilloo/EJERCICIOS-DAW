package org.example;

import java.util.Scanner;

public class BATERIA1EJ10 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        String vector [] = {"Coche", "Moto", "Cuatriciclo", "Tren", "Ferrocarril"};

        System.out.println("Introduce una letra: ");
        char letra_usuario = teclado.next().toUpperCase().charAt(0);

        int contador = 0;

        for (int i = 0; i < vector.length; i++) {

            char letra_vector = vector[i].charAt(0);

            if (letra_usuario==letra_vector){
                System.out.println(vector[i]);
                contador++;
            }
        }

        System.out.println("La letra " + letra_usuario + " aparece " + contador + " veces.");


    }
}
