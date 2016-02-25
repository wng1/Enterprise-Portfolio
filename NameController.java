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
    public String showName() 
  {
    if (isEmpty(firstname) || isEmpty(lastname)) 
    {
      return("Empty-name");
    } else {
      return("Checked-name");
  }
  
  private boolean isEmpty(String fullname) {
    return(fullname.trim().isEmpty());
  }
    
}


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
  
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:f="http://xmlns.jcp.org/jsf/core"
      xmlns:h="http://xmlns.jcp.org/jsf/html">
      
<h:head>
<title>Create New User</title>
<link href="./css/styles.css" rel="stylesheet" type="text/css"/> 
</h:head>

<h:body>

<div align="center">

<h1 class="title">Create New User</h1>
<p>Please fill in the form below to register. Thank you!</p>

<fieldset>
<legend>Enter your personal details:</legend>
<h:form>
  First Name: <h:inputText value="#{Users.firstname}"/><br/>
  Last Name: <h:inputText value="#{Users.favoriteLanguage}"/><br/>
  Age: <h:selectOneMenu value="#{Users.age}">
       <f:selectItems value="#{Users.listOfAges}"/>
  </h:selectOneMenu><br/>
  I agree with the Terms & Conditions and Privacy Policy  <h:selectBooleanCheckbox value="#{Users.agreement}"/><br/>
  Receive weekly newsletter? <h:selectBooleanCheckbox value="#{Users.subscription}"/><br/>
  <h:commandButton value="Submit" action="#{Users.showSubscriptionPlan}"/>
</h:form>
</fieldset>

</div>

</h:body>
</html>
