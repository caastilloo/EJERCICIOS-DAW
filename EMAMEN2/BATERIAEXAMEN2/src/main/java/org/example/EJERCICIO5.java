package org.example;

import java.util.Scanner;

public class EJERCICIO5 {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        int sueldomaximo = 0;
        int mas_de_mil = 0;

        for (int i = 1; i<=5; i++){

            System.out.println("Introduce sueldo "+ i);
            int sueldo = teclado.nextInt();

            if (sueldo>1000){
                mas_de_mil++;
            }

            if (sueldo>sueldomaximo){
                sueldomaximo = sueldo;
            }

        }

        System.out.println("El sueldo mas alto es " + sueldomaximo +"€");
        System.out.println("Nuumero de empleados con sueldo superior a 1000: "+ mas_de_mil);
    }
}
