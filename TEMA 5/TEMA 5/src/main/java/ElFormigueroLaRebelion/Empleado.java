package ElFormigueroLaRebelion;

public class Empleado {

    private static final String SIGLAS_ID = "EP";
    private static int cantidadLibros = 0;

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director; // Por hacer

    public Empleado(String nombre, String cargo){
        cantidadLibros++;
        id = generarId();
        this.nombre = nombre;
        this.cargo = setCargo(cargo);
//        this.director = director;
    }

    public String generarId(){
        return SIGLAS_ID + cantidadLibros;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String setCargo(String cargo) {
        if (cargo.equals("director") || cargo.equals("técnico") || cargo.equals("presentador") || cargo.equals("colaborador")){
            return cargo;
        }else {
            return "pte";
        }
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                '}';
    }
}
