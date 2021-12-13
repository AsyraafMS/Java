public class TaxFree extends Item
{
    private double discP;
    
    public TaxFree()
    {
        super();
        discP = 0;
    }

    public TaxFree(String i, double p, double d)
    {
        super(i,p);
        discP = d;
    }
    
      public void setDic(double disc){
       discP = disc;
    }
    
    public double getDisc(){
        return discP;
    }
    
    public double calculateDiscount(){
        return discP/100.0 * super.getPrice();
    }
    
    public double netPrice(){
        return super.getPrice() - calculateDiscount();
    }
    
    public String toString(){
        return super.toString() + "\nDiscount : RM " + calculateDiscount() +
               "\nNet price: RM " + netPrice();
    }    
}
