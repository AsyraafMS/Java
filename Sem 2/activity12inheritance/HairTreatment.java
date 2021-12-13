public class HairTreatment extends Saloon{
    
    //attributes
    private boolean rebonding;      // yes or no to rebond
    private boolean cutting;        // yes or no to cut
    private boolean washing;        // yes or no to wash
    private boolean dyeing;         // yes or no to dye

    final double rebondingPrice;       // total price of hair rebonding
    final double cuttingPrice;      // total price of hair cutting
    final double washingPrice;      // total price of hair washing
    final double dyeingPrice;      // total price of hair dyeing

    //normal constrcutor
    HairTreatment(String cNo, String cName, boolean mem, String date, boolean rebonding, boolean cutting, boolean washing, boolean dyeing){
        super(cNo, cName, mem, date);
        this.rebonding = rebonding;
        this.cutting = cutting;
        this.washing = washing;
        this.dyeing = dyeing;
        rebondingPrice = 250.00;
        cuttingPrice = 75.00;
        washingPrice = 35.00;
        dyeingPrice = 150.00;
    }

    // accessor method
    public boolean getRebonding(){ return rebonding;}
    public boolean getCutting(){ return cutting;}
    public boolean getWashing(){ return washing;}
    public boolean getDyeing(){ return dyeing;}

    //processor method
    public double calcHairTreatment(){
        double total = 0;

        if(getRebonding() == true){
            total = total + rebondingPrice;
        }
        if(getCutting() == true){
            total = total + cuttingPrice;
        }
        if(getWashing() == true){
            total = total + washingPrice;
        } 
        if(getDyeing() == true){
            total = total + dyeingPrice;
        }

        return total;
    }

    //toString method
    public String toString(){
        return super.toString() + "\nRebonding: " + rebonding + "\nCutting: " + cutting + "\nWashing: " + washing + "\nDyeing: " + dyeing + "\nTotal Hair Treatment: RM" + calcHairTreatment();
    }
}
