/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author JLRobles
 */
public class Prestamo {
    Conexion conexion;
    public Prestamo(){
        conexion=new Conexion();
    }
    public String RegistrarCliente( int Nombre, int Apellido,String Estado){
        String respuesta=null;
        Connection accesoDB = conexion.getConexion();
        
        try{
            PreparedStatement ps = accesoDB.prepareStatement("insert into prestamos(cantidadaprestar,Estado,cuenta_nocuenta) values (?,?,?)");
            ps.setInt(1, Nombre);
            ps.setString(2, Estado);
            ps.setInt(3, Apellido);
            int rs = ps.executeUpdate();
            if(rs>0){
                respuesta="Registro exitoso.";
            }
        }catch(Exception e){
            System.out.println("Registro no ingresado");
        }
        return  respuesta;
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
    public String [] AlmacenamientoPrestamos(){
        String [] respuesta=null; 
        Connection accesoDB = conexion.getConexion();
        try {
        String cnn="select count(nombre) from premios";
        Statement stmnt2=accesoDB.createStatement();
        ResultSet rss=stmnt2.executeQuery(cnn);
        if(rss.next()){
            int r=Integer.parseInt(rss.getString(1));
        respuesta=new String[r];
        
            String Cn= "select * from premios";
            Statement stmnt= accesoDB.createStatement();
            ResultSet rs=stmnt.executeQuery(Cn);
            
            int i=0;
            while(rs.next()){
                respuesta[i]=rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3);
                i++;
            }
        }
        }catch(Exception e){
            System.out.println("Registro no encontrado");
        }
        
        return respuesta;
    }
}
