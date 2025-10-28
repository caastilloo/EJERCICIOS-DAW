package org.example;

import java.util.Random;

public class Aleatorios {

    static void main() {

        Random aleatorio = new Random();

        int numero = aleatorio.nextInt(2)+1;
        System.out.println(numero);

    }
}
