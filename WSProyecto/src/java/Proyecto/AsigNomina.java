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
public class AsigNomina {
    Conexion conexion;
    public AsigNomina(){
        conexion=new Conexion();
    }
    public String RegistrarEnNomina(int codigo, int sueldo, String cuentaemp, int cuentaempli){
        String respuesta=null;
        Connection accesoDB = conexion.getConexion();
        
        try{
            PreparedStatement ps = accesoDB.prepareStatement("insert into registronomina(idregistro,sueldoempleado,clientempresa,cuenta_nocuenta) values (?,?,?,?)");
            ps.setInt(1, codigo);
            ps.setInt(2, sueldo);
            ps.setString(3, cuentaemp);
            ps.setInt(4, cuentaempli);
            
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
