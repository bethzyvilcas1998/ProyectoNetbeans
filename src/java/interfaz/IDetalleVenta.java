/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import TransFerObject.DetalleVenta;

import java.util.ArrayList;

/**
 *
 * @author MARTIN
 */
public interface IDetalleVenta {
    public  abstract ArrayList<DetalleVenta>listaDetalleVenta();
    public abstract boolean  insertDetalle (DetalleVenta dev);
    public abstract  boolean actualizarDetalee(DetalleVenta dev);
    public abstract boolean  eliminarDetalle(int idVentaDetalle);
}
