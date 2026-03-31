package Colecciones.MercaDaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MercadawTest {

    Cliente cliente;
    Pedido pedido;

    @BeforeEach
    void setUp() {
        cliente = new Cliente("user", "1234");
        cliente.crearPedido();
        pedido = cliente.getPedido();
    }

    // TEST INSERCIÓN DE PRODUCTOS
    @Test
    void testInsertarProducto() {
        cliente.insertarProducto(Producto.PAN);

        assertTrue(pedido.getPedido().containsKey(Producto.PAN));
        assertEquals(1, pedido.getPedido().get(Producto.PAN));
    }

    // TEST PRODUCTO INEXISTENTE
    @Test
    void testProductoInexistente() {
        assertThrows(IllegalArgumentException.class, () -> {
            Producto.valueOf("NO_EXISTE");
        });
    }

    // TEST CÁLCULO DE IMPORTE
    @Test
    void testCalculoImporte() {
        cliente.insertarProducto(Producto.PAN);   // 1.00
        cliente.insertarProducto(Producto.LECHE); // 1.30

        double esperado = Producto.PAN.getPrecio() + Producto.LECHE.getPrecio();

        assertEquals(esperado, pedido.getImporte_total());
    }

    // TEST PROMO 3x2
    @Test
    void testPromo3x2() {
        cliente.insertarProducto(Producto.PAN);
        cliente.insertarProducto(Producto.PAN);
        cliente.insertarProducto(Producto.PAN);

        pedido.aplicarPromo3x2();

        // Esperado: paga 2 productos (3x2)
        double esperado = 2 * Producto.PAN.getPrecio();

        assertEquals(esperado, pedido.getImporte_total());
    }

    // TEST DESCUENTO 10%
    @Test
    void testPromo10() {
        cliente.insertarProducto(Producto.PAN); // 1.00

        pedido.aplicarPromo10();

        double esperado = Producto.PAN.getPrecio() * 0.9;

        assertEquals(esperado, pedido.getImporte_total());
    }

    // TEST PROMOCIONES COMBINADAS
    @Test
    void testPromosCombinadas() {
        cliente.insertarProducto(Producto.PAN);
        cliente.insertarProducto(Producto.PAN);
        cliente.insertarProducto(Producto.PAN);

        pedido.aplicarPromo3x2();
        pedido.aplicarPromo10();

        double esperado = (2 * Producto.PAN.getPrecio()) * 0.9;

        assertEquals(esperado, pedido.getImporte_total());
    }

    // TEST AUTENTICACIÓN
    @Test
    void testAutenticacion() {
        Set<Cliente> clientes = new HashSet<>();

        Cliente c1 = new Cliente("user", "1234");
        clientes.add(c1);

        Cliente intento = new Cliente("user", "1234");

        assertTrue(clientes.contains(intento));
    }

    // TEST CLIENTES GENERADOS
    @Test
    void testGenerarClientes() {
        Mercadaw mercadaw = new Mercadaw();
        mercadaw.generarClientes();

        assertNotNull(mercadaw.getClientes());
    }

}