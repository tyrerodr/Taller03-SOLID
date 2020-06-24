/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_solid.ISP;

/**
 *
 * @author Bryan
 */

//MALA IMPLEMENTACION DE ISP
public class Camisas implements IProduct{

    @Override
    public double precio() {
        return 12.23;
    }

    @Override
    public int restriccionEdad() {
        throw new UnsupportedOperationException("Not supported yet."); //No es necesario 
    }

    @Override
    public int talla() {
        return 0; //Aqui retornaria un valor entero
    }

    @Override
    public String color() {
        return "cafe";
    }
    
    @Override
    public String Plataforma() {
        throw new UnsupportedOperationException("Not supported yet."); //No es relevante para las camisas en este caso 
    }
    
    
}
