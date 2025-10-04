package org.example;

import java.util.Scanner;

public class EJERCICIOBASCULA {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        int altura = 0;
        boolean repetir = false;

        System.out.println("BIENVENIDO AL RATÓN JUGUETÓN");

        do {
            try {
                System.out.println("Leyendo la altura (cm) ...:");
                altura= teclado.nextInt();

                if (altura>230 || altura<0){
                    System.out.println("ERROR DE LECTURA, BAJA DE LA BÁSCULA Y VUELVE A SUBIR ...");
                    return;
                }

                if (altura<140) {
                    int resta_altura = 140-altura;
                    System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRRACIÓN. Te faltan " + resta_altura + " cm de altura.");
                    return;
                }

            }catch (Exception er){
                System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR ...");
                teclado.nextLine();
                repetir=true;
            }
        }while(repetir==true);

        double peso = 0;

        double formula_peso = altura * 2 / 8;;

        System.out.println("Leyendo el peso ...");
        peso = teclado.nextDouble();

            if (peso > 120) {
                double resta_peso = peso-120;
                System.out.println("LO SIENTO. Sobrepasas " + resta_peso + " kg el límite de la atracción.");
            } else if (peso < formula_peso) {
                System.out.println("LO SIENTO. No superas el peso mínimo, que son " + formula_peso + " kg, de la atración.");
            }else{
                System.out.println("Pesas " + peso + " kg. Peso mínimo calculado: " + formula_peso + ".");
                System.out.println("¡¡SUBE A LA ATRACCIÓN!!");
            }



    }

}
