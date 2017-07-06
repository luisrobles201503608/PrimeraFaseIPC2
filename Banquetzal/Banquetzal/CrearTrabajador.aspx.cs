using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Banquetzal
{
    public partial class CrearTrabajadod : System.Web.UI.Page
    {
        Referencia.WSGestionCIndividualClient refe = new Referencia.WSGestionCIndividualClient();
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            string r = refe.RegistrarTrabajador(TextBox1.Text, TextBox2.Text, TextBox3.Text, TextBox4.Text, TextBox5.Text, TextBox6.Text, TextBox7.Text, TextBox8.Text,int.Parse(TextBox9.Text.Trim()),int.Parse(TextBox10.Text.Trim()));
            TextBox1.Text = "";
            TextBox2.Text = "";
            TextBox3.Text = "";
            TextBox4.Text = "";
            TextBox5.Text = "";
            TextBox6.Text = "";
            TextBox7.Text = "";
            TextBox8.Text = "";
            TextBox9.Text = "";
            TextBox10.Text = "";
            Label1.Text = r;

        }
    }
}