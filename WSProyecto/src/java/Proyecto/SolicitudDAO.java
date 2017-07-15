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
public class SolicitudDAO {
     Conexion conexion;
    public SolicitudDAO(){
        conexion=new Conexion();
    }
    public String RegistrarCliente(String premio ,String proveedor){
        String respuesta=null;
        Connection accesoDB = conexion.getConexion();
        
        try{
            PreparedStatement ps = accesoDB.prepareStatement("insert into solicitudproveedores(premios_nombre,proveedores_nombre) values (?,?)");
            ps.setString(1, premio);
            ps.setString(2, proveedor);
            
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
