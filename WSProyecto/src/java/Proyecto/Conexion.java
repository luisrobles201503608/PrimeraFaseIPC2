/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;
import java.sql.*;

/**
 *
 * @author JLRobles
 */
public class Conexion {
    public Conexion() {
    }
  public Connection getConexion(){
        Connection con=null;
        try{
            /* Carga|Registra el driver JDBC */
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            /* Obtener la conexion */
	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdbanquetzal","root","123");
        }catch(SQLException ex){
            System.out.println("Error de conexion"); 
        }catch(Exception e){ 
           System.out.println("Error de conexion"); 
        }
        return con;
    }
}
