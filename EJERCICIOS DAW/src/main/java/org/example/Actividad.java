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


    }
}