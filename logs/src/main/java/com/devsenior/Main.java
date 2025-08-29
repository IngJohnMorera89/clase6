package com.devsenior;
import org.apache.logging.log4j.*;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
     
       logger.info("Iniciando aplicacion");

       // crear empleados y Gerente
       Empleado emp1 = new Empleado(30, "Juan", 50000);
       Gerente gerente = new Gerente(40, "Maria", 70000);
       logger.info("La informacion del Empleado: " + emp1);
       logger.info("La informacion del Gerente: " + gerente);


       //aumentar el salario

        emp1.aumentarSalario(5000);
        gerente.aumentarSalario(10000);

        
        logger.info("La informacion del Empleado: " + emp1);
        logger.info("La informacion del Gerente: " + gerente);

        logger.info("Finalizando la aplicacion");
        logger.trace("Este es un mensaje de traza");
        logger.debug("Este es un mensaje de depuracion");
        logger.error("Este es un mensaje de error");
        logger.fatal("Este es un mensaje fatal");
    }
    
}
