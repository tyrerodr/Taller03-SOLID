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
public class Juegos implements IProduct{

    @Override
    public double precio() {
        return 89; //Retornaria un valor de precio en este caso 
    }

    @Override
    public int restriccionEdad() {
        return 18;
    }

    @Override
    public int talla() {
        throw new UnsupportedOperationException("Not supported yet."); //No tendria sentido implementar esto en juegos
    }

    @Override
    public String color() {
        throw new UnsupportedOperationException("Not supported yet."); //No tendria sentido implementar esto en juegos
    }

    @Override
    public String Plataforma() {
        return "PlayStation5";
    }


    
}
