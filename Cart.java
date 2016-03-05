public class Cart
{
private ArrayList listOfProducts;

public Cart()
{
listOfProducts = new ArrayList();
}

public List getListofProducts()
[
return(listOfProducts);
}

public synchronized void addProduct(String pID)
{
  Product order;
  for(int i =0; i<listOfProduct.size(); i++)
  {
    order = (Product)listOfProducts.get(i);
    
    if (order.getPID().equals(pID))
    {
      orderDetails.countUpNoOfProducts();
    } 
  }
}

}
