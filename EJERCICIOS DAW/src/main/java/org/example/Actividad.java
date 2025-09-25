package org.example;

import java.util.Scanner;

public class Actividad {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nombre:"); // Escribir
        String nombre = teclado.nextLine(); // Leer

        System.out.println("¿A qué curso vas?");
        String curso = teclado.next();

        System.out.println("Hola " + nombre + " bienvenido a " + curso);

        System.out.println("Introduce un número...");
        int num1 = teclado.nextInt();

        System.out.println("Introduce otro número...");
        int num2 = teclado.nextInt();

        System.out.println("El resultado es " + (num1+num2)); // Opción 1

        // Opción 2
        int resultado = num1+num2;
        System.out.println("El resultado es " + resultado);

    }
}