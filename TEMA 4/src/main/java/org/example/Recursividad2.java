package org.example;

public class Recursividad2 {

    static void main() {

        int num = 1;
        System.out.println(suma(10));

    }

    public static int suma(int num){

        if (num==0){
            return 0;
        }else {
            return num + suma(num-1);
        }

    }
}
