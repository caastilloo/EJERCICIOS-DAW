package Colecciones.Practica;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Pedido {

    private HashMap<Producto, Integer> pedido;
    private double importe_total;

    public Pedido(double importe_total) {
        pedido = new HashMap<>();
        this.importe_total = importe_total;
    }

    public void actualizarImporteTotal(double importe){
        this.importe_total += importe;
    }

    public void aplicarPromo3x2(){
        for (Map.Entry<Producto, Integer> mapita : pedido.entrySet()){
            if (mapita.getValue() % 3 == 0){
                int unidadesGratis = mapita.getValue() / 3;
                this.importe_total -= (unidadesGratis * mapita.getKey().getPrecio());
            }
        }
    }

    public void aplicarPromo10(){
        this.importe_total = importe_total * 0.9;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido1 = (Pedido) o;
        return Double.compare(importe_total, pedido1.importe_total) == 0 && Objects.equals(pedido, pedido1.pedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pedido, importe_total);
    }
}
