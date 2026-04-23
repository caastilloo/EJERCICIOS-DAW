package org.example.mantenimientodeestudiantes;

import java.time.LocalDate;

public class Estudiante {

    private Integer nia;
    private String nombre;
    private LocalDate fechaNacimiento;

    public Estudiante(Integer nia, String nombre, LocalDate fechaNacimiento) {
        this.nia = nia;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getNia() {
        return nia;
    }

    public void setNia(Integer nia) {
        this.nia = nia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nia='" + nia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
