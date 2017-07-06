<%@ Page Title="" Language="C#" MasterPageFile="~/Master1.Master" AutoEventWireup="true" CodeBehind="CrearUsuario.aspx.cs" Inherits="Banquetzal.CrearUsuario" %>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
     <table style="width: 100%">
    <tr>
        <td colspan="3" style="height: 26px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; Crear Usuario&nbsp;</td>
    </tr>
    <tr>
        <td style="width: 394px" rowspan="8">
            &nbsp;</td>
        <td style="width: 144px; height: 31px;">CUI</td>
        <td style="height: 31px">
            <asp:TextBox ID="TextBox1" runat="server" Width="267px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px; height: 31px;">Nombre</td>
        <td style="height: 31px">
            <asp:TextBox ID="TextBox2" runat="server" Width="267px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Apellido</td>
        <td>
            <asp:TextBox ID="TextBox3" runat="server" Width="267px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Fecha de Nacimiento</td>
        <td>
            <asp:TextBox ID="TextBox4" runat="server" Width="267px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Telefono</td>
        <td>
            <asp:TextBox ID="TextBox5" runat="server" Width="267px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Correo</td>
        <td>
            <asp:TextBox ID="TextBox6" runat="server" Width="267px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Nombre de Usuario</td>
        <td>
            <asp:TextBox ID="TextBox7" runat="server" Width="267px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Contraseña</td>
        <td>
            <asp:TextBox ID="TextBox8" runat="server" Width="267px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 394px">
            <asp:Label ID="Label1" runat="server"></asp:Label>
        </td>
        <td style="width: 144px">&nbsp;</td>
        <td>
            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Enviar" />
        </td>
    </tr>
</table>
</asp:Content>
