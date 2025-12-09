package org.example;

import java.util.Scanner;

public class Validar {

    public static void cadena (){

        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.next();

        System.out.println("Hola " + nombre);
    }

    public static int suma_3(int a, int b, int c){

        return a+b+c;
    }

    public static boolean validar (int resultado){

        if (resultado >= 0){
            return true;
        }else {
            return false;
        }
    }

}
