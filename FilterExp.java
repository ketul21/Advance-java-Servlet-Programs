
import java.io.*;
import javax.servlet.*;

public class FilterExp implements Filter {

    public void init(FilterConfig f) throws ServletException {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fc) throws IOException, ServletException {
        if ("SOHAM".equals(req.getParameter("un")) && "SARERIYA".equals(req.getParameter("pwd"))) {
            fc.doFilter(req, resp);
        } else {
            resp.setContentType("text/html");
            RequestDispatcher rd = req.getRequestDispatcher("pr4.html");
            rd.include(req, resp);
        }
    }

    public void destroy() {
    }

}
