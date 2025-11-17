package org.example;

import java.util.Scanner;

public class BATERIA2EJ4 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el valor m: ");
        int valor = teclado.nextInt();

        primos:
        for (int i = 2; i <= valor; i++) {

            for (int j = 2; j < i; j++) {

                if (i % j == 0){
                    continue primos;
                }
                
            }

            System.out.print(i + " ");

        }


    }

}
