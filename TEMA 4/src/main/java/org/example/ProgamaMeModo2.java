package org.example;

import java.util.Scanner;

public class ProgamaMeModo2 {

    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {

        int x = teclado.nextInt();
        int y = teclado.nextInt();
        teclado.nextLine();

        if (x<0 || y<0){
            return false;
        } else {
            int perimetro = (x+y)*2;
            System.out.println(perimetro);
            return true;
        }
    }

}
