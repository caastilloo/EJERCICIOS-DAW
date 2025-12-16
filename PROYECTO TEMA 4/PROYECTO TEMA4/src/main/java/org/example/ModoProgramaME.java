package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ModoProgramaME {

    static Scanner teclado = new Scanner(System.in) ;

    public static void main(String[] args) {

        while(casoDePrueba())
            ;
    }

    public static boolean casoDePrueba() {

        int numero_matriz = teclado.nextInt();

        int matriz_original [][] = new int[numero_matriz][numero_matriz];

        for (int i = 0; i < numero_matriz; i++) {
            for (int j = 0; j < numero_matriz; j++) {

                int valor = teclado.nextInt();

                //crear dos variables para saber si es arriba o abajo

                if(i>j && valor != 0){
                    // superior falso
                } else if (i>j && valor != 0) {
                    // inferior falso
                }
            }

            // imprimir si o no

        }
            return true;
        }
}
