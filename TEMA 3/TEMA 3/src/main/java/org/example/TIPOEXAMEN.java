package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TIPOEXAMEN {

    static void main() {

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** BIENVENIDOS AL BINGO DEL CASINO CANTÁBRICO ***");

        // (max-min+1)+1
        int numero_bolas = aleatorio.nextInt(31)+10;
        int array [] = new int[numero_bolas];

        for (int i = 0; i < array.length; i++) {

            array[i] = aleatorio.nextInt(90)+1;
        }

        bucle1:
        for (int i = 0; i < array.length; i++) {

            array[i] = aleatorio.nextInt(90)+1;

            bucle2:
            for (int j = 0; j < i; j++) {

                if (array[i]==array[j]){
                    i--;
                    break;
                }
            }

        }

        System.out.println();

        System.out.println(numero_bolas + " bolas extraídas hasta ahora: " + Arrays.toString(array));

        System.out.println();

        System.out.println("*** INTRODUCE LOS DATOS DE TU CARTÓN ***");

        int matriz [][] = new int[3][3];


        for (int i = 0; i < 3; i++) {
            System.out.println("Fila " + i+1 + ":");
            String fila= teclado.next();

            boolean valido = fila.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}");

            if (valido){
                String fila_string [] = fila.split("-");

                int fila_int [] = new int[3];

                for (int j = 0; j < 3; j++) {
                    fila_int[j] = Integer.parseInt(fila_string[j]);
                }

                for (int j = 0; j < matriz.length; j++) {

                    matriz[i][j] = fila_int[j];
                }

            }else {
                System.out.println("Cerrando programa... Introduce valores con el formato correcto (N-N-N).");
                return;
            }


        }

        for (int mat[] : matriz){
            System.out.println(Arrays.toString(mat));
        }


        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == array[i]){
                    contador++;
                }

            }
        }

        System.out.println("*** PREMIOS ***");

        boolean haylinea = false;

        if (contador==9){
            System.out.println("HAY BINGO!!!");
        }else {
            System.out.println("NO HAY BINGO");
        }

        int contadorfilas =0;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == array[i]){
                    contadorfilas++;
                }
            }

            if (contadorfilas == 3){
                System.out.println("LINEA " + i+1 + ": CORRECTA");
                haylinea=true;
            }

        }

        if (!haylinea){
            System.out.println("No has conseguido ninguna linea.");
        }


    }
}
