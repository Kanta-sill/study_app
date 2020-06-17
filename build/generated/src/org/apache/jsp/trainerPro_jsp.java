package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class trainerPro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <table border=\"1\">\n");
      out.write("            <TR>\n");
      out.write("                <TH>ID Topic</TH>\n");
      out.write("                <TH>Name</TH>\n");
      out.write("                <TH>Description</TH>\n");
      out.write("                <TH>ID Topic</TH>\n");
      out.write("                <TH>ID Topic</TH>\n");
      out.write("                <TH>ID Topic</TH>\n");
      out.write("                <TH>ID Topic</TH>\n");
      out.write("                <TH>ID Topic</TH>\n");
      out.write("                <TH>ID Topic</TH>\n");
      out.write("                <TH>ID Topic</TH>\n");
      out.write("                <TH>ID Topic</TH>\n");
      out.write("                <TH>ID Topic</TH>\n");
      out.write("                <TH>ID Topic</TH>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </TR>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <s:iterator var=\"p\" value=\"items\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><s:property value=\"#p.id\"/></td>\n");
      out.write("                <td><s:property value=\"#p.name\"/></td>\n");
      out.write("                <td><s:property value=\"#p.account\"/></td>\n");
      out.write("                <td><s:property value=\"#p.age\"/></td>\n");
      out.write("                <td><s:property value=\"#p.dot\"/></td>\n");
      out.write("                <td><s:property value=\"#p.ex_in\"/></td>\n");
      out.write("                <td><s:property value=\"#p.edu\"/></td>\n");
      out.write("                <td><s:property value=\"#p.placework\"/></td>\n");
      out.write("                <td><s:property value=\"#p.email\"/></td>\n");
      out.write("                <td><s:property value=\"#p.toeic\"/></td>\n");
      out.write("                <td><s:property value=\"#p.depart\"/></td>\n");
      out.write("                <td><s:property value=\"#p.location\"/></td>\n");
      out.write("                <td><s:property value=\"#p.exp\"/></td>\n");
      out.write("                </tr>\n");
      out.write("            </s:iterator>\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <h1>Personal Profile !</h1>\n");
      out.write("        <br/>\n");
      out.write("            <s:iterator var=\"p\" value=\"items\">\n");
      out.write("                <tr>\n");
      out.write("                    ID: <td><s:property value=\"#p.id\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    Name: <td><s:property value=\"#p.name\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    Account: <td><s:property value=\"#p.account\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    Age: <td><s:property value=\"#p.age\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    Date Of Birth: <td><s:property value=\"#p.dot\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    External/Internal Type: <td><s:property value=\"#p.ex_in\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    Education: <td><s:property value=\"#p.edu\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    Place Work: <td><s:property value=\"#p.placework\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    Email: <td><s:property value=\"#p.email\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    Toeic Score: <td><s:property value=\"#p.toeic\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    Department: <td><s:property value=\"#p.depart\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    Location: <td><s:property value=\"#p.location\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    Experience Detail: <td><s:property value=\"#p.exp\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </s:iterator>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <br/>\n");
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
