using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Banquetzal
{
    public partial class Log2 : System.Web.UI.Page
    {
        Referencia.WSGestionCIndividualClient re = new Referencia.WSGestionCIndividualClient();
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click1(object sender, EventArgs e)
        {
            String resp=re.Login(TextBox1.Text,TextBox2.Text);
            if (resp.Equals("datos correctos"))
            {
                Response.Redirect("Inicio1.aspx");
            }
            else
            {
                TextBox1.Text = "";
                TextBox2.Text = "";
                Response.Redirect("CambioC1.aspx");
            }
        }
    }
}