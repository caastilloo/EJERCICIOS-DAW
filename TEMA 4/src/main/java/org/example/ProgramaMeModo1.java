package org.example;

import java.util.Scanner;

public class ProgramaMeModo1 {

    static Scanner teclado;

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }

    public static void casoDePrueba() {

        String persona[] = teclado.nextLine().split(" ");

        System.out.println("Hola, " + persona[1] + ".");

    }

}
