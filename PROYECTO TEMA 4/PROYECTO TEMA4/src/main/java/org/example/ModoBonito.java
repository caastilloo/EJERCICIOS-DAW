package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ModoBonito {

    static Scanner teclado = new Scanner(System.in);

    static void main() {

        introduccion();
        ejemplos();
        ejecutar();

    }

    public static void introduccion(){
        System.out.println("=============================================");
        System.out.println("      PROGRAMA DE MATRICES TRIANGULARES    ");
        System.out.println("=============================================");
        System.out.println();
        System.out.println("Este programa comprueba si una matriz");
        System.out.println("cuadrada es triangular superior o inferior.");
        System.out.println();
    }

    public static void ejemplos(){
        System.out.println("----------------- EJEMPLOS -------------------");

        System.out.println("Ejemplo de matriz triangular SUPERIOR:");
        int superior [][] = {
                {1, 0, 0},
                {4, 5, 0},
                {7, 8, 9}
        };

        for (int sup[] : superior){
            System.out.println(Arrays.toString(sup));
        }

        System.out.println("Ejemplo de matriz triangular INFERIOR:");
        int inferior [][] = {
                {1, 2, 3},
                {0, 5, 6},
                {0, 0, 9}
        };

        for (int inf[] : inferior){
            System.out.println(Arrays.toString(inf));
        }

        System.out.println("----------------------------------------------");
    }

    public static void menu(){
        System.out.println();

        System.out.println("------------------- MENU ---------------------");
        System.out.println("[1] - Comprobar una matriz");
        System.out.println("[2] - Salir");
        System.out.print("-> Elige un opción: ");
    }

    public static void ejecutar(){

        boolean salir = false;

        while (!salir){

            menu();
            char opcion = teclado.next().toUpperCase().charAt(0);

            switch (opcion){
                case '1':
                    procesarMatriz();
                    break;
                case '2':
                    System.out.println("Saliendo del programa ...");
                    salir = true;
                    break;
                default:
                    System.out.println("ERROR. Introduce una opción válida.");
            }
        }

    }

    public static int[][] leerMatriz (int numero){

        int matriz [][] = new int[numero][numero];

        System.out.println("Introduce los valores de la matriz:");
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("----------------------------------------------");
        System.out.println("Tu matriz:");
        for (int matr[] : matriz){
            System.out.println(Arrays.toString(matr));
        }

        return matriz;
    }

    public static void procesarMatriz(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("----------------------------------------------");

        System.out.println("Introduce el tamaño de la matriz: ");
        int numero = teclado.nextInt();

        int matriz [][] = leerMatriz(numero);

        boolean resultado = comprobarTriangular(matriz);

        System.out.println();

        if (resultado){
            System.out.println("-> La matriz ES triangular.");
        }else {
            System.out.println("-> La matriz NO es triangular.");
        }
        System.out.println("----------------------------------------------");
    }

    public static boolean comprobarTriangular (int [][] matriz){

        boolean superior = true;
        boolean inferior = true;
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i > j && matriz[i][j] != 0) {
                    superior = false;
                }

                if (i < j && matriz[i][j] != 0){
                    inferior = false;
                }
            }

        }

        return superior || inferior;
    }
}
