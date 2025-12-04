package org.example;

import java.util.Scanner;

public class BAT1EJ1 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un número:");
        int numero = teclado.nextInt();
        // validarNumero

        // Primera opcion
        int resultado = cubo(numero);
        System.out.println(resultado);

        // Segunda opcion
        System.out.println(cubo(numero));
    }

    public static int cubo(int numero){ // se puede llamar num y no pasa nada



        return numero*numero*numero; // igual seria num*num*num
    }
}
