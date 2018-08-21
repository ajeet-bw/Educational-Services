/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

/**
 *
 * @author User
 */
import static java.awt.SystemColor.window;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

public class HtmlContent extends JFrame
{
    String str="Anmol";
public static void main(String args[])
{
	new HtmlContent().start();
}

void start()
{
	try
	{
	String html;
	html="<html><style>table #header,td {border: 1px solid black;} "
                + "table #bd, th, td {border: 1px solid black;}</style><head></head>";
	html+="<body bgcolor=white><center><h4>TAX Invoice</h4><hr></center>";
        html+="<table id=id1 cellpadding=\"2\" cellspacing=\"0\">"
                + "<tr id=header>"
                   + "<td  width=\"323\">"
                      + "<b>TIBRA TEXTILES</b><br>"
                      +"HOUSE NO. 333 GALI NO 2 KARIM NAGAR <br>MEERUT U.P.Mob No: 9997391833 State Code:09<br><hr>"
                      + "Sender Address <br>Name:<br>Address:<br>GSTIN/UIN:<br>PAN NO.<br>State Name:<br>Place of Supply:"
                   + "</td>"
                   + "<td width=\"312\">"
                       + "<table>"
                            +"<tr><td>Invoice No:<b>GST/1419</b></td><td>Date:<b>12-04-2018</b></td></tr>"
                            +"<tr><td>Delivery Note.</td><td>Mode/Terms and Payment</td></tr>"
                            +"<tr><td>Supplier's Ref.</td><td>Other Reference(S)</td></tr>"
                            +"<tr><td>Buyer's Order No.</td><td>Dated</td></tr>"
                            +"<tr><td>Despatch Document No.</td><td>Delivery Note Date</td></tr>"
                            +"<tr><td>Dispatched Through</td><td>Destination</td></tr>"
                            +"<tr><td>Terms of Delivery</td><td>None</td></tr>"
                            +"<tr><td>Other</td><td>For General</td></tr>"
                       + "</table>"
                   + "</td>"
                + "</tr></table>"
             + "<table  id=bd cellpadding=\"2\" cellspacing=\"0\">"
                +"<tr>"
                   + "<th width=\"40\">S.No.</th>"
                   + "<th width=\"250\">Description of Goods</th>"
                   + "<th width=\"60\">HSN/SAC</th>"
                   + "<th width=\"40\">GST</th>"
                   + "<th width=\"60\">Quantity</th>"
                   + "<th width=\"60\">Rate</th>"
                   + "<th  width=\"40\">Per</th>"
                   + "<th  width=\"80\">Amount</th>"
                + "</tr>";
                html+="<tr><td id=col valign=\"top\" cellpadding=\"0\" width=\"40\" height=\"100\"></td><td width=\"250\"></td><td width=\"60\"></td><td width=\"40\"></td><td width=\"60\"></td><td width=\"60\"></td><td  width=\"40\"></td><td  width=\"80\"></td></tr>";
                html+="<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>"
            + "</table>";
        html+="<table cellpadding=\"0\" cellspacing=\"0\"><tr><td colspan=\"7\" width=\"638\">afsadgh</td></tr><tr><td width=\"200\" rowspan=\"2\">hsn</td><td rowspan=\"2\">taxable value</td><td colspan=\"2\">central tax</td><td colspan=\"2\">state tax</td><td rowspan=\"2\">total tax</td></tr>"
                + "<tr><td>rate</td><td>amount</td><td>rate</td><td>amount</td></tr>"
                + "<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr><tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr></table>";
	html+="</body></html>";
	JEditorPane ed1=new JEditorPane("text/html",html);
	add(ed1);
	setVisible(true);
	setSize(1380,750);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
        //ed1.print();
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("Some problem has occured"+e.getMessage());
	}
}
}

