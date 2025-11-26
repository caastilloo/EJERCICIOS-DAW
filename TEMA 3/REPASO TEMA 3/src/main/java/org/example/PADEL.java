package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class PADEL {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el porcentaje de los 4 factores externos (compi-pista-pala-pelota):");
        String porcentaje [] = teclado.next().split("-");

        System.out.println(Arrays.toString(porcentaje));

        int suma = 0;
        for (int i = 0; i < porcentaje.length; i++) {
            int porcentaje_num = Integer.parseInt(porcentaje[i]);
            suma += porcentaje_num;
        }

        int resultado = 100-suma;

        System.out.println("Tienes un " + resultado + "% de culpa.");

    }
}
