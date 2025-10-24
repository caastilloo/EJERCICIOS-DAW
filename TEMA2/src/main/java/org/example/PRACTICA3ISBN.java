package org.example;

import java.util.Scanner;

public class PRACTICA3ISBN {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        char opcion = 'x';

        System.out.println("*** VALIDAR ISBN ***");

        System.out.println("[1] | Validar ISBN");
        System.out.println("[2] | Reparar ISBN");
        System.out.println("[X] | Salir");

        System.out.println("Seleccione una opción:");
        opcion = Character.toLowerCase(teclado.next().charAt(0));

        System.out.println("Introduzca ISBN");
        String isbn = teclado.nextLine();

        int tamanyo = isbn.length();

        if (tamanyo>10){
            System.out.println("El ISBN tiene 10 dígitos, revise su ISBN");
        }else {

            int x = 10;



            switch (opcion){
//INTENTAR HACERLO CON CHARAT!!!
                case '1':
                    System.out.println("Introduzca ISBN para VALIDAR:");
                    String isbn_validar = teclado.nextLine();

                    String digito1 = isbn_validar.substring(0,1);
                    int digito1_num = Integer.parseInt(digito1);
                    int num1 = digito1_num*10;

                    String digito2 = isbn_validar.substring(1,2);
                    int digito2_num = Integer.parseInt(digito1);
                    int num2 = digito1_num*9;

                    String digito3 = isbn_validar.substring(2,3);
                    int digito3_num = Integer.parseInt(digito1);
                    int num3 = digito1_num*8;

                    String digito4 = isbn_validar.substring(3,4);
                    int digito4_num = Integer.parseInt(digito1);
                    int num4 = digito1_num*7;

                    String digito5 = isbn_validar.substring(4,5);
                    int digito5_num = Integer.parseInt(digito1);
                    int num5 = digito1_num*6;

                    String digito6 = isbn_validar.substring(5,6);
                    int digito6_num = Integer.parseInt(digito1);
                    int num6 = digito1_num*5;

                    String digito7 = isbn_validar.substring(6,7);
                    int digito7_num = Integer.parseInt(digito1);
                    int num7 = digito1_num*10;

                    String digito8 = isbn_validar.substring(7,8);
                    int digito8_num = Integer.parseInt(digito1);
                    int num8 = digito1_num*10;

                    String digito9 = isbn_validar.substring(8,9);
                    int digito9_num = Integer.parseInt(digito1);
                    int num9 = digito1_num*10;

                    String digito10 = isbn_validar.substring(9,10);
                    int digito10_num = Integer.parseInt(digito1);
                    int num10 = digito1_num*10;

                    int isbn_validado = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;

                    System.out.println(isbn_validado);
                    break;
                case '2':
                    System.out.println("Introduzca ISBN a REPARAR");
                    String isbn_reparar = teclado.next();
                    break;
                case 'x':
                    System.out.println("Saliendo ...");
                    break;
                default:
                    System.out.println("ERROR. Introduce una opción valida");
                    break;
            }
        }

    }
}