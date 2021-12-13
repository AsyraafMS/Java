public class Maintenance
{
    private String phoneNo;//phone number car's owner
    private String plateNo;//car's plateNo
    private int serviceType;//service type-1, 2, 3
    private boolean aircond; //true-inclusive aircond service
    
    public Maintenance(String phoneNo, String plateNo, int serviceType, boolean aircond)
    {
        this.phoneNo = phoneNo;
        this.plateNo = plateNo;
        this.serviceType = serviceType;
        this.aircond = aircond;
    }
    
    public String getPhoneNo(){return phoneNo;}
    public String getPlateNo(){return plateNo;}
    public int getType(){return serviceType;}
    public boolean getAircond(){return aircond;}
    
    public double calcCharge()
    {
        double charge = 0.0;
        if(serviceType%5==0)
            charge = 500;
        else
            charge = 150;
        
        if (aircond)
            charge+=100;
            
        return charge;
    }
    
    public String printServiceType()
    {
        return "service "+serviceType;
    }
    
    public String printAircond()
    {
        if (aircond)
            return "aircond service";
        else
            return "";
    }
     
    public void setPhoneNo(String newPhoneNo){phoneNo=newPhoneNo;}
    
    public String toString()
    {return phoneNo+"\t"+plateNo+"\t"+printServiceType()+"\t"+printAircond();}
}
