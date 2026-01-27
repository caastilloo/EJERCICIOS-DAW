package ArrayListIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class PruebaArrayList {

    static void main() {

        ArrayList<String> listaPartesCoche = new ArrayList<>();

        System.out.println("Elementos insertados: " + listaPartesCoche.size());

        listaPartesCoche.add("Puerta");
        listaPartesCoche.add("Polea");
        listaPartesCoche.add("Piston");
        listaPartesCoche.add("Alternador");

        System.out.println("Elementos insertados: " + listaPartesCoche.size());

        listaPartesCoche.add(3, "Tubo escape");

        System.out.println(listaPartesCoche);

        listaPartesCoche.remove("Puerta");

        System.out.println(listaPartesCoche);

        listaPartesCoche.remove(1);

        System.out.println(listaPartesCoche);

        System.out.println("Posición de alternador en la lista: " + listaPartesCoche.indexOf("Alternador"));
        System.out.println("Posición de puerta en la lista: " + listaPartesCoche.indexOf("Puerta"));

        System.out.println("En la posición 2 está: " + listaPartesCoche.get(2));

        for (String parte : listaPartesCoche){
            System.out.println("Parte: " + parte);
        }

        for (int i = 0; i < listaPartesCoche.size(); i++) {
            System.out.println("Parte " + (i+1) + ": " + listaPartesCoche.get(i));
        }

        listaPartesCoche.set(0, "Carter");
        System.out.println(listaPartesCoche);

        listaPartesCoche.clone(); // No vale para modificar la lista (lo pasa a object)
        ArrayList<String> copia = new ArrayList<>(listaPartesCoche); // Vale para modificar la lista

        System.out.println("La lista contiene puerta?: " + listaPartesCoche.contains("Puerta"));
        System.out.println("La lista contiene alternador?: " + listaPartesCoche.contains("Alternador"));

        System.out.println("Está vacia?: " + listaPartesCoche.isEmpty());

        listaPartesCoche.clear();

        System.out.println("Está vacia?: " + listaPartesCoche.isEmpty());

        listaPartesCoche.addAll(Arrays.asList("Rueda", "Freno", "Radiador"));

        System.out.println(listaPartesCoche);

    }
}
