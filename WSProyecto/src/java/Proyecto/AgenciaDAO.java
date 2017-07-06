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
public class AgenciaDAO {
    Conexion conexion;
    public AgenciaDAO(){
        conexion=new Conexion();
    }
    public String RegistrarCliente(int codigo, String direccion, String Telefono, String haper,String hcier) {
        String respuesta=null;
        Connection accesoDB = conexion.getConexion();
        
        try{
            PreparedStatement ps = accesoDB.prepareStatement("insert into agencia(codigoagencia,direccion,telefono,horarioapertura,horariocierre ) values (?,?,?,?,?)");
            ps.setInt(1, codigo);
            ps.setString(2, direccion);
            ps.setString(3, Telefono);
            ps.setString(4, haper);
            ps.setString(5, hcier);
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
