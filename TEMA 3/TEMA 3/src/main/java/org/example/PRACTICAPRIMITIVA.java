package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PRACTICAPRIMITIVA {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Introduce los datos de tu boleto: ");
        String boleto = teclado.nextLine();

        boolean comprobar = boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1,2}");

        if (comprobar==false){
            return;
        }

        String boleto_vector [] = boleto.split("[-/]");
        System.out.println(Arrays.toString(boleto_vector));








    }
}
