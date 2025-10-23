package org.example;

import java.util.Scanner;

public class PRACTICA2CALCULADORA {

    static void main() {

        //Asignamos un nuevo scanner con el nombre teclado
        Scanner teclado = new Scanner(System.in);

        //Zona de declaracion de variables
        double operando1 = 0;
        double operando2 = 0;
        char operacion = 'x';
        double resultado = 0;
        boolean repetir = false;

        //Damos bienvenida al programa
        System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA ****");

        do { //Haremos todo el bloque de codigo que esta dentro del do hasta que el while se cumpla

            repetir=false;

            //Intentaremos hacer lo que esta dentro del try y si salta una excepcion el catch lo capturara y hara las intrucciones dentro de este
            try {
                //Decimos al usuario que introduzca el primer operando y lo guardamos en la variable operando1
                System.out.println("> Introduce operando:");
                operando1 = teclado.nextFloat();

                //Formato de la calculadora
                System.out.println("----------------------------");

                System.out.println("[+] -> sumar");
                System.out.println("[-] -> restar");
                System.out.println("[X] -> multiplicar");
                System.out.println("[/] -> dividir");
                System.out.println("[R] -> raíz cuadrada");

                System.out.println("----------------------------");

                System.out.println("> Elige una operación:");
                operacion = Character.toUpperCase(teclado.next().charAt(0));

                //Si la operacion que elijamos no es R, entonces pediremos el segundo operando guardandolo en la variable operando2
                if (operacion!= 'R'){
                    System.out.println("> Introduce el segundo operando:");
                    operando2 = teclado.nextFloat();
                    repetir=false;
                }

                //Guardamos un booleano para saber si es error o no
                boolean error = false;

                //Leemos operacion y dependiendo del caso hacemos las intrucciones dentro del "case"
                switch (operacion){
                    case '+':
                        resultado = operando1+operando2;
                        break; //Sirve para salir de este caso
                    case '-':
                        resultado = operando1-operando2;
                        break;
                    case 'X':
                        resultado = operando1*operando2;
                        break;
                    case '/':
                        if (operando2==0){
                            System.out.println("ERROR. No se puede dividir entre 0.");
                            error=true; //Aqui indicamos al programa que si que hay un error
                            break;
                        }else{
                            resultado = operando1/operando2;
                        }
                        break;
                    case 'R':
                        if (operando1<0){ //Si cuando elejimos R el operando es menor que 0 imprimiremos un ERROR
                            System.out.println("ERROR. No se puede calcular la raíz cuadrada de un número negativo.");
                            error=true;
                        }else{
                            resultado = Math.sqrt(operando1); //Formula para calcular la raiz cuadrada usando la clase Math
                        }
                        break;
                    default: //Si no se cumple ningún caso entonces imprimiremos que introduzca una operacion válida
                        System.out.println("Introduce una operación válida ...");
                        error=true;
                        break;
                }

                if (error){ //Si es error no mostramos el resultado
                } else if (operacion=='R') { //Mostramos el mensaje de resultado en caso de que la operacion sea R
                    System.out.println("La raíz cuadrada de " + operando1 + " es " + resultado);
                }else { //Mostraremos el mensaje del resultado si la operacion no es R
                    System.out.println("El resultado de " + operando1 + " " + operacion + " " + operando2 + " es " + resultado);
                }

            //Capturamos la excepcion y decimos que ha habido un error porque el formato es incorrecto y lo repetimos
            }catch (Exception err){
                System.out.println("ERROR. Formato incorrecto");
                repetir=true;
                teclado.nextLine(); //Limpiamos el buffer para que no imprima todo el rato el mismo mensaje
            }

        }while (repetir==true); //Se repetira el bucle mientras repetir sea true







    }

}
