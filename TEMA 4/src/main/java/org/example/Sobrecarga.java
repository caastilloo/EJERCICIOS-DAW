package org.example;

public class Sobrecarga {

    static void main() {


        coche();

        coche("renault");

    }

    public static void coche(){
        System.out.println("brrr brrr");
    }

//    public static int coche(){
//
//    }

    public static void coche(String marca){
        System.out.println("Hola soy un " + marca);
    }
}
