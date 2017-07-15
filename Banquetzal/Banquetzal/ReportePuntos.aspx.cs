using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Banquetzal
{
    public partial class ReportePuntos : System.Web.UI.Page
    {
        Referencia.WSGestionCIndividualClient refe = new Referencia.WSGestionCIndividualClient();
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            refe.ReportePuntos(int.Parse(TextBox1.Text));
            System.Diagnostics.Process.Start("C:\\Users\\JLRobles\\Documents\\NetBeansProjects\\WSProyecto\\src\\java\\Proyecto\\report4.pdf");
        }
    }
}