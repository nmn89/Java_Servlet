import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Demo extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) 
    throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("mname");
        out.println("Hello"+name+"This is httpServlet demo program");
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException{
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("mname");
        out.println("Hello"+name+"This is doPost() method");
    }
}   