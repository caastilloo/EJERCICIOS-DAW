package CopaDelRey;

public class Masajista extends MutxamielFC{

    private String titulacion;
    private int anosExperiencia;

    public Masajista(String nombre, int edad) {
        super(nombre, edad);
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public void concentrarse() {

    }

    @Override
    public void viajar(String ciudad) {

    }

    @Override
    public void celebrarGol() {

    }

    @Override
    public String toString() {
        return "Masajista{" +
                "titulacion='" + titulacion + '\'' +
                ", anosExperiencia=" + anosExperiencia +
                '}';
    }
}
