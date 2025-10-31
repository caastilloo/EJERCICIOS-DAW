package org.example;

public class STRINGTEORIA {

//    La clase String contiene varios métodos típicos que operan con cadenas de texto. Su comportamiento es el siguiente:
//
//    int length(): devuelve la cantidad de caracteres del String.
//"Javadesdecero".lenght(); //retorna 13

//    Char charAt(int i): devuelve el carácter que se encuentre en la posición i.
//            System.out.println("Javadesdecero.es".charAt(3)); //retorna 'a'

//    String substring(int i): devuelve la subcadena desde la posición i hasta el final.
//            "Javadesdecero.es".substring(4); //retorna 'desdecero.es'

//    String substring (int i, int j): devuelve la subcadena desde la posición i hasta la posición j - 1.
//            "Javadesdecero.es".substring(4,9); //devuelve 'desde'

//    String concat (String palabra): concatena la cadena especificada al final de esta cadena.
//            String s1 = "Java";
//            String s2 = "desdecero.es
//    String salida = s1.concat(s2) // retorna 'Javadesdecero.es'

//    int indexOf (String s): devuelve la posición dentro de la cadena de la primera aparición de la cadena especificada.
//            String s = "Java desde cero";
//
//    int salida = s.indexOf("cero"); // retorna 11
//    int indexOf (String s, String i): devuelve la posición de la primera aparición de la cadena especificada, comenzando desde una posición específica.
//            String s = "Java desde cero";
//
//    int salida = s.indexOf("a", 3); // retorna 3
//    int lastIndexOf (int ch): devuelve la posición de la última aparición de la cadena especificada.
//            String s = "Java desde cero";
//
//    int salida = s.lastIndexOf("a"); // retorna 3
//    String toUpperCase(): convierte todos los caracteres de String a mayúsculas.
//    String palabra = "hoLa";
//
//    String palabra2 = palabra.toUpperCase(); // retorna 'HOLA'
//    String toLowerCase(): convierte todos los caracteres de String a minúsculas.
//
//    String palabra = "hOLa";
//
//    String palabra2 = palabra.toLowerCase(); // retorna 'hola'
//    String trim(): retorna la copia de la cadena, eliminando espacios en blanco en ambos extremos. Se usa principalmente para leer valores desde bases de datos, cuyas tablas tienen atributos normalmente sobredimensionados y rellenos con espacios a la derecha de su valor. No afecta a espacios en blanco en medio.
//    String palabra1 = " Java desde cero ";
//
//    String palabra2 = palabra1.trim(); // devuelve 'Java desde cero'
//    String replace(char 'antiguo_valor, char 'nuevo_valor'): devuelve una cadena tras reemplazar el valor antiguo en la cadena por el nuevo.
//            String palabra1 = "yava desde cero";
//
//    String palabra2 = palabra1.replace('y', 'j'); // devuelve 'java desde cero'
//    boolean equals(Objeto otroObjeto): compara este String con el objeto especificado.
//    boolean salida = "Java".equals("Java") // retorna 'true'
//
//    boolean salida = "Java".equals("java") // retorna 'false'
//    boolean equalsIgnoreCase(String otroString): compara dos cadenas ignorando las diferencias entre mayúsculas y minúsculas.
//    boolean salida = "Java".equalsIgnoreCase("Java") // retorna 'true'
//
//    boolean salida = "Java".equalsIgnoreCase("java") // retorna 'true'
//    int compareTo(String otroString): compara dos cadenas lexicográficamente. Esto es, siempre utiliza el valor Unicode de cada carácter de la cadena para compararlos (no el tamaño/posiciones).
//    int salida = s1.compareTo(s2); // donde s1 y s2 son dos cadenas que se comparan
//
//    Esto devuelve la diferencia s1-s2. Si:
//
//            - salida < 0 // s1 es menor que s2
//
//            - salida = 0 // s1 y s2 son iguales
//
//            - salida > 0 // s1 es mayor que s2
}
