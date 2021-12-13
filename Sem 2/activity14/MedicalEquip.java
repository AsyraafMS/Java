public class MedicalEquip extends Product{
    //constructor
    public MedicalEquip(String pn, double pp){
        super(pn,pp);
    }

    //definitions of other methods
    public String getExpiry(){
        return null;
    }
    public String toString(){
        return "Equipment Name: " + super.getProductName() + " | Equipment Price: RM" + super.getPrice();
    }
    
    // processor method calcPayment()
    public double calcPayment(double dp){
        double discount = 1 - (dp/100);
        return super.getPrice() * discount;
    }
}