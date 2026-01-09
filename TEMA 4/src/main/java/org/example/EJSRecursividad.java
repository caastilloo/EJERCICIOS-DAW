package org.example;

import java.io.IOException;
import java.util.Scanner;

public class EJSRecursividad {

    static Scanner teclado = new Scanner(System.in);
    static String frase = "Hola soy una frase al reves";
    static char[] frase_char = frase.toCharArray();

    static void main() {

        menu();

    }


    public static void menu(){

        System.out.println("*** Batería de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");

        System.out.println("1- Dígito");
        System.out.println("2- Potencias");
        System.out.println("3- Del Revés");
        System.out.println("4- Binario");
        System.out.println("5- A binario");
        System.out.println("6- Orden alfabético");
        System.out.println("7- Mostrar suma");

        System.out.println();

        opcion();
        menu2();

    }

    public static void opcion(){

        System.out.println();
        System.out.print("-> Introduce una opcion: ");
        int opcion = teclado.nextInt();

        switch (opcion){
            case 1:
                System.out.print("Introduce un numero: ");
                int numero = teclado.nextInt();
                System.out.println(ej1(numero));

            case 2:
                System.out.print("Introduce la base: ");
                int base = teclado.nextInt();
                System.out.print("Introduce la exponente: ");
                int exponente = teclado.nextInt();
                System.out.println(ej2(base, exponente));


            case 3:
                System.out.print("Introduce un numero: ");
                int numero_invertido = teclado.nextInt();
                ej3_numero(numero_invertido);

                System.out.println();

                ej3_cadena(frase_char.length-1);

                System.out.println();

                ej3_cadena_sin_vector(frase_char.length-1);

                System.out.println();

            case 4:

            case 5:

            case 6:

            case 7:

        }

    }

    public static void menu2(){
        System.out.println("Elige una opción:");
        System.out.println("  [M] - Volver al menú principal");
        System.out.println("  [X] - Salir");
    }

    public static void borrar() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

    }

    public static int ej1(int numero){

        if (numero < 10) return 1;
        else return 1+ej1(numero/10);

    }

    public static int ej2(int base, int exponente){

        if (exponente == 0){
            return 1;
        }else { //base * potencia(base, exponente-1)
            return base*ej2(base, exponente-1); //tambien se podria hacer bse, --exponente
        }

    }

    public static void ej3_numero(int numero_invertido){

        if (numero_invertido < 10){
            System.out.print(numero_invertido);
        } else {
            System.out.print(numero_invertido%10);
            ej3_numero(numero_invertido/10); // del_reves(numero/10)
        }

    }

    public static void ej3_cadena(int posicion){

        if (posicion >= 0){
            System.out.print(frase_char[posicion]);
            ej3_cadena(posicion-1);
        }

    }

    // Otra manera de hacerlo sin arrays
    public static void ej3_cadena_sin_vector(int posicion){

        if (posicion >= 0){
            System.out.print(frase.charAt(posicion));
            ej3_cadena_sin_vector(posicion-1);
        }

    }

}
