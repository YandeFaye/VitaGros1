/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-10-15 21:16:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_002dvisit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/footer.jspf", Long.valueOf(1665783142933L));
    _jspx_dependants.put("/WEB-INF/views/common/header.jspf", Long.valueOf(1665786627983L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod.release();
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fnobody.release();
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
      out.write("        url(\"https://www.hopvetdesprairies.com/wp-content/uploads/sites/265/2022/04/Service-cat-vet-surgery-1920x604.jpg\");\r\n");
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
      out.write("}\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-secondary text-light\">\r\n");
      out.write("  <a class=\"text-light\" style=\"margin-left: 50px; font-size:30px\" href=\"#\">VitaGros Pharma</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavAltMarkup\" \r\n");
      out.write("  aria-controls=\"navbarNavAltMarkup\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarNavAltMarkup\">\r\n");
      out.write("    <div class=\"navbar-nav text-light\">\r\n");
      out.write("      <a class=\"nav-item nav-link text-light \" href=\"list-owner\">Home </a>\r\n");
      out.write("      <a class=\"nav-item nav-link text-light \" href=\"list-pet\">List Pet</a>\r\n");
      out.write("      <a class=\"nav-item nav-link text-light \" href=\"list-visit\">List visits</a>\r\n");
      out.write("       <a class=\"nav-item nav-link text-light \" href=\"list-vet\">About US</a>\r\n");
      out.write("       <a class=\"nav-item nav-link text-light \" href=\"logout\" style=\"margin-left:300px;color:red;\" >Logout</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/views/add-visit.jsp(7,0) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setModelAttribute("visits");
      // /WEB-INF/views/add-visit.jsp(7,0) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("post");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\r\n");
            out.write("<div class=\"row\">\r\n");
            out.write("    <div class=\"col-sm-4\">\r\n");
            out.write("\r\n");
            out.write("    ");
            if (_jspx_meth_form_005fhidden_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("    ");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f0.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/add-visit.jsp(13,4) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f0.setPath("date");
            int[] _jspx_push_body_count_form_005ferrors_005f0 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f0 = _jspx_th_form_005ferrors_005f0.doStartTag();
              if (_jspx_th_form_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (java.lang.Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f0.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f0);
            }
            out.write("<br><br>\r\n");
            out.write("\t");
            if (_jspx_meth_form_005flabel_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write('\r');
            out.write('\n');
            out.write('	');
            if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t</div>\r\n");
            out.write("\t\r\n");
            out.write("\t <div class=\"col-sm-4\">\r\n");
            out.write("\t");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f1.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/add-visit.jsp(19,1) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f1.setPath("description");
            int[] _jspx_push_body_count_form_005ferrors_005f1 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f1 = _jspx_th_form_005ferrors_005f1.doStartTag();
              if (_jspx_th_form_005ferrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (java.lang.Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f1.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f1);
            }
            out.write("<br><br>\r\n");
            out.write("\t");
            if (_jspx_meth_form_005flabel_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write('\r');
            out.write('\n');
            out.write('	');
            if (_jspx_meth_form_005finput_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t</div>\r\n");
            out.write("\t\r\n");
            out.write("\t \r\n");
            out.write("\t\r\n");
            out.write("\t <div class=\"col-sm-4\">\r\n");
            out.write("\t<input class=\"sub1\" type=\"submit\">\r\n");
            out.write("\t</div>\r\n");
            out.write("\t\r\n");
            out.write("\t</div>\r\n");
            out.write("\r\n");
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
        _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod.reuse(_jspx_th_form_005fform_005f0);
      }
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("<footer class=\"text-center text-white\" style=\"background-color: #caced1;\">\r\n");
      out.write("  <!-- Grid container -->\r\n");
      out.write("  <div class=\"container p-4\">\r\n");
      out.write("    <!-- Section: Images -->\r\n");
      out.write("    <section class=\"\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-2 col-md-12 mb-4 mb-md-0\">\r\n");
      out.write("          <div\r\n");
      out.write("            class=\"bg-image hover-overlay ripple shadow-1-strong rounded\"\r\n");
      out.write("            data-ripple-color=\"light\"\r\n");
      out.write("          >\r\n");
      out.write("            <img\r\n");
      out.write("              src=\"http://www.noovomoi.ca/content/dam/style-de-vie/migrated/images/2015/10/11/animaux-epoustouflants-tigre.jpg\"\r\n");
      out.write("              class=\"w-100\"\r\n");
      out.write("            />\r\n");
      out.write("            <a href=\"#!\">\r\n");
      out.write("              <div\r\n");
      out.write("                class=\"mask\"\r\n");
      out.write("                style=\"background-color: rgba(251, 251, 251, 0.2);\"\r\n");
      out.write("              ></div>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-2 col-md-12 mb-4 mb-md-0\">\r\n");
      out.write("          <div\r\n");
      out.write("            class=\"bg-image hover-overlay ripple shadow-1-strong rounded\"\r\n");
      out.write("            data-ripple-color=\"light\"\r\n");
      out.write("          >\r\n");
      out.write("            <img\r\n");
      out.write("              src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQJJX4DncEht5Nu-Eu1gzRDfXSIMWYCnXEq3w&usqp=CAU\"\r\n");
      out.write("              class=\"w-100\"\r\n");
      out.write("            />\r\n");
      out.write("            <a href=\"#!\">\r\n");
      out.write("              <div\r\n");
      out.write("                class=\"mask\"\r\n");
      out.write("                style=\"background-color: rgba(251, 251, 251, 0.2);\"\r\n");
      out.write("              ></div>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-2 col-md-12 mb-4 mb-md-0\">\r\n");
      out.write("          <div\r\n");
      out.write("            class=\"bg-image hover-overlay ripple shadow-1-strong rounded\"\r\n");
      out.write("            data-ripple-color=\"light\"\r\n");
      out.write("          >\r\n");
      out.write("            <img\r\n");
      out.write("              src=\"https://www.allianz.fr/content/onemarketing/azfr/onemarketingfrance/fr_FR/assurance-particulier/sante-prevoyance/assurance-sante/assurance-chiens-chats.thumb.1280.1280.png?ck=1663918426\"\r\n");
      out.write("              class=\"w-100\"\r\n");
      out.write("            />\r\n");
      out.write("            <a href=\"#!\">\r\n");
      out.write("              <div\r\n");
      out.write("                class=\"mask\"\r\n");
      out.write("                style=\"background-color: rgba(251, 251, 251, 0.2);\"\r\n");
      out.write("              ></div>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-2 col-md-12 mb-4 mb-md-0\">\r\n");
      out.write("          <div\r\n");
      out.write("            class=\"bg-image hover-overlay ripple shadow-1-strong rounded\"\r\n");
      out.write("            data-ripple-color=\"light\"\r\n");
      out.write("          >\r\n");
      out.write("            <img\r\n");
      out.write("              src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-GdOhj8JonK1kycTxkN7Vg55efO6d9zUW6w&usqp=CAU\"\r\n");
      out.write("              class=\"w-100\"\r\n");
      out.write("            />\r\n");
      out.write("            <a href=\"#!\">\r\n");
      out.write("              <div\r\n");
      out.write("                class=\"mask\"\r\n");
      out.write("                style=\"background-color: rgba(251, 251, 251, 0.2);\"\r\n");
      out.write("              ></div>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-2 col-md-12 mb-4 mb-md-0\">\r\n");
      out.write("          <div\r\n");
      out.write("            class=\"bg-image hover-overlay ripple shadow-1-strong rounded\"\r\n");
      out.write("            data-ripple-color=\"light\"\r\n");
      out.write("          >\r\n");
      out.write("            <img\r\n");
      out.write("              src=\"https://emmenetonchien.com/sites/default/files/feed_image/Nice%20avec%20son%20chien%20-%20parc%20naturel%20de%20la%20croix%20des%20gardes%20-%20activite%CC%81%20chien%20nice%20-%20vacances%20chien%20-%20emme%CC%80netonchien.png\"\r\n");
      out.write("              class=\"w-100\"\r\n");
      out.write("            />\r\n");
      out.write("            <a href=\"#!\">\r\n");
      out.write("              <div\r\n");
      out.write("                class=\"mask\"\r\n");
      out.write("                style=\"background-color: rgba(251, 251, 251, 0.2);\"\r\n");
      out.write("              ></div>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-2 col-md-12 mb-4 mb-md-0\">\r\n");
      out.write("          <div\r\n");
      out.write("            class=\"bg-image hover-overlay ripple shadow-1-strong rounded\"\r\n");
      out.write("            data-ripple-color=\"light\"\r\n");
      out.write("          >\r\n");
      out.write("            <img\r\n");
      out.write("              src=\"https://www.autourdesanimaux.com/wp-content/uploads/lapin-carottes-scaled.jpeg\"\r\n");
      out.write("              class=\"w-100\"\r\n");
      out.write("            />\r\n");
      out.write("            <a href=\"#!\">\r\n");
      out.write("              <div\r\n");
      out.write("                class=\"mask\"\r\n");
      out.write("                style=\"background-color: rgba(251, 251, 251, 0.2);\"\r\n");
      out.write("              ></div>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- Section: Images -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Grid container -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Copyright -->\r\n");
      out.write("  <div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.2);\">\r\n");
      out.write("    © 2022 Copyright:\r\n");
      out.write("    <a class=\"text-white\" href=\"https://mdbootstrap.com/\">VitaGros Pharma</a>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Copyright -->\r\n");
      out.write("</footer>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write(" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
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

  private boolean _jspx_meth_form_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f0 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/add-visit.jsp(12,4) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fhidden_005f0.setPath("id");
    int[] _jspx_push_body_count_form_005fhidden_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fhidden_005f0 = _jspx_th_form_005fhidden_005f0.doStartTag();
      if (_jspx_th_form_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fhidden_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fhidden_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fhidden_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fnobody.reuse(_jspx_th_form_005fhidden_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005flabel_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_005flabel_005f0 = (org.springframework.web.servlet.tags.form.LabelTag) _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_005flabel_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005flabel_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/add-visit.jsp(14,1) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005flabel_005f0.setPath("date");
    int[] _jspx_push_body_count_form_005flabel_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005flabel_005f0 = _jspx_th_form_005flabel_005f0.doStartTag();
      if (_jspx_eval_form_005flabel_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Date");
          int evalDoAfterBody = _jspx_th_form_005flabel_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005flabel_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005flabel_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005flabel_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005flabel_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath.reuse(_jspx_th_form_005flabel_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/add-visit.jsp(15,1) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setPath("date");
    // /WEB-INF/views/add-visit.jsp(15,1) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "type", "text");
    int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
      if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005flabel_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_005flabel_005f1 = (org.springframework.web.servlet.tags.form.LabelTag) _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_005flabel_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005flabel_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/add-visit.jsp(20,1) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005flabel_005f1.setPath("description");
    int[] _jspx_push_body_count_form_005flabel_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005flabel_005f1 = _jspx_th_form_005flabel_005f1.doStartTag();
      if (_jspx_eval_form_005flabel_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Description");
          int evalDoAfterBody = _jspx_th_form_005flabel_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005flabel_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005flabel_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005flabel_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005flabel_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath.reuse(_jspx_th_form_005flabel_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/add-visit.jsp(21,1) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setPath("description");
    // /WEB-INF/views/add-visit.jsp(21,1) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "type", "text");
    int[] _jspx_push_body_count_form_005finput_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f1 = _jspx_th_form_005finput_005f1.doStartTag();
      if (_jspx_th_form_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f1);
    }
    return false;
  }
}
