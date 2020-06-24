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
//BUENA IMPLEMENTACION DE ISP
//AQUI CADA CLASE TIENE IMPLEMENTADO LOS METDOSO NECESARIOS
//CUMPLIENDO EL PRINCIPIO DE ISP
public class Camisas2 implements Vestimenta,IProduct2{

    @Override
    public int talla() {
        return 35;
    }

    @Override
    public String color() {
        return "Azul";
    }

    @Override
    public int precio() {
        return 24;
    }
    
}
