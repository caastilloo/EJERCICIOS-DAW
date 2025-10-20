package org.example;

import java.lang.classfile.attribute.ModuleAttribute;
import java.util.Scanner;

public class PRACTICA2CALCULADORA {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        float operando1 = 0;
        float operando2 = 0;
        float resultado = 0;

        System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA ****");

        System.out.println("> Introduce operando:");
        operando1 = teclado.nextFloat();

        System.out.println("----------------------------");

        System.out.println("[+] -> sumar");
        System.out.println("[-] -> restar");
        System.out.println("[x] -> multiplicar");
        System.out.println("[/] -> dividir");
        System.out.println("[R] -> raíz cuadrada");

        System.out.println("----------------------------");

        System.out.println("> Elige una operación:");
        char operacion = teclado.next().charAt(0);

        switch (operacion){
            case '+':
                float suma = operando1 + operando2;
                resultado = suma;
                break;
            case '-':
                float resta = operando1 - operando2;
                resultado = resta;
                break;
            case 'x':
                float multiplicacion = operando1 * operando2;
                resultado = multiplicacion;
                break;
            case '/':
                float division = operando1 / operando2;
                resultado = division;
                break;
            case 'R':
                break;
            default:
                System.out.println("Introduce una operación válida ...");
                break;
        }


        System.out.println("> Introduce el segundo operando:");
        operando2 = teclado.nextFloat();

        System.out.println("El resultado de " + operando1 + operacion + operando2 + " es " + resultado);

    }

}
