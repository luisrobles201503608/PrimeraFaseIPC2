using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Banquetzal
{
    public partial class Depositos : System.Web.UI.Page
    {
        Referencia.WSGestionCIndividualClient refe = new Referencia.WSGestionCIndividualClient();
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            string r = refe.Depositar(TextBox1.Text, int.Parse(TextBox2.Text.Trim()),TextBox3.Text);
            TextBox1.Text = "";
            TextBox2.Text = "";
            Label1.Text = r;
        }
    }
}