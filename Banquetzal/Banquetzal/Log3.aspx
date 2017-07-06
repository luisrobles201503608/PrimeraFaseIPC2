<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Log3.aspx.cs" Inherits="Banquetzal.Log3" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" /> 
    <title>
        LogIn
    </title>
    <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
<body>

    <form id="form1" runat="server">
  <h1>&nbsp;Login Empleados</h1>
  <div class="inset">
  <p>
    &nbsp;USUARIO<asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
      </p>
  <p>
      CONTRASEÑA<asp:TextBox ID="TextBox2" runat="server" TextMode="Password"></asp:TextBox>
      </p>
  </div>
  <p class="p-container">
    &nbsp;
      <asp:Button ID="Button1" runat="server" OnClick="Button1_Click1" Text="Ingresar" style="height: 26px" />
        <asp:LinkButton ID="LinkButton1" runat="server" PostBackUrl="~/Log2.aspx">Log Usuario</asp:LinkButton>
      <asp:LinkButton ID="LinkButton2" runat="server" PostBackUrl="~/Log4.aspx">Log Empresa</asp:LinkButton>
        </p>
    </form>
</body>
</html>
