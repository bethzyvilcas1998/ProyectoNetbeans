/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransFerObject;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author MARTIN
 */
public class Venta {
   private int idVentas;
   private double total;
   private String  fecha;
   
   private List<DetalleVenta>listaDetalle;

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<DetalleVenta> getListaDetalle() {
        return listaDetalle;
    }

    public void setListaDetalle(List<DetalleVenta> listaDetalle) {
        this.listaDetalle = listaDetalle;
    }
   
    
}
