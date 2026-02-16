package DispositivosInteligentes;

public class ParlanteInteligente extends Dispositivo{

    public ParlanteInteligente(String nombre, boolean estado) {
        super(nombre, estado);
    }

    public ParlanteInteligente(){

    }

    @Override
    public void enceder() {

        ParlanteInteligente parlante = new ParlanteInteligente();

        if (parlante.isEstado() == true){
            System.out.println("El parlante ya está encendido.");
        }else {
            System.out.println("Activando parlante con comando de voz...");
        }


    }
}
