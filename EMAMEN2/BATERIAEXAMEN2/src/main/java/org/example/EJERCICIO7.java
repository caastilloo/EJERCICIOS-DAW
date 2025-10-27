package org.example;

import java.util.Scanner;

public class EJERCICIO7 {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        boolean error = true;
        int num =0;

        do {
            System.out.println("INGRESA NUUMERO ENTERO POSITIVO | INDICAR CUANTOS TERMINOS DE LA SECUENCIA DESEA VER");
            num = teclado.nextInt();

            if (num <=0){
                System.out.println("ERROR. Introduzca otro numero");
            }

        }while (num<=0);

        int a = 0, b = 1;

        System.out.println("SECUENCIA");

            for (int i = 1; i<=num; i++){
                System.out.println(a + " ");
                int siguiente = a+b;
                a=b;
                b=siguiente;

            }

        System.out.println();
        }




    }

