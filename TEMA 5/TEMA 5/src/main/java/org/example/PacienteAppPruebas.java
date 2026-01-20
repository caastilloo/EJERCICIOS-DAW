package org.example;

public class PacienteAppPruebas {

    static void main() {

        Paciente jose = new Paciente();
        Paciente pablo = new Paciente("pablo", 18, 'H', 10, 170);

        System.out.println(jose.getDni());

        System.out.println(pablo.calcularIMC());
        System.out.println(jose.calcularIMC());

        System.out.println(jose.esMayorDeEdad());
        System.out.println(pablo.esMayorDeEdad());

        System.out.println(pablo.getSexo());

        System.out.println();

        pablo.mostarInfoPaciente();


//        System.out.println(pablo.getNombre());
//        System.out.println(jose.getSexo());
//        System.out.println(pablo.getSexo());

    }
}
