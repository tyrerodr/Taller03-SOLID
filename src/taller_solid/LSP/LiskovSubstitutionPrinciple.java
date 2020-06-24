/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_solid.LSP;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tyrone
 */
public class LiskovSubstitutionPrinciple {
    //Tenemos una clase Bird con las características comunes en los pajaros.
    public class Bird {
        String food;
        String tweet;
    public String eat(){
        return food;
    }
 
    public String tweet(){
        return tweet;
    }
 
    public void fly(){
        // Codigo fly()
    }
 
}
    //A partir de esta clase podemos crear subtipos sin problemas, como por ejemplo el siguiente:
    public class Sparrow extends Bird {
            @Override
            public String eat() {
                return "Insect";
    }
            @Override
            public String tweet() {
                return "Chirp";
    }
}
    
    
    /*Quiás pueda parecer que una herencia correcta hasta que 
    queremos un nuevo tipo de pájaro, el pingüino.*/
    public class Penguin extends Bird {
        @Override
        public String eat() {
            return "Fish";
        }
        @Override
        public String tweet() {
            return "Squawk”";
        }
        @Override
        public void fly() {
            new Exception("Penguins can’t fly");
        }
}
    
    /*Solucion 1 verficar mediante un metodo si el tipo 
    de pájaro es un pinguino y segun eso continuar con el proceso*/
    
    /*Pero en este caso estaríamos violando el LSP, 
    porque nos indica que el código debería funcionar sin conocer 
    la clase exacta del objeto “Bird”*/
    
    public void startFlying(Bird bird) {
        if (Penguin.class.isInstance(bird)) {
            //No puede volar
        } else {
            bird.fly();
        }
}
    
    /*La solucion sería crear otra clase “FlyingBird” que herede de “Bird”,esta implementaria la función fly()
      en este caso el subtipo “Sparrow” heredará de esta clase*/
    /*“Penguin” seguirá heredando 
       de “Bird” pero sin tener que implementar la funcionalidad de fly().*/
    public class FlyingBird extends Bird {

        public void fly() {
            // Codigo fly()
        }
}
}