package org.example;

import java.util.Scanner;

public class BATERIA2EJERCICIO4 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un palabra:");
        String palabra = teclado.next();

        int tamanyo = palabra.length();

        for (int i = 0; i<tamanyo; i++){

            System.out.println(palabra.charAt(i));
        }

        System.out.println("Introduce un palabra:");
        String palabra2 = teclado.next();

        int tamanyo2 = palabra.length();

        for (int i = tamanyo2-1; i>=0; i--){

            System.out.print(palabra.charAt(i));
        }
    }
}
