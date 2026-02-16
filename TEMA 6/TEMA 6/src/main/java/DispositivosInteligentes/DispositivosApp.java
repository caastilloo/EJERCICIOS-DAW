package DispositivosInteligentes;

import java.util.ArrayList;

public class DispositivosApp {

    static void main() {

        Dispositivo aireAcondicionado = new AireAcondicionado("Aire acondicionado", false);
        ParlanteInteligente parlanteInteligente = new ParlanteInteligente("Parlante", false);
        Televisor televisor = new Televisor("Tele", false);

        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(aireAcondicionado);
        listaDispositivos.add(parlanteInteligente);
        listaDispositivos.add(televisor);

        for (Dispositivo dispositivo : listaDispositivos){
            dispositivo.enceder();

            if (dispositivo instanceof AireAcondicionado){
                ((AireAcondicionado) dispositivo).sincronizar();
            }

            if (dispositivo instanceof Televisor){
                ((Televisor) dispositivo).sincronizar();
            }

            dispositivo.isEstado();
            dispositivo.apagar();

        }


    }
}
