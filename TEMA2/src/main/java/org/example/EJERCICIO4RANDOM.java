package org.example;

import java.util.Random;

public class EJERCICIO4RANDOM {

    static void main() {

        Random aleatorio = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasenya = "";


        int rango = aleatorio.nextInt(12 - 8 + 1)+8;
        int tamanyo = caracteres.length();

        String minusculas = caracteres.substring(26,52);
        String mayusculas = caracteres.substring(0,26);
        String numeros = caracteres.substring(52,62);


        String minusculas_cont = "";
        String mayusculas_cont = "";
        String numeros_cont = "";

        minusculas_cont += minusculas.charAt(aleatorio.nextInt(minusculas.length()-1));
        mayusculas_cont += mayusculas.charAt(aleatorio.nextInt(mayusculas.length()-1));
        numeros_cont += numeros.charAt(aleatorio.nextInt(numeros.length()-1));

        int contrasenya_fn = 0;

        for (int i = 0; i<rango; i++){
            contrasenya += minusculas_cont + mayusculas_cont + numeros_cont;
            contrasenya_fn += contrasenya.charAt(aleatorio.nextInt(contrasenya.length()-1));

        }

        System.out.println(contrasenya);


    }

}



//int num = aleatorio.nextInt(12)+1;
//            System.out.println(num);
