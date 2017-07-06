/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author JLRobles
 */
public class ClienteNomi {
    String codigoE;
    String Nombre;
    String Telefono;
    String Correo;
    
    public ClienteNomi(){
        codigoE="";
        Nombre="";
        Telefono="";
        Correo="";
    }

    public String getCUI() {
        return codigoE;
    }

    public void setCUI(String CUI) {
        this.codigoE = CUI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
}