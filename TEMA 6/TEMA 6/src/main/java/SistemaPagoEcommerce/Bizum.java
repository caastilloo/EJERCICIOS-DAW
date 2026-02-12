package SistemaPagoEcommerce;

public class Bizum extends MetodoPago{

    private String telefono;
    private int pin;

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con Bizum" );
    }

    //validarBizum
}
