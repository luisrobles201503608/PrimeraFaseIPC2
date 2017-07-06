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
public class Retiro {
    
 Conexion conexion;
 int sal,total=0,total2=0,sal2;
 String tipo="";
    public Retiro(){
        conexion=new Conexion();
    }
    public String Retiro1(String nocuenta, int retiro){
        String respuesta=null;
        try{
            Connection accesodb=conexion.getConexion();
            PreparedStatement ps=accesodb.prepareStatement("select * from cuenta where nocuenta=?");
            ps.setInt(1, Integer.parseInt(nocuenta));
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
               tipo=rs.getString(3);
               sal=(rs.getInt(2));
               if(sal>retiro&&tipo.equalsIgnoreCase("activo")){
            total=sal-retiro;
            respuesta="Transaccion Realizada" ;
            }
            }else{
                respuesta="datos no encontrados";
            }
        }catch(Exception ex){
            respuesta=ex.toString();
        }
        return respuesta;
    }
    public String Retiro2(String cui, int retiro){
        String respuesta=null;    
        try{
            Connection accesodb=conexion.getConexion();
            if(tipo.equalsIgnoreCase("activo")){
                PreparedStatement pd = accesodb.prepareStatement("update cuenta SET saldo=? where nocuenta=?");
            pd.setInt(1, total);
            pd.setInt(2, Integer.parseInt(cui));
            int i= pd.executeUpdate();
            if(i>0){
               respuesta="Retiro Realizado" ;
            }else{
                respuesta="datos no encontrados";
            }
            } else{
                respuesta="Transaccion no posible";
            }
            }catch(Exception ex){
                
            }
            return respuesta;
            }
    public String Estado1(String nocuenta,int retiro){
        String respuesta=null;
        try{
            Connection accesodb=conexion.getConexion();
            PreparedStatement ps=accesodb.prepareStatement("select * from estadocuenta where cuenta_nocuenta=?");
            ps.setInt(1, Integer.parseInt(nocuenta));
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
               sal2=(rs.getInt(6));
            total2=sal2+retiro;
            respuesta="Transaccion Realizada" ;
            }else{
                respuesta="datos no encontrados";
            }
        }catch(Exception ex){
            respuesta=ex.toString();
        }
        return respuesta;
    }
    public String Estado2(String cui, int retiro){
        String respuesta=null;    
        try{
            Connection accesodb=conexion.getConexion();
                PreparedStatement pd = accesodb.prepareStatement("update estadocuenta SET Retiro=? where cuenta_nocuenta=?");
            pd.setInt(1, total2);
            pd.setInt(2, Integer.parseInt(cui));
            int i= pd.executeUpdate();
            if(i>0){
               respuesta="Accion Realizada" ;
            }else{
                respuesta="datos no encontrados";
            }
            }catch(Exception ex){
                
            }
            return respuesta;
            }
            
}
        
