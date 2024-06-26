
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class FilterServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Welcome " + request.getParameter("un"));
    }
}
