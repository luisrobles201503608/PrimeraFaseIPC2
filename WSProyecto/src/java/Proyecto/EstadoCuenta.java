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
public class EstadoCuenta {
    
 Conexion conexion;
 int sal,total=0,total2=0,sal2;
 String tipo="";
    public EstadoCuenta(){
        conexion=new Conexion();
    }
    public int CuentaRetiros(int nocuenta){
        int respuesta=0;
        try{
            Connection accesodb=conexion.getConexion();
            PreparedStatement ps=accesodb.prepareStatement("select * from estadocuenta where cuenta_nocuenta=?");
            ps.setInt(1, nocuenta);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
               sal=(rs.getInt(6));
              respuesta=sal;
            }
            
        }catch(Exception ex){
            
        }
        return respuesta;
    }
    public int CuentaDepositos(int nocuenta){
        int respuesta=0;
        try{
            Connection accesodb=conexion.getConexion();
            PreparedStatement ps=accesodb.prepareStatement("select * from estadocuenta where cuenta_nocuenta=?");
            ps.setInt(1,nocuenta);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
               sal=(rs.getInt(7));
              respuesta=sal;
            }
            
        }catch(Exception ex){
            
        }
        return respuesta;
    }
}
