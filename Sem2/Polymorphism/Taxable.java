public class Taxable extends Item
{
    private double taxP;
    
    public Taxable()
    {
        super();
        taxP = 0.0;
    }
    
    public Taxable(String s, double p, double t){
        super(s, p);
        taxP = t;
    }
    
    public void setTax(double tax){
       taxP = tax;
    }
    
    public double getTax(){
        return taxP;
    }
    
    public double calc(){
       return taxP / 100.0 * super.getPrice();
   }
    
    public double netPrice(){
        return super.getPrice() + calc();
    }

    public String toString(){
        return super.toString() + "\nTax : RM " + calc() +
               "\nNet price: RM " + netPrice();
    }
}
