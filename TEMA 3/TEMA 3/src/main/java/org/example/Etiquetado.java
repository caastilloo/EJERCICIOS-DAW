package org.example;

public class Etiquetado {

    static void main() {

        bucle_fuera:
        for (int i = 0; i <= 10; i++) {
            System.out.println("Bucle fuera " + i);

            bucle_detro:
            for (int j = 0; j <= 5; j++) {
                System.out.println("Bucle dentro " + j);

                if (j==4){
                    continue bucle_fuera;
                }

            }

        }






    }
}
