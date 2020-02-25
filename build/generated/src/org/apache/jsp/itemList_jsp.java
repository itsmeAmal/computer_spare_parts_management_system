package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sms.control.itemControl;
import com.sms.control.userControl;
import java.sql.ResultSet;

public final class itemList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .button {\n");
      out.write("                background-color: #660066;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("                padding: 10px 10px;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 16px;\n");
      out.write("                margin: 4px 2px;\n");
      out.write("                opacity: 0.6;\n");
      out.write("                transition: 0.3s;\n");
      out.write("                display: inline-block;\n");
      out.write("                text-decoration: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 320px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button:hover {opacity: 1}\n");
      out.write("            table {\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th, td {\n");
      out.write("                text-align: left;\n");
      out.write("                padding: 8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            tr:nth-child(even) {background-color: #f2f2f2;}\n");
      out.write("            /*//-----------------*/\n");
      out.write("            .button_ {\n");
      out.write("                display: inline-block;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                background-color: #3399ff;\n");
      out.write("                border: none;\n");
      out.write("                color: #FFFFFF;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 14px;\n");
      out.write("                padding: 10px;\n");
      out.write("                width: 200px;\n");
      out.write("                transition: all 0.5s;\n");
      out.write("                cursor: pointer;\n");
      out.write("                margin: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button_ span {\n");
      out.write("                cursor: pointer;\n");
      out.write("                display: inline-block;\n");
      out.write("                position: relative;\n");
      out.write("                transition: 0.5s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button_ span:after {\n");
      out.write("                content: '\\00bb';\n");
      out.write("                position: absolute;\n");
      out.write("                opacity: 0;\n");
      out.write("                top: 0;\n");
      out.write("                right: -20px;\n");
      out.write("                transition: 0.5s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button_:hover span {\n");
      out.write("                padding-right: 25px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button_:hover span:after {\n");
      out.write("                opacity: 1;\n");
      out.write("                right: 0;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"position: absolute; left: 20%; top: 180px; width: 973px; height: 490px;background-color: #ccccff;\">   \n");
      out.write("            <h3>Item Details</h3>\n");
      out.write("            <div style=\"overflow-x:auto;\">\n");
      out.write("                <table>\n");
      out.write("                    ");

                        ResultSet rset = itemControl.getAllItem();
                    
      out.write("\n");
      out.write("                    <th> Name</th>\n");
      out.write("                    <th> Category Name</th>\n");
      out.write("                    <th> Description</th>\n");
      out.write("                    <th> Sub Category Name</th>\n");
      out.write("                    <th> Brand Name</th>\n");
      out.write("                        ");

                            while (rset.next()) {
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( rset.getString("item_name"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rset.getString("item_category_name"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rset.getString("item_description"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rset.getString("item_sub_category_name"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rset.getString("item_brand_name"));
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                        <form action=\"dashBoardServlet\">                       \n");
      out.write("                        <td><button class=\"button_\" style=\"vertical-align:middle\"><span>DELETE </span></button></td>\n");
      out.write("                        <td><input type=\"hidden\" name=\"delete\" value=\"");
      out.print( rset.getString("item_id"));
      out.write("\"/></td>\n");
      out.write("                    </form>\n");
      out.write("                        <td><button class=\"button_\" style=\"vertical-align:middle\"><span>DELETE </span></button></td>\n");
      out.write("                    </tr> \n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
