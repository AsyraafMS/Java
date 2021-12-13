public class Customer {
    private String custName;
    private String custAddress;
    private int productID;
    private int quantity;
    private String pakej;
    
    //normal constructor
    public Customer(String custName, String custAddress, int productID, int quantity, String pakej) {
        this.custName = custName;
        this.custAddress = custAddress;
        this.productID = productID;
        this.quantity = quantity;
        this.pakej = pakej;
    }
    
    public void setCustName(String custName) {this.custName = custName;}
    public void setCustAddress(String custAddress) {this.custAddress = custAddress;}
    public void setProductID(int productID) {this.productID = productID;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
    public void setPakej(String pakej) {this.pakej = pakej;}
    
    public String getCustName() {return custName;}
    public String getCustAddress() {return custAddress;}
    public int getProductID() {return productID;}
    public int getQuantity() {return quantity;}
    public String getPakej() {return pakej;}
    
    public String toString() {
        return "Customer's name: " + custName + "\nAddress: " + custAddress + "\nProduct ID: " + productID + "\nQuantity: " + quantity + "\nPakej: " + pakej;
    }
}