import java.io.*;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.GenericServlet;
@WebServlet("/GenServlet")
public class GenServlet extends GenericServlet {
    public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
        System.out.println("We are in service() method");
        PrintWriter out = res.getWriter();
        out.println("Developing program by Generic Servlet");
        System.out.println("This is service()");
    }
}
