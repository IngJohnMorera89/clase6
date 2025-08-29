package com.devsenior;

import org.apache.logging.log4j.*;

public class Gerente extends  Empleado {

     private String departamento;

    public Gerente(int edad, String nombre, double salario) {
        super(edad, nombre, salario);

        this.departamento = departamento;


    }

    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                "} " + super.toString();
    }

}
