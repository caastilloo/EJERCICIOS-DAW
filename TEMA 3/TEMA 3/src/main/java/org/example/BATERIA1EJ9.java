package org.example;

import java.lang.classfile.attribute.ModuleAttribute;

public class BATERIA1EJ9 {

    static void main() {

        String vector [] = {"Coche", "Moto", "Cuatriciclo", "Tren", "Ferrocarril"};
        int aux = 0;
        String palabra = "hola";

        for (int i = 0; i < vector.length; i++) {

            if (vector[i].length()>vector[aux++].length()){
                palabra=vector[i];
            }else {
                palabra=vector[aux++];
            }

        }

    }
}
