<%@ Page Title="" Language="C#" MasterPageFile="~/Master2.Master" AutoEventWireup="true" CodeBehind="CrearTrabajador.aspx.cs" Inherits="Banquetzal.CrearTrabajadod" %>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <table style="width: 100%">
    <tr>
        <td colspan="3" style="height: 26px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; Crear Empleado</td>
    </tr>
    <tr>
        <td style="width: 394px" rowspan="10">
            &nbsp;</td>
        <td style="width: 144px; height: 31px;">CUI</td>
        <td style="height: 31px">
            <asp:TextBox ID="TextBox1" runat="server" Width="313px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px; height: 31px;">Nombre</td>
        <td style="height: 31px">
            <asp:TextBox ID="TextBox2" runat="server" Width="313px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Apellido</td>
        <td>
            <asp:TextBox ID="TextBox3" runat="server" Width="313px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Fecha de Nacimiento</td>
        <td>
            <asp:TextBox ID="TextBox4" runat="server" Width="313px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Telefono</td>
        <td>
            <asp:TextBox ID="TextBox5" runat="server" Width="313px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Correo</td>
        <td>
            <asp:TextBox ID="TextBox6" runat="server" Width="313px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Nombre de Usuario</td>
        <td>
            <asp:TextBox ID="TextBox7" runat="server" Width="313px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Contraseña</td>
        <td>
            <asp:TextBox ID="TextBox8" runat="server" Width="313px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Rol</td>
        <td>
            <asp:TextBox ID="TextBox9" runat="server" Width="313px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Agencia Donde Labora</td>
        <td>
            <asp:TextBox ID="TextBox10" runat="server" Width="313px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 394px">
            &nbsp;</td>
        <td style="width: 144px">
            <asp:Label ID="Label1" runat="server"></asp:Label>
        </td>
        <td>
            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Enviar" />
        </td>
    </tr>
</table>
</asp:Content>
