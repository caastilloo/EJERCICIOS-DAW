package Insti;

public class InstiApp {

    static void main() {

//        Instituto figueras = new Instituto("figueras pacheco", "Alicante");

        Instituto figueras = new Instituto();

        Instituto lloixa = new Instituto("IES LLOIXA", "SAN JUAN");
        lloixa.setPoblacion(null);
        System.out.println(lloixa.getPoblacion());
    }
}
