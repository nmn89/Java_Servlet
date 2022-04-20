import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


// Servlet Name
@WebServlet("/Main_Form")
public class Main_Form extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
HttpServletResponse response)
		throws ServletException, IOException
	{
		try {
         String url = "jdbc:mysql:// localhost:3306/learner";
         String user = "root";
         String password = "root";
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection(url,user,password);
			PrintWriter out = response.getWriter();
			String title = "Using Post Method to Read Form Data";
         String docType =
            "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
         
         out.println(docType +
            "<html>\n" +
               "<head><title>" + title + "</title></head>\n" +
               "<body bgcolor = \"#f0f0f0\">\n" +
                  "<h1 align = \"center\">" + title + "</h1>\n" +
                  "<ul>\n" +
                     "  <li><b>First Name</b>: "
                     + request.getParameter("first_name") + "\n" +
                     "  <li><b>Last Name</b>: "
                     + request.getParameter("last_name") + "\n" +
                     "  <li><b>Email-ID</b>: "
                     + request.getParameter("email") + "\n" +
                     "  <li><b>Contact</b>: "
                     + request.getParameter("contact") + "\n" +
                   "</ul>\n" +
               "</body>" +
            "</html>"
         );
         PreparedStatement st = con.prepareStatement("insert into Form values(?, ?, ?, ?)");
			st.setString(1,request.getParameter("first_name"));
			st.setString(2, request.getParameter("last_name"));
         st.setString(3, request.getParameter("email"));
         st.setString(4, request.getParameter("contact"));
			st.executeUpdate();
			st.close();
			con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
