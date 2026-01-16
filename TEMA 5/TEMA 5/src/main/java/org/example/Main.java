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

        System.out.println();

        Persona persona1 = new Persona("jose", "19384k", 19);

        persona1.mostrarInfo();

        System.out.println();

        System.out.println(persona1.getDni());


    }

}
