package Colecciones.Practica;

import java.util.Objects;

public class Cliente {

    private String usuario;
    private String contrasenya;
    private String direccion = "Calle falsa, 123";
    private Pedido pedido = null;
    private boolean promociones = false; // REVISAR

    public Cliente(String usuario, String contrasenya) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        direccion = "Calle falsa, 123";
        pedido = null;
        promociones = false;
    }

    public void crearPedido(){
        System.out.println("\nCreando nuevo pedido ...\n");
        this.pedido = new Pedido(0);
    }

    public void insertarProducto(Producto producto){

        if (pedido.getPedido().containsKey(producto)){
            int cantidad = pedido.getPedido().get(producto);
            pedido.getPedido().put(producto, cantidad + 1);
        }else {
            pedido.getPedido().put(producto, 1);
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contraseña) {
        this.contrasenya = contrasenya;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public boolean isPromociones() {
        return promociones;
    }

    public void setPromociones(boolean promociones) {
        this.promociones = promociones;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(usuario, cliente.usuario) && Objects.equals(contrasenya, cliente.contrasenya);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, contrasenya);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "usuario='" + usuario + '\'' +
                ", contrasenya='" + contrasenya + '\'' +
                ", direccion='" + direccion + '\'' +
                ", pedido=" + pedido +
                ", promociones=" + promociones +
                '}';
    }
}
