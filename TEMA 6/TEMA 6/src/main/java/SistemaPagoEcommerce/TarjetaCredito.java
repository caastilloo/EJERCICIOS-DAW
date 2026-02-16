package SistemaPagoEcommerce;

import java.util.Scanner;

public class TarjetaCredito extends MetodoPago{

    static Scanner teclado = new Scanner(System.in);

    private String nro_tarjeta;
    private String tipo;

    public TarjetaCredito(String nro_tarjeta, String tipo){
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo.toUpperCase();
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con tarjeta de crédito " + tipo.toUpperCase());
        System.out.println("Pago aceptado. Muchas gracias.");
    }

    // AÑADIR VALIDACION TIPO
    public boolean validarTarjeta(){
        System.out.println("Validando Tarjeta ...");

        if (nro_tarjeta.length()!=16){
            System.out.println("Los datos de tu Tarjeta no son correctos.");
            return false;
        }

        if (!tipo.equals("VISA") && !tipo.equals("MASTERCARD") && !tipo.equals("MAESTRO")){
            return false;
        }

        return true;
    }


    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "nro_tarjeta='" + nro_tarjeta + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
