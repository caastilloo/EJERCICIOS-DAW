package org.example;

public class EJEMPLOMULTI {

    static void main() {

        int num = 433;

        String num_string = Integer.toString(num);
        String num_izq = num_string.substring(0,1);
        int num_izq_int = Integer.parseInt(num_izq);

        System.out.println(num_izq_int*100);

    }
}
