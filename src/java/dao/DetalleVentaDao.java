/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexion.Conexion;
import Interfaz.IDetalleVenta;
import TransFerObject.DetalleVenta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MARTIN
 */
public class DetalleVentaDao implements IDetalleVenta{

    @Override
    public ArrayList<DetalleVenta> listaDetalleVenta() {
        ArrayList<DetalleVenta> listadev =new ArrayList<>();
        Conexion db=new Conexion();
        Connection cn=db.getConnection();
        String procedimientoAlm="{CALL sp_listaDetalleVenta}";
        if(cn!=null){
            try {
                CallableStatement cs=cn.prepareCall(procedimientoAlm);
                ResultSet rs=cs.executeQuery();
                while(rs.next()){
                    DetalleVenta Dev=new DetalleVenta();
                    Dev.setCantidad(rs.getInt("cantidad"));
                    Dev.setSubtotal(rs.getDouble("subtotal"));
                     listadev.add(Dev);
                }
                
            } catch (Exception e) {
                
            }finally{
                try {
                    cn.close();
                } catch (Exception e) {
                }
            }
        }
        return listadev;
    }

    @Override
    public boolean insertDetalle(DetalleVenta dev) {
        
        boolean inserta =false;
        return inserta;
        
    }

    @Override
    public boolean actualizarDetalee(DetalleVenta dev) {
        boolean update=false;
        return update;
        
    }

    @Override
    public boolean eliminarDetalle(int idVentaDetalle) {
        boolean eliminar=false;
        return eliminar;
        
    }
    
}
