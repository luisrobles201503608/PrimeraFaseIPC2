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
public class Cuenta {
    int nocuenta;
    int saldo;
    String Estado;
    String cui;
    int tipoc;
    public Cuenta(){
        nocuenta=0;
        saldo=0;
        Estado="";
        cui="";
        tipoc=0;
    }

    public int getNocuenta() {
        return nocuenta;
    }

    public void setNocuenta(int nocuenta) {
        this.nocuenta = nocuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public int getTipoc() {
        return tipoc;
    }

    public void setTipoc(int tipoc) {
        this.tipoc = tipoc;
    }
    
}
