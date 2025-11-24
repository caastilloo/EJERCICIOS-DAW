package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class REPASO2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int matriz [][] = new int[2][3];

//        for (int n[] : matriz){
//            System.out.println(Arrays.toString(n));
//        }

//        int numero = 0;
//        for (int i = 1; i > matriz.length; i--) {
//            for (int j = 0; j < matriz[i].length; j++) {
//
//                matriz[i][j] = numero++;
//
//            }
//        }
//
//        for (int fila[] : matriz){
//            System.out.println(Arrays.toString(fila));
//        }

//        int fila = aleatorio.nextInt(matriz.length);
//        int columna = aleatorio.nextInt(matriz[0].length);

        int relleno = 0;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = relleno++;

            }
        }

        for (int mat[] : matriz){
            System.out.println(Arrays.toString(mat));
        }

        int posicion_profesor = matriz[aleatorio.nextInt(2)][aleatorio.nextInt(3)];
        System.out.println("Posicion profesor: " + posicion_profesor);

        int posicion_carta = matriz[aleatorio.nextInt(2)][aleatorio.nextInt(3)];
        System.out.println("Posicion notita: " + posicion_carta);

        int fila = 1;
        int columna = 0;
        int posicion_alumno = matriz[fila][columna];
        System.out.println("Posicion alumno " + posicion_alumno);

        System.out.println();

        boolean pillado = false;

        do {

            System.out.println("Escoge una dirección (N: Norte, E: Este, S: Sur, O: Oeste.)");
            char dirección = Character.toUpperCase(teclado.nextLine().charAt(0));

            System.out.println("Has escogido la direccion: " + dirección + ".");


            switch (dirección){
                case 'E':
                    columna++;
                    posicion_alumno = matriz[fila][columna];
                    break;
//                        System.out.print("A donde quieres ir? [E-O] > ");
//                        dirección = Character.toUpperCase(teclado.nextLine().charAt(0));


                case 'O':
                    columna--;
                    posicion_alumno = matriz[fila][columna];
                    break;
//                        do {
//                            System.out.print("A donde quieres ir? [N-E] > ");
//                            dirección = Character.toUpperCase(teclado.nextLine().charAt(0));
//                        }while (dirección== 'O' || dirección == 'S');
//                        System.out.println("Has escogido la dirección " + dirección);
//                        System.out.println("Te mueves a la habitación: " + );

                case 'S':
                    fila++;
                    posicion_alumno = matriz[fila][columna];
                    break;

                case 'N':
                    fila--;
                    posicion_alumno = matriz[fila][columna];
                    break;

                default:
                    System.out.println("ERROR");
                    break;

            }

            System.out.println("Y te mueves a la habitación: " + posicion_alumno);

//            for (int i = 1; i < matriz.length; i++) {
//
//                for (int j = 0; j < matriz[i].length; j++) {
//
//                    matriz[i][j] = matriz[fila][columna];
//
//                }
//            }

            if (posicion_alumno==posicion_carta){
                System.out.println("Has encontrado la notita!");
                pillado = false;
            }

            if (posicion_alumno==posicion_profesor){
                System.out.println("El profesor te ha pillado");
                pillado = false;
            }

            teclado.next();

        }while(pillado=true);



        posicion_alumno = matriz[fila][columna];
        System.out.println(posicion_alumno);

//        System.out.println();
//
//        System.out.println("Estas en la habitación ");
//        System.out.println("A donde quieres ir? ");
    }
}
