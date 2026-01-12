package org.example;

import java.util.Scanner;

public class ViajandoenelsigloXIX {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main

    public static void casoDePrueba() {

        int libra = teclado.nextInt();
        int chelin = teclado.nextInt();
        int penique = teclado.nextInt();

    } // casoDePrueba
}
