﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Banquetzal
{
    public partial class CrearChequera : System.Web.UI.Page
    {
        Referencia.WSGestionCIndividualClient refe = new Referencia.WSGestionCIndividualClient();
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            refe.CrearChequera(TextBox1.Text,int.Parse(TextBox2.Text));
        }
    }
}