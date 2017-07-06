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
public class Prestamo {
    Conexion conexion;
    public Prestamo(){
        conexion=new Conexion();
    }
    public String RegistrarCliente( int Nombre, int Apellido){
        String respuesta=null;
        Connection accesoDB = conexion.getConexion();
        
        try{
            PreparedStatement ps = accesoDB.prepareStatement("insert into prestamos(cantidadaprestar,cuenta_nocuenta) values (?,?)");
            ps.setInt(1, Nombre);
            ps.setInt(2, Apellido);
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
