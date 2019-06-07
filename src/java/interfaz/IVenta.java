/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import TransFerObject.Venta;
import java.util.ArrayList;

/**
 *
 * @author MARTIN
 */
public interface IVenta {
    public abstract ArrayList<Venta>listaVenta();
    public abstract boolean insertaVemnta(Venta ven);
    public abstract boolean actualizarVenta(Venta ven);
    public abstract boolean  eliminarVenta( int idVentas);
    
}
