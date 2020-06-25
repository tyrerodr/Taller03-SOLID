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
public class CalculateAttack {
    
    //APLICANDO OCP Y SRP
    public int calculateDamagePElectrico(IElectrico p){
        return p.attackEnemy();
    }
    
    //SIN APLICAR OCP (MALA IMPLEMENTACIÓN)
    /*public int calculateDamagePikachu(Pikachu p){
        return p.puntos_ataque * 125;
    }
    
    public int calculateDamageElectrode(Electrode p){
        return p.puntos_ataque * 100;
    }*/
}
