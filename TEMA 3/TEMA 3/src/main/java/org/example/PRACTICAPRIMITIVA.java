    package org.example;

    import java.util.Arrays;
    import java.util.Random;
    import java.util.Scanner;

    public class PRACTICAPRIMITIVA {

        static void main() {

            Scanner teclado = new Scanner(System.in); //Insertamos un scanner
            Random aleatorio = new Random(); //Insertamos un random

            //Pedimos al usuario los datos de su boleto
            System.out.println("Introduce los datos de tu boleto: ");
            String boleto = teclado.nextLine(); //Guardamos los datos del boleto

            //Comprobamos si los datos introducidos tienen el formato correcto
            if (!boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d")){
                return; //Si el formato es incorrecto se termina el programa
            }

            //Con la funcion split quitamos los separadores - / y lo guardamos en el array boleto vector
            String boleto_vector [] = boleto.split("[-/]");
            System.out.println(Arrays.toString(boleto_vector)); //Imprimimos el vector ya limpio

            int boletin_usuario [] = new int[6]; //Creamos un array con 6 numeros
            int reintegro_usuario = Integer.parseInt(boleto_vector[6]); //Convertimos el reintegro del usuario a un numero

            //Bucle para pasar cada numero del boleto a un numero entero y comprobamos que este en el rango entre 1 y 49
            for (int i = 0; i < 6; i++) {
                boletin_usuario[i] = Integer.parseInt(boleto_vector[i]);

                //Si el numero esta fuera del rango acabamos el programa
                if (boletin_usuario[i] <1 || boletin_usuario[i]>49){
                    return;
                }
            }

            //Si el numero esta fuera del rango acabamos el programa
            if (reintegro_usuario < 0 || reintegro_usuario > 9){
                return;
            }

            Arrays.sort(boletin_usuario); //Ordenamos el array con la funcion sort


            int numeros_boletin [] = new int[6];
            int contador = 0;

            //Bucle que utiliozams para generar los numeros sin que se repitan
            while (contador<6){
                int numero = aleatorio.nextInt(49)+1;
                boolean repetido = false; //Un booleano para saber si

                //Bucle para comprobar si el nuumero ya ha salido antees
                for (int i = 0; i < contador; i++) {
                    //Si el numero del boletin original
                    if (numeros_boletin[i] == numero) {
                        repetido = true;
                    }
                }

                //Si el numero no esta repitido lo guardamos
                if (!repetido) {
                    numeros_boletin[contador]=numero;
                    contador++;
                }

            }

            Arrays.sort(numeros_boletin); //Ordenamos el array con la funcion sort

            int numero_complementario = aleatorio.nextInt(49)+1;
            boolean coincide = true;

            //Bucle para comprobar si el complementario no coincide con ninguno de los otros numeros
            while (coincide){
                coincide=false;

                for (int i = 0; i < 6; i++) {
                    //Si el numero coincide generamos ese numero otra vez
                    if (numeros_boletin[i] == numero_complementario){
                        numero_complementario = aleatorio.nextInt(49)+1;
                        coincide=true;
                    }

                }
            }

            int reintegro_sorteo = aleatorio.nextInt(10); //El reintegro del sorteo es un numero aleatorio entre 0 y 9

            //Mostramos el boletin que ha salido de forma aleatorio el complementario y el reintegro
            System.out.println("Ha salido:");
            System.out.println(Arrays.toString(numeros_boletin));
            System.out.println("Complementario: " + numero_complementario);
            System.out.println("Reintegro " + reintegro_sorteo);

            int aciertos = 0; //Hacemos un contador para ir contando los aciertos
            boolean acierto_complementario = false; //Es true cuando coincide con el complementario

            //Recorremos los numeros del boletin del usuuario
            for (int i = 0; i < 6; i++) {

                boolean igual = false;

                //Comparamos con los numero del sorteo
                for (int j = 0; j < 6; j++) {
                    //Si coinciden apuntamos un acierto
                    if (boletin_usuario[i] == numeros_boletin[j]){
                        igual = true;
                        aciertos++;
                        break;
                    }
                }

                //Si no es ninguno de los 6 comprobamos si es el numero complementario
                if (!igual && boletin_usuario[i] == numero_complementario){
                    acierto_complementario = true;
                }
            }

            boolean acierto_reintegro = reintegro_usuario == reintegro_sorteo; //Comprobamos si el reintegro del usuario coincide con el sorte

            System.out.println(); //Espacio

            System.out.println("Resultados:");

            //Si es un acierto imprimos que es 1 acierto y si no imprimimos el numero de aciertos
            if (aciertos==1){
                System.out.println("1 acierto");
            }else {
                System.out.println(aciertos+ " aciertos");
            }

            //Mostramos si ha acertado el reintegro
            if (acierto_reintegro){
                System.out.println("Reintegro");
            }

            //Depende del numero de aciertos mostraremos una categoria
            if (aciertos==6 && acierto_reintegro){
                System.out.println("Catergoria Especial: Acertar los 6 números de la combinación ganadora y el reintegro");
            } else if (aciertos==6) {
                System.out.println("1a Categoría: Acertar los 6 números de la combinación ganadora.");
            } else if (aciertos==5 && acierto_complementario) {
                System.out.println("2a Categoría: Acertar 5 numeros de la combinación y el núumero complementario");
            } else if (aciertos==5) {
                System.out.println("3a Categoría: Acertar 5 números de la combinación");
            } else if (aciertos==4) {
                System.out.println("4a Categoría: Acertar 4 números de la combinación");
            } else if (aciertos==3) {
                System.out.println("5a Categoría: Acertar 3 números de la combinación");
            } else if (acierto_reintegro) {
                System.out.println("6a Categoría (Reintegro): Acertar el número del reintegro");
            }else {
                System.out.println("No premiado");
            }


        }
    }



    //            for (int i = 0; i < 6; i++) {
//                int numero = aleatorio.nextInt(49)+1;
//
//                for (int j = 0; j < i; j++) {
//                    if (numeros_boletin[j]==numero){
//                        i--;
//                        break;
//                    }
//                }
//
//                if (numero!=-1){
//                    numeros_boletin[i] = numero;
//                }
//
//            }