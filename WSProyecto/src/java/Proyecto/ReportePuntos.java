/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author JLRobles
 */
public class ReportePuntos {
     Conexion conexion;
     String respuesta="Logrado";
    public ReportePuntos(){
        conexion=new Conexion();
    }
    public String RegistrarChe(int nocuenta){
        try{
        
        Connection accesoDB = conexion.getConexion();
        Map parametro=new HashMap();
        parametro.put("parameter1", nocuenta);
        JasperReport jr=null;
        String r="C:\\Users\\JLRobles\\Documents\\NetBeansProjects\\WSProyecto\\src\\java\\Proyecto\\report4.jasper";
        jr=(JasperReport)JRLoader.loadObjectFromFile(r);
        JasperPrint jp;
        jp= JasperFillManager.fillReport(jr, parametro,conexion.getConexion());
        JasperRunManager.runReportToPdf(r, parametro, conexion.getConexion());
    } catch(Exception ex){
        
    }
        return respuesta;
}
}