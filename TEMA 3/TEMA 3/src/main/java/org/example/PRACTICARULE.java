package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PRACTICARULE {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        final String colores [] = {"Rojo","Negro"};

        Integer vector_numeros [] = new Integer[37];

        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i]=i;
        }

        final String par_impar [] = {"Par", "Impar"};

        System.out.println("Introduce tu número (0-36) ...");
        int numero_usuario = teclado.nextInt();

        if (!Arrays.asList(vector_numeros).contains(numero_usuario)){
            System.out.println("ERROR. El número no es válido (0-36)");
            return;
        }

        String color_apuesta = "";
        String par_impar_apuesta = "";

        if (numero_usuario!=0){

            System.out.println("Introduce color:");
            color_apuesta = teclado.next();

            if (Arrays.asList(colores).contains(color_apuesta.toLowerCase())){
                System.out.println("ERROR. El color debe ser ROJO - NEGRO");
                return;
            }

            System.out.println("Introduce Par/Impar: ");
            par_impar_apuesta = teclado.next();

            if (Arrays.asList(par_impar).contains(par_impar_apuesta.toLowerCase())){
                System.out.println("ERROR. La opció debe ser PAR - IMPAR");
                return;
            }

        }

        String color_sorteo = colores[aleatorio.nextInt(2)];

        int numero_sorteo = aleatorio.nextInt(36)+1;

        String par_impar_sorteo;

        if (numero_sorteo % 2 == 0){
            par_impar_sorteo="Par";
        }else {
            par_impar_sorteo="Impar";
        }

        System.out.println("Ha salido " + numero_sorteo + " " + color_sorteo + " " + par_impar_sorteo);

        if (numero_usuario==numero_sorteo && color_sorteo.equals(color_apuesta) && par_impar_sorteo.equals(par_impar_apuesta)){
            System.out.println("HAS GANADO!");
        } else if (numero_usuario==numero_sorteo) {
            if (numero_sorteo==0){
                System.out.println("HAS GANADO Y TODA LA MESA PIERDA");
            }else {
                System.out.println("HAS ACERTADO EL NÚMERO: " + numero_usuario);
            }
        }else if (color_apuesta.equals(color_sorteo)){
            System.out.println("HAS ACERTADO EL COLOR" + color_apuesta);
        } else if (par_impar_apuesta.equals(par_impar_sorteo)) {
            System.out.println("HAS ACERTADO" + par_impar_apuesta);
        }


    }
}
