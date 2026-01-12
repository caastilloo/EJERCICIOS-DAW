package org.example;

public class RecursividadMain {

    static int limite = 10000;

    static void main() {

        System.gc(); //Limpia lo que pueda antes de medir

        long inicioEjecucion = System.nanoTime();
        long memoriaAntes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        // PROGRAMA A REALIZAR
        imprimir(1);

        long finEjecucion = System.nanoTime();
        long memoriaDespues = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println("Tiempo recursivo: " + (finEjecucion - inicioEjecucion) + " ns");
        System.out.println("Memoria consumida recursivo: " + (memoriaDespues - memoriaAntes) + " bytes");

//        System.out.println(suma(10));

        inicioEjecucion = System.nanoTime();
        memoriaAntes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        // PROGRAMA A REALIZAR
        imprimir_bucle();

        finEjecucion = System.nanoTime();
        memoriaDespues = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println("Tiempo: " + (finEjecucion - inicioEjecucion) + " ns");
        System.out.println("Memoria consumida: " + (memoriaDespues - memoriaAntes) + " bytes");

    }

    public static void imprimir(int num){

        if (num <= limite){
            System.out.println(num);
            imprimir(num+1);
        }
    }

    public static void imprimir_bucle(){

        for (int i = 0; i <= 10000; i++) {

            System.out.println(i);

        }
    }

    public static int suma(int num){

        if (num==0){
            return 0;
        }else {
            return num + suma(num-1);
        }

    }





}
