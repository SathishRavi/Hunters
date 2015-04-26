package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("Registration is Successful.\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<link href=\"images/favicon.jpg\" type=\"image\" rel=\"icon\"/>\n");
      out.write("\n");
      out.write("<title>Housing</title>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"layout/styles/layout.css\" type=\"text/css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"layout/scripts/jquery.min.js\"></script>\n");
      out.write("<!-- Waterwheel Carousel -->\n");
      out.write("<script type=\"text/javascript\" src=\"layout/scripts/carousel/jquery.waterwheelCarousel.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"layout/scripts/carousel/jquery.waterwheelCarousel.setup.js\"></script>\n");
      out.write("<!-- / Waterwheel Carousel -->\n");
      out.write("</head>\n");
      out.write("<body id=\"top\">\n");
      out.write("<div class=\"wrapper col1\">\n");
      out.write("  <div id=\"header\">\n");
      out.write("    <div class=\"fl_left\">\n");
      out.write("\n");
      out.write("<h1><a href=\"index.html\">Housing</a></h1>\n");
      out.write("<p style=\"indent:20\">- making life simpler..</p>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("      <div class=\"fl_right\"><a href=\"#\"><img src=\"images/demo/logo.jpg\" alt=\"\" /></a></div>\n");
      out.write("    <br class=\"clear\" />\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("<!-- ####################################################################################################### -->\n");
      out.write("<div class=\"wrapper col2\">\n");
      out.write("  <div id=\"topbar\">\n");
      out.write("    <div id=\"topnav\">\n");
      out.write("      <ul>\n");
      out.write("        <li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("        <li><a href=\"https://housing.com/about\">About-Us</a></li>\n");
      out.write("        <li><a href=\"https://housing.com/blog\">Blog</a></li>\n");
      out.write("\t\t<li><a href=\"#\">Services <b>&#8681<b></a>\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"visitor.jsp\">Buyer</a></li>\n");
      out.write("            <li><a href=\"login.jsp\">Seller</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("       \n");
      out.write("        <li class=\"last\"><a href=\"contact.html\">Contact-Us</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <br class=\"clear\" />\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- ####################################################################################################### -->\n");
      out.write("Please Login Here <a href=\"login.jsp\">Go to Login</a>\n");
      out.write(" <hr color=\"grey\">\n");
      out.write("<!-- ####################################################################################################### -->\n");
      out.write("<div class=\"wrapper col6\">\n");
      out.write("  <div id=\"copyright\">\n");
      out.write("    <p class=\"fl_left\">Copyright &copy; 2014 - All Rights Reserved</p>\n");
      out.write("    <p class=\"fl_right\"> Made by Hunters...</p> \n");
      out.write("    <br class=\"clear\" />\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
