package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Main Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <!--   <h1>Enter the operation to be performed</h1>\n");
      out.write("        <a href=\"deposit.jsp\">DEPOSIT</a><br/><br/>\n");
      out.write("        <a href=\"withdraw.jsp\">WITHDRAW</a><br/><br/>\n");
      out.write("        <a href=\"balance.jsp\">BALANCE</a><br/><br/>\n");
      out.write("        -->\n");
      out.write("        <!-- Report View Table-->\n");
      out.write("<table width=\"100%\">\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("<iframe id='report_view' name=\"report_view\" width='60%' height=\"500\" frameborder=\"0\" src='deposit.jsp'>\n");
      out.write("</td>\n");
      out.write("<td align=\"left\">\n");
      out.write("<iframe id='drilldown_view' name=\"drilldown_view\" width='40%' height=\"500\" frameborder=\"0\" src='withdraw.jsp'>\n");
      out.write("</td> \n");
      out.write("</tr>\n");
      out.write("</table>\n");
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
