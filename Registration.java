
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Registration extend HttpServlet 
{
  public void doGet(HttpServletRequest rq, HttpServletResponse rsp) throws ServletException, IOException
  {
    response.setContentType("text.html");
    PrintWriter output = response.getWriter(); //utilises the java.io
    
    String actionURL="/servlet/RegistrationServlet";
    String firstName = CookieUtilites.getCookieValue(request, "firstName", "");
    
    //Repeat for the other relevant fields
     //Basic outline
  <HTML>
  <BODY>
   <FORM ACTION=\""+actionURL + "\">\n" + "First Name:" +
   <INPUT TYPE=\"TEXT\" NAME=\"firstName\" " +"VALUE=\" "+FirstName + "\">
   <INPUT TYPE=\"SUBMIT\" VALUE=\"REGISTER"></FORM>
   </BODY>
   </HTML>
  }
}