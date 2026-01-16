package org.example;

public class Televisor {

    final int DEF_CANAL = 1;
    final int DEF_VOLUMEN = 5;

    private int canal;
    private int volumen;

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Televisor(){
        int DEF_CANAL;
        int DEF_VOLUMEN;
    }

    public Televisor(int valorCanal, int valorVolumen){

    }

    public void subirCanal(){

        if (canal == 100){
            canal = 1;
        }else {
            canal = canal+1;
        }

    }

    public void bajarCanal(){

        if (canal == 0){
            canal = 100;
        }else {
            canal = canal-1;
        }

    }

    public void cambiarCanal(int canal){

        this.canal = canal;

    }

    public void subirVolumen(){

        if (volumen < 100){
            volumen = volumen+1;
        }

        System.out.println("Volumen: " + volumen);

    }

    public void bajarVolumen(){

        if (volumen > 0){
            volumen = volumen+1;
        }

        System.out.println("Volumen: " + volumen);

    }


}
