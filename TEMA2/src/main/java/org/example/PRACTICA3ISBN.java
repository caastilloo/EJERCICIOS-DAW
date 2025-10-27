package org.example;

import java.util.Scanner;

public class PRACTICA3ISBN {

    static void main() {

        Scanner teclado = new Scanner(System.in); //PARA LEER LO QUE ESCRIBIMOS POR EL TECLADO
        char opcion = 'x'; //VARIABLE DEL CHAR


        //HACEMOS EL MENU
        System.out.println("*** VALIDAR ISBN ***");

        System.out.println("---------------------");

        System.out.println("[1] | Validar ISBN");
        System.out.println("[2] | Reparar ISBN");
        System.out.println("[X] | Salir");

        System.out.println("---------------------");

        System.out.println("Seleccione una opción:");
        opcion = Character.toLowerCase(teclado.nextLine().charAt(0));


        switch (opcion){ //PARA HACER UNA COSA O OTRA DEPENDIENDO DE LA OPCION QUUE ELIJA EL USUARIO

            case '1': //EN EL CASO QUE EL USUARIO ELIJA EL 1 EN EL MENU:
                    System.out.println("Introduzca ISBN");
                    String isbn = teclado.nextLine(); //GUARDAMOS EL ISBN EN UUN STRING

                    int tamanyo_isbn = isbn.length(); //SACAMOS EL TAMAÑO DEL ISBN Y LO GUARDAMOS EN UN INT

                    if (tamanyo_isbn != 10){ //SI EL ISBN NO TIENE 10 DIGITOS NO HAREMOS EL PROCESO
                        System.out.println("El ISBN tiene que tener 10 dígitos, revise su ISBN.");
                    } else {
                        int suma = 0; //VARIABLE DE LA SUMA
                        for (int i = 0; i < 10; i++){ //BUCLE QUUE RECORRE CADA POSICION DE 0 a 9, CADA DIGITO SE MULTIPLICA de 10 HASTA 1 Y SE SUMA PARA COMPROBAR SI ES DIVISIBLE ENTRE 11
                            char digito= isbn.charAt(i); //VARIABLE DIGITO
                            int valor = 0; //VARIABLE VALOR

                            if (i == 9 && Character.toUpperCase(digito) == 'X'){ //SI LA i ES 9 y EL DIGITO ES x o X
                                valor = 10;
                            } else if (digito>= '0' && digito <= '9') { //SI DIGITO ES MAYOR O IGUAL A 0 Y DIGITO ES MENOR O IGUAL A 9
                                valor = digito - '0';
                            } else { //SI NO NO CONTIENE LOS CARACTERES VALIDOS
                                System.out.println("ISBN contiene caracteres no validos.");
                                valor =-1; // EL VALOR ES -1
                                break; //SALIMOS
                            }

                            suma = suma + valor * (10-i); //GUUARDAMOS EN SUMA EL NUMERO PARA COMPROBAR SI ES DIVISIBLE

                        }

                        if (suma % 11==0){ //COMPROBAMOS SI ES DIVISIBLE ENTRE 11
                            System.out.println("El ISBN es válido."); //SI LO ES
                        }else {
                            System.out.println("El ISBN no es válido."); //NO LO ES
                        }
                    }

                    break; //SALIMOS

            case '2':
                System.out.println("Introduzca ISBN a REPARAR:");
                String isbn_reparar = teclado.nextLine(); // GUARDAMOS EL ISBN A REPARAR EN UUN STRING

                if (isbn_reparar.length() != 10) { //SI EL ISBN NO TIENE 10 DIGITOS NO HAREMOS EL PROCESO
                    System.out.println("El ISBN tiene que tener 10 dígitos, revise su ISBN.");
                    break;
                }

                int suma = 0; // GUARDAMOS VARIABLE SUMA
                int posicion_interrogacion = isbn_reparar.indexOf('?'); // GUARDAMOS LA VARIABLE PARA SABER DONDE ESTA LA ?
                boolean error = false;

                for (int i = 0; i < 10; i++) {
                    if (i == posicion_interrogacion){ // SI LA i ES IGUAL A LA POSICION DEL INTERROGANTE CONTINUAMOS
                        continue;
                    }

                    char digito = isbn_reparar.charAt(i); // VARIABLE CHAR (DIGITO)
                    int valor = 0; // VARIABLE VALOR

                    if (i == 9 && Character.toUpperCase(digito) == 'X') { // SI LA i ES 9 Y EL DIGITO ES x o X
                        valor = 10; // VALOR = 10
                    } else if (digito >= '0' && digito <= '9') { // SI EL DIGITO ES MAYOR O IGUAL A 0 Y DIGITO ES MAYOR O IGUAL A 9
                        valor = digito - '0'; // VALOR ES EL DIGITO - EL 0
                    } else { // SI NO
                        System.out.println("ISBN contiene caracteres no válidos.");
                        error = true; // ES UN ERROR
                        break;
                    }

                    suma = suma + valor * (10 - i); // VARIABLE SUMA
                }

                if (!error) {
                    if (posicion_interrogacion != -1) { // SI LA POSICION DE LA INTERROGACION ES DIFERENTE A MENOS 1
                        boolean encontrado = false; // BOOLEANO DE ENCONTRADO

                        for (int n = 0; n <= 10; n++) {
                            int total = suma + n * (10 - posicion_interrogacion);
                            if (total % 11 == 0) {
                                if (n == 10 && posicion_interrogacion == 9) { // SI n == 10 Y POSICION INTERROGACION ES IGUAL A 9
                                    System.out.println("El dígito que falta es: X");
                                } else { // SI NO
                                    System.out.println("El dígito que falta es: " + n);
                                }
                                encontrado = true; // LO HEMOS ENCONTRADO
                                break;
                            }
                        }

                        if (!encontrado) { // SI NO ES ENCONTRADA
                            System.out.println("No se encontró un dígito que haga el ISBN válido.");
                        }

                    } else { // SI NO
                        if (suma % 11 == 0) { // VALIDAMOS QUE SEA DIVISIBLE ENTRE 11
                            System.out.println("El ISBN ya es válido.");
                        } else { // SI NO
                            System.out.println("El ISBN no es válido y no tiene '?' para reparar.");
                        }
                    }
                }

                break; //SALIMOS

                case 'x': //EN EL CASO DE QUE EL USUARIO ELIJA X SALDREMOS DEL PROGRAMA
                    System.out.println("Saliendo ...");
                    break; //SALIMOS

                default: //Y SI PONEMOS CUALQUIER COSA QUE NO SEA NINGUNA OPCION DEL MENU
                    System.out.println("ERROR. Introduce una opción valida"); //NOS INDICARA QUE LA OPCION NO ES VALIDA
                    break; //SALIMOS
            }
        }

    }













