import javax.faces.bean.*;

@ManagedBean //Java Bean managed by JSF framework

public class AccountBean
{
protected String UserID, Username, Password;
protected Users user;

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

}
