/**
 * MilkLive Program (Group Assignment)
 * 
 * @ Created by (Aiman Afzan, Sarra Aisya, Nur Syahirah)
 * @ Version : 16/1/2022
 */


public class MilkLive
{
    // Creating The List Of Milk Class Attributes
    
    private String custName;
    private String cupSize; // 'S' : small  'M' : medium  'L' ; Large
    private boolean membership ; // 'Yes' or 'No'
    private boolean addOn; // 'Yes' or 'No'
    private String flavor; // ML01: Singature Brown Sugar, ML02: Hazelnut Milk Tea, ML03: Original Milk Tea, ML04: Matty Milk Tea(Horlick)
    private double price;
    
    // Creating the Normal Constructor 
    public MilkLive(String cN, String cS, boolean m, boolean aO, String f, double p)
    {
        this.custName = cN;
        this.cupSize = cS;
        this.membership = m;
        this.addOn = aO;
        this.flavor = f;
        this.price = p;
    }
    
    // Creating the Get Method 
    public String getCustName(){return custName;}
    public String getCupSize(){return cupSize;}
    public boolean getMembership(){return membership;}
    public boolean getAddOn(){return addOn;}
    public String getFlavor(){return flavor;}
    public double getPrice(){return price;}
    
    // Creating the toString Method
    public String toString(){
     return "\nCustomer Name : " + custName + "\nCup Size : " + cupSize + "\nMembership : "+ membership + "\nAdd On : " + addOn + "\nFlavor : "+ flavor + "\nPrice RM :" + price;
        
    }
}
