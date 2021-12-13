public class Fine extends Book
{
    //attributes
    private double amount;
    private double rates;
    private int overdueDays;
 
     //default constructor
    public Fine(){
        this.amount = 0.0;
        this.rates = 0.0;
        this.overdueDays = 0;
    }

     //normal constructor
    public Fine(double amt, double rate, int over){
        this.amount = amt;
        this.rates = rate;
        this.overdueDays = over;
    }

     //mutator method
    public void setAmount(double amt){this.amount = amt;}
    public void setRates(double rate){this.rates = rate;}
    public void setOverdue(int days){this.overdueDays = days;}

     //accessor method
    public double getAmount(){return amount;}
    public double getRates(){return rates;}
    public int getOverdue(){return overdueDays;}

     //processor method (calculation)
    public double calcTotal(){
        amount = overdueDays * rates;
        return amount;
    }
    
     // toString() method
     public String toString(){
         return "Amount: "+ amount +"\tRates: "+ rates +"\tOverdue: "+ overdueDays;
     }
}
