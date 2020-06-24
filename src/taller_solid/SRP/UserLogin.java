/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_solid.SRP;

/**
 *
 * @author Rafael
 */
public class UserLogin { 
    private final DataBase db;
    UserLogin(DataBase db){
        this.db=db;
    }
    void login(String userName, String password){
        User user= db.findUserByUserName(userName);
        if(user==null){
            //no hace login
        }
        // permite hacer login
        
    }
    //void sendEmail(User user, String msg){
        // envia correo al usuario
    //}
    
} // Esta clase UserLogin tiene como responsaiblidad
//el proceso de login, pero ademas se le habia dado
//la responsabilidad de enviar correo electronico al user
// Por lo que se viola el principio de responsabilidad unica
//al hacer dos cosas con objetivos diferentes; de manera que para
//emeplear bien el principio se debe seperar la clase en dos
//una especifico para el login y otra para el envio de mensaje

