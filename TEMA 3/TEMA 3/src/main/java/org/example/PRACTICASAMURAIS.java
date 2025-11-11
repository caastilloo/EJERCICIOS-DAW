package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PRACTICASAMURAIS {

    static void main() {

        //Añadidmos una entrada y un aleatorio
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        //Establecemos un vector para cada equipo con un tamaño de 6 numeros
        int equipo1 [] = new int[7];
        int equipo2 [] = new int[7];

        //Hacemos este bucle para hacer la potencia primero del equipo 1 y luego del 2 para mas adelante comenzar la batalla con cada potencia
        for (int i = 1; i <= 2 ; i++) {

            //Inicializamos una variable para saber si la suma es 30
            boolean igual30 = false;
            //Auxiliar para saber en que equipo estamos
            int [] equipo_actual;

            //Si la i es 1 entonces el equipo actual sera el Equipo1
            if (i==1){
                equipo_actual=equipo1;
            }else{ //En la siguiente vuelta se activara el else ya que pasara a ser 2 la i
                equipo_actual=equipo2;
            }

            //Haremos todo esto hasta que la suma de la potencia sea 30
            do {

                //Inicializamos equuipo y pedimos la potencia y la guardamos en un string que le haremos un split, al vector, para quitar los espacios
                System.out.println("EQUPO " + i + ":");
                System.out.println("> Introduce la potencia de los samurais: ");
                String numeros = teclado.nextLine();
                String numeros_vector [] = numeros.split(" ");

                //Si la longitud del vector no es 7 le diremos al usuario que deben de ser 7 numero en la potencia
                if (numeros_vector.length != 7){
                    System.out.println("Debes introducir 7 numeros en la potencia");
                    continue; //Nos servira para volver al principio del bucle
                }

                //Variable para controlar la suma
                int suma = 0;

                //Haremos un bucle para recorrer todos los valores que hemos metido por teclado
                for (int e = 0; e < numeros_vector.length; e++) {
                    int numero = Integer.parseInt(numeros_vector[e]); //Aqui convertiremos el texto en numero
                    equipo_actual[e]=numero; //Guardaremos el numero en el vector
                    suma += equipo_actual[e]; //Mientras sumamos las potencias
                }

                //Si la suma nos da 30 el equipo estara completado
                if (suma==30){
                    System.out.println("Equipo completado.");
                    igual30=true;
                }else { //Y cuando la suma no sea 30 sacamos un error porq la potencia total no suma 30
                    System.out.println("ERROR. La potencia total no suma 30");
                }

            } while (!igual30);
        }

        //Aqui empezamos la batalla
        System.out.println("¡Empieza la batalla!");
        int samurai = aleatorio.nextInt(7)+1; //Sacamos un numero aleatorio para empezar desde este
        System.out.println("La batalla inicia con el Samurai " + samurai + "."); //Decimos porque numero empezamos

        //Creamos dos variables para llevar el contador de muertes de cada equipo
        int contador_equipo1 = 0;
        int contador_equipo2 = 0;

        //Variable para la posicion en el array por eso restamos 1
        int posicion = samurai-1;

        //Bucle para hacer 7 rondas, una por cada nuumero
        for (int j = 1; j <= 7 ; j++) {
            //Cogemos la potencia de cada samuurai de esa posicion
            int numero_equipo1 = equipo1[posicion];
            int numero_equipo2 = equipo2[posicion];

            //Diremos quien gana en cada caso
            if (numero_equipo1>numero_equipo2){ //Si el nuumero del equipo 1 es mayor al del equipo 2 ganara el equipo 1
                System.out.println("Samurai " + (posicion+1) + ". Gana Equipo 1 " + numero_equipo1 + " vs " + numero_equipo2);
                equipo2[posicion]=0; //La posicion queda en 0 porq ha muerto
                contador_equipo2++; //Sumamos el contador de bajas
            } else if (numero_equipo1<numero_equipo2) { //Si el numero del equipo 2 es mayor al del equipo 1 gane el equipo 2
                System.out.println("Samurai " + (posicion+1) + ". Gana Equipo 2 " + numero_equipo1 + " vs " + numero_equipo2);
                equipo1[posicion]=0; //La posicion queda en 0 porque ha muerto
                contador_equipo1++; //Suumamos al contador de bajas
            }else {
                System.out.println("Empate. Ambos equipos mueren. " + numero_equipo1 + " vs " + numero_equipo2);
                equipo1[posicion]=0; //Muere el del equipo 1
                equipo2[posicion]=0; //Y muuere el del equipo 2
                contador_equipo1++; //Se cuenta tanto en el 1
                contador_equipo2++; //Como en el 2
            }

            //Si el contador de muertes del equipo 1 es mayor a 3 gana directamente el equipo 2
            if (contador_equipo1>3){
                System.out.println("!Equipo 2 GANA! Equipo 1 ha tenido " + contador_equipo1 + " bajas.");
                break; //Salimos directamente del bucle
            }else if (contador_equipo2>3){ //Si el contador de muertes del equipo 2 es mayor a 3 gana directamente el equipo 1
                System.out.println("!Equipo 1 GANA! Equipo 2 ha tenido " + contador_equipo2 + " bajas.");
                break; //Salimos directamente del bucle
            }

            //Aqui pasamo al siguiente samurai en cada vuelta del bucle
            posicion++; //Incrementamos la posicion para ir avanzando en el array/vector
            if (posicion==7){ //Si la posicion llega al final (7) volvemos a al principio (0)
                posicion=0;
            }

        }


    }
}



//Si empatan los dos equipos sera un empate
//        if (contador_equipo1 <= 3 && contador_equipo2 <= 3) {
//            System.out.println("!EMPATE!. El Equipo 1 ha tenido " + contador_equipo1 + " y el Equipo 2 ha tenido " + contador_equipo2 + ".");
//        }