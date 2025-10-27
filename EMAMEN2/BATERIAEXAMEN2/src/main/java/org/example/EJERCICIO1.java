package org.example;

import java.util.Scanner;

public class EJERCICIO1 {

    static void main() {

        Scanner telcado = new Scanner(System.in);
        int mayores_0 = 0;
        int menores_0 = 0;
        int iguales_0 = 0;

        System.out.println("Cantidad num a introducir:");
        int cantidad = telcado.nextInt();

        for (int i = 1; i<=cantidad; i++){
            System.out.println("Introduce el numero " + i);
            int num = telcado.nextInt();

            if (num>0){
                mayores_0++;
            } else if (num<0){
                menores_0++;
            } else if (num==0){
                iguales_0++;
            }
        }

        System.out.println("MAYORES 0:" + mayores_0);
        System.out.println("MENORES 0:" + menores_0);
        System.out.println("IGUALES 0:" + iguales_0);

    }

}
