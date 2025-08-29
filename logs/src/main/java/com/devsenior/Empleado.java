package com.devsenior;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Empleado {

    private static final Logger logger = LogManager.getLogger(Empleado.class);

    // ATRIBUTOS
    private String nombre;
    private int edad;
    private double salario;

    //CONSTRUCTOR
    public Empleado(int edad, String nombre, double salario) {
        this.edad = edad;
        this.nombre = nombre;
        this.salario = salario;

        if (edad < 0) {
            logger.warn("El empleado " + nombre + " es menor de Edad");
        }
    }

    public void aumentarSalario(double cantidad) {
        if (cantidad < 0) {
           logger.warn("No se puede aumentar el salario");
           return;
        }

        this.salario += cantidad;
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }


}
