/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package open.close.principle;

/**
 *
 * @author TBeltran
 */
public class Electrode extends Pokemon implements IElectrico{

    //Método para realzar daño de Electrode
    @Override
    public int attackEnemy() {
        return this.puntos_ataque * 100;
    }
    
}
