package org.example;

import java.util.Scanner;

public class NUMERODELASUERTE {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario su fecha de nacimiento con unos caracteres especificos
        System.out.println("Introduce tu fecha de naciemiento (dd/mm/aaaa)");
        String fecha = teclado.nextLine();


        int tamnyo_fecha = fecha.length();
        if (tamnyo_fecha > 10){
            System.out.println("No introduzca negativos, ni mas caractéres de los pedidos (dd/mm/aaaa)");
            return;
        }

        try {
            // Sacamos el numero del dia
            String num1 = fecha.substring(0,2);
            int num1_int = Integer.parseInt(num1);


            // Sacamos numero del mes
            String num2 = fecha.substring(3,5);
            int num2_int = Integer.parseInt(num2);

            // Sacamos numero del mes
            String num3 = fecha.substring(6,10);
            int num3_int = Integer.parseInt(num3);

            // Sumamos el dia mas el mes mas el año
            int suma = num1_int + num2_int + num3_int;

            if (num1_int == 0 || num2_int == 0 || num3_int == 0) {
                System.out.println("No introduzcas 0, introduce un formato correcto ...");
                return;
            }else{
                // Imprimimos los 3 numeros y el resultado
                System.out.println(num1 + "+" + num2 + "+" + num3 + " = " + suma);
            }

            String suma_string = Integer.toString(suma);

            // Sacamos el primer numero del resultado de la suma1
            String num1_string = suma_string.substring(0,1);
            int num1_suma = Integer.parseInt(num1_string);

            // Sacamos el segundo numero del resultado de la suma1
            String num2_string = suma_string.substring(1,2);
            int num2_suma = Integer.parseInt(num2_string);

            // Sacamos el tercero numero del resultado de la suma1
            String num3_string = suma_string.substring(2,3);
            int num3_suma = Integer.parseInt(num3_string);

            // Sacamos el cuarto numero del resultado de la suma1
            String num4_string = suma_string.substring(3,4);
            int num4_suma = Integer.parseInt(num4_string);

            // Hacemos la suma2 con los resultados de la primera suma
            int suma2 = num1_suma + num2_suma + num3_suma + num4_suma;

            // Imprimimos los 4 numeros y el resultado
            System.out.println(num1_string + "+" + num2_string + "+" + num3_string + "+" + num4_string + " = " + suma2);

            // Imprimos cual es el numero de la suerte del usuario
            System.out.println("Tu número de la suerte es " + suma2);

        // Controlamos si introducen numeros negativos o ceros
        }catch (Exception err){
            System.out.println("ERROR. Introduce un formato valido");
        }








    }
}
