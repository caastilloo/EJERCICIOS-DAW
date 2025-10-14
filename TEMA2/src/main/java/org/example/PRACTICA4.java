package org.example;

import java.util.Scanner;

public class PRACTICA4 {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        boolean repetir = false;


        System.out.println("Intoduce el multiplicando (3 cifras): ");
        int multiplicando = teclado.nextInt();

        System.out.println("Intoduce el multiplicador (3 cifras): ");
        int multiplicador = teclado.nextInt();

        int mult = 0;
        int multr = 0;


        if (multr > 99 && multr <= 999) {
            String num_string = Integer.toString(multr);
            String num_derecha = num_string.substring(2, 3);
            int num_derec_int = Integer.parseInt(num_derecha);

            System.out.println(num_derec_int * mult);

            String num_string2 = Integer.toString(multr);
            String num_centro = num_string2.substring(1, 2);
            int num_centro_int = Integer.parseInt(num_centro);

            System.out.println(num_centro_int * mult);

            String num_string3 = Integer.toString(multr);
            String num_izquierda = num_string3.substring(0, 1);
            int num_izquierda_int = Integer.parseInt(num_izquierda);

            System.out.println(num_izquierda_int * mult);

        } else {
            System.out.println("no");
        }
    }
}
