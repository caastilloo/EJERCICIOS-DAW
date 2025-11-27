package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class EliminarElementoArray {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int array [] = {1,3,5,7,9};

        System.out.println(Arrays.toString(array));

        System.out.print("Ingresa el índice a eliminar: ");
        int posicion = teclado.nextInt();

        int array_nuevo [] = new int[array.length-1];

        for (int i = 0; i < array_nuevo.length; i++) {

            array_nuevo[i] = array[i];

        }

        System.out.println(Arrays.toString(array_nuevo));






    }
}
