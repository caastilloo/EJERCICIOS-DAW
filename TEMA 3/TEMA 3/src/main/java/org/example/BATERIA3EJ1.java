package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BATERIA3EJ1 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int matriz [][] = new int[3][3];

        System.out.println("Rellene la matriz");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.println("Introduce un número");
                matriz[i][j] = teclado.nextInt();

            }
        }

        System.out.println("Matriz:");

        for (int fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }

        System.out.print("Número a buscar: ");
        int numero_buscar = teclado.nextInt();

        System.out.println();

        fuera:
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j]==numero_buscar){
                    System.out.println("Salida:");
                    System.out.println("El número " + numero_buscar + " se ncuentra en la posición: (" + i + ", " + j + ").");
                    break fuera;
                }

            }

        }



    }
}
