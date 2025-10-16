package org.example;

import java.util.Scanner;

public class PRACTICA4 {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        boolean repetir = false;

        int mult = 0;
        int multr = 0;
        do {
            try {
                System.out.println("Intoduce el multiplicando (3 cifras): ");
                mult = teclado.nextInt();
            }catch (Exception err){
                System.out.println("Error: Introduce un número");
                teclado.nextLine();
            }

            if (mult >= 100 && mult <= 999 || mult <= -100 && mult >= -999){
                repetir=false;
            } else {
                repetir=true;
            }
        }while (repetir==true);

        do {
            try {
                System.out.println("Introduce el multiplicador (3 cifras): ");
                multr = teclado.nextInt();
            }catch (Exception err){
                System.out.println("Error: Introduce un número");
                teclado.nextLine();
            }

            if (multr >= 100 && multr <= 999 || multr <= -100 && multr >= -999){
                repetir=false;
            } else {
                repetir=true;
            }
        }while (repetir==true);

        int signo = 1;
        if ((mult < 0 && multr > 0) || (mult > 0 && multr < 0)){
            signo=-1;
        }

        int mult_positivo = mult;
        if (mult_positivo < 0){
            mult_positivo = -mult_positivo;
        }

        int multr_positivo = multr;
        if (multr_positivo < 0){
            multr_positivo = -multr_positivo;
        }

        String multr_texto = Integer.toString(multr_positivo);

        int num1 = mult * Integer.parseInt(multr_texto.substring(0,1));
        int num2 = mult * Integer.parseInt(multr_texto.substring(1,2));
        int num3 = mult * Integer.parseInt(multr_texto.substring(2,3));

        int resultado_final = mult * multr;

        System.out.println();
        System.out.println("  " + mult);
        System.out.println("x "+ multr);
        System.out.println("----------");
        System.out.println("  " + num1);
        System.out.println(" " + num2 + " ");
        System.out.println(num3 + "  ");
        System.out.println("----------");
        System.out.println(resultado_final);

        }
    }
