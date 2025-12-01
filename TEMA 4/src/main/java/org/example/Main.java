package org.example;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime tu nombre");
        String nombre = teclado.next();

        int num = Prueba.prueba(10,nombre);
        System.out.println(num);

        System.out.println();

        Prueba.procedimiento(nombre);

        procedimiento();

        System.out.println("Perros: ");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);

        }

        varios("palabra",1,3,4,6,23,4324,23,4,9);

    }

    public static void procedimiento(){

        System.out.println();
    }

    //varargs -> ...
    public static void varios(String palabra, int...num){ //el varargs siempre al final, int...num, String palabra -> NO

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

    }
}
