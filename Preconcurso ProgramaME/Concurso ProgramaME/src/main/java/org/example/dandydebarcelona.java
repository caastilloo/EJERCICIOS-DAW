package org.example;

import java.util.Scanner;

public class dandydebarcelona {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main

    public static void casoDePrueba() {

        // 1 chelin = 12 peniques
        // 1 libra = 20 chelines

        int carruajeNormalDentro = teclado.nextInt(); // 1 chelin = 12 peniques
        int carruajeNormalFuera = teclado.nextInt(); // 9 peniques
        int carruajeComodoDentro = teclado.nextInt(); // 1 chelin y 6 peniques = 18 peniques
        int carruajeComodoFuera = teclado.nextInt(); // 1 chelin = 12 peniques

        int Libra = 0;
        int Chelin = 0;
        int Penique = 0;

        if (carruajeNormalDentro >= 1) {
            Penique += 12;
        } else if (carruajeNormalFuera >= 1) {
            Penique += 9;
        } else if (carruajeComodoDentro >= 1) {
            Penique += 18;
        } else if (carruajeComodoFuera >= 1) {
            Penique += 12;
        }

        int contadorResto = 0;
        while (Penique >= 12) {
            Chelin++;
            Penique -= 12;
        }

        while (Chelin >= 20) {
            Libra++;
            Chelin -= 20;
        }

        System.out.println(Libra + " " + Chelin + " " + Penique);
    } // casoDePrueba


}
