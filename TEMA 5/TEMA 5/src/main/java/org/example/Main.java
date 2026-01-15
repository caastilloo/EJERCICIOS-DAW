package org.example;

public class Main {

    static void main() {

        Perros perro1 = new Perros("caniche", "permanente", 1, 4, "verde");

        Perros perro2 = new Perros();

        perro1.imprimirFicha();

        System.out.println();

        perro2.setColor("negro");
        perro2.setRaza("pastor alemán");
        System.out.println(perro2.getColor());
        System.out.println(perro2.getRaza());
    }

}
