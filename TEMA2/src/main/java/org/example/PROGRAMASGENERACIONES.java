package org.example;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class PROGRAMASGENERACIONES {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        final int ANYO_MINIMO = 1900;

        System.out.println("Elige un modo...");

        System.out.println("[1] - Año de necimiento");
        System.out.println("[2] - Edad");
        System.out.println("----------------------------");

        int modo = 0;

        LocalDateTime fecha = LocalDateTime.now();
        int anyo_actual = fecha.getYear();

        int anyo_nacimiento_int = 0;

        if (teclado.hasNextInt()){
            modo = teclado.nextInt();
        }else{
            System.out.println("Introduce un valor válido...");
            return;
        }

        switch (modo){
            case 1:
                System.out.println("Introduce tu año de nacimiento...");
                String anyo_nacimiento = teclado.next();


                try {
                    anyo_nacimiento_int = Integer.parseInt(anyo_nacimiento);
                }catch (Exception err){
                    System.out.println("Formato introducido para el año no es correcto");
                    return;
                }
                break;
            case 2:
                int edad = 0;
                System.out.println("Introduce tu edad...");

                if (teclado.hasNextInt()){
                    edad = teclado.nextInt();
                }else {
                    System.out.println("Formato incorrecto. No es numérico...");
                    return;
                }

                if (edad>=0){
                    anyo_nacimiento_int = anyo_actual - edad;
                }
                break;

            default:
                System.out.println("El modo no existe!");
                break;
        }


        if (anyo_nacimiento_int >= ANYO_MINIMO && anyo_nacimiento_int <= anyo_actual){

            if (anyo_nacimiento_int >= 1900 && anyo_nacimiento_int <= 1927){
                System.out.println("Generación no bautizada");
            } else if (anyo_nacimiento_int<= 1928 && anyo_nacimiento_int <= 1944) {
                System.out.println("Generación Silent");
            } else if (anyo_nacimiento_int<= 1945 && anyo_nacimiento_int <= 1964) {
                System.out.println("Baby Boomer");
            } else if (anyo_nacimiento_int<= 1965 && anyo_nacimiento_int <= 1981) {
                System.out.println("Generación X");
            } else if (anyo_nacimiento_int<= 1982 && anyo_nacimiento_int <= 1994) {
                System.out.println("Millenials la mejor");
            }else{
                System.out.println("Generación Z");
            }
        }

    }

}
