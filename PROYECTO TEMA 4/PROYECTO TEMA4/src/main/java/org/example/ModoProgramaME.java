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

        boolean arriba = true;
        boolean abajo = true;

        for (int i = 0; i < numero_matriz; i++) {
            for (int j = 0; j < numero_matriz; j++) {

                int valor = teclado.nextInt();

                if (i>j && valor != 0){
                    arriba = false;
                }

                if (i>j && valor != 0){
                    abajo = false;
                }

//                if(i>j && valor != 0){
//                    arriba = false;
//                } else if (i>j && valor != 0) {
//                    abajo = false;
//                }
            }
        }

            if (arriba || abajo){
                System.out.println("Si");
            }else{
                System.out.println("No");
            }

            return true;
        }
}
