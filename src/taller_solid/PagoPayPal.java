/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_solid;

/**
 *
 * @author Bryan
 */
public class PagoPayPal extends Pago{
    private boolean loggedIn; //conexion a cuenta PagoPayPal

    @Override
    public void realizarCobro(double monto){ 
        if(!loggedIn)
            logIn();       
        //cargar el monto de compra al medio de pago
    }
    
    public void logIn(){
       loggedIn = true;
    }
}
