package org.example;

import java.util.Scanner;

public class AtascoEnLasVias1 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        teclado = new Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {

        int numeros = teclado.nextInt();
        int array [] = new int[numeros];

        int contador = 1;

        if (!teclado.hasNext())
            return false;
        else {

            int limite = 1;

            for (int i = 0; i < numeros+1; i++) {

                if (array[i++] < array[limite++]){
                    contador++;
                }

                if (limite==3){
                    break;
                }


            }

            System.out.println(contador);

            return true;
        }
    }


}
