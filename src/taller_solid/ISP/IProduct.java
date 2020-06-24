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
public interface IProduct {
    public double precio();//El precio puede ser implementado por todas las clases que implementen producto
    public int restriccionEdad(); //Este metodo solo serviria para saber el rango de edad para el cual esta destinado un videojuego
    public int talla();//La talla seria unicamente valido para la clase zapato
    public String color();// El color al igual que la talla solo serviria para la clase zapato
    public String Plataforma();
    /*Todos las clases que implementen esta interfaz se veran en la obligacion de 
     implementar estos metodos 
    */
    
}
