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
public class Cheque {
     Conexion conexion;
     int sal,total=0,total2=0,sal2;
  String tipo="";
    public Cheque(){
        conexion=new Conexion();
    }
    public String RegistrarChe(int codigo,String nombre,int monto,String firma,String chequera ,int nocuenta){
        String respuesta=null;
        Connection accesoDB = conexion.getConexion();
        
        try{
            PreparedStatement ps = accesoDB.prepareStatement("insert into cheque(correlativo,nombre,monto,firmadigital,cuenta_nocuenta,chequera_identificador) values (?,?,?,?,?,?)");
            ps.setInt(1, codigo);
            ps.setString(2,nombre);
            ps.setInt(3,monto);
            ps.setString(4,firma);
            ps.setInt(5, nocuenta);
            ps.setString(6, chequera);
            int rs = ps.executeUpdate();
            
            if(rs>0){
                respuesta="Registro exitoso.";
            }
        }catch(Exception e){
            System.out.println("Registro no ingresado");
        }
        return  respuesta;
}
    public String Deposito1(int nocuenta, int retiro){
        String respuesta=null;
        try{
            Connection accesodb=conexion.getConexion();
            PreparedStatement ps=accesodb.prepareStatement("select * from cuenta where nocuenta=?");
            ps.setInt(1, nocuenta);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
               tipo=rs.getString(3);
               sal=(rs.getInt(2));
               if(sal>retiro&&tipo.equalsIgnoreCase("activo")){
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
    public String Deposito2(int cui, int retiro){
        String respuesta=null;    
        try{
            Connection accesodb=conexion.getConexion();
            if(tipo.equalsIgnoreCase("activo")){
                PreparedStatement pd = accesodb.prepareStatement("update cuenta SET saldo=? where nocuenta=?");
            pd.setInt(1, total);
            pd.setInt(2, cui);
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
    public String Estado1(int nocuenta,int retiro){
        String respuesta=null;
        try{
            Connection accesodb=conexion.getConexion();
            PreparedStatement ps=accesodb.prepareStatement("select * from estadocuenta where cuenta_nocuenta=?");
            ps.setInt(1, nocuenta);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
               sal2=(rs.getInt(7));
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
    public String Estado2(int cui, int retiro){
        String respuesta=null;    
        try{
            Connection accesodb=conexion.getConexion();
                PreparedStatement pd = accesodb.prepareStatement("update estadocuenta SET Deposito=? where cuenta_nocuenta=?");
            pd.setInt(1, total2);
            pd.setInt(2, cui);
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
