package org.example;

import java.util.Scanner;

public class BATERIAEJERCICIO {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra o frase: ");
        String frase = teclado.nextLine();


        System.out.println("Texto original: " + frase);

        int longitud = frase.length();
        System.out.println("La longitud del texto es: " + longitud);

        System.out.println("Texto sin espacios: ");

        String frase_mayus = frase.toUpperCase();
        System.out.println("Texto a mayusculas: " + frase_mayus);





    }


}
