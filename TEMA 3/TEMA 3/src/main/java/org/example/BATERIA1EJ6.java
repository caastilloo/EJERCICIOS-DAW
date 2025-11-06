package org.example;

public class BATERIA1EJ6 {

    static void main() {

        int vector [] = {1,2,3,2,1};
        boolean es_o_no = true;

        for (int i = 0; i < vector.length; i++) {

            //vector.length-1 = ultima posicion
            if (vector[i]!=vector[vector.length-1-i]){
                System.out.println("No es");
                es_o_no=false;
                break;
            }
        }

        if (es_o_no){
            System.out.println("Es palindromo");
        }


    }
}
