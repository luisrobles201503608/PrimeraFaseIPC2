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
public class Agencia {
    int codigoAgencia;
    String Direccion;
    String telefono;
    String horarioA;
    String horarioC;
    public Agencia(){
     codigoAgencia=0;
     Direccion="";
     telefono="";
     horarioA="";
     horarioC="";
    }

    public int getCodigoAgencia() {
        return codigoAgencia;
    }

    public void setCodigoAgencia(int codigoAgencia) {
        this.codigoAgencia = codigoAgencia;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHorarioA() {
        return horarioA;
    }

    public void setHorarioA(String horarioA) {
        this.horarioA = horarioA;
    }

    public String getHorarioC() {
        return horarioC;
    }

    public void setHorarioC(String horarioC) {
        this.horarioC = horarioC;
    }
}
