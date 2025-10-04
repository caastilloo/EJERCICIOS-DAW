package org.example;

import java.util.Scanner;

public class EJERCICIOBASCULA {

    static void main() {

        Scanner teclado = new Scanner(System.in); //Asignamos un nombre al scanner para que lea el teclado
        int altura = 0; //Asignamos una variable para la altura
        boolean repetir = false; //Lo asignamos para cuando pongamos repetir=true el programa repita automaticamente

        System.out.println("BIENVENIDO AL RATÓN JUGUETÓN"); //Imprimimos la introducción de nuestro programa //Imprimimos la introducción de nuestro programa

        do { //Nos permite reintentar el codigo si hay un error
            try { //Intenta leer la altura si escribimos otra cosa que no sea un numero entero saltara un error
                System.out.println("Leyendo la altura (cm) ...:"); //Imprimimos un frase para indicar al usuario que ponga su altura
                altura= teclado.nextInt(); //Guardamos en "altura" lo que pongamos con el teclado

                if (altura>230 || altura<0){ //comprobar si la altura es mayor que 230 o 0 entonces ...
                    System.out.println("ERROR DE LECTURA, BAJA DE LA BÁSCULA Y VUELVE A SUBIR ..."); //Imprimimos una frase de error
                    return; //Lo utilzamos para salir del main y por eso acabara el programa
                }

                if (altura<140) { //Comprobamos si la altura es menos que 140 entonces...
                    int resta_altura = 140-altura; //Asiganamos un variable llamada resta_altura para guardas 140-altura
                    System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRRACIÓN. Te faltan " + resta_altura + " cm de altura."); //Imprimimos un mensaje que nos indica que no podemos montar en la atracción
                    return; //Lo utilizamos para salir del main y por eso acabara el programa
                }

                repetir = false; //Lo utilizamos para no repetir si lo que introducimos es un numero entero correcto

            }catch (Exception er){ //Lo utilizamos para si hay cualquier error de una excepcion mandar al usuario aqui
                System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR ..."); //Imprimir que ha habido un error en la lectura vuelvelo a repetir
                teclado.nextLine(); //Sirve para no imprimir el mensaje todo el rato
                repetir=true; //Nos indica que queremos repetir el proceso
            }
        }while(repetir==true); //Si hay excepcion repetir si no se acaba el do-while

        double peso = 0; //Asignamos una variable para el peso

        double formula_peso = altura * 2 / 8;; //Asignamos una variable para la formula que nos da el enunciado (peso minimo)

        System.out.println("Leyendo el peso ..."); //Imprimir un mensaje para introducir el peso
        peso = teclado.nextDouble(); //gardamos en "peso" lo que introduzcamos en el teclado

            if (peso > 120) { //Comprobamos si el peso es mayor a 120 entonces ...
                double resta_peso = peso-120; //Asignamos una variable con el nombre resta_peso quue sigifnicia peso-120
                System.out.println("LO SIENTO. Sobrepasas " + resta_peso + " kg el límite de la atracción."); //Imprimir un mensaje de que su peso supera el limite de la atraccion y por tanto no puede subir
            } else if (peso < formula_peso) { //Comprobamos si el peso es menor que la formula_peso entonces ...
                System.out.println("LO SIENTO. No superas el peso mínimo, que son " + formula_peso + " kg, de la atración."); //Imprimir un mensaje de que su peso no supera el mínimo y cual es el minimo para su altura
            }else{ //Si esl peso esta dentro de los limites entonces ...
                System.out.println("Pesas " + peso + " kg. Peso mínimo calculado: " + formula_peso + "."); //Imprimir un mensaje que diga cuanto pesa y el peso que has escrito y el minimo de su peso calculado
                System.out.println("¡¡SUBE A LA ATRACCIÓN!!"); //Imprimir mensaje que diga que subas a la atraccion
            }



    }

}
