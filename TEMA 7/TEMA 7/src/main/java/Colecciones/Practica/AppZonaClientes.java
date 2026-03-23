package Colecciones.Practica;

import java.util.*;

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
                System.out.println("\nBIENVENID@ " + cliente.getUsuario() + "!");
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
        cliente.crearPedido();
    }

    public static void imprimirProductos(){
        System.out.println("Añade productos a tu lista de la compra ...");

        for (Producto producto : Producto.values()){
            System.out.println(producto + ": " + producto.getPrecio() + "€");
        }

        try{

            System.out.println("\n=================================================================================");

            System.out.print("\nElige un producto: ");
            Producto producto = Producto.valueOf(teclado.next().toUpperCase());
            cliente.insertarProducto(producto);
            cliente.getPedido().actualizarImporteTotal(producto.getPrecio());

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

        }catch (IllegalArgumentException er){
            System.out.println("Producto no reconocido. Elige otro ...");
            imprimirProductos();
        }





    }

    public static void imprimirResumen(){

        double importeTotal = 0;

        System.out.println(" === RESUMEN DE TU CARRITO DE LA COMPRA === ");
        System.out.println("Productos:");

        for (Map.Entry<Producto, Integer> mapita : cliente.getPedido().getPedido().entrySet()){
            System.out.println(mapita.getValue() + " | " + mapita.getKey() + mapita.getKey().getPrecio());
            importeTotal+=mapita.getKey().getPrecio();
        }

        System.out.println("IMPORTE TOTAL: " + importeTotal);

        mostrarOpciones();

    }

    public static void imprimirDespedida(){
        System.out.println(" === GRACIAS POR SU PEDIDO ===");
        System.out.println("Lo recibirá en unos días en la dirección " + cliente.getDireccion());
    }

    public static void mostrarOpciones(){
        System.out.println("\n================================");
        System.out.println("¿Qué desea hacer?");
        System.out.println("[1]. Aplicar promos.");
        System.out.println("[2]. Mostrar resumen ordenador por uds.");
        System.out.println("[3]. Terminar pedidos.");

        System.out.print("\n-> ");
        int opcion = teclado.nextInt();

        switch (opcion){

            case 1:
                if (cliente.isPromociones() == false){

                }else {
                    System.out.println("Las promociones ya han sido aplicadas.");
                }
            case 2:

            case 3:
                imprimirDespedida();
                break;
            default:
                System.out.println("ERROR. Opción no válida.");
                break;
        }

    }
}
