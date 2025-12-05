package org.example;

import java.util.Scanner;

public class ProgramaMeModo3 {

    static Scanner teclado;

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {

        if (!teclado.hasNext())
            return false;
        else {

            int toros = teclado.nextInt();
            int velocidad_corredor = 0;

            for (int i = 0; i < toros; i++) {

                int velocidad_toro = teclado.nextInt();

                if (velocidad_toro>velocidad_corredor){
                    velocidad_corredor=velocidad_toro;
                }

            }
            System.out.println(velocidad_corredor);
            teclado.nextLine();
            return true;
        }
    }
}
