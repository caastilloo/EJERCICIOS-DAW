package CopaDelRey;

public abstract class MutxamielFC implements FuncionesIntegrantes{

    private String nombre;
    private int edad;

    public MutxamielFC(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "MutxamielFC{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
