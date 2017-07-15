/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author JLRobles
 */
public class NomiDAO {
    Conexion conexion;
    public NomiDAO(){
        conexion=new Conexion();
    }
    public String RegistrarCliente(String codigo, String Nombre, String Telefono, String Correo){
        String respuesta=null;
        Connection accesoDB = conexion.getConexion();
        
        try{
            PreparedStatement ps = accesoDB.prepareStatement("insert into clientenomi(codigoempresa,nombreempresa,telefono, correo) values (?,?,?,?)");
            ps.setString(1, codigo);
            ps.setString(2, Nombre);
            ps.setString(3, Telefono);
            ps.setString(4, Correo);
            
            int rs = ps.executeUpdate();
            
            if(rs>0){
                respuesta="Registro exitoso.";
            }
        }catch(Exception e){
            System.out.println("Registro no ingresado");
        }
        return  respuesta;
    }
    public String VerificarUsuario(String usuario, String contraseña){
        String respuesta=null;
        try{
            Connection accesodb=conexion.getConexion();
            PreparedStatement ps=accesodb.prepareStatement("SELECT * FROM clientenomi where correo=? and telefono=?");
            ps.setString(1, usuario);
            ps.setString(2,contraseña);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
               respuesta="datos correctos" ;
            }else{
                respuesta="datos no encontrados";
            }
        }catch(Exception ex){
            respuesta=ex.toString();
        }
        return respuesta;
    }
    public boolean cambiarContra(String contra,String usuario){
        boolean resp=false;
        Connection accesoDB = conexion.getConexion();
        
        try{
            PreparedStatement ps = accesoDB.prepareStatement("update clientenomi SET contraseña=? where usuario=?");
            ps.setString(1, contra);
            ps.setString(2, usuario);
            
            int rs = ps.executeUpdate();
            
            if(rs>0){
                resp=true;
            }
        }catch(Exception e){
            System.out.println("Registro no ingresado");
        }
        return resp;
    }
public String historial(int nocuenta,String descripcion,int monto,String fecha){
        String respuesta=null;
        Connection accesoDB = conexion.getConexion();
        
        try{
            PreparedStatement ps = accesoDB.prepareStatement("insert into estadohistorial(nocuenta,descripcion,monto,fecha) values (?,?,?,?)");
            ps.setInt(1, nocuenta);
            ps.setString(2,descripcion);
            ps.setInt(3,monto);
            ps.setString(4,fecha);
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
