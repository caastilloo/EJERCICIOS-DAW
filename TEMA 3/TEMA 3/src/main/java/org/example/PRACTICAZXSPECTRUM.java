package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class PRACTICAZXSPECTRUM {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("******* VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM *******");

        // Pedimos ancho y alto
        System.out.println("Introduce la resolución de tu pantalla (ancho x alto) ...");

        System.out.println("Ancho:");
        int ancho = teclado.nextInt();

        System.out.println("Alto:");
        int alto = teclado.nextInt();

        // Creamos la matriz donde guardamos los pixeles (colores)
        String matriz [][] = new String[alto][ancho];

        System.out.println("Introduce (línea a línea) los colores de tu imagen para cada píxel:");

        // Recorrer fila
        for (int i = 0; i < matriz.length; i++) {

            String color[] = teclado.next().split("");

            // Validamos el tamaño de la matriz
            if (color.length==matriz[i].length){

                boolean rellenar = true; // Booleano para saber si rellenar o no

                // Bucle para validar cada letra que este entre a y o
                for (int j = 0; j < matriz[i].length; j++) {

                    if (!color[j].matches("[A-O]")){
                        System.out.println("Has introducido un pixel incorrecto [A-O]");
                        rellenar = false;
                        break;
                    }
                }

                // Si no esta entre la y la o repetimos
                if (!rellenar){
                    i--;
                    continue;
                }

                // Columnas (copiamos cada letra en la matriz)
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = color[j];
                }
            }else { // Si el tamaño es incorrecto lo diremos
                System.out.println("El tamaño es incorrecto...");
                i--; // Retrocedemos para volver a la misma interacion
            }
        }

        // For each para imprimir la matriz
        for (String fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }


//        String validador_bloque1 = "";
//        int contador = 1;
//
//        // FILAS
//        for (int i = 0; i < matriz.length; i++) {
//
//            validador_bloque1 = matriz[0][0];
//            // COLUMNAS
//            for (int j = 0; j < 8; j++) {
//
//                if (matriz[i][j]!=validador_bloque1){
//                    contador++;
//                }
//
//            }
//        }
//
//        int contador2 = 1;
//        String validador_bloque2 = "";
//        for (int i = 0; i < matriz.length; i++) {
//
//            for (int j = 8; j < 16; j++) {
//
//                validador_bloque2 = matriz[0][8];
//                if (matriz[i][j]!=validador_bloque2){
//                    contador2++;
//                }
//            }
//        }

        boolean compatible = true; // Booleano para saber si es o no es compatible, inicialmente es compatible

        // Recorremos la matriz por bloques de 8x8 (FILA)
        for (int i = 0; i < matriz.length; i+=8) {

            // Recorremos la matriz por bloques de 8x8 (COLUMNA)
            for (int j = 0; j < matriz[i].length; j+=8) {

                // Contador para los colores que sean distintos
                int contador_colores = 0;

                // Variable para guardarnos color a color
                String colores = "";

                // Estas variables las usaremos para movernos dentro del bucle
                int fila = i;
                int columna = j;

                // Recorremos los pixeles del bloque 8x8 (8x8 = 64)
                for (int k = 0; k < 64; k++) {

                    // Variable para ver el pixel (color) actual
                    String letra = matriz[fila][columna];

                    // Si esa letra no estaba en colores la añadimos
                    if (!colores.contains(letra)){
                        colores += letra; // Aqui se guarda el color en la variable letra
                        contador_colores++; // Subimos el contador en 1
                    }

                    // Si hay mas de dos colores no sera compatible
                    if (contador_colores > 2){
                        compatible=false;
                    }

                    // Avanzamos una columna
                    columna++;

                    // Si llegamos al final del bloque pasamos a la siguiente fila
                    if (columna==j + 8){
                        columna=j;
                        fila++;
                    }
                }
            }
        }

        // Si es compatible lo mostraremos
        if (compatible){
            System.out.println("Es compatible con ZX Spectrum");
        }else { // Si no lo es lo mostraremos igual
            System.out.println("No es compatible con ZX Spectrum");
        }

    }
}
