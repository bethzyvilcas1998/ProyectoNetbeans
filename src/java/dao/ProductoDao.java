/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexion.Conexion;
import Interfaz.IProducto;
import TransFerObject.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MARTIN
 */
public class ProductoDao implements IProducto{

    @Override
    public ArrayList<Producto> listaproducto() {
        ArrayList<Producto>listaProductos= new ArrayList<>();
        Conexion db=new  Conexion();
        Connection cn=db.getConnection();
        String prode="{CALL sp_listaProducto}";
        if(cn!=null){
            try {
                CallableStatement cs=cn.prepareCall(prode);
                ResultSet rs=cs.executeQuery();
                while(rs.next()){
                    Producto prod=new Producto();
                    prod.setMarca(rs.getString("marca"));
                    prod.setNombre(rs.getString("nombre"));
                    prod.setPrecio(rs.getDouble("precio"));
                    prod.setStock(rs.getInt("stock"));
                    listaProductos.add(prod);
                }
            } catch (Exception e) {
                
            }finally{
                try {
                    cn.close();
                } catch (Exception e) {
                }
        }
        }
        return listaProductos;
        
    }

    @Override
    public boolean insertaProducto(Producto prod) {
        boolean inserta=false;
        return inserta;
        
    }

    @Override
    public boolean actualizarProducto(Producto prod) {
        boolean update=false;
        return update;
        
    }

    @Override
    public boolean eliminar(int idProducto) {
        boolean eliminar=false;
        return eliminar;
    }
    
}
