package org.example;

import java.util.Scanner;

public class BATERIA2EJERCICIO1 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        String contrasenya = "admin1234";

        do {
            System.out.println("Introduce una contraseña: ");
            String respuesta = teclado.next();

            if (respuesta.equals(contrasenya)){
                System.out.println("Contraseña correcta, bienvenido!");
                break;
            }

            System.out.println("Contraseña Incorrecta");
        }while (true);

        while (true){

            System.out.println("Inserte una palabra (o Salir): ");
            String palabra = teclado.next();

            if (palabra.toLowerCase().equals("salir")){
                System.out.println("Saliendo...");
                break;
            }

            if (palabra.equals("ANULADO")){
                System.out.println("palabra prohibida");
                continue; //Volveria a empezar
            }


            System.out.println(palabra + " GOL");


        }

        for (int i = 0; i <20; i++){

            if (i % 2 == 0){
                continue;
            }

            System.out.println(i);
        }


    }
}
