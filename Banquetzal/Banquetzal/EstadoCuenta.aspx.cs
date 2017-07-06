using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Banquetzal
{
    public partial class EstadoCuenta : System.Web.UI.Page
    {
        Referencia.WSGestionCIndividualClient re = new Referencia.WSGestionCIndividualClient();
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            int a= re.EstadoCDeposito(int.Parse(TextBox1.Text));
            int b = re.EstadoCRetiro(int.Parse(TextBox1.Text));
            TextBox2.Text = b.ToString();
            TextBox3.Text = a.ToString();

        }
    }
}