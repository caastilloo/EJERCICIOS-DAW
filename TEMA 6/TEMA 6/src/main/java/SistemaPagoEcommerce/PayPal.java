package SistemaPagoEcommerce;

import java.util.Scanner;

public class PayPal extends MetodoPago{

    static Scanner teclado = new Scanner(System.in);

    private String cuenta;
    private double saldo = 23;

    public PayPal(String cuenta){
        this.cuenta = cuenta;
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesado pago de " + importe + " con PayPal");
        System.out.println("Pago aceptado. Muchas gracias.");
    }

    public void validarPayPal(){
        System.out.println("Validando PayPal ...");
        if (!cuenta.matches("^[A-Za-z0-9+_.-]+@alu.edu.gva.com$")){
            System.out.println("Los datos de tu PayPal no son correctos.");
        }else {
            System.out.println("Intoduce el importe a pagar:");
            int importe = teclado.nextInt();
            if (importe < saldo){
                procesarPago(importe);
            }else {
                System.out.println("No tiene saldo suficiente para pagar.");
            }
        }
    }


    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "PayPal{" +
                "cuenta='" + cuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
