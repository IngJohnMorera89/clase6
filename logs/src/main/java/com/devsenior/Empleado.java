package com.devsenior;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(int edad, String nombre, double salario) {
        this.edad = edad;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double porcentaje) {
        if (porcentaje > 0) {
            this.salario += this.salario * porcentaje / 100;
        }
    }



}
