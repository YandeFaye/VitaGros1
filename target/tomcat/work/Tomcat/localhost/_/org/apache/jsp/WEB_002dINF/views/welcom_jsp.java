/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-10-18 09:43:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcom_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("    background-image: linear-gradient(rgba(0, 0, 0, 0.8), rgba(0, 0, 0, 0.8)),\r\n");
      out.write("        url(\"https://www.santevet.com/upload/admin/images/article/NAC/identification_I-CAD_2018%20-%20copie.jpg\");\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("    background-position: center;\r\n");
      out.write("    background-attachment: fixed;\r\n");
      out.write("    margin-top: 5px;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    .btn1:link,\r\n");
      out.write("    .btn1:visited{\r\n");
      out.write("    text-decoration: none; \r\n");
      out.write("    color: #fff;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("    font-family: sans-serif;\r\n");
      out.write("    border:2px solid #948f8a ;\r\n");
      out.write("    border-radius: 200px;\r\n");
      out.write("     padding: 10px 10px;\r\n");
      out.write("     margin-left: 200px;\r\n");
      out.write("     background-color: blue ;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".text {\r\n");
      out.write("    width: 1100px;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 40%;\r\n");
      out.write("    left: 60%;\r\n");
      out.write("    transform: translate(-50%, -50%);\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    font-family: sans-serif;\r\n");
      out.write("    letter-spacing: 3px;\r\n");
      out.write("    line-height: 60px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"text\">\r\n");
      out.write("        <h1>welcome to our VitaGros Pharma</h1>\r\n");
      out.write("        <a href=\"list-owner\" class=\"btn1\">Clic to Access</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
