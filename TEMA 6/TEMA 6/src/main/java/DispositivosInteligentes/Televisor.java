package DispositivosInteligentes;

public class Televisor extends Dispositivo implements ControlRemoto{

    public Televisor(String nombre, boolean estado) {
        super(nombre, estado);
    }

    public Televisor(){

    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando con control remoto...");
    }

    @Override
    public void enceder() {
        Dispositivo televisor = new Televisor();

        if (televisor.isEstado() == true){
            System.out.println("El televisor ya está encendido.");
        }else {
            System.out.println("Encendiendo televisor");
        }

    }
}
