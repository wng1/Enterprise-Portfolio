import javax.faces.bean.*;

@ManagedBean //Java Bean managed by JSF framework

public class AccountBean
{
protected String UserID, Username, Password;
protected Users user;
private static UserCheck checkUser = new UserMap();

public String getUserID()
{
  return(UserID);
}

public void setUserID(String UserID)
{
 this.UserID = UserID.trim();
 
 if(this.UserID.isEmpty())
 {
   this.UserID = "(UserID not entered)";
 }
}

public String getPassword()
{
  return(password);
}

public void setPassword(String password)
{
  this.password = password;
}

public User getUser()
{
  return(user);
}

public String showAccountInformation()
{
  if(!password.equals("test"))   //check userid validity
  {
    return("incorrect-pass");   //Next version, improved security and crytography
  }
  
  if (user == null) { return("no-User");
  else if(user.getSubscriptionPlan() == "basic")
  {
    return ("basic")
  } else if (user.getSubscriptionPlan() == "premium")
  {
    return ("premium")
  }
  else { return ("advanced")  };
  
}

}
