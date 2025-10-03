package org.example;

import java.util.Scanner;

public class pruebaej5 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        double divisor = 0;
        double dividendo = 0;
        boolean repetir = false;

        do{
            try{
                System.out.println("Intoduce el dividendo...");
                dividendo = teclado.nextDouble();
                System.out.println("Intoduce el divisor...");
                divisor = teclado.nextDouble();
                repetir = false;
            }catch (Exception er){
                System.out.println("Introduce un formato correcto");
                repetir = true;
            }

            teclado.nextLine();

        }while (repetir);

        repetir = false;

        if (divisor==0){
            System.out.println("NO SE PUEDE");
            repetir = false;
        }else{
            double resultado = dividendo/divisor;
            System.out.println("Resultado:" + resultado);
            repetir = true;
        }

    }
}
