package Colecciones.Practica;

import java.util.LinkedHashSet;
import java.util.Scanner;

import static Colecciones.Practica.Cliente.crearPedido;

public class AppZonaClientes {

    static Cliente cliente;
    static Scanner teclado = new Scanner(System.in);

    static void main() {
        Mercadaw mercadaw = new Mercadaw();
        mercadaw.generarClientes();
        autenticacion(mercadaw.getClientes());
        imprimirProductos();
    }

    public static void autenticacion(LinkedHashSet<Cliente> clientes){
        System.out.println("=== COMPRA ONLINE EN MERCADAW ===\n");

        int contador = 3;
        boolean condicion = true;
        while (condicion){
            System.out.println("Usuario: ");
            String usuario = teclado.next();
            System.out.println("Contraseña: ");
            String contrasenya = teclado.next();
            Cliente cliente1 = new Cliente(usuario, contrasenya);

            if (clientes.contains(cliente1)){
                cliente = cliente1;
                System.out.println("\nBIENVENID@, " + usuario);
                iniciarCompra();
                condicion = false;
            }else {
                contador--;
                System.out.println("Credenciales no válidas. Intentos: " + contador);
            }

            if (contador==0){
                System.out.println("\nERROR DE AUTENTICACIÓN.");
                return;
            }
        }
    }

    public static void iniciarCompra(){
        crearPedido();
    }

    public static void imprimirProductos(){
        System.out.println("BIENVENID@ " + cliente.getUsuario() + "!\n");
        System.out.println("Añade productos a tu lista de la compra ...\n");

//        System.out.println("   " + Producto.MANZANAS + ": " + Producto.MANZANAS.getPrecio() + "€");
//        System.out.println("   " + Producto.PAN + ": " + Producto.PAN.getPrecio() + "€");
//        System.out.println("   " + Producto.ARROZ + ": " + Producto.ARROZ.getPrecio() + "€");
//        System.out.println("   " + Producto.POLLO + ": " + Producto.POLLO.getPrecio() + "€");
//        System.out.println("   " + Producto.LECHE + ": " + Producto.LECHE.getPrecio() + "€");
//        System.out.println("   " + Producto.ACEITE + ": " + Producto.ACEITE.getPrecio() + "€");
//        System.out.println("   " + Producto.HUEVOS + ": " + Producto.HUEVOS.getPrecio() + "€");
//        System.out.println("   " + Producto.TOMATES + ": " + Producto.TOMATES.getPrecio() + "€");
//        System.out.println("   " + Producto.PASTA + ": " + Producto.PASTA.getPrecio() + "€");

        for (Producto producto : Producto.values()){
            System.out.println("   " + producto + ": " + producto.getPrecio() + "€");
        }

        try{

            System.out.println("\n=================================================================================");

            System.out.print("\n   Elige un producto: ");
            Producto producto = Producto.valueOf(teclado.next().toUpperCase());
            cliente.insertarProducto(producto);

            System.out.println("Has añadidio " + producto + " con un precio de " + producto.getPrecio() + "€");
            System.out.println("Importe total del pedido: " + cliente.getPedido().getImporte_total() + "€");

            System.out.println("¿Quieres añadir mas productos a la lista (S/N)?");
            char opcion = teclado.next().toUpperCase().charAt(0);

            switch (opcion){
                case 'S':
                  imprimirProductos();
                  break;
                case 'N':
                    imprimirResumen();
                    break;
                default:
                    System.out.println("ERROR. Opcion incorrecta.");
            }

            System.out.println("\n=================================================================================");

        }catch (Exception er){
            System.out.println("Producto no reconocido. Elige otro ...");
            imprimirProductos();
        }





    }

    public static void imprimirResumen(){

    }

    public void imprimirDespedida(){

    }

    public void mostrarOpciones(){

    }
}
