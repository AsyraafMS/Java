public class Medicine extends Product{
    String expiryDate;      // format : Jan 2019, Feb 2019
// constructor
    public Medicine(String pn, double pp, String date){
        super(pn,pp);
        expiryDate = date;
    }
    //definitions of other methods
    public String getExpiry(){
        return expiryDate;
    }
    public String toString(){
        return "Medicine Name: " + super.getProductName() + " | Medicine Price: RM" + super.getPrice();
    }

    // processor method calcPayment()
    public double calcPayment(double dp){
        double discount = 1 - (dp/100);
        if (expiryDate.equalsIgnoreCase("Dec 2019") || Integer.parseInt(expiryDate.substring(4)) > 2019){
            return super.getPrice() * discount;
        } else {
            return super.getPrice();
        }
        
    }
    
}
