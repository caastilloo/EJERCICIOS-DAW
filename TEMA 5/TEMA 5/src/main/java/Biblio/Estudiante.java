package Biblio;

public class Estudiante {

    private static int contadorEstudiantes = 0;
    private static final String CORREO_FORMAT = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private Libro libro;

    public Estudiante(String nombre, String curso, String email){

        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        nia = ++contadorEstudiantes; // ++ delante -> se actualiza antes de igualar | atras ++ -> se actualiza depes de igualar
        libro = null;

    }

    public Estudiante(String nombre){
        this(nombre, "", "");
        //this.nombre = nombre;
    }

    public static int obtenerTotalEstudiantes(){ // Si es estatico normalmente no lo llama el constructor
        return contadorEstudiantes;
    }

    public static boolean validarCorreo(String email){
        if (email.matches(CORREO_FORMAT)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", nia=" + nia +
                ", email='" + email + '\'' +
                ", libro='" + libro.getTitulo() +
                '}';
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

}
