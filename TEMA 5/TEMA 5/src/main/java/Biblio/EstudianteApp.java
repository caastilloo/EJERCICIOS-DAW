package Biblio;

public class EstudianteApp {

    static void main() {

        Estudiante jose = new Estudiante("jose");
        Estudiante pablo = new Estudiante("Pablo", "4ESO", "pablo@gmail.com");

        Editorial amaya = new Editorial("ANAYA", "España");

        System.out.println(jose.getNia());
        System.out.println(pablo.getNia());

        System.out.println("Estudiantes creados: " + Estudiante.obtenerTotalEstudiantes());

        System.out.println(Estudiante.validarCorreo("hola@iesmutxamel.com"));
        System.out.println(Estudiante.validarCorreo("hola@alu.edu.gva.es"));

        Libro las_48_leyes = new Libro("Las 48 leyes del poder", "Robert Greene", amaya);
        System.out.println(las_48_leyes);
    }
}
