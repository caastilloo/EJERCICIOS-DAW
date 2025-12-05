package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BAT1EJ4 {

    static Scanner teclado = new Scanner(System.in);

    static void main() {

        double vector [] = new double[6];
        double[] vector_nuevo = datos(vector);

//        OPCION 1
        System.out.println(Arrays.toString(vector_nuevo));

//        OPCION 2
//        System.out.println(Arrays.toString(datos(vector)));

//        OPCION 3
//        for (double reca : vector_nuevo){
//            System.out.println(reca + " ");
//        }

        System.out.println(diaNumero(vector_nuevo));
        double media = media(vector_nuevo);
        System.out.println(media);
        double domingo = domingo(vector_nuevo);
        System.out.println(domingo);

        if (domingo > media){
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }

    }

    public static double[] datos(double[] vector){

//      double vector [] = new int[6]; TAMBIEN PUEDO DEFENIRLO AQUI

        for (int i = 0; i < vector.length; i++) {

            vector[i] = teclado.nextDouble();

        }

        return vector;
    }

    public static String diaNumero(double vector_nuevo[]){

        double maximo = vector_nuevo[0];
        int dia = 0;

        for (int i = 0; i < vector_nuevo.length; i++) {

            if (vector_nuevo[i]>maximo){
                maximo = vector_nuevo[i];
                dia = i;
            }
        }

        return diaSemana(dia);
    }

    public static String diaSemana(int dia_numero){

        switch (dia_numero){
            case 0:
                return "MARTES";
            case 1:
                return "MIERCOLES";
            case 2:
                return "JUEVES";
            case 3:
                return "VIENRES";
            case 4:
                return "SABADO";
            case 5:
                return "DOMINGO";
        }

        return "";
    }

    public static double media(double vector_nuevo[]){

        int acumulador = 0;

        for (int i = 0; i < vector_nuevo.length; i++) {

            acumulador += vector_nuevo[i];

        }

        return (acumulador/vector_nuevo.length);
    }

    public static double domingo (double vector_nuevo[]){

        return vector_nuevo[vector_nuevo.length-1];
    }
}


