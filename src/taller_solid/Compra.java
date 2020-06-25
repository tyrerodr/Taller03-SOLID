/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_solid;

import java.util.List;

/**
 *
 * @author Bryan
 */
public class Compra {
    private IPagos _pago;
    private Pago Pago;
    private PagoPayPal pagoPayPal;
    private List articulos;
    
    public Compra(IPagos pagos){
        this._pago=pagos;
    }
    public void agregarArticulo(Articulo articulo){
        //agregar un articulo a la compra
    }
    public void removerArticulo(Articulo articulo){
        //remover un articulo a la compra
    }
}
