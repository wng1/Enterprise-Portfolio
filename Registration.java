
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Registration extend HttpServlet 
{
  public void doGet(HttpServletRequest rq, HttpServletResponse rsp) throws ServletException, IOException
  {
    response.setContentType("text.html");
    PrintWriter output = response.getWriter(); //utilises the java.io
    
    String actionURL= "/servlet/RegistrationServlet";
    String firstName = CookieUtilites.getCookieValue(request, "firstName", "");
   
    //
    String counter = CookieUtilies.getCookieValue(request, "accessCount", "1");
    
    int StartCounter = 1;
    try 
    {
      StartCounter = Integer.parseInt(countString);
    } catch (NumberFormatException e)
    {
      LongLivedCookie cs = new LongLivedCookie("accessCount", String.valueOf(StartCounter+1));
    }
    response.addCookie(cs);
    
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

public class RegistrationServlet extend HttpServlet
{
  //Usual validations on request.getParameter("")
  
  Cookie c1 = new LongLivedCookie("firstName", firstName);
  response.addCookie(c1);
  
  
}
}
