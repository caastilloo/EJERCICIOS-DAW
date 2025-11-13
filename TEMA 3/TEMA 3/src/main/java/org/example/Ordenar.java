package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Ordenar {

    static void main() {

        int vector [] = {7,5,10,2,1};

        int vector_copia [] = vector.clone();

        Arrays.sort(vector_copia);
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vector_copia));

//        Arrays.sort(vector_copia, Collections.reverseOrder()); //Para utilizarlo hace falta pasar a Integer
//        System.out.println(Arrays.toString(vector_copia));

        int posicion = Arrays.binarySearch(vector_copia, 10);
        System.out.println(posicion);

    }

}
