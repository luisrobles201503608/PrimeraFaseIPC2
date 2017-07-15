using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Banquetzal
{
    public partial class CanjearPremios : System.Web.UI.Page
    {
        Referencia.WSGestionCIndividualClient refe = new Referencia.WSGestionCIndividualClient();
        protected void Page_Load(object sender, EventArgs e)
        {
            string[] d = refe.ObtenerPremios();
            TableRow tR = new TableRow();
            Table1.Rows.Add(tR);
            TableCell tc = new TableCell();
            tR.Cells.Add(tc);
            tc.Text = "Premios";
            
            for (int i=0;i<d.Length;i++)
            {
                TableRow tr2 = new TableRow();
                Table1.Rows.Add(tr2);
                TableCell tc2 = new TableCell();
                tc2.Text = d[i];
                tr2.Cells.Add(tc2);
            }
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            refe.ComprarProducto(TextBox1.Text,TextBox2.Text);
        }
    }
}