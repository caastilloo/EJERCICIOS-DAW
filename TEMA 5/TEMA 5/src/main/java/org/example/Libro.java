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

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        cantidadLibros++;
        librosDisponibles++;
        id = calcularId();
    }

    private String calcularId(){

        return SIGLAS_ID + cantidadLibros;
    }

    public void prestar(){

        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado con éxito.");
            librosDisponibles--;
        }else {
            System.out.println("El libro '" + titulo + "' no esta disponible para prestar.");
        }

    }

    public void devolver(){

        if (!disponible){
            disponible=true;
            System.out.println("El libro '" + titulo + "' ha sido devuelto con éxito.");
            librosDisponibles++;
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

    public void setId(String id) {
        this.id = id;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
