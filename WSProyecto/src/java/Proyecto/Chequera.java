/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author JLRobles
 */
public class Chequera {
    Conexion conexion;
    public Chequera(){
        conexion=new Conexion();
    }
    public String RegistrarChe(String codigo, int nocuenta){
        String respuesta=null;
        Connection accesoDB = conexion.getConexion();
        
        try{
            PreparedStatement ps = accesoDB.prepareStatement("insert into chequera(identificador,cuenta_nocuenta) values (?,?)");
            ps.setString(1, codigo);
            ps.setInt(2, nocuenta);
            
            int rs = ps.executeUpdate();
            
            if(rs>0){
                respuesta="Registro exitoso.";
            }
        }catch(Exception e){
            System.out.println("Registro no ingresado");
        }
        return  respuesta;
}
}