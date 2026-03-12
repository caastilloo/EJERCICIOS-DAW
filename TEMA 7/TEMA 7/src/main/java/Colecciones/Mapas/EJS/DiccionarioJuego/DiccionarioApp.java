package Colecciones.Mapas.EJS.DiccionarioJuego;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class DiccionarioApp {

    static Scanner teclado = new Scanner(System.in);

    static void main() {

        Diccionario diccionario = new Diccionario();
        int preguntas = 0;
        int aciertos = 0;
        int errores = 0;

        diccionario.cargarPalabras();

    }

}
