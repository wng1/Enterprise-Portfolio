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
  
}
