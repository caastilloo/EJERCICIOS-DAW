package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BAT1EJ4 {

    static void main() {


        double vector [] = new double[6];
        double[] vector_nuevo = datos(vector);

//        OPCION 1
        System.out.println(Arrays.toString(vector_nuevo));

//        OPCION 2
        System.out.println(Arrays.toString(datos(vector)));

//        OPCION 3
        for (double reca : vector_nuevo){

        }


    }

    public static double[] datos(double[] vector){

        Scanner teclado = new Scanner(System.in);

//      double vector [] = new int[6]; TAMBIEN PUEDO DEFENIRLO AQUI

        for (int i = 0; i < vector.length; i++) {

            vector[i] = teclado.nextInt();

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
                break;
            case 1:
                return "MIERCOLES";
                break;
            case 2:
                return "JUEVES";
                break;
            case 3:
                return "VIENRES";
                break;
            case 4:
                return "SABADO";
                break;
            case 5:
                return "DOMINGO";
                break;
        }

        return "";
    }
}
