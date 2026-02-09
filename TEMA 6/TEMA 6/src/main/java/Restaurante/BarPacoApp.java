package Restaurante;

public class BarPacoApp {

    static void main() {

        Camarero pepe = new Camarero("Pepe", "78238912L", 1234.89);
        pepe.mostrarInfoPersonas();

        System.out.println();

        Cliente jose = new Cliente("Jose", "45782345K", 3, 2);
        jose.mostrarInfoPersonas();
    }
}
