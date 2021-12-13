public abstract class Product
{
//field
    String proName;     // name of product
    double proPrice;    // price of product;
//constructor
    public Product(String pn, double pp){
        proName = pn;
        proPrice = pp;
    }
    public Product(Product product){
        proName = product.proName;
        proPrice = product.proPrice;
    }

    // definitions of other methods
    public double getPrice(){ return proPrice;}
    public String getProductName(){ return proName;}

    public abstract double calcPayment(double dp);
    /* Receives the discount (e.g: 25.0 for 25.0%) through parameter, calculates and rteturns the price after discount */
    public abstract String getExpiry();
    public abstract String toString();
}
