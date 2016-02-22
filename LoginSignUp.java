public class LoginSignup extend HttpServlet 
{

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException SerletException
{
    processLoginReg(request, response)
}

protected processLoginReg(HttpServletRequest request, HttpServlet response)
{
  response.setHeader("content-type", "application/json;charset=utf-8");
  //response.setContentType("text/html");
  //response.setHeader("context-type", "text/html");
}
