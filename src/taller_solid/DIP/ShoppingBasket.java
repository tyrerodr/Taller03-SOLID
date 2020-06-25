/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_solid.DIP;

/**
 *
 * @author Rafael
 */
public class ShoppingBasket {
//buena implementacion
    
private final Persistence persistence;
private final PaymentMethod paymentMethod;

public ShoppingBasket(Persistence persistence, PaymentMethod paymentMethod) {
this.persistence = persistence;
this.paymentMethod = paymentMethod;
}

public void buy(Shopping shopping) {
persistence.save(shopping);
paymentMethod.pay(shopping);
}
//Ahora gracias a la buena implementacion de DIP podemos probar nuestra clase 
//de forma aislada.
    
//Mala implementacion
    //public void buy(Shopping shopping) {

    //SqlDatabase db = new SqlDatabase();
    //db.save(shopping);

    //CreditCard creditCard = new CreditCard();
    //creditCard.pay(shopping);
    //}  
}
////Aquí estamos incumpliendo todas las reglas que impusimos al principio. 
//Una clase de más alto nivel, como es la cesta de la compra, está dependiendo
//de otras de alto nivel, como cuál es el mecanismo para almacenar la información 
//o para realizar el método de pago. Se encarga de crear instancias de esos objetos y después utilizarlas.