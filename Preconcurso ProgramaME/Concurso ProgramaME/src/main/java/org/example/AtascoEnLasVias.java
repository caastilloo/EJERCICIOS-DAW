package org.example;

import java.util.Scanner;

public class AtascoEnLasVias {

    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {
        if (!teclado.hasNext())
            return false;
        else {

            int trenes = teclado.nextInt();

            int vector [] = new int[trenes];
            int aux = 1;

            for (int i = 0; i < trenes; i++) {
                vector[i] = teclado.nextInt();
                if (i >= 1){
                    if (vector[trenes-1] > vector[trenes-2]){
                        aux++;
                    }
                }
            }

            System.out.println(aux);

            return true;
        }
    }

}
