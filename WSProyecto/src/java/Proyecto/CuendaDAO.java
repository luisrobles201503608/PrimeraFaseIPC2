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
public class CuendaDAO {
Conexion conexion;
    public CuendaDAO(){
        conexion=new Conexion();
    }
    public String RegistrarCliente(int codigo, int Saldo,String Estado ,String Cui, int tipoC){
        String respuesta=null;
        Connection accesoDB = conexion.getConexion();
        
        try{
            PreparedStatement ps = accesoDB.prepareStatement("insert into cuenta(nocuenta,saldo,estado,clienteindi_cui,tipocuenta_id) values (?,?,?,?,?)");
            ps.setInt(1, codigo);
            ps.setInt(2, Saldo);
            ps.setString(3, Estado);
            ps.setString(4, Cui);
            ps.setInt(5, tipoC);
            
            int rs = ps.executeUpdate();
            
            if(rs>0){
                respuesta="Registro exitoso.";
            }
        }catch(Exception e){
            System.out.println("Registro no ingresado");
        }
        return  respuesta;
}
    public String EstadoDeCuenta(int codigo){
        String respuesta=null;
        Connection accesoDB = conexion.getConexion();
        
        try{
            PreparedStatement ps = accesoDB.prepareStatement("insert into estadocuenta(nombreestado,prestamo,transacterceros,transacpersonal,puntosacumulados,Retiro,Deposito,cuenta_nocuenta) values (?,?,?,?,?,?,?,?)");
            ps.setInt(1,codigo);
            ps.setInt(2, 0);
            ps.setInt(3, 0);
            ps.setInt(4, 0);
            ps.setInt(5, 0);
            ps.setInt(6, 0);
            ps.setInt(7, 0);
            ps.setInt(8, codigo);

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
