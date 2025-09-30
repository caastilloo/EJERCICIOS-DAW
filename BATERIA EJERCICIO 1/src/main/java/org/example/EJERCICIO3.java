package org.example;

import java.util.Scanner;

public class EJERCICIO3 {

    static void main(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();

        if (numero>0){
            System.out.println("El número es POSITIVO");

        } else if (numero<0) {
            System.out.println("El número es N1EGATIVO");

        }else{
            System.out.println("El número es NATURAL");
        }
    }


}
