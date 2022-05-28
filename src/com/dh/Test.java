package com.dh;


import org.apache.log4j.Logger;

public class Test {
    private static final Logger logger = Logger.getLogger(Test.class); //Instanciando la clase Logger, que la obtenemos de la clase Test.

    public static void main(String[] args) {

        Leon leon1 = new Leon("Scar", 11 , true); //Instanciando Leones.
        Leon leon2 = new Leon("Nala", 8, false);
        Leon leon3 = new Leon("Simba", -4, false );
        leon1.correr(); //LLamando al método correr
        leon2.correr();


        try { //Agarramos el error, el método esMayora10(), que es donde pusimos la excepción.
            leon3.esMayorA10();
        }catch (Exception e){
            logger.error("La edad del leon " + leon3.getNombre() + " es incorrecta", e);
        }

        Tigre tigre1 = new Tigre("Kelloggs", 12); //Instaciando Tigres
        Tigre tigre2 = new Tigre("Shere Khan", 4 );
        Tigre tigre3 = new Tigre("Tiger", -2);

        tigre1.correr();//Llamando al método correr
        tigre2.correr();


        try {//Agarramos el error, el método esMayora10(), que es donde pusimos la excepción.
            tigre3.esMayorA10();
        }catch (Exception e){
            logger.error("La edad del tigre " + tigre3.getNombre() + " es incorrecta", e);

        }

    }
}
