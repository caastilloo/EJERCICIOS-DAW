package org.example;

import java.util.Scanner;

public class PRACTICA2CALCULADORA {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        double operando1 = 0;
        double operando2 = 0;
        char operacion = 'x';
        double resultado = 0;

        System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA ****");

        try {
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
            operacion = teclado.next().charAt(0);


            if (operacion!= 'R'){
                System.out.println("> Introduce el segundo operando:");
                operando2 = teclado.nextFloat();
            }

            switch (operacion){
                case '+':
                    resultado = operando1+operando2;
                    break;
                case '-':
                    resultado = operando1-operando2;
                    break;
                case 'x':
                    resultado = operando1*operando2;
                    break;
                case '/':
                    resultado = operando1/operando2;
                    break;
                case 'R':
                    resultado = Math.sqrt(operando1);
                    break;
                default:
                    System.out.println("Introduce una operación válida ...");
                    return;
            }

            if (operacion=='/' && operando2==0){
                System.out.println("No se puede dividir entre 0");
            }else{
                System.out.println("El resultado de " + operando1 + " " + operacion + " " + operando2 + " es " + resultado);
            }

        }catch (Exception err){
            System.out.println("ERROR. Formato incorrecto");
        }






    }

}
