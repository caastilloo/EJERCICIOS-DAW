package org.example;

import java.util.Scanner;

public class EJERCICIO6 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int num_mayores = 0;
        int altura_mayor = 0;

        System.out.println("Introduce el numero de alumnos:");
        int alumnos = teclado.nextInt();

        for (int i = 1; i<=alumnos; i++){
            System.out.println("Introduce la edad del alumno "+ i+ ":");
            int edad = teclado.nextInt();

            System.out.println("Introduuce la altura (cm) del alumno " + i+ ":");
            int altura = teclado.nextInt();

            System.out.println("ALUMNO "+ i+ " Edad: " + edad + " Altura: " + altura);

            if (edad>=18){
                num_mayores++;
            }

            if (altura>=175){
                altura_mayor++;
            }
        }

        System.out.println("El numero de alumnos mayores de 18 años es: " + num_mayores);
        System.out.println("El numero de alumnos que miden mas de 175 cm es: " + altura_mayor);

    }
}
