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
public class Trabajador {
    String CUI;
    String Nombre;
    String Apellido;
    String FechaNacimiento;
    String Telefono;
    String Correo;
    String Usuario;
    String Contraseña;
    int noagencia;
    int norol;
    
    public Trabajador(){
        CUI="";
        Nombre="";
        Apellido="";
        FechaNacimiento="";
        Telefono="";
        Correo="";
        Usuario="";
        Contraseña="";
        noagencia=0;
        norol=0;
    }

    public int getNoagencia() {
        return noagencia;
    }

    public void setNoagencia(int noagencia) {
        this.noagencia = noagencia;
    }

    public int getNorol() {
        return norol;
    }

    public void setNorol(int norol) {
        this.norol = norol;
    }

    public String getCUI() {
        return CUI;
    }

    public void setCUI(String CUI) {
        this.CUI = CUI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
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

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }


}
