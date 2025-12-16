package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ModoProgramaME { // cambio de repositorio, importado de repositorio incorrecto

    static Scanner teclado = new Scanner(System.in) ;
    static int numero_matriz;

    public static void main(String[] args) {

        while(casoDePrueba()){

//            for (String filas[] : matriz){
//                System.out.println(Arrays.toString(filas));
//            }

        }
    }

    public static boolean casoDePrueba() {

        int numero_matriz = teclado.nextInt();
        String matriz_original [][] = new String[numero_matriz][numero_matriz];

        if (numero_matriz<0 && numero_matriz>=50){
            return false;
        }else {

            for (int i = 0; i < matriz_original.length; i++) {

                String cadena [] =teclado.nextLine().split(" ");

                for (int j = 0; j < matriz_original[i].length; j++) {

                    matriz_original[i][j] = cadena[i];

                }
            }

            for (String fil[] : matriz_original){
                System.out.println(Arrays.toString(fil));
            }


//            String cadena [] = teclado.nextLine().split(" ");

//            int aux = 0;
//            for (int i = 0; i < matriz.length; i++) {
//                for (int j = 0; j < matriz[i].length; j++) {
//
//                    matriz[i][j] = teclado.nextLine();
//
//                }
//            }

            return true;
        }

//        if (filas<0 && filas<=50)
//        return false;
//    else {
//            // CÓDIGO PRINCIPAL AQUÍ
//            // Procesa un único caso leyendo con
//            // in.next*()
//            return true;
//        }




}
