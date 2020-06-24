/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_solid.OCP;

/**
 *
 * @author TBeltran
 */
public class Pikachu extends Pokemon implements IElectrico{
    
    //Método para realzar daño de Pikachu
    @Override
    public int attackEnemy() {
        return this.puntos_ataque * 125;
    }


    
}
