package org.example;

import java.util.Scanner;

public class PacienteApp {

    static Scanner teclado = new Scanner(System.in);

    static void main() {



        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();

        System.out.println("Introduce tu sexo: ");
        char sexo = teclado.next().charAt(0);

        System.out.println("Introduce tu peso: ");
        double peso = teclado.nextDouble();

        System.out.println("Introduce tu altura: ");
        int altura = teclado.nextInt();

        System.out.println("-----------------------");

        System.out.println("INFO:");
        Paciente objeto1 = new Paciente(nombre, edad, sexo, peso, altura);
        objeto1.mostarInfoPaciente();

        Paciente objeto2 = new Paciente(nombre, edad, sexo);
        objeto2.mostarInfoPaciente();


    }

}
