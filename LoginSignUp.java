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
  //File extension and browser, OS will detect
  
  PrintWriter out = response.getWriter();
  Result loginRegResponse = createLoginReg(request);
  
  String username = request.getParameter("username");
  String password = request.getParameter("password");
  
  //In other file it retrives the parameters 
  //<form name="loginReg" action="login" method="post">
  //<input type="text" name="username">
  //<input type="password" name="password">
  //<input type="submit" value="login">
  //</form>   Simple html form input, can be validated with UI graphics, jquery designs, error handling
}
