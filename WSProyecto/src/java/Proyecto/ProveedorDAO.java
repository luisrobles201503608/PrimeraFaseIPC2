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
public class ProveedorDAO {
    Conexion conexion;
    public ProveedorDAO(){
        conexion=new Conexion();
    }
    public String RegistrarCliente(String nombre ,String correo, int telefono){
        String respuesta=null;
        Connection accesoDB = conexion.getConexion();
        
        try{
            PreparedStatement ps = accesoDB.prepareStatement("insert into proveedores(Nombre,Telefono,Correo) values (?,?,?)");
            ps.setString(1, nombre);
            ps.setInt(2, telefono);
            ps.setString(3, correo);
            
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
