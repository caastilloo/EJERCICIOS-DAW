package org.example;

import java.util.Arrays;
import java.util.Random;

public class BATERIA3EJ2 {

    static void main() {

        Random aleatorio = new Random();

        int tamanyo = aleatorio.nextInt(5)+1;
        int matriz [][] = new int[tamanyo][tamanyo];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(25)+1;
            }
        }

        System.out.println("Matriz:");
        for (int fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }

        System.out.println();
        int suma_filas = 0;

        System.out.println("Suma de filas:");
        for (int i = 0; i < matriz.length; i++) {

            suma_filas=0; // Reiniciamos la suma en cada vuela
            for (int j = 0; j < matriz[i].length; j++) {

                suma_filas += matriz[i][j];

            }

            System.out.println("Suma " + i + ": " + suma_filas);

        }

        int suma_columnas = 0;
        System.out.println();

        System.out.println("Suma de columnas:");
        for (int i = 0; i < matriz[0].length; i++) {
            // Se podrian cambiar los nombres de las variables i por j y j por i para no liarnos
            suma_columnas=0;
            for (int j = 0; j < matriz.length; j++) {

                suma_columnas += matriz[j][i]; // Va al reves porq la j ahora es la fila y la i la columna

            }

            System.out.println("Suma " + i + ": " + suma_columnas);

        }

        System.out.println();
        int suma_columna_solo = 0;

        System.out.println("Suma de SOLO una columna:");
        for (int i = 0; i < matriz[0].length; i++) {

            suma_columna_solo=0;
            for (int j = 0; j < matriz.length; j++) {

                suma_columna_solo += matriz[0][i];

            }

            System.out.println("Suma " + i + ": " + suma_columna_solo);

        }

    }
}
