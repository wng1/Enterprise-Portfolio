public abstract class ProductPage extends HttpServlet
{
  private ProductItems[] products;
  private String[] pID;
  private String title;
  
  //When using servlet, this method should be called before the servlet is accessed. 
  
  protected void setProducts(String[] pID)
{
  this.pID = pID;
  products = new ProductItems[pID.length];
  
  for(int i=0; i<products.length; i++)
  products[i] = Product.getProduct(pID[i]);
  //Create a new arraylist with product ID in the array list, then run through this arraylist of the indexes
}
  //Display the content using the doGet Method
  
  protected void doGet(HttpServletRequest request, HttpSerrvletResponse response) throws IOException, ServletException
  {
    if (products == null)
    {
      response.sendError(response, "Missing products");
      //public void sendError(int code, String message) 
      This sendError method sends a status code with short message formatted inside an HTML file and sent to the client.
      return;
    }
    response.setContentType("text/html");
    PrintWriter output = response.getWriter();
    
    String outputFile = ""
    // HTML coding
    
  }
  
  
  
}
