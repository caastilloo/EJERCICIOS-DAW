package Restaurante;

import java.util.ArrayList;

public class Encargado extends Persona{

    private double salario;
    private ArrayList<Camarero> listaCamareros;

    public Encargado(String nombre, String dni, double salario) {
        super(nombre, dni);
        this.salario = salario;
        listaCamareros = new ArrayList<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Camarero> getListaCamareros() {
        return listaCamareros;
    }

    public void setListaCamareros(ArrayList<Camarero> listaCamareros) {
        this.listaCamareros = listaCamareros;
    }

    public void echarBranca(){
        System.out.println("Sirve más rápido!");
    }

    @Override
    public void mostrarInfoPersonas(){
        super.mostrarInfoPersonas();
        System.out.println("Salario: " + salario + "€");
        System.out.println("Camareros a cargo: ");
        for (Camarero camarero : listaCamareros){
            System.out.println(camarero.getNombre());
        }
    }

    @Override
    public String toString() {
        return "Encargado{" +
                "salario=" + salario +
                ", listaCamareros=" + listaCamareros +
                '}';
    }
}
