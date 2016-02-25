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
}
