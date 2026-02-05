package ElFormigueroLaRebelion;

public class AppProgramas {

    static void main() {

        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);

        Programa el_hormiguero = new Programa("El Hormiguero",antena3);
        System.out.println(el_hormiguero);
        System.out.println(antena3);

        Empleado empleado1 = new Empleado("Eduardo", "director");
        Empleado empleado2 = new Empleado("Alberto", "camara");
        System.out.println(empleado1);
        System.out.println(empleado2);
        Empleado empleado3 = new Empleado("Maria", "tecnico");
        System.out.println(empleado3);
        Invitado inv1 = new Invitado("Pablo", "Bombero", 1);
        System.out.println(inv1);

    }
}
