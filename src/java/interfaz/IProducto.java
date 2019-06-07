/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import TransFerObject.Producto;
import java.util.ArrayList;

/**
 *
 * @author MARTIN
 */
public interface IProducto {
    public abstract  ArrayList<Producto>listaproducto();
    public abstract  boolean  insertaProducto (Producto prod);
    public abstract  boolean  actualizarProducto (Producto prod);
    public abstract  boolean  eliminar (int  idProducto);

    
}
