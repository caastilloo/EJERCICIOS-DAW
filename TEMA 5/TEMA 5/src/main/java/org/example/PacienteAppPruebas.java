package org.example;

public class PacienteAppPruebas {

    static void main() {

        Paciente jose = new Paciente();
        Paciente pablo = new Paciente("pablo", 18, 'H', 10, 170);

        // Simempre que imprimas un objeto se lanza el toString (el override hace que no haya que poner el toString)
        System.out.println(jose);
        System.out.println(pablo);

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
