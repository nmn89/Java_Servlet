import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CheckBox extends HttpServlet{
     
    public void doGet(HttpServletRequest request , HttpServletResponse response)
    throws ServletException, IOException{
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "Reading Checkbox Data";
        String docType ="<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";      
        
        out.println(docType +
         "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor = \"#00FFFF\">\n" +
               "<h1 align = \"center\">" + title + "</h1>\n" +
               "<ul>\n" +
                  "  <li><b>Maths Flag : </b>: "
                  + request.getParameter("maths") + "\n" +
                  "  <li><b>Physics Flag: </b>: "
                  + request.getParameter("physics") + "\n" +
                  "  <li><b>Chemistry Flag: </b>: "
                  + request.getParameter("chemistry") + "\n" +
               "</ul>\n" +
            "</body>" +
         "</html>"
      );
   }

   // Method to handle POST method request.
   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      doGet(request, response);
   }
}

