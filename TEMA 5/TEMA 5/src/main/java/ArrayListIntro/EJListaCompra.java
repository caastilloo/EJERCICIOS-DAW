package ArrayListIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EJListaCompra {

    static Random aleatorio = new Random();
    static Scanner teclado = new Scanner(System.in);

    static void main() {

        // A
        ArrayList<String> listaCompra = new ArrayList<>();

        System.out.println("Está vacia?: " + listaCompra.isEmpty());

        listaCompra.add("Tomates");

        System.out.println("Está vacia?: " + listaCompra.isEmpty());

        // B
        listaCompra.addAll(Arrays.asList("Huevos", "Leche", "Arroz", "Patatas", "Cebolla"));

        System.out.println(listaCompra);

        // C
        System.out.println("El tercer elemento de la lista es: " + listaCompra.get(2));

        // D
        listaCompra.remove(1);
        listaCompra.add(2, "Queso");

        System.out.println(listaCompra);

        // E
        System.out.println("Está 'Leche' en la lista?: " + listaCompra.contains("Leche"));
        System.out.println("Está 'Mantequilla' en la lista?: " + listaCompra.contains("Mantequilla"));

        // F
        System.out.print("Introduce un elemento a añadir: ");
        String elementoMas = teclado.next();

        if (listaCompra.contains(elementoMas) == false){
            listaCompra.add(elementoMas);
        }else {
            System.out.println("No se puede agregar. El elemento ya se encuentra en la lista");
        }

        System.out.print("Introduce un elemento a modificar: ");
        String elementoMod = teclado.next();

        if (listaCompra.contains(elementoMod) == true){
            System.out.println("No se puede modificar este elemento. Ya que ya se encuentra en la lista");
        }else {
            System.out.print("Introduce la posicion a modificar: ");
            int posicionMod = teclado.nextInt();

            listaCompra.set(posicionMod, elementoMod);
        }

        System.out.println(listaCompra);

        // G
        System.out.println("El número de elementos en la lista es de: " + listaCompra.size());

        // H
        ArrayList<String> copiaListaCompra = new ArrayList<>(listaCompra);
        System.out.println("Esta es la copia de la lista: " + copiaListaCompra);

        // I
        copiaListaCompra.clear();
        System.out.println("La copia de la lista esta vacia?: " + copiaListaCompra.isEmpty());

        // J
        boolean sonIguales = listaCompra.equals(copiaListaCompra);
        System.out.println("Las dos listas son iguales?: " + sonIguales);

        // K
        copiaListaCompra.addAll(Arrays.asList("Manzanas", "Pasta"));
        System.out.println(copiaListaCompra);

        // L
        ArrayList<String> faltantes = new ArrayList<>(listaCompra);
        faltantes.remove(copiaListaCompra);

        System.out.println(faltantes);

        // M
        ArrayList<Integer> precios = new ArrayList<>();

        for (int i = 0; i < listaCompra.size(); i++) {
            precios.add(aleatorio.nextInt(11));
        }

//        System.out.println(precios);

        for (int i = 0; i < listaCompra.size(); i++) {
            System.out.println("Producto " + (i+1) + ": " + listaCompra.get(i));
            System.out.println("-> PRECIO: " + precios.get(i) + "€");
        }


    }
}
