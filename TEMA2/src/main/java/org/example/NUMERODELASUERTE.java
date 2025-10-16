package org.example;

import java.util.Scanner;

public class NUMERODELASUERTE {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu fecha de naciemiento (dd/mm/aaaa)");
        String fecha = teclado.nextLine();

        String num1 = fecha.substring(0,2);
        int num1_int = Integer.parseInt(num1);

        String num2 = fecha.substring(3,5);
        int num2_int = Integer.parseInt(num2);

        String num3 = fecha.substring(6,10);
        int num3_int = Integer.parseInt(num3);

        int suma = num1_int + num2_int + num3_int;

        System.out.println(num1 + "+" + num2 + "+" + num3 + " = " + suma);

        String suma_string = Integer.toString(suma);

        String num1_string = suma_string.substring(0,1);
        int num1_suma = Integer.parseInt(num1_string);

        String num2_string = suma_string.substring(1,2);
        int num2_suma = Integer.parseInt(num2_string);

        String num3_string = suma_string.substring(2,3);
        int num3_suma = Integer.parseInt(num3_string);

        String num4_string = suma_string.substring(3,4);
        int num4_suma = Integer.parseInt(num3_string);

        int suma2 = num1_suma + num2_suma + num3_suma + num4_suma;

        System.out.println(num1_string + "+" + num2_string + "+" + num3_string + "+" + num4_string + " = " + suma2);

        System.out.println("Tu número de la suerte es " + suma2);







    }
}
