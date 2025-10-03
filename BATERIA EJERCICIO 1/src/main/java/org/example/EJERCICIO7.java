package org.example;

import java.util.Scanner;

public class EJERCICIO7 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Hay Jamón (S/N)");
        char jamon = teclado.next().charAt(0);

        System.out.println("Hay Aceite (S/N)");
        char aceite = teclado.next().charAt(0);

        System.out.println("Hay Tomate (S/N)");
        char tomate = teclado.next().charAt(0);

        if (aceite == 'S' && jamon == 'S' && tomate == 'S'){
            System.out.println("Vamos");
        }else (aceite == 'N' && jamon == 'N' && tomate == 'N'){
            System.out.println("No vamos");
        }
    }
}
