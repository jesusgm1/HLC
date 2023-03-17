
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alejandro
 */
@WebServlet(name = "s1", urlPatterns = {"/s1"})
public class s1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet authController</title>");
            out.println("</head>");
            out.println("<body>");
            // TODO output your page here. You may use following sample code. */
            //String nombre=(String)misesion.getAttribute("minombre");
            String nombre = request.getParameter("nombre");
            String valor = request.getParameter("valor");
            String crear = request.getParameter("crear");
            String visualizar = request.getParameter("visualizar");

            if (crear != null) {
                Cookie creada = new Cookie(nombre, valor);
                response.addCookie(creada);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            if (visualizar != null) {
                Cookie[] cookies = request.getCookies();
                if (cookies != null) {
                    for (Cookie c : cookies) {
                        out.println(c);
                    }
                }
            }
            request.getRequestDispatcher("index.jsp").forward(request, response);
            out.println("</body>");
            out.println("</html>");
        }
    }
}
