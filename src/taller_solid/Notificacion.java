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
public class Notificacion {
    private int tipoNotifiacion;
    public void notificar(Pago pago){
        if(tipoNotifiacion==1){
            //enviarEmail();
        }
        else{
            //enviarSMS();
        }
        
    }
}
