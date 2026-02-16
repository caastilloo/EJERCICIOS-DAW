package DispositivosInteligentes;

public class AireAcondicionado extends Dispositivo implements ControlRemoto{

    public AireAcondicionado(String nombre, boolean estado) {
        super(nombre, estado);
    }

    public AireAcondicionado(){

    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando aire acondicionado con control remoto...");
    }

    @Override
    public void enceder() {
        Dispositivo aire = new AireAcondicionado();

        if (aire.isEstado() == true){
            System.out.println("El aire acondicionado ya está encendido.");
        }else {
            System.out.println("Encendiendo aire acondicionado...");
        }


    }
}
