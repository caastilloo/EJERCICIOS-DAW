package org.example;

import java.util.Scanner;

public class EMBLUCAR {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        int num = 0;
        boolean repetir = false;

        System.out.println("HOLA BIENVENIDO");

        do {
            try {
                System.out.println("Introduce un número:");
                num = teclado.nextInt();
                repetir = false;
            }catch (Exception err){
                System.out.println("ERROR formato introducido no es correcto");
                repetir = true;
            }

            teclado.nextLine();

        }while (repetir==true);
    }
}
