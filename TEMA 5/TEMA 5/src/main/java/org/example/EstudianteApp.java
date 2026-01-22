package org.example;

public class EstudianteApp {

    static void main() {

        Estudiante jose = new Estudiante("jose");
        Estudiante pablo = new Estudiante("Pablo", "4ESO", "pablo@gmail.com");

        System.out.println(jose.getNia());
        System.out.println(pablo.getNia());

        System.out.println("Estudiantes creados: " + Estudiante.obtenerTotalEstudiantes());

        System.out.println(Estudiante.validarCorreo("hola@iesmutxamel.com"));
        System.out.println(Estudiante.validarCorreo("hola@alu.edu.gva.es"));
    }
}
