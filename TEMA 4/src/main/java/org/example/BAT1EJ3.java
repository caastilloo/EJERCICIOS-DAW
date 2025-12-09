package org.example;

import java.util.Scanner;

/**
 * @author Jose
 * @version 1.0
 */
public class BAT1EJ3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena ...");
        String cadena = teclado.nextLine();

        cadena = mayusculas(cadena);
        System.out.println(cadena);

        System.out.println("Hay " + contarVocales(cadena) + " vocales.");

    }

    /**
     * @author Jose
     * @version 1.0
     * Método para pasar a mayúsculas una cadena
     * @param cadena - de tipo String para convertirla en mayúsculas
     * @return - devuelve la cadena en mayúsculas
     */
    public static String mayusculas (String cadena){

        return cadena.toUpperCase();
    }
    
    public static int contarVocales (String cadena){

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {

            // OPCION 1
            switch (cadena.charAt(i)){

                case 'A':
                    contador++;
                    break;
                case 'E':
                    contador++;
                    break;
                case 'I':
                    contador++;
                    break;
                case 'O':
                    contador++;
                    break;
                case 'U':
                    contador++;
                    break;
            }

            // OPCION 2
//            switch (cadena.charAt(i)){
//
//                case 'A':
//                case 'E':
//                case 'I':
//                case 'O':
//                case 'U':
//                    contador++;
//                    break;
//            }


        }
        return contador;
    }

}
