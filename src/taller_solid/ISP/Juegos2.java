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
public class Juegos2 implements Jugable,IProduct2{

    @Override
    public int retricccionEdad() {
        return 18;
    }

    @Override
    public String Plataforma() {
        return "PlayStation5";
    }

    @Override
    public int precio() {
        return 23;
    }
    
}
