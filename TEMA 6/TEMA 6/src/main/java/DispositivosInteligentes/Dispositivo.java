package DispositivosInteligentes;

public abstract class Dispositivo {

    private String nombre;
    private boolean estado;

    public Dispositivo(String nombre, boolean estado){
        this.nombre = nombre;
        this.estado = estado;
    }

    public Dispositivo(){

    }

    public abstract void enceder();
    public void apagar(){
        if (estado = false){
            System.out.println("El dispositivo " + nombre + " ya está apagado.");
        }

        estado=false;
        System.out.println("El dispositivo " + nombre + " está apagado.");
    }
    public void mostrarEstado(){
        if (estado = true){
            System.out.println("El dispositivo " + nombre + " está encendido.");
        }else {
            System.out.println("El dispositivo " + nombre + " está apagado.");
        }
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }
}
