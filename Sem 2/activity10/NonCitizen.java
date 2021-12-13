//subclass of Person
public class NonCitizen extends Person
{
   private String passportNo;

   //constructor
   public NonCitizen()
   {
       super();
       this.passportNo = null;
   }

   //setter methods;
   public void setPassportNo(String p){this.passportNo = p;}

   //getter methods;
   public String getPassportNo(){return passportNo;}

   //printer methods;
   public String toString(){
       return "Passport No: " + passportNo + "\nNon-Citizen Fee: " + calcFee();
   }

   //overridden method calcFee();
   public double calcFee(){
       double fee;
       switch(super.getType())
       {
            case 1:
                fee =  1484;
                break;
            case 2:
                fee = 900;
                break;
            default:
                fee = 0; 
       }
       return fee;
   }
}
