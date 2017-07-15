using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Banquetzal
{
    public partial class DepositarAOCuentas : System.Web.UI.Page
    {
        Referencia.WSGestionCIndividualClient refe = new Referencia.WSGestionCIndividualClient();
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            refe.DepositoTerceros(TextBox1.Text,TextBox2.Text,int.Parse(TextBox3.Text));
        }

        protected void TextBox3_TextChanged(object sender, EventArgs e)
        {

        }
    }
}