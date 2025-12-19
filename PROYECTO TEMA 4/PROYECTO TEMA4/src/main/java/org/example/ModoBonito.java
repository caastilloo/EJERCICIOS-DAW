package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Jose
 * @version 1.0
 * Clase principal del programa que permite
 * comprobar si una matriz es triangular superior o inferior
 */
public class ModoBonito {

    static Scanner teclado = new Scanner(System.in);

    /**
     * @author Jose
     * @version 1.0
     * Metodo principal del programa
     * Se encarga de iniciar la ejecución llamando
     * a los metodos de introduccion, ejemploss y ejecucion
     */
    public static void main(String[] args) {

        introduccion();
        ejemplos();
        ejecutar();

    }

    /**
     * @author Jose
     * @version 1.0
     * Metodo que muestra por pantalla la introducción
     * y una breve explicación del programa.
     */
    public static void introduccion(){
        System.out.println("=============================================");
        System.out.println("      PROGRAMA DE MATRICES TRIANGULARES    ");
        System.out.println("=============================================");
        System.out.println();
        System.out.println("Este programa comprueba si una matriz");
        System.out.println("cuadrada es triangular superior o inferior.");
        System.out.println();
    }

    /**
     * @author Jose
     * @version 1.0
     * Metodo que muestra ejemplos de matrices triangulares
     */
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

    /**
     * @author Jose
     * @version 1.0
     * Metodo que muestra el menu del programa
     * con las opciones disponibles
     */
    public static void menu(){
        System.out.println();

        System.out.println("------------------- MENU ---------------------");
        System.out.println("[1] - Comprobar una matriz");
        System.out.println("[2] - Salir");
        System.out.print("-> Elige un opción: ");
    }

    /**
     * @author Jose
     * @version 1.0
     * Metodo principal del programa
     * Muestra el menu, lee la opcion del usuario y ejecuta algo
     * dependiendo de lo que elija el usuario
     */
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

    /**
     * @author Jose
     * @version 1.0
     * Metodo que lee una matriz desde teclado
     *
     * @param numero - para saber el tamaño de la matriz
     * @return devuelve la matriz introducidda por el usuario
     */
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

    /**
     * @author Jose
     * @version 1.0
     * Metodo que hace la lectura de los datos introducidos por el
     * usuario y llama al metodo comprobacion y muestra el resultado
     */
    public static void procesarMatriz(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("----------------------------------------------");

        System.out.println("Introduce el tamaño de la matriz: ");
        int numero = teclado.nextInt();

        int[][] matriz = new int[numero][numero];

        System.out.println("Introduce los valores de la matriz:");
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Tu matriz:");
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }

        boolean resultado = comprobarTriangular(matriz);

        System.out.println();

        if (resultado){
            System.out.println("-> La matriz ES triangular.");
        }else {
            System.out.println("-> La matriz NO es triangular.");
        }
        System.out.println("----------------------------------------------");
    }

    /**
     * @author Jose
     * @version 1.0
     * Metodo que comprueba si una matriz es triangular superior
     * o triangular inferior
     *
     * @param matriz - matriz a comprobar
     * @return devuelve true si es triangular y falso si no lo es
     */
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
