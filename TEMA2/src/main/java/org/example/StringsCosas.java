package org.example;

public class StringsCosas {

    static void main() {


        String frase = "Netanyahu oro le regala una paloma de oro a Trump";

        int tamanyo = frase.length();
        System.out.println(tamanyo);

        System.out.println(frase.charAt(31));
        String trozo = frase.substring(38,45);
        System.out.println(trozo);

        String trozo2 = frase.substring(38);
        System.out.println(trozo2);

        int posicion_oro = frase.indexOf("oro");
        System.out.println(posicion_oro);
        int posicion_oro2 = frase.indexOf("oro", 13);
        System.out.println(posicion_oro2);

        int posicion_oro_ultima = frase.lastIndexOf("oro");
        System.out.println(posicion_oro_ultima);


        String frase_mayusculas = frase.toUpperCase();
        System.out.println(frase_mayusculas);
        String frase_minisculas = frase.toLowerCase();
        System.out.println(frase_minisculas);

        String nombre = "Patri                             ";
        System.out.println(nombre.trim() + " - " + nombre + "#");
        boolean iguales = nombre.trim().equals("Patri");
        System.out.println(iguales);

        String nombre1 = "Iván                             ";
        System.out.println(nombre1.trim() + " - " + nombre1 + "#");
        String nombre_mayus = nombre1.toUpperCase();
        boolean iguales1 = nombre_mayus.trim().equals("IVÁN");
        System.out.println(iguales1);

        //No mirar mayusculas ni minusculas
        boolean iguales2 = nombre.trim().equalsIgnoreCase("Iván");
        System.out.println(iguales2);

        String cambiada = frase.replace("paloma", "palOma");
        System.out.println(cambiada);

        String frase_concatenada = frase.concat(" de EEUU");
        System.out.println(frase_concatenada);
        System.out.println(frase + " de EEUU");

    }

}
