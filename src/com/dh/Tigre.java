package com.dh;

import org.apache.log4j.Logger;

public class Tigre {
    private static final Logger logger = Logger.getLogger(Test.class); //Instanciando la clase Logger, que la obtenemos de la clase Test.
    private String nombre;//Atributos.
    private int edad;

    public Tigre(String nombre, int edad) {//Constructor
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { //Métodos accesores
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    //Métodos con sus logger.info para mostrar la información de lo que sucede.
    public void correr(){
        logger.info("El Tigre " + getNombre() + " está corriendo");
    }
    public void esMayorA10(){
        if(getEdad()>10){
            logger.info("La edad del tigre " + nombre + " es " + edad + " años.");
        }if (getEdad()<10 && getEdad()>0) {
            logger.info("La edad del tigre " + nombre + " es " + edad + " años.");
        }  if(getEdad()<0) {
            logger.info("La edad no puede ser negativa");
            throw new RuntimeException(); //Marcamos que acá va a haber una excepción.
        }

    }
}
