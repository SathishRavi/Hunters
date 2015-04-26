package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class visitormaster_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<HTML>\n");
      out.write("   <head>\n");
      out.write("<link href=\"images/favicon.jpg\" type=\"image\" rel=\"icon\"/>\n");
      out.write("\n");
      out.write("<title>Fetching data from database</title>\n");
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
      out.write("            <li><a href=\"seller.jsp\">Seller</a></li>\n");
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
      out.write("\n");
      out.write("     <script language=\"javascript\">\n");
      out.write("function check()\n");
      out.write("{\n");
      out.write("document.grade.action=\"./navi.jsp\";\n");
      out.write("document.grade.submit();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("        <H1>Fetching Data From a Database</H1>\n");
      out.write("         <TABLE BORDER=\"1\">\n");
      out.write("            <TR>\n");
      out.write("               <TH>Area</TH>\n");
      out.write("               <TH>City</TH>\n");
      out.write("               <TH>State</TH>\n");
      out.write("               <TH>School</TH>\n");
      out.write("               <TH>bus</TH>\n");
      out.write("               <Th> Restaurants</Th>\n");
      out.write("               <th> Attractions </th>\n");
      out.write("           </TR>\n");
      out.write("           \n");
      out.write("        ");
 
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","sathish");
PreparedStatement pst=conn.prepareStatement("insert into seller values(?,?,?,?,?,?,?)");

            Statement statement = conn.createStatement();  
            //ResultSet resultset = statement.executeQuery("select * from Publishers where pub_id = '" + id + "'") ;
            
            //String state = request.getParameter("state"); 
             String area = request.getParameter("area"); 
           ResultSet rs = statement.executeQuery("select * from seller where state = '" +area + "'"); 
            //ResultSet rs = statement.executeQuery("SELECT area, city, state, school,bus, rest,  atter FROM seller");
            //ResultSet rs = statement.executeQuery("SELECT * FROM seller");
            while(rs.next())
{
      out.write("\n");
      out.write("       <tr>\n");
      out.write("<td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
 }
      out.write("\n");
      out.write("</table>\n");
      out.write("<br><br><input type=\"submit\" value=\"BACK\" style=\"width:80;height:20;border: 1px solid #0000FF\" onClick=\"history.back()\">\n");
      out.write("<hr color=\"grey\">\n");
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
