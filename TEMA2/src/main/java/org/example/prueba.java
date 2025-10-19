package org.example;

import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario su fecha de nacimiento
        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa):");
        String fecha = teclado.nextLine();

        try {
            // Extraemos día, mes y año
            int dia = Integer.parseInt(fecha.substring(0, 2));
            int mes = Integer.parseInt(fecha.substring(3, 5));
            int anio = Integer.parseInt(fecha.substring(6, 10));

            // 🔹 Validamos los valores
            if (dia <= 0 || dia > 31) {
                System.out.println("Error: el día debe estar entre 1 y 31.");
                return;
            }
            if (mes <= 0 || mes > 12) {
                System.out.println("Error: el mes debe estar entre 1 y 12.");
                return;
            }
            if (anio <= 0) {
                System.out.println("Error: el año no puede ser cero ni negativo.");
                return;
            }

            // Sumamos día + mes + año
            int suma = dia + mes + anio;
            System.out.println(dia + " + " + mes + " + " + anio + " = " + suma);

            // Convertimos la suma a String
            String sumaStr = Integer.toString(suma);

            // 🔹 Calculamos el número de la suerte sumando los dígitos de la suma
            int suma2 = 0;
            for (int i = 0; i < sumaStr.length(); i++) {
                suma2 += Character.getNumericValue(sumaStr.charAt(i));
            }

            // Mostramos resultado
            System.out.println("Tu número de la suerte es " + suma2);

        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            System.out.println("Error: formato de fecha incorrecto. Usa el formato dd/mm/aaaa.");
        }
    }
}
