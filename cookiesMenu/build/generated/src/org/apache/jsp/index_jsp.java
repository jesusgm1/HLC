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
      response.setContentType("text/html;charset=Shift_JIS");
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=Shift_JIS\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Gestion de Cookies</h1>\n");
      out.write("        <form name=\"formulario1\" method=\"POST\" action=\"\">\n");
      out.write("            Nombre de la cookie<input type=\"text\" name=\"nombre\">\n");
      out.write("            <br>\n");
      out.write("            Valor de la cookie<input type=\"text\" name=\"valor\">\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" name=\"crear\" value=\"Crear\">\n");
      out.write("            <input type=\"submit\" name=\"visualizar\" value=\"Visualizar\">\n");
      out.write("            <input type=\"submit\" name=\"modificar\" value=\"Modificar\">\n");
      out.write("            <input type=\"submit\" name=\"borrar\" value=\"Borrar\">\n");
      out.write("        </form>\n");
      out.write("        ");

            if (request.getParameter("crear") != null) {
                String nombre = request.getParameter("nombre");
                String valor = request.getParameter("valor");
                Cookie creada = new Cookie(nombre, valor);
                response.addCookie(creada);
            }
            if (request.getParameter("visualizar") != null) {
                Cookie[] cookies = request.getCookies();
                if (cookies != null) {
                    for (Cookie c : cookies) {
                        out.println(c.getName() + " " + c.getValue() + "<br>");
                    }
                }
            }
            if (request.getParameter("modificar") != null) {
                String nombre = request.getParameter("nombre");
                String valor = request.getParameter("valor");
                 Cookie[] cookies = request.getCookies();
                if (cookies != null) {
                    for (Cookie c : cookies) {
                        if(c.getName().equals(nombre)) {
                            c.setValue(valor);
                            response.addCookie(c);
                        }
                    }
                }
            }
            if (request.getParameter("borrar") != null) {
                String nombre = request.getParameter("nombre");
                Cookie[] cookies = request.getCookies();
                if (cookies != null) {
                    for (Cookie c : cookies) {
                        if(c.getName().equals(nombre)) {
                            c.setMaxAge(0);
                            response.addCookie(c);
                        }
                    }
                }
            }
        
      out.write("\n");
      out.write("    </body>\n");
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
