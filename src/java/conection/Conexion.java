/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Computer
 */
public class Conexion {
    public Connection getConnection(){
        Connection cn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/ferrreteria","root","");
           
        } catch (SQLException e) {
           
        } catch (Exception e) {
           
        }
         return cn;
    }
}
