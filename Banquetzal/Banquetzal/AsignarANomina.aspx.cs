using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Banquetzal
{
    public partial class AsignarANomina : System.Web.UI.Page
    {
        Referencia.WSGestionCIndividualClient refe = new Referencia.WSGestionCIndividualClient();
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            string r = refe.AsignarANomin(int.Parse(TextBox1.Text.Trim()), int.Parse(TextBox2.Text.Trim()), TextBox4.Text,int.Parse(TextBox3.Text));
            TextBox1.Text = "";
            TextBox2.Text = "";
            TextBox3.Text = "";
            TextBox4.Text = "";
            Label1.Text = r;
        }

        protected void TextBox4_TextChanged(object sender, EventArgs e)
        {

        }
    }
}