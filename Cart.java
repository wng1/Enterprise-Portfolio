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
  OrderDetails order;
  for(int i =0; i<listOfProduct.size(); i++)
  {
    order = (OrderDetails)listOfProducts.get(i);
    
    if (order.getPID().equals(pID))
    {
      orderDetails.countUpNoOfProducts();
      return;
    } 
  }
    OrderDetails newOrder = new OrderDetails (Product.getProduct(pID));
    OrderDetails.add(newOrder);
}

}
