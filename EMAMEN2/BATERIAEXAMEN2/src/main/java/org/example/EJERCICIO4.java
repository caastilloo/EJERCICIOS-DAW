package org.example;

import java.util.Scanner;

public class EJERCICIO4 {

    static void main() {

        Scanner telcado = new Scanner(System.in);

        System.out.println("-----------------");

        System.out.println("0-4 - INSUFICIENTE");
        System.out.println("5 - SUFICIENTE");
        System.out.println("6 - BIEN");
        System.out.println("7-8 - NOTABLE");
        System.out.println("9-10 - SOBRESALIENTE");
        System.out.println("Otro valor, no valido");

        System.out.println("-----------------");

        System.out.println("INTRODUZCA SU NOTA NUMÉRICA:");
        int nota = telcado.nextInt();

        switch (nota){
            case 0, 1, 2, 3, 4:
                System.out.println("INSUFICIENTE");
                break;
            case 5:
                System.out.println("SUFICIENTE");
                break;
            case 6:
                System.out.println("BIEN");
                break;
            case 7, 8:
                System.out.println("NOTABLE");
                break;
            case 9, 10:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("VALOR NO VALIDO");
                break;
        }

    }

}
