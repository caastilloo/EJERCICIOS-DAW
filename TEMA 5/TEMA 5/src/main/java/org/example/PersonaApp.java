package org.example;

public class PersonaApp {

    static void main() {

        Persona profe = new Persona("Patricia", "9304032K", 50);
        System.out.println(profe.getEdad());

        Persona alum = new Persona();
        System.out.println(alum.getDni());
        alum.setDni("943852K");
        System.out.println(alum.getDni());


    }




}
