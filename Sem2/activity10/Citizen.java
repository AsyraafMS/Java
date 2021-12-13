// subclass of Person
public class Citizen extends Person
{
    private String icNo;

    //constructor;
    public Citizen()
    {
        super();
        this.icNo = null;
    }

    //setter methods;
    public void setIcNo(String i){this.icNo = i;}

    //getter methods;
    public String getIcNo(){return icNo;}

    //printer methods;
    public String toString(){
        return "IC No: " + icNo + "\nCitizen Fee" + calcFee();
    }

    //overridden method calcFee();
    public double calcFee(){
        double fee;
        switch(super.getType())
        {
             case 1:
                 fee =  1272;
                 break;
             case 2:
                 fee = 795;
                 break;
             default:
                 fee = 0; 
        }
        return fee;
    }
}
