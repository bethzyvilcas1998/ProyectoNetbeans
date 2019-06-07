/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexion.Conexion;
import Interfaz.IVenta;
import TransFerObject.Venta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MARTIN
 */
public class VentasDao  implements IVenta{

    @Override
    public ArrayList<Venta> listaVenta() {
        ArrayList<Venta>listaVenta=new ArrayList<>();
        Conexion  db= new Conexion();
        Connection cn=db.getConnection();
        String prode="{CALL sp_listaVenta}";
        if(cn!=null){
            try {
                CallableStatement cs=cn.prepareCall(prode);
                ResultSet rs=cs.executeQuery();
                while(rs.next()){
                    Venta ven= new Venta();
                    ven.setFecha(rs.getString("fecha"));
                    ven.setFecha(rs.getString("fecha"));
                    listaVenta.add(ven);
                    
                    
                }
            } catch (Exception e) {
                
            }finally{
                try {
                    cn.close();
                } catch (Exception e) {
                }
            }
        }
        return listaVenta;
    }

    @Override
    public boolean insertaVemnta(Venta ven) {
        boolean inserta=false;
        return inserta;
        
       }

    @Override
    public boolean actualizarVenta(Venta ven) {
        boolean actualizar=false;
        return actualizar;
        
       }

    @Override
    public boolean eliminarVenta(int idVentas) {
        boolean eliminar=false;
        return eliminar;
          }
    
    
}
