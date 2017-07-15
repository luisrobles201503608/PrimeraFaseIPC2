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
public class DepositoTercer {
    Conexion conexion;
 int sal,total=0,total2=0,tipo2=0,sal2;
 String tipo="";
    public DepositoTercer(){
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
               if(sal>retiro&&tipo.equalsIgnoreCase("activo")&&tipo2!=3){
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
            if(tipo2!=3){
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
            }catch(Exception ex){
                
            }
            return respuesta;
            }
    public String deposito1(String nocuenta, int retiro){
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
    public String deposito2(String cui, int retiro){
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
