package org.example;

public class BATERIAEJERCICO4 {

    static void main() {

        String texto = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";
        String palabra = "Mundo";

        texto = texto.toUpperCase();
        palabra = palabra.toUpperCase();

        int tam = texto.length();

        texto = texto.replace(palabra,"");
        int tam_texto_nuevo = texto.length();

        int veces = (tam-tam_texto_nuevo)/(palabra.length());
        System.out.println(veces);




    }
}
