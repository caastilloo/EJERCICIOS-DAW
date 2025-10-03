package org.example;

import java.util.Scanner;

public class BASCULAFERIA {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        boolean repetir = false;
        int altura = 0;

        System.out.println("BIENVENIDO AL RATÓN JUGUETÓN");

        do {
            try{
                System.out.println("Introduzca su altura (cm):");
                altura = teclado.nextInt();
                repetir=false;
            } catch (Exception err){
                System.out.println("ERROR DE LECTURA, Baja de la báscula y vuelve a subir");
                repetir=true;
                teclado.nextLine();
        }
        }while (repetir);

        if (altura<140){
            int altura_tope = 140-altura;
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. Te faltan " + altura_tope + " cm de altura.");
        } else if (altura>=140) {
            System.out.println("Puedes subir en la atracción");
        }

        int altura_max = 230;
        int altura_min = 0;
        if (altura_max>altura && altura_min>altura){
            System.out.println("ERROR DE LECTURA, Baja de la báscula y vuelve a subir");
        }

        double peso = 0;

        do {
            try{
                System.out.println("Introduzca su peso (kg):");
                peso = teclado.nextInt();
                repetir=false;
            } catch (Exception err){
                System.out.println("ERROR DE LECTURA, Baja de la báscula y vuelve a subir");
                repetir=true;
                teclado.nextLine();
            }
        }while (repetir);






        /*if (peso<75){
            double peso_min = 75-peso;
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. Te faltan " + peso_min + " cm de altura.");
        } else if (peso>=75) {
            System.out.println("Puedes subir en la atracción");
        }
        */
    }
}


