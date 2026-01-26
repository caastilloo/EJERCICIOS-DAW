package Biblio;

public class Libro {

    private static final String SIGLAS_ID = "LIB";
    private static final int NUMEROS_ID = 1;

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private Estudiante estudiantePrestado;
    private Editorial editorial;

    public Libro(String titulo, String autor, Editorial editorial){
        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        cantidadLibros++;
        librosDisponibles++;
        id = calcularId();
        estudiantePrestado=null;
        this.editorial = editorial;
    }

    private String calcularId(){

        return SIGLAS_ID + cantidadLibros;
    }

    public Prestamo prestar(Estudiante estudiante){

        Prestamo prestamo = null;

        if (disponible && estudiante.getLibro() == null) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado con éxito a " + estudiante.getNombre() + " del curso " + estudiante.getCurso() + ".");
            librosDisponibles--;
            estudiantePrestado=estudiante;
            estudiantePrestado.setLibro(this);
            prestamo = new Prestamo(estudiante, this);

        } else if (estudiante.getLibro() != null) {
            System.out.println("El estudiante " + estudiante.getNombre() + " ya tiene un libro prestado");
        }else {
            System.out.println("El libro '" + titulo + "' no esta disponible para prestar.");
        }

        return prestamo;

    }

    public void devolver(Estudiante estudiante){ // revisar

        if (!disponible){
            disponible=true;
            System.out.println("El libro '" + titulo + "' ha sido devuelto con éxito por " + estudiante.getNombre() + " del curso " + estudiante.getCurso() + ".");
            librosDisponibles++;
            estudiantePrestado.setLibro(null);
            estudiantePrestado=null;
        }else {
            System.out.println("El libro '" + titulo + "' no se puede devolver. Está disponible.");
        }

    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public boolean estaDisponible(){
        return disponible;
    }

    static public int getCantidadLibros(){
        return cantidadLibros;
    }

    static public int getLibrosDisponibles(){
        return librosDisponibles;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", id='" + id + '\'' +
                ", disponible= " + disponible +
                ", estudiante= " + estudiantePrestado +
                ", editorial= " + editorial +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public void setEstudiantePrestado(Estudiante estudiantePrestado) {
        this.estudiantePrestado = estudiantePrestado;
    }
}
