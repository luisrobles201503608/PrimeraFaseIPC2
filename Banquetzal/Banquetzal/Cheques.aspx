<%@ Page Title="" Language="C#" MasterPageFile="~/Master1.Master" AutoEventWireup="true" CodeBehind="Cheques.aspx.cs" Inherits="Banquetzal.Cheques" %>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">

    <table style="width: 100%">
        <tr>
            <td colspan="3" style="height: 26px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                Cobrar Cheques</td>
        </tr>
        <tr>
            <td rowspan="7" style="width: 430px">&nbsp;</td>
            <td style="width: 127px">No Corelativo</td>
            <td>
                <asp:TextBox ID="TextBox1" runat="server" Width="183px"></asp:TextBox>
            </td>
        </tr>
        <tr>
            <td style="width: 127px">Nombre</td>
            <td>
                <asp:TextBox ID="TextBox2" runat="server" Width="183px"></asp:TextBox>
            </td>
        </tr>
        <tr>
            <td style="width: 127px">Monto</td>
            <td>
                <asp:TextBox ID="TextBox3" runat="server" Width="183px"></asp:TextBox>
            </td>
        </tr>
        <tr>
            <td style="width: 127px">Firma</td>
            <td>
                <asp:TextBox ID="TextBox4" runat="server" Width="183px"></asp:TextBox>
            </td>
        </tr>
        <tr>
            <td style="width: 127px">Cuenta a depositar</td>
            <td>
                <asp:TextBox ID="TextBox5" runat="server" Width="183px"></asp:TextBox>
            </td>
        </tr>
        <tr>
            <td style="width: 127px">Chequera</td>
            <td>
                <asp:TextBox ID="TextBox6" runat="server" Width="183px"></asp:TextBox>
            </td>
        </tr>
        <tr>
            <td style="width: 127px">&nbsp;</td>
            <td>
                <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Cobrar Cheque" />
            </td>
        </tr>
    </table>

</asp:Content>
