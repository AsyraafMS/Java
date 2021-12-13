//adib
public class HairTreatment extends Saloon{
    private boolean rebonding;
    private boolean cutting;
    private boolean washing;
    private boolean dyeing;
    final double rebondingPrice;
    final double cuttingPrice;
    final double washingPrice;
    final double dyeingPrice;
    
    HairTreatment(String num, String name, boolean member, String date, boolean rebonding, boolean cutting, boolean washing, boolean dyeing){
        super(num, name, member, date);
        this.rebonding = rebonding;
        this.cutting = cutting;
        this.washing = washing;
        this.dyeing = dyeing;
        rebondingPrice = 250.00;
        cuttingPrice = 75.00;
        washingPrice = 35.00;
        dyeingPrice = 150.00;
    }
    
    public boolean getRebonding(){
        return rebonding;
    }
    
    public boolean getCutting(){
        return cutting;
    }
    
    public boolean getWashing(){
        return washing;
    }
    
    public boolean getDyeing(){
        return dyeing;
    }
    
    public double calcHairTreatment(){
        double priceRebonding = 0;
        if(getRebonding() == true){
            priceRebonding = rebondingPrice;
        }else if(getRebonding() == false){
            priceRebonding = 0;
        }
        double priceCutting = 0;
        if(getCutting() == true){
            priceCutting = cuttingPrice;
        }else if(getCutting() == false){
            priceCutting = 0;
        }
        double priceWashing = 0;
        if(getWashing() == true){
            priceWashing = washingPrice;
        }else if(getWashing() == false){
            priceWashing = 0;
        }
        double priceDyeing = 0;
        if(getDyeing() == true){
            priceDyeing = dyeingPrice;
        }else if(getDyeing() == false){
            priceDyeing = 0;
        }
        
        if(getMember() == true){
            return (priceRebonding + priceCutting + priceWashing + priceDyeing) * 0.75;
        }else if(getMember() == false){
            return priceRebonding + priceCutting + priceWashing + priceDyeing;
        }else {
            return 0;
        }
    }
    
    public String toString(){
        return super.toString() + "\nRebonding: " + rebonding + "\nCutting: " + cutting + "\nWashing: " + washing + "\nDyeing: " + dyeing + "\nTotal Hair Treatment: RM" + calcHairTreatment();
    }
}