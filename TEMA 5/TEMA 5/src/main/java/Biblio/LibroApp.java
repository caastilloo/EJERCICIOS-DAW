package Biblio;

public class LibroApp {

    static void main() {

        Editorial amaya = new Editorial("ANAYA", "España");

        Libro las_48_leyes = new Libro("Las 48 leyes del poder", "Robert Greene", amaya);
        System.out.println(las_48_leyes);

        Libro habitos_atomicos = new Libro("Habitos Atómicos", "James Clear", amaya);
        System.out.println(habitos_atomicos);

        Estudiante pablo = new Estudiante("Pablo", "4ESO", "pablo@gmail.com");

        las_48_leyes.prestar(pablo);
        System.out.println(pablo);
//        System.out.println(las_48_leyes.estaDisponible());
        las_48_leyes.prestar(pablo);
        System.out.println(pablo);
        habitos_atomicos.prestar(pablo);
//        System.out.println(pablo);

//        las_48_leyes.prestar();
//        las_48_leyes.devolver();
//        las_48_leyes.devolver();

//        System.out.println(las_48_leyes.estaDisponible());

    }
}
