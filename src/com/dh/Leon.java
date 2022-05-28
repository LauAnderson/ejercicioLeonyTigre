package com.dh;


import org.apache.log4j.Logger;

public class Leon {

    private static final Logger logger = Logger.getLogger(Test.class); //Instanciando la clase Logger, que la obtenemos de la clase Test.
    private String nombre; //Atributos
    private int edad;
    private Boolean esAlfa;

    public Leon(String nombre, int edad, Boolean esAlfa) { //Constructor
        this.nombre = nombre;
        this.edad = edad;
        this.esAlfa = esAlfa;
    }

    public String getNombre() {//Métodos accesores
        return nombre;
    }
    public int getEdad() {
        return edad;
    }

    public Boolean getEsAlfa() {
        return esAlfa;
    }

    //Métodos con sus logger.info para mostrar la información de lo que sucede.
    public void correr(){
        logger.info("El León "  + getNombre() + " está corriendo");
    }
    public void esMayorA10(){
        if(getEdad()>10 && getEsAlfa()){
            logger.info("La edad del León " + nombre + " es " + edad + " años. Por lo tanto es alfa" );
        }if (getEdad()<10 && getEdad()>0) {
            logger.info("La edad del León " + nombre + " es " + edad + " años. Por lo tanto no es alfa");
        }  if(getEdad()<0) {
            logger.info("La edad no puede ser negativa");
            throw new RuntimeException(); //Marcamos que acá va a haber una excepción.
        }

    }
}