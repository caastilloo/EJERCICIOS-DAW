package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BATERIA1EJ4 {

    static void main() {

        //REVISAR CORRECCION


        Scanner teclado = new Scanner(System.in);

        int array_original [] = {1,3,5,7,9};

        System.out.println("Array original: " + Arrays.toString(array_original));

        System.out.println("Ingrese el índice a eliminar: ");
        int indice = teclado.nextInt();

        int array_nuevo [] = new int [array_original.length-1];


        for (int i = 0; i<array_nuevo.length; i++){
            array_nuevo[i]=array_original[i];

            if (i>=indice){
                array_nuevo[i]=array_original[i+1];
                break;
            }else{
                array_nuevo[i]=array_original[i];
            }
        }

        System.out.println("Array resultante: " + Arrays.toString(array_nuevo));

    }
}
