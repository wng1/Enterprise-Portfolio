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
  
  final boolean debug = this.log.isDebugEnabled();
  
  //Retrieve the credential values from the form
  final String username = request.getParameter("username");
  final String password = request.getParameter("password");
  
  try 
  {
  //Validate the user either in Realm or Principal
  //Realm realm = context.getRealm();   
  if (debug)
  this.log.debug("Authenticating... " + username);
  Principal principal = this.context.getRealm().authenticate(username, password)
  
  //Next step is to process
  this.processAuthorisedUser(request, response, config, principal, username, password, false);
  
  }
  catch(Exception e)
  {
      System.out.println("test");
  }
  finally 
   {
            out.close();
   }
  //In other file it retrives the parameters 
  //<form name="loginReg" action="login" method="post">
  //<input type="text" name="username">
  //<input type="password" name="password">
  //<input type="submit" value="login">
  //</form>   Simple html form input, can be validated with UI graphics, jquery designs, error handling
}
