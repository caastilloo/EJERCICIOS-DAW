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
        ++cantidadLibros;
        ++librosDisponibles;
    }

    public int calcularId(){
        return 0;
    }

    public void prestar(){
        disponible = false;
        librosDisponibles--;
        System.out.println("El libro ha sido prestado con éxito.");
    }

}
