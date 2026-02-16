package SistemaPagoEcommerce;

import java.util.Random;
import java.util.Scanner;

public class Bizum extends MetodoPago{

    static Scanner teclado = new Scanner(System.in);

    private String telefono;
    private int pin;

    public Bizum(String telefono){
        this.telefono = telefono;
        generarPin();
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con Bizum" );
        System.out.println("Pago aceptado. Muchas gracias.");
    }

    // AÑADIR CONTROL PIN
    public boolean validarBizum(int pin){
        System.out.println("Validando Bizum ...");

        if (telefono.length()!=9){
            System.out.println("Los datos de tu Bizum no son correctos.");
            return false;
        }

        if (this.pin != pin){
            System.out.println("El PIN no es el correcto.");
            return false;
        }

        return true;

//        else {
//            System.out.println("Introduce el importe a pagar:");
//            int importe = teclado.nextInt();
//            procesarPago(importe);
//        }
    }

    private void generarPin(){
        Random aleatorio = new Random();

        pin = aleatorio.nextInt(900000) + 100000;
        System.out.println("[PIN GENERADO]: " + pin);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
