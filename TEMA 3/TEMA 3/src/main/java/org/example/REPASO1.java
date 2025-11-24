package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class REPASO1 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el porcentaje de los 4 factores externos (compi-pista-pala-pelota):");
        String porcentajes [] = teclado.nextLine().split(" ");

        System.out.println(Arrays.toString(porcentajes));

        int suma = 0;

        for (int i = 0; i < porcentajes.length; i++) {

              int numero = Integer.parseInt(porcentajes[i]);
              suma += numero;

        }

        int resultado = 100-suma;
        System.out.println("Tienes un " + resultado + "% de culpa.");
    }
}
