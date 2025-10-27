package org.example;

import java.util.Random;

public class EJERCICIO1RANDOM {

    static void main() {

        Random aleatorio = new Random();

        int resultado1 = aleatorio.nextInt(6)+1;
        int resultado2 = aleatorio.nextInt(6)+1;
        int suma = resultado1 + resultado2;

        System.out.println("El resultado del primer dado es: " + resultado1);
        System.out.println("El resultado del segundo dado es: " + resultado2);
        System.out.println("La suma de los dos resultado son: " + suma);

    }
}
