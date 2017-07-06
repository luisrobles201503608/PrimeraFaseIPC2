<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Log4.aspx.cs" Inherits="Banquetzal.Log4" %>
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
  <h1>&nbsp;Login Empresas</h1>
  <div class="inset">
  <p>
    &nbsp;Correo<asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
      </p>
  <p>
      Telefono<asp:TextBox ID="TextBox2" runat="server" TextMode="Password"></asp:TextBox>
      </p>
  </div>
  <p class="p-container">
    &nbsp;
      <asp:Button ID="Button1" runat="server" OnClick="Button1_Click1" Text="Ingresar" style="height: 26px" />
        <asp:LinkButton ID="LinkButton1" runat="server"  PostBackUrl="~/Log3.aspx">Log Personal</asp:LinkButton>
        <asp:LinkButton ID="LinkButton2" runat="server"  PostBackUrl="~/Log2.aspx"> Log Usuario</asp:LinkButton>
        </p>
    </form>
</body>
</html>
