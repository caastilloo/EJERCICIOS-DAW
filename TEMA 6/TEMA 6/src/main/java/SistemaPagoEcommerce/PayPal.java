package SistemaPagoEcommerce;

public class PayPal extends MetodoPago{

    private String cuenta;
    private double saldo = 23;

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesado pago de " + importe + " con PayPal");
    }

    //validarPayPal
}
