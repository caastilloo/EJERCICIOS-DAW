package SistemaPagoEcommerce;

import java.util.Random;
import java.util.Scanner;

public class Tienda {

    static Scanner teclado = new Scanner(System.in);
    static Random aleatorio = new Random();

    static void realizarPago(MetodoPago metodo){
        System.out.println("Introduce el importe a pagar:");
        double importe = teclado.nextDouble();
        metodo.procesarPago(importe);
    }

    static void iniciarPago(){
        System.out.println("¿Qué método de pago quieres usar? [Bizum, PayPal, Tarjeta]");
        String metodo_cliente = teclado.next().toLowerCase();
        metodoCliente(metodo_cliente);

    }

    static void metodoCliente(String metodo_cliente){

        switch (metodo_cliente){
            case "tarjeta":
                System.out.println("Introduce los datos de tu tarjeta:");
                String datos_tarj = teclado.next();

                System.out.println("Selecciona el tipo de tarjeta [VISA, MASTERCARD, MAESTRO]:");
                String tipo = teclado.next();

                TarjetaCredito tarjeta = new TarjetaCredito(datos_tarj, tipo);
                if (tarjeta.validarTarjeta()){
                    realizarPago(tarjeta);
                }else {
                    System.out.println("Los datos de tu tarjeta no son correctos.");
                }

                break;

            case "bizum":
                System.out.println("Introduce tu número de telefono vinculado con Bizum:");
                String telefono = teclado.next();

                Bizum bizum = new Bizum(telefono);

                System.out.println("Introduce tu PIN:");
                int pin = teclado.nextInt();

                if (bizum.validarBizum(pin)){
                    realizarPago(bizum);
                }else {
                    System.out.println("Los datos de tu Bizum no son correctos");
                }

                break;

            case "paypal":

                System.out.println("Introduce tu correo electrónico vinculado con PayPal:");
                String correo = teclado.next();

                PayPal payPal = new PayPal(correo);
                System.out.println("Introduce importe:");
                double importe = teclado.nextDouble();

                if (payPal.validarPayPal(importe)){
                    realizarPago(payPal);
                }else {
                    System.out.println("Los datos de tu PayPal no son correctos.");
                }

                break;

            default:
                System.out.println("El método de pago no existe.");
                break;
        }
    }
}
