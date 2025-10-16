package org.example;

import java.util.Scanner;

public class BATERIAEJERCICIO3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int numero = teclado.nextInt();

        System.out.println("Introduce las cifras que quieras eliminar: ");
        int cifras = teclado.nextInt();

        String numero_string = Integer.toString(numero);
        int tam = numero_string.length();

        int nuevo_tam = tam-cifras;

        String num_cortado = numero_string.substring(0,nuevo_tam);
        System.out.println(num_cortado);


    }
}
