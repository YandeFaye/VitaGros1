/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-10-20 14:59:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_002downer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/footer.jspf", Long.valueOf(1666113715615L));
    _jspx_dependants.put("/WEB-INF/views/common/header.jspf", Long.valueOf(1666251890017L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write(" <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"rel=\"stylesheet\"\r\n");
      out.write("  integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("    background-image: linear-gradient(rgba(0, 0, 0, 0.8), rgba(0, 0, 0, 0.8)),\r\n");
      out.write("        url(\"https://www.wanimo.com/veterinaire/wp-content/uploads/2017/01/images_chien-chat-longevite@2x.jpg\");\r\n");
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
      out.write("     padding: 5px 5px;\r\n");
      out.write("     margin-left: 200px;\r\n");
      out.write("     background-color: blue ;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("    .text {\r\n");
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
      out.write(".table{\r\n");
      out.write(" width: 1000px;\r\n");
      out.write(" margin:auto auto;\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write(".nav-link{\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    margin-left: 50px;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("nav{\r\n");
      out.write("    background-attachment: fixed;\r\n");
      out.write("}\r\n");
      out.write(" a:link,\r\n");
      out.write("a:visited\r\n");
      out.write("{\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    font-size:16px;\r\n");
      out.write("    font-weight: 300;\r\n");
      out.write("    letter-spacing: 2px;\r\n");
      out.write("    transition: border-bottom transparent;\r\n");
      out.write("}\r\n");
      out.write(" a:hover,\r\n");
      out.write(" a:active{\r\n");
      out.write("    border-bottom: 3px solid green;\r\n");
      out.write("    padding-bottom: 5px;\r\n");
      out.write("    transition: border-bottom 1s;\r\n");
      out.write("   \r\n");
      out.write(" } \r\n");
      out.write(" \r\n");
      out.write(" .a{\r\n");
      out.write(" \r\n");
      out.write(" width:100px;\r\n");
      out.write(" height:100px;\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" border-radius:20px;\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" }\r\n");
      out.write(" form{\r\n");
      out.write(" color:white;\r\n");
      out.write(" }\r\n");
      out.write(" .container{\r\n");
      out.write("        width: 1900px;   \r\n");
      out.write("       \r\n");
      out.write("    }\r\n");
      out.write("    input{\r\n");
      out.write("        width: 300px;\r\n");
      out.write("        border: blue;\r\n");
      out.write("         border-radius:20px;\r\n");
      out.write("          height:40px;\r\n");
      out.write("       \r\n");
      out.write("    }\r\n");
      out.write("   \r\n");
      out.write("    label{color: wheat;\r\n");
      out.write("    padding: 10px;}\r\n");
      out.write("    .sub{\r\n");
      out.write("    margin-top:90px;\r\n");
      out.write("    background-color: green;\r\n");
      out.write("    height:40px;\r\n");
      out.write("    border-radius:20px;\r\n");
      out.write("    color:white;\r\n");
      out.write("    margin-left:380px;\r\n");
      out.write("    }\r\n");
      out.write("     .sub1{\r\n");
      out.write("    margin-top:90px;\r\n");
      out.write("    background-color: green;\r\n");
      out.write("    height:40px;\r\n");
      out.write("    border-radius:20px;\r\n");
      out.write("    color:white;\r\n");
      out.write("   \r\n");
      out.write("    }\r\n");
      out.write("    .box{\r\n");
      out.write("    display: flex;\r\n");
      out.write("     background-color: white;\r\n");
      out.write("     height:max-height;\r\n");
      out.write("     margin-top:-20px;\r\n");
      out.write("   }\r\n");
      out.write("    .box1{\r\n");
      out.write("    margin-left:50px;\r\n");
      out.write("   \r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin-top:20px;\r\n");
      out.write("    }\r\n");
      out.write("    .box2{\r\n");
      out.write("    margin-top:20px;\r\n");
      out.write("    margin-left:400px;\r\n");
      out.write("    \r\n");
      out.write("    }\r\n");
      out.write("    label {\r\n");
      out.write("    font-family: sans-serif;\r\n");
      out.write("    font-size: 1rem;\r\n");
      out.write("    padding-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("select {\r\n");
      out.write("    font-size: .9rem;\r\n");
      out.write("    padding: 2px 5px;\r\n");
      out.write("     width: 300px;\r\n");
      out.write("        border: blue;\r\n");
      out.write("         border-radius:20px;\r\n");
      out.write("          height:40px;\r\n");
      out.write("}\r\n");
      out.write(".a1{\r\n");
      out.write("margin-left:200px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".container1{\r\n");
      out.write("width:400px;\r\n");
      out.write("margin-left:200px;\r\n");
      out.write("margin-top:20px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".b{\r\n");
      out.write(" font-size: 15px;\r\n");
      out.write("    font-family: sans-serif;\r\n");
      out.write("    border:2px solid #948f8a ;\r\n");
      out.write("    border-radius: 200px;\r\n");
      out.write("     padding: 5px 5px;\r\n");
      out.write("     margin-right: 200px;\r\n");
      out.write("     background-color: blue ;\r\n");
      out.write("     text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<table class=\"table text-light \">\r\n");
      out.write("  <thead>\r\n");
      out.write("    <tr class=\"bg-secondary\">\r\n");
      out.write("      <th scope=\"col\">Name</th>\r\n");
      out.write("     <th scope=\"col\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${owner.firstName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${owner.lastName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</th>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("      <th scope=\"col\"> Address</th>\r\n");
      out.write("        <th scope=\"col\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${owner.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</th>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("      <th scope=\"col\"> City</th>\r\n");
      out.write("        <th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${owner.city}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("      <th scope=\"col\">Telephone</th>\r\n");
      out.write("       <th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${owner.telephone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</th>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("     \r\n");
      out.write("      </tr>\r\n");
      out.write("  </thead>\r\n");
      out.write("  \r\n");
      out.write("  </table>\r\n");
      out.write("  <br><br>\r\n");
      out.write("<a href=\"/update-owner?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${owner.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"btn1\">Edit Owner</a>\r\n");
      out.write("<a href=\"/add-pet?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${owner.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"btn1\">Add New Pets</a>\r\n");
      out.write("<br><br><br>\r\n");
      out.write("<h5  style=\"color:white;\">Pets and Visit</h5>\r\n");
      out.write("<hr style=\"height:5px;background-color:black;\">\r\n");
      out.write("<div class=\"box\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"box1\">\r\n");
      out.write(" ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("  </div>\r\n");
      out.write("<div class=\"box2\">\r\n");
      out.write("<strong>Visit Date:</strong>\r\n");
      if (_jspx_meth_c_005fout_005f3(_jspx_page_context))
        return;
      out.write(" &nbsp;&nbsp; \r\n");
      out.write("<strong>Description:</strong>");
      if (_jspx_meth_c_005fout_005f4(_jspx_page_context))
        return;
      out.write("<br><br>\r\n");
      out.write("&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;\r\n");
      out.write(" <a style=\"color:green\"> Edit Pet</a> &nbsp;&nbsp;&nbsp;&nbsp; <a style=\"color:green\"> Add Vivit</a></p></div>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("</div>\r\n");
      out.write("  <br><br>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write(" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/detail-owner.jsp(39,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/detail-owner.jsp(39,1) '${owner.pet}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${owner.pet}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/detail-owner.jsp(39,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("pets");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("       ");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("         ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/detail-owner.jsp(40,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${owner.pet.iterator().hasNext()}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("<strong>Name:</strong> &nbsp;&nbsp;");
        if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("<br>\r\n");
        out.write("<strong>Birth date: &nbsp;&nbsp;</strong>");
        if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write(" <br>\r\n");
        out.write(" <strong>Type: &nbsp;&nbsp;</strong>");
        if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fif_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write(" \r\n");
        out.write("     ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/views/detail-owner.jsp(42,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pets.name}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/views/detail-owner.jsp(43,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pets.dateOfBirth}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/views/detail-owner.jsp(44,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pets.petType.name}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent(null);
    // /WEB-INF/views/detail-owner.jsp(51,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pets.visits.date}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f4.setParent(null);
    // /WEB-INF/views/detail-owner.jsp(52,29) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pets.visits.description}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
    if (_jspx_th_c_005fout_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
    return false;
  }
}
