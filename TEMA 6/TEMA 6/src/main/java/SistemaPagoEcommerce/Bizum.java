package SistemaPagoEcommerce;

import java.util.Random;
import java.util.Scanner;

public class Bizum extends MetodoPago{

    static Random aleatorio = new Random();
    static Scanner teclado = new Scanner(System.in);

    private String telefono;
    private int pin;

    public Bizum(String telefono, int pin){
        this.telefono = telefono;
        this.pin = pin;
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con Bizum" );
        System.out.println("Pago aceptado. Muchas gracias.");
    }

    // AÑADIR CONTROL PIN
    public void validarBizum(){
        System.out.println("Validando Bizum ...");
        if (telefono.length()!=9){
            System.out.println("Los datos de tu Bizum no son correctos.");
        }else {
            System.out.println("Introduce el importe a pagar:");
            int importe = teclado.nextInt();
            procesarPago(importe);
        }


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
