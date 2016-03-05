public class OrderDetails
{
private Products product;
private int numOfProducts;

public OrderDetails(Products product)
{
setProduct(product);
setNumOfProducts(1); //This will be on default
}

public Product getProduct() //Create Product class
{
  return(product);
}

public String getProductID()
{
  return(getProduct().getPID()); //Check in other class to ensure pID is PID
}

public String getProductName()
{
  return(getProduct().getProductName());
}

public String getProductInfo()
{
  return(getProduct().getProductInfo());
}

public double getProductCost()
{
  return(getProduct().getProductCost());
)

public int getNumOfProducts()
{
  return(numOfProducts);
}

//Now setters
public void setNumOfProducts(int n)
{
  this.numOfProducts = n;  //Normally default is one quantity, however user may require more than one
}

public void countUpNoOfProducts()
{
  setNoOfProducts(getNoOfProducts() + 1); //Whole number    //may require GUI button to do
}

public void countDownOfProducts()
{
  setNoofProducts(getNoOfProducts() - 1); // countdown
}

protected void setProduct(Product product)
{
  this.product = product;   //not to be changed.
}

public void cancelProductOrder()
{
  setNumOfItems(0);
}

public double getProductTotalCost()
{
  return(getNumOfProducts * getProductCost());
}
//VAT can be optionally included (depending on the database design)
}