//                    String digito1 = isbn.substring(0,1);
////                    int digito1_num = Integer.parseInt(digito1);
////                    int num1 = digito1_num*10;
//
//                String digito2 = isbn.substring(1,2);
//                int digito2_num = Integer.parseInt(digito1);
//                int num2 = digito1_num*9;
//
//                String digito3 = isbn.substring(2,3);
//                int digito3_num = Integer.parseInt(digito1);
//                int num3 = digito1_num*8;
//
//                String digito4 = isbn.substring(3,4);
//                int digito4_num = Integer.parseInt(digito1);
//                int num4 = digito1_num*7;
//
//                String digito5 = isbn.substring(4,5);
//                int digito5_num = Integer.parseInt(digito1);
//                int num5 = digito1_num*6;
//
//                String digito6 = isbn.substring(5,6);
//                int digito6_num = Integer.parseInt(digito1);
//                int num6 = digito1_num*5;
//
//                String digito7 = isbn.substring(6,7);
//                int digito7_num = Integer.parseInt(digito1);
//                int num7 = digito1_num*10;
//
//                String digito8 = isbn.substring(7,8);
//                int digito8_num = Integer.parseInt(digito1);
//                int num8 = digito1_num*10;
//
//                String digito9 = isbn.substring(8,9);
//                int digito9_num = Integer.parseInt(digito1);
//                int num9 = digito1_num*10;
//
//                String digito10 = isbn.substring(9,10);
//                int digito10_num = Integer.parseInt(digito1);
//                int num10 = digito1_num*10;