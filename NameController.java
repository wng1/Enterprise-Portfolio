import javax.faces.bean.*;

@ManagedBean

public class NameController
{
  private String firstName="", lastName="";
//This intialities bi values in the parameters of the form

  public String getFirstName() 
  {
    return(firstName);
  }
  
  public void setFirstName(String firstName) 
  {
    this.firstName = firstName;
  }

  public String getLastName() 
  {
    return(lastName);
  }

  public void setLastName(String lastName) 
  {
    this.lastName = lastName;
  }
  
  
}
