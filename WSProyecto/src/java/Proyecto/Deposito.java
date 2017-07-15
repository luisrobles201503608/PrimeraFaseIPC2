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
public class Deposito {
 Conexion conexion;
 int sal,total=0,total2=0,tipo2=0,sal2,sal3,total3=0;
 String tipo="";
    public Deposito(){
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
               tipo2=rs.getInt(5);
               if(tipo.equalsIgnoreCase("activo")){
            total=sal+retiro;
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
            }
            catch(Exception ex){
                
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
    public String Puntos1(String nocuenta,int retiro){
        String respuesta=null;
        try{
            Connection accesodb=conexion.getConexion();
            PreparedStatement ps=accesodb.prepareStatement("select * from estadocuenta where cuenta_nocuenta=?");
            ps.setInt(1, Integer.parseInt(nocuenta));
            ResultSet rs=ps.executeQuery();
            if(rs.next()&&retiro>=500){
               sal3=(rs.getInt(5));
            total3=sal3+1000;
            respuesta="Transaccion Realizada" ;
            }else{
                respuesta="datos no obtenidos";
            }
        }catch(Exception ex){
            respuesta=ex.toString();
        }
        return respuesta;
    }
    public String Puntos2(String cui, int retiro){
        String respuesta=null;    
        try{
            Connection accesodb=conexion.getConexion();
                PreparedStatement pd = accesodb.prepareStatement("update estadocuenta SET puntosacumulados=? where cuenta_nocuenta=?");
            pd.setInt(1, total3);
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