/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author JLRobles
 */
@WebService(serviceName = "WSGestion")
public class WSGestionCIndividual {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RegistrarUsuarioIndi")
    public String RegistrarUsuarioIndi(@WebParam(name = "CUI") String CUI, @WebParam(name = "Nombre") String Nombre, @WebParam(name = "Apellido") String Apellido, @WebParam(name = "FechaNac") String FechaNac, @WebParam(name = "Telefono") String Telefono, @WebParam(name = "Correo") String Correo, @WebParam(name = "Usuario") String Usuario, @WebParam(name = "Contrase\u00f1a") String Contraseña) {
        IndiDAO in=new IndiDAO();
        String respuesta = in.RegistrarCliente(CUI, Nombre, Apellido, FechaNac, Telefono, Correo, Usuario, Contraseña);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public String Login(@WebParam(name = "Usuario") String Usuario, @WebParam(name = "Contrase\u00f1a") String Contraseña) {
        //TODO write your implementation code here:
        IndiDAO in=new IndiDAO();
        String respuesta=in.VerificarUsuario(Usuario, Contraseña);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "InsertarEmpresa")
    public String InsertarEmpresa(@WebParam(name = "CodigoEmpresa") String CodigoEmpresa, @WebParam(name = "Nombre") String Nombre, @WebParam(name = "Telefono") String Telefono, @WebParam(name = "Correo") String Correo) {
        //TODO write your implementation code here:
        NomiDAO n=new NomiDAO();
        String respuesta=n.RegistrarCliente(CodigoEmpresa, Nombre, Telefono, Correo);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "LogEmpresa")
    public String LogEmpresa(@WebParam(name = "Correo") String Correo, @WebParam(name = "Telefono") String Telefono) {
        NomiDAO n=new NomiDAO();
      String respuesta=  n.VerificarUsuario(Correo, Telefono);

        return respuesta;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "RegistrarTrabajador")
    public String RegistrarTrabajador(@WebParam(name = "CUI") String CUI, @WebParam(name = "Nombre") String Nombre, @WebParam(name = "Apellido") String Apellido, @WebParam(name = "FechaNac") String FechaNac, @WebParam(name = "Telefono") String Telefono, @WebParam(name = "Correo") String Correo, @WebParam(name = "Usuario") String Usuario, @WebParam(name = "Contrase\u00f1a") String Contraseña,@WebParam(name = "Rol") int Rol,@WebParam(name = "Agencia") int Agencia) {
        TrabajadorDAO in=new TrabajadorDAO();
        String respuesta = in.RegistraEmpleados(CUI, Nombre, Apellido, FechaNac, Telefono, Correo, Usuario, Contraseña, Rol, Agencia);
        return respuesta;
    }
    @WebMethod(operationName = "LogEmpleado")
    public String LogEmpleado(@WebParam(name = "Usuario") String Usuario, @WebParam(name = "Contra") String Contra) {
        TrabajadorDAO n=new TrabajadorDAO();
      String respuesta=  n.VerificarUsuario(Usuario, Contra);

        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "InsertarAgencia")
    public String InsertarAgencia(@WebParam(name = "Codigo") int Codigo, @WebParam(name = "Direccion") String Direccion, @WebParam(name = "Telefono") String Telefono, @WebParam(name = "HApertura") String HApertura, @WebParam(name = "HCierre") String HCierre) {
        //TODO write your implementation code here:
        AgenciaDAO ag=new AgenciaDAO();
        String res=ag.RegistrarCliente(Codigo, Direccion, Telefono, HCierre, HCierre);
        return res;
    }
     /**
     * Web service operation
     */
    @WebMethod(operationName = "AsignarANomin")
    public String AsignarANomin(@WebParam(name = "CodigoNomina") int ID, @WebParam(name = "Salario") int salario, @WebParam(name = "CuentaEmpleado") String Cuenta, @WebParam(name = "CodigoEmpresa") int empresa) {
        //TODO write your implementation code here:
        AsigNomina n=new AsigNomina();
        String respuesta=n.RegistrarEnNomina(ID, salario, Cuenta, empresa);
        return respuesta;
    }
     /**
     * Web service operation
     */
    @WebMethod(operationName = "CrearCuenta")
    public String CrearCuenta(@WebParam(name = "NOCuenta") int ID, @WebParam(name = "Saldo") int saldo, @WebParam(name = "Estado") String estado, @WebParam(name = "Fecha") String Fecha, @WebParam(name = "ClienteID") String CUI, @WebParam(name = "TipoC") int TipoC) {
        //TODO write your implementation code here:
        CuendaDAO n=new CuendaDAO();
        String respuesta=n.RegistrarCliente(ID, saldo, estado, CUI, TipoC);
        n.EstadoDeCuenta(ID);
        n.historial(ID, "crear cuenta", saldo,Fecha);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Retirar")
    public String Retirar(@WebParam(name = "Cui") String Cui, @WebParam(name = "retiro") int retiro, @WebParam(name = "Fecha") String Fecha) {
        //TODO write your implementation code here:
        Retiro r=new Retiro();
        String respuesta=r.Retiro1(Cui, retiro);
        r.historial(Integer.parseInt(Cui), "retiro", retiro,Fecha);
        r.Retiro2(Cui, retiro);
        r.Estado1(Cui, retiro);
        r.Estado2(Cui, retiro);
        return respuesta;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "Depositar")
    public String Depositar(@WebParam(name = "Cui") String Cui, @WebParam(name = "retiro") int retiro, @WebParam(name = "Fecha") String Fecha) {
        //TODO write your implementation code here:
        Deposito de=new Deposito();
        de.Retiro1(Cui, retiro);
        String respuesta=de.Retiro2(Cui, retiro);
        de.Estado1(Cui, retiro);
        de.Estado2(Cui, retiro);
        de.Puntos1(Cui, retiro);
        de.Puntos2(Cui, retiro);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Prestamo")
    public String Prestamo( @WebParam(name = "Cantidad") int Cantidad, @WebParam(name = "noCuenta") int noCuenta, @WebParam(name = "Estado") String Estado, @WebParam(name = "Fecha") String Fecha) {
        //TODO write your implementation code here:
        Prestamo r=new Prestamo();
        String respuesta=r.RegistrarCliente(Cantidad, noCuenta,"Pendiente");
        r.historial(noCuenta, "Prestamo", Cantidad, Fecha);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CambiarContraIndi")
    public boolean CambiarContraIndi(@WebParam(name = "Usuario") String Usuario, @WebParam(name = "Contrase\u00f1a") String Contraseña) {
        //TODO write your implementation code here:
        IndiDAO r=new IndiDAO();
        boolean re=r.cambiarContra(Contraseña, Usuario);
        return re;
    }
     /**
     * Web service operation
     */
    @WebMethod(operationName = "CambiarContraNomi")
    public boolean CambiarContraNomi(@WebParam(name = "Usuario") String Usuario, @WebParam(name = "Contrase\u00f1a") String Contraseña) {
        //TODO write your implementation code here:
        NomiDAO r=new NomiDAO();
        boolean re=r.cambiarContra(Contraseña, Usuario);
        return re;
    }
     /**
     * Web service operation
     */
    @WebMethod(operationName = "CambiarContraEmp")
    public boolean CambiarContraEmp(@WebParam(name = "Usuario") String Usuario, @WebParam(name = "Contrase\u00f1a") String Contraseña) {
        //TODO write your implementation code here:
        TrabajadorDAO r=new TrabajadorDAO();
        boolean re=r.cambiarContra(Contraseña, Usuario);
        return re;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CrearChequera")
    public String CrearChequera(@WebParam(name = "Correlativo") String Correlativo, @WebParam(name = "noCuenta") int noCuenta,@WebParam(name = "Fecha") String Fecha) {
        Chequera c=new Chequera();
        String resp=c.RegistrarChe(Correlativo, noCuenta);
        c.historial(noCuenta, "Crear Chequera", 0, Fecha);
        return resp;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Cheque")
    public String Cheque(@WebParam(name = "Correlativo") int Correlativo, @WebParam(name = "nombre") String nombre, @WebParam(name = "monto") int monto, @WebParam(name = "firma") String firma, @WebParam(name = "noCuenta") int noCuenta, @WebParam(name = "Chequera") String Chequera, @WebParam(name = "Fecha") String Fecha) {
        Cheque c =new Cheque();
        c.RegistrarChe(Correlativo, nombre, monto, firma, Chequera, noCuenta);
        c.Deposito1(noCuenta, monto);
        c.Deposito2(noCuenta, monto);
        c.Estado1(noCuenta, monto);
        c.historial(noCuenta, "Cobro Cheque", monto, Fecha);
        String resp=c.Estado2(noCuenta, monto);
        return resp;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "EstadoCRetiro")
    public int EstadoCRetiro(@WebParam(name = "noCuenta") int noCuenta) {
        //TODO write your implementation code here:
        EstadoCuenta c=new EstadoCuenta();
        int s=c.CuentaRetiros(noCuenta);
        return s;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "EstadoCDeposito")
    public int EstadoCDeposito(@WebParam(name = "noCuenta") int noCuenta) {
        //TODO write your implementation code here:
        EstadoCuenta c=new EstadoCuenta();
        int s=c.CuentaDepositos(noCuenta);
        return s;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RegistrarProveedor")
    public String RegistrarProveedor(@WebParam(name = "nombre") String nombre, @WebParam(name = "telefono") int telefono, @WebParam(name = "correo") String correo) {
        ProveedorDAO n= new ProveedorDAO();
        String resp=n.RegistrarCliente(nombre, correo, telefono);
        return resp;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RegistrarPremio")
    public String RegistrarPremio(@WebParam(name = "Nombre") String Nombre, @WebParam(name = "Valor") int Valor, @WebParam(name = "existencia") int existencia) {
        PremiosDAO n= new PremiosDAO();
        String resp=n.RegistrarCliente(Nombre, Valor, existencia);
        return resp;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "SolicitudProveedores")
    public String SolicitudProveedores(@WebParam(name = "premio") String premio, @WebParam(name = "proveedor") String proveedor) {
        //TODO write your implementation code here:
        SolicitudDAO n= new SolicitudDAO();
        String resp=n.RegistrarCliente(premio, proveedor);
        return resp;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DepositoTerceros")
    public String DepositoTerceros(@WebParam(name = "NoCuenta") String NoCuenta, @WebParam(name = "NoCuentaDepositante") String NoCuentaDepositante, @WebParam(name = "Monto") int Monto) {
        DepositoTercer dep= new DepositoTercer();
        dep.Retiro1(NoCuenta, Monto);
        dep.Retiro2(NoCuenta, Monto);
        dep.deposito1(NoCuentaDepositante, Monto);
        String respuesta=dep.deposito2(NoCuentaDepositante, Monto);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ReportePuntos")
    public String ReportePuntos(@WebParam(name = "noCuenta") int noCuenta) {
        //TODO write your implementation code here:
        ReportePuntos re=new ReportePuntos();
        String res=re.RegistrarChe(noCuenta);
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ObtenerPremios")
    public String[] ObtenerPremios() {
        PremiosDAO p= new PremiosDAO();
        String [] resp = p.AlmacenamientoPremios();
        return resp;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ComprarProducto")
    public String ComprarProducto(@WebParam(name = "noCuenta") String noCuenta,@WebParam(name = "Premio") String Premio) {
        PremiosDAO p= new PremiosDAO();
        String  resp = p.Comprar(noCuenta, Premio);
        return resp;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ObtenerPremios")
    public String[] ObtenerPrestamos() {
        Prestamo p= new Prestamo();
        String [] resp = p.AlmacenamientoPrestamos();
        return resp;
    }
}
