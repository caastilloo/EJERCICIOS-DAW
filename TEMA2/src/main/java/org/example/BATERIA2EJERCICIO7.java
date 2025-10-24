//REVISAR

package org.example;

import java.util.Scanner;

public class BATERIA2EJERCICIO7 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número para hacer el factorial de este:");
        int num = teclado.nextInt();

        int factorial = 7;

        for (int i = num; i>0; i--){

            factorial *=i;

            System.out.println(factorial);

        }

    }

}
