package Colecciones.Practica;

import java.util.HashMap;

public class Pedido {

    private HashMap<Producto, Integer> pedido;
    private double importe_total;

    public Pedido(HashMap<Producto, Integer> pedido, double importe_total) {
        this.pedido = pedido;
        this.importe_total = importe_total;
    }

    public HashMap<Producto, Integer> getPedido() {
        return pedido;
    }

    public void setPedido(HashMap<Producto, Integer> pedido) {
        this.pedido = pedido;
    }

    public double getImporte_total() {
        return importe_total;
    }

    public void setImporte_total(double importe_total) {
        this.importe_total = importe_total;
    }

    public void aplicarPromo3x2(){

    }

    public void aplicarPromo10(){

    }
}
