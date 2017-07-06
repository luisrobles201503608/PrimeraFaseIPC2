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
public class TrabajadorDAO {
    Conexion conexion;
    public TrabajadorDAO(){
        conexion=new Conexion();
    }
    public String RegistraEmpleados(String CUI, String Nombre, String Apellido, String FechaNacimiento, String Telefono, String Correo, String Usuario, String Contraseña,int rol, int agencia){
        String respuesta=null;
        Connection accesoDB = conexion.getConexion();
        
        try{
            PreparedStatement ps = accesoDB.prepareStatement("insert into trabajadorbanco(cui,nombre, apellidos, fechanacimiento,telefono, correo,usuario,contraseña,roloperador_idrol,agencia_codigoagencia) values (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, CUI);
            ps.setString(2, Nombre);
            ps.setString(3, Apellido);
            ps.setString(4, FechaNacimiento);
            ps.setString(5, Telefono);
            ps.setString(6, Correo);
            ps.setString(7, Usuario);
            ps.setString(8, Contraseña);
            ps.setInt(9, rol);
            ps.setInt(10, agencia);
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
            PreparedStatement ps=accesodb.prepareStatement("SELECT * FROM trabajadorbanco where usuario=? and contraseña=?");
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
            PreparedStatement ps = accesoDB.prepareStatement("update trabajadorbanco SET contraseña=? where usuario=?");
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
}
