package org.example;

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

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        cantidadLibros++;
        librosDisponibles++;
        id = calcularId();
        estudiantePrestado=null;
    }

    private String calcularId(){

        return SIGLAS_ID + cantidadLibros;
    }

    public void prestar(Estudiante estudiante){

        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado con éxito a " + estudiante.getNombre() + " del curso " + estudiante.getCurso() + ".");
            librosDisponibles--;
            estudiantePrestado=estudiante;
            estudiantePrestado.setLibro(this);
        }else {
            System.out.println("El libro '" + titulo + "' no esta disponible para prestar.");
        }

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
                ", disponible=" + disponible +
                ", estudiante=" + estudiantePrestado +
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
