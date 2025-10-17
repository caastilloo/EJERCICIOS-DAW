package org.example;

import java.util.Scanner;

public class EjemploHasNext {

    static void main() {

        Scanner teclado = new Scanner(System.in);


        if (teclado.hasNextInt()){
            int num = teclado.nextInt();
            System.out.println(num);

        }else{
            System.out.println("El formato introducido no es correcto");

        }
    }

}
