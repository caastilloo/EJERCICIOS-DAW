package org.example;

import java.util.Scanner;

public class PRACTICA4 {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        boolean repetir = false;


        do {
            try {
                System.out.println("Intoduce el multiplicando (3 cifras): ");
                int multiplicando = teclado.nextInt();

                System.out.println("Intoduce el multiplicador (3 cifras): ");
                int multiplicador = teclado.nextInt();

                int mult = 0;
                int multr = 0;


                if (multr>=99 && multr<=100 && multr<=-99 && multr>=-100) {
                    String num_string = Integer.toString(multr);
                    String num_derecha = num_string.substring(2, 3);
                    int num_derec_int = Integer.parseInt(num_derecha);
                }

                repetir = false;

            }catch (Exception err){
                repetir = true;
                teclado.nextLine();
            }
        }while (repetir==true);




    }
}
