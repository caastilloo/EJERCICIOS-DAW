package org.example;

import java.util.Scanner;

public class BATERIAEJ1 {

    static void main() {

        Scanner teclado =new Scanner(System.in);

        final int JORNADA_SIN_EXTRAS = 40;
        final double PLUS_TARIFA_EXTRA = 1.5;

        System.out.println("Introduzca las Horas: ");
        int horas = teclado.nextInt();

        System.out.println("Introduzca la Tarifa a aplicar: ");
        double tarifa = teclado.nextDouble();


        if (horas>JORNADA_SIN_EXTRAS){ //si
            double extras = horas - JORNADA_SIN_EXTRAS;
            double tarifa_extras = tarifa * PLUS_TARIFA_EXTRA;
            double salario_extra = extras * tarifa_extras;

            System.out.println("Salario (con exta): " + (salario_extra + (JORNADA_SIN_EXTRAS * tarifa)) + "€");

        }else{ //si no
            double salario = horas * tarifa;
            System.out.println("Salario: " + salario + "€");
        }


        }




    }