/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JLRobles
 */
public class PremiosDAO {
     Conexion conexion;
     int puntos=0;
    public PremiosDAO(){
        conexion=new Conexion();
    }
    public String RegistrarCliente(String nombre , int valor,int existencia){
        String respuesta=null;
        Connection accesoDB = conexion.getConexion();
try{
            PreparedStatement ps = accesoDB.prepareStatement("insert into premios(nombre,valor,existencia) values (?,?,?)");
            ps.setString(1, nombre);
            ps.setInt(2, valor);
            ps.setInt(3, existencia);
            
            int rs = ps.executeUpdate();
            
            if(rs>0){
                respuesta="Registro exitoso.";
            }
        }catch(Exception e){
            System.out.println("Registro no ingresado");
        }
        return  respuesta;
}
    public String [] AlmacenamientoPremios(){
        String [] respuesta=null; 
        Connection accesoDB = conexion.getConexion();
        try {
        String cnn="select count(idprestamo) from prestamos";
        Statement stmnt2=accesoDB.createStatement();
        ResultSet rss=stmnt2.executeQuery(cnn);
        if(rss.next()){
            int r=Integer.parseInt(rss.getString(1));
        respuesta=new String[r];
        
            String Cn= "select * from prestamos";
            Statement stmnt= accesoDB.createStatement();
            ResultSet rs=stmnt.executeQuery(Cn);
            
            int i=0;
            while(rs.next()){
                respuesta[i]=rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4);
                i++;
            }
        }
        }catch(Exception e){
            System.out.println("Registro no encontrado");
        }
        
        return respuesta;
    }
    public String Comprar(String nocuenta, String Premio){
        String respuesta=null;
        try{
            Connection accesodb=conexion.getConexion();
            PreparedStatement ps=accesodb.prepareStatement("SELECT * FROM estadocuenta where nombreestado=?");
            ps.setInt(1, Integer.parseInt(nocuenta));
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
            puntos=rs.getInt("puntosacumulados");
            PreparedStatement ps2=accesodb.prepareStatement("SELECT * FROM premios where nombre=?");
            ps2.setString(1, Premio);
            ResultSet rs2=ps2.executeQuery();
            
            if(rs2.next()&&rs2.getInt(2)<=puntos){
                int existencia=rs2.getInt(3);
                PreparedStatement ps3=accesodb.prepareStatement("update premios SET existencia=? where nombre=?");
                existencia=existencia-1;
                ps3.setInt(1, existencia);
                ps3.setString(2, Premio);
                int rs3=ps3.executeUpdate();
               if(rs3>0){
                respuesta="Se ha Comprado el producto";
                }
            }
               respuesta="Se compro ya el Producto" ;
            }else{
                respuesta="datos no encontrados";
            }
        }catch(Exception e){
            respuesta= e.toString();
        }
        return respuesta;
    }
}