

public class Customer
{
    private String custName;       // customer's name
    private String custAddress;    // customer's address
    private int productID;         // product ID
    private int quantity;          // quantity bought
    private String pakej;          // either staff or student package

    // normal constructor
    public Customer(String custName, String custAddress, int productID, int quantity, String pakej)
    {
        this.custName = custName;
        this.custAddress = custAddress;
        this.productID = productID;
        this.quantity = quantity;
        this.pakej = pakej;
    }

    //setter
    public void setName(String name)
    {
        this.custName = name;
    }
    public void setAddress(String address)
    {
        this.custAddress = address;
    }
    public void setProductID(int id)
    {
        this.productID = id;
    }
    public void setQuantity(int qty)
    {
        this.quantity = qty;
    }
    public void setPakej(String pakej)
    {
        this.pakej = pakej;
    }
    public void setAll(String custName, String custAddress, int productID, int quantity, String pakej)
    {
        this.custName = custName;
        this.custAddress = custAddress;
        this.productID = productID;
        this.quantity = quantity;
        this.pakej = pakej;
    }

    // getters
    public String getName()
    {
        return custName;
    }
    public String getAddress()
    {
        return custAddress;
    }
    public int getProductID()
    {
        return productID;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public String getPakej()
    {
        return pakej;
    }
    
    // tostring
    
}
