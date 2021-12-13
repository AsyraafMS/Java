abstract class TailorOrder{
   private String custName;
   private String orderNum;
   private double deposit;
   private boolean delivery;

   // sets all data members
   public TailorOrder(String c, String o, double d, boolean delivery){
       this.custName = c;
       this.orderNum = o;
       this.deposit = d;
       this.delivery = delivery;
   }

   public abstract double payment();
   public abstract boolean getEmbroidery();

   public String getName(){return custName;}
   public String getOrderNum(){return orderNum;}
   public double getDeposit(){return deposit;}
   public boolean getDelivery(){return delivery;}
   public double getBalance(){return payment();}


   public String toString(){
       return "Name: " + custName + "\nOrder Number: " + orderNum + "\nDeposit: RM" + deposit + "\nDelivery: " + delivery;
   }
}
