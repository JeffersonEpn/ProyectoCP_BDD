/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionSQL {
    
    Connection conectar = null;
    
    public Connection conexion(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://LAPTOP-NSU32VJA\\JEFFERSON2014:1433;databaseName=Proyecto;user=sa;password=ipa199519";
            conectar = DriverManager.getConnection(connectionURL);
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
        return conectar;
    }
}
