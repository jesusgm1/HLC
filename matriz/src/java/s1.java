
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author equipo
 */
@WebServlet(urlPatterns = {"/s1"})
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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet s2</title>");
            out.println("</head>");
            out.println("<body>");
            int size = (Integer) request.getAttribute("numero");
            int matrix[][] = new int[size][size];
            int c = 2, i = matrix.length - 1, j = (size / 2) + 1;
            boolean llena = false;
            matrix[0][(size - 1) / 2] = 1;
            for (int k = 0; !llena; k++) {
                if (j == matrix[i].length) {
                    j = 0;
                }
                if (matrix[i][j] == 0) {
                    if ((c % size) == 0) {
                        matrix[i][j] = c;
                        i++;
                    } else {
                        matrix[i][j] = c;
                        i--;
                        j++;
                    }
                }
                if (i == -1) {
                    i = matrix.length - 1;
                }
                if (c == Math.pow(size, 2)) {
                    llena = true;
                }
                c++;
            }
            i = 0;
            j = 0;
            out.println("<table border =2>");
            for (i = 0; i < matrix.length; i++) {
                out.println("<tr>");
                for (j = 0; j < matrix[i].length; j++) {
                    out.println("<td>" + matrix[i][j] + "</td>");
                }
                out.println("</tr>");
            }
            if(size==1) size+=2;
            out.println("</table>");
            out.println("<form name='formulario' action='s3' method='POST'>");
            out.println("<button type='submit' name='size' value='" + (size + 2) + "'>+</button>");
            out.println("<button type='submit' name='size' value='" + (size - 2) + "'>-</button>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
