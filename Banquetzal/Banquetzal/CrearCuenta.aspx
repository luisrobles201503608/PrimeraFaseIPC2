<%@ Page Title="" Language="C#" MasterPageFile="~/Master1.Master" AutoEventWireup="true" CodeBehind="CrearCuenta.aspx.cs" Inherits="Banquetzal.CrearCuenta" %>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">

    <table style="width: 100%">
    <tr>
        <td colspan="3" style="height: 26px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; Crear Cuenta</td>
    </tr>
    <tr>
        <td style="width: 394px" rowspan="6">
            &nbsp;</td>
        <td style="width: 144px">No.Cuenta</td>
        <td>
            <asp:TextBox ID="TextBox1" runat="server" Width="264px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Saldo</td>
        <td>
            <asp:TextBox ID="TextBox2" runat="server" Width="264px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Actividad Cuenta</td>
        <td>
            <asp:TextBox ID="TextBox3" runat="server" Width="264px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Fecha</td>
        <td>
            <asp:TextBox ID="TextBox6" runat="server" Width="264px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Pertenece A...</td>
        <td>
            <asp:TextBox ID="TextBox4" runat="server" Width="264px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 144px">Tipo Cuenta</td>
        <td>
            <asp:TextBox ID="TextBox5" runat="server" Width="264px"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 394px">
            &nbsp;</td>
        <td style="width: 144px">
            <asp:Label ID="Label1" runat="server"></asp:Label>
        </td>
        <td>
            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Crear" />
        </td>
    </tr>
</table>
</asp:Content>
