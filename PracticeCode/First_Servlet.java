import java.io.*;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;

public class First_Servlet implements Servlet{
    static{
        System.out.println("Servlet class loading");
    }
    public First_Servlet(){
        System.out.println("Servlet Instantiation");
    }
    ServletConfig config;
    public void init(ServletConfig config)throws ServletException{
        this.config = config;
        System.out.println("We are in init() method");
    }
    public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
        System.out.println("We are in service() method");
        PrintWriter out = res.getWriter();
        out.println("Welcome to Servlet");
    }
    public void destroy(){
        System.out.println("We are in destroy() method");
    }
    public ServletConfig getServletConfig(){
        return null;
    }
    public String getServletInfo(){
        return "My first Servlet Program";
    }
}   