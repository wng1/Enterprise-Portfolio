import java.io.*;
import java.sql.*;   //sql.Driver, sql.Connection
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

//Import the required libraries for the class

public class DatabaseConnection extends HttpServlet   
{
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException   
//public method can be changed to protected
static final String JDBC = "com.mysql.jdbc.driver";
static final String dbURL = "jdbc:mysql://localhost/dbAccessTest";
//Provide unchanged instance variables and path to the databaase access

static final String Username = "";   // Ommitted
static final String Password = "";   // Ommitted 
//Here are the written database credentials for authorisation to the database and with relevent user permissions

try
{
Class.forName("com.mysql.jdbc.driver");  //Accesing a database in a java app requires this to utilise the imported sql.Driver library
//This is valid for Java Virtual Machines (JVM)
//Once the driver have been regisetered, open a connection for the following 

Connection con = DriverManager.getConnection(dbURL, Username, Password); // It can be written like this OR
Connection con = DriverManager.getConnection("jdbc:oracle:orc:@localhost:1521:orcl", "", ""); // like this via Oracle SQL Listerner

//Important section for accessing database  (Must set up test environment and populate data
String sql = "SELECT UserID From UserEntity WHERE" + "Username = $Username AND Password = $Password";
PreparedStatement preStmt = con.prepareStatement(sql);
preStmt.setString(1, UserID);
ResultSet result = preStmt.executeQuery():

while(result.next())  //Extract data from the entity tables in the database
{
int UserID = resukt.getUserID("UserID");
String firstName = result.getString("firstName");
String lastName= result.getString("lastName");

System.out.println("UserID" + UserID);
System.out.println("firstName" + firstName);
System.out.println("lastName" + lastName);
}
result.close();
stmt.close();
con.close();   //Once completed, clean-up the environment 
}
catch(SQLException sqlerror) 
{
sqlerror.printStackTrace();   //Test purpose only,  must be changed for better security
}
catch(Exception error)
{
error.printStackTrace(): //Handles the Class.forName errors
}
finally // Used to ensure that the connection is closed and finally block will always required to be run
{
if(connection!=null)
connection.close();
}catch(SQLException sqlerror2)
{
}

}

//Some basic steps fo follow when connecting JDBC

Load the driver
Define the URL connection you want to connect to
establish that connection and ensure its connected
create a statement object you want or wish to process
execute a query. process that result then close the connection 
