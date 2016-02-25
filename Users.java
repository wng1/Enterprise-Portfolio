public class EmployeeServlet extends HttpServlet
{
protected final String databaseURL="jdbc:mysql:myDatabase";
protected final String tableName = "Users";
protected final String username = "";
protected final String password = "";

public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException
      {
        response.setContentType("text/html")
        PrintWriter out = response.getWriter();
        //optional to include the HTML format for good practice
        showTable(out);
      }
      
//next is to make an connection

protected void showTable(PrintWriter out)
{
      try
      {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM" + tableName; //To be changed
            
            ResultSet rs = stmt.executeQuery(query);
            printTableTop(conn, rs, out);
            printTableBody(rs, out);
            conn.close();
      }
      catch (Exception e)
      {
            System.err.println("Error:" +e); //to be changed as well
      }
}

protected Connection getConnection() throw Exception
{
//Establish network connection to database
Properties userInfo = new Properties():
userInfo.put("user". username);
userInfo.put("password", password);
Connection conn = DriverManager.getConnection(url, userInfo);
return (conn);
}
 

}
