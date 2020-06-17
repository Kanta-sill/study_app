package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_method_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>Login</title>\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link href=\"./assets/vendor/fonts/circular-std/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/libs/css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/vendor/fonts/fontawesome/css/fontawesome-all.css\">\n");
      out.write("    \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("    html,\n");
      out.write("    body {\n");
      out.write("        height: 100%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    body {\n");
      out.write("        display: -ms-flexbox;\n");
      out.write("        display: flex;\n");
      out.write("        -ms-flex-align: center;\n");
      out.write("        align-items: center;\n");
      out.write("        padding-top: 40px;\n");
      out.write("        padding-bottom: 40px;\n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("    <!-- login page  -->\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <div class=\"splash-container\">\n");
      out.write("        <div class=\"card \">\n");
      out.write("            <div class=\"card-header text-center\"><a href=\"./index.html\"></a><span class=\"splash-description\">Please enter your user information!</span></div>\n");
      out.write("            \n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-footer bg-white p-0  \">\n");
      out.write("                <div class=\"card-footer-item card-footer-item-bordered\">\n");
      out.write("                    <a href=\"#\" class=\"footer-link\">Create An Account</a></div>\n");
      out.write("                <div class=\"card-footer-item card-footer-item-bordered\">\n");
      out.write("                    <a href=\"#\" class=\"footer-link\">Forgot Password</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- end login page  -->\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <script src=\"../assets/vendor/jquery/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"../assets/vendor/bootstrap/js/bootstrap.bundle.js\"></script>\n");
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
    _jspx_th_s_form_0.setAction("login.baconsoi");
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
        out.write("                    <form>\n");
        out.write("                        \n");
        out.write("                        <div class=\"form-group\">\n");
        out.write("                            <input class=\"form-control form-control-lg\" name=\"user\" type=\"text\" placeholder=\"Username\" autocomplete=\"off\">\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"form-group\">\n");
        out.write("                            <input class=\"form-control form-control-lg\" name=\"pass\" type=\"password\" placeholder=\"Password\">\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"form-group\">\n");
        out.write("                            <label class=\"custom-control custom-checkbox\">\n");
        out.write("                                <input class=\"custom-control-input\" type=\"checkbox\"><span class=\"custom-control-label\">Remember Me</span>\n");
        out.write("                            </label>\n");
        out.write("                        </div>\n");
        out.write("                        <button type=\"submit\" class=\"btn btn-primary btn-lg btn-block\" method=\"execute\">Sign in</button>\n");
        out.write("                    </form>\n");
        out.write("                ");
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
}
