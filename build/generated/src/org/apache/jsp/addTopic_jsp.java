package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addTopic_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_type_method_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_method_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_submit_value_type_method_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_submit_value_type_method_nobody.release();
    _jspx_tagPool_s_form_method_action.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>Concept - Bootstrap 4 Admin Dashboard Template</title>\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link href=\"./assets/vendor/fonts/circular-std/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/libs/css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/vendor/fonts/fontawesome/css/fontawesome-all.css\">\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .addtopic{\n");
      out.write("             display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        input{\n");
      out.write("            width: 300px;\n");
      out.write("            height: 30px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("    <!-- main wrapper -->\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <div class=\"dashboard-main-wrapper\">\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- navbar -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <div class=\"dashboard-header\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg bg-white fixed-top\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">FPT Edu</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse \" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto navbar-right-top\">\n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item dropdown nav-user\">\n");
      out.write("                            <a class=\"nav-link nav-user-img\" href=\"#\" id=\"navbarDropdownMenuLink2\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"><img src=\"assets/images/account.png\" alt=\"\" class=\"user-avatar-md rounded-circle\"></a>\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right nav-user-dropdown\" aria-labelledby=\"navbarDropdownMenuLink2\">\n");
      out.write("                                <div class=\"nav-user-info\">\n");
      out.write("                                    <h5 class=\"mb-0 text-white nav-user-name\">John Abraham </h5>\n");
      out.write("                                    <span class=\"status\"></span><span class=\"ml-2\">Available</span>\n");
      out.write("                                </div>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-user mr-2\"></i>Account</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-cog mr-2\"></i>Setting</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-power-off mr-2\"></i>Logout</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- end navbar -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- left sidebar -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <div class=\"nav-left-sidebar sidebar-dark\">\n");
      out.write("            <div class=\"menu-list\">\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("                    <a class=\"d-xl-none d-lg-none\" href=\"#\">Dashboard</a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                        <ul class=\"navbar-nav flex-column\">\n");
      out.write("                            <li class=\"nav-divider\">\n");
      out.write("                                Menu\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item \">\n");
      out.write("                                <a class=\"nav-link\" href=\"IndexCate.jsp\">Manage Category</a>\n");
      out.write("\n");
      out.write("                                \n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"IndexTop.jsp\">Manage Topic</a>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"Index.jsp\">Manage Course</a>\n");
      out.write("                                \n");
      out.write("                            </li>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <li class=\"nav-item \">\n");
      out.write("                                <a class=\"nav-link\" href=\"IndexTrainer.jsp\">Manage Profile</a>\n");
      out.write("\n");
      out.write("                                \n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"\">Manage Course</a>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- end left sidebar -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- wrapper  -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <div class=\"dashboard-wrapper\">\n");
      out.write("\n");
      out.write("            <div  class=\"container-fluid dashboard-content \">\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- pageheader  -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <h1>Fill Topic  !</h1>\n");
      out.write("                <div class=\"addtopic\">\n");
      out.write("                    ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- end sales traffice country source  -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- footer -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xl-6 col-lg-6 col-md-6 col-sm-12 col-12\">\n");
      out.write("                             Copyright © 2020 Concept. All rights reserved. \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-6 col-lg-6 col-md-6 col-sm-12 col-12\">\n");
      out.write("                            <div class=\"text-md-right footer-links d-none d-sm-block\">\n");
      out.write("                                <a href=\"javascript: void(0);\">About</a>\n");
      out.write("                                <a href=\"javascript: void(0);\">Support</a>\n");
      out.write("                                <a href=\"javascript: void(0);\">Contact Us</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- end footer -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("        </div>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- end wrapper  -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("    </div>\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- end main wrapper  -->\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jquery 3.3.1 -->\n");
      out.write("    <script src=\"assets/vendor/jquery/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <!-- bootstap bundle js -->\n");
      out.write("    <script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.js\"></script>\n");
      out.write("    <!-- slimscroll js -->\n");
      out.write("    <script src=\"assets/vendor/slimscroll/jquery.slimscroll.js\"></script>\n");
      out.write("    <!-- main js -->\n");
      out.write("    <script src=\"assets/libs/js/main-js.js\"></script>\n");
      out.write("    <!-- chart chartist js -->\n");
      out.write("    <script src=\"assets/vendor/charts/chartist-bundle/chartist.min.js\"></script>\n");
      out.write("    <!-- sparkline js -->\n");
      out.write("    <script src=\"assets/vendor/charts/sparkline/jquery.sparkline.js\"></script>\n");
      out.write("    <!-- morris js -->\n");
      out.write("    <script src=\"assets/vendor/charts/morris-bundle/raphael.min.js\"></script>\n");
      out.write("    <script src=\"assets/vendor/charts/morris-bundle/morris.js\"></script>\n");
      out.write("    <!-- chart c3 js -->\n");
      out.write("    <script src=\"assets/vendor/charts/c3charts/c3.min.js\"></script>\n");
      out.write("    <script src=\"assets/vendor/charts/c3charts/d3-5.4.0.min.js\"></script>\n");
      out.write("    <script src=\"assets/vendor/charts/c3charts/C3chartjs.js\"></script>\n");
      out.write("    <script src=\"assets/libs/js/dashboard-ecommerce.js\"></script>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
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

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_method_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("addTopic");
    _jspx_th_s_form_0.setMethod("POST");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        ID: <br/><input type=\"text\" name=\"id\"><br/>\n");
        out.write("                        Name: <br/><input type=\"text\" name=\"name\"><br/>\n");
        out.write("                        Description: <br/><textarea rows=\"3\" cols=\"40\" maxlength=\"20\" name=\"des\"></textarea>\n");
        out.write("\n");
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_method_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_method_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_type_method_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_submit_0.setType("button");
    _jspx_th_s_submit_0.setValue("Save");
    _jspx_th_s_submit_0.setMethod("execute");
    int _jspx_eval_s_submit_0 = _jspx_th_s_submit_0.doStartTag();
    if (_jspx_th_s_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_type_method_nobody.reuse(_jspx_th_s_submit_0);
      return true;
    }
    _jspx_tagPool_s_submit_value_type_method_nobody.reuse(_jspx_th_s_submit_0);
    return false;
  }
}
