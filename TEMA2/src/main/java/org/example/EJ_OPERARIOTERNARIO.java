package org.example;

public class EJ_OPERARIOTERNARIO {

    static void main() {

        int a = 5, b = 1, c = 3;
        int resultado = a++ == 3 && b > c++ ? a -=c :
                a > 0 && a == c ? a += b :
                        a == b ? a++ : a++;

        System.out.println(resultado);


    }

}
