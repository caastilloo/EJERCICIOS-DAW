package org.example;

import java.util.Random;
import java.util.Scanner;

public class PRACTICAPRIMITIVA {

    static void main() {

        Scanner teclado =new Scanner(System.in);
        Random aleatorio = new Random();

        boolean repetir= false;

        do {
            System.out.println("Introduce los datos de tu boleto: ");
            String boleto = teclado.nextLine();

            boolean comprobar = boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1,2}");

            if (comprobar==true){
                break;
            }

        }while (repetir==false);





    }
}
