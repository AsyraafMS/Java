public class SpringCleaning extends CleaningService{
    //attributes
    private String houseType;
    private boolean cleanMaterial;

    //normal constructor
    public SpringCleaning(String ic, String name, String phone, String zone, String type, boolean cleanMat){
        super(ic, name, phone, zone);
        this.houseType = type;
        this.cleanMaterial = cleanMat;
    }   
    public String getHouseType(){return houseType;}
    public boolean getCleanMaterial(){return cleanMaterial;}
    public String toString(){return "House Type: "+houseType+"\nClean Material: "+cleanMaterial;}
    
    public double calcCleaningCharges(){
        double rate = 0;
        
        if (houseType.equals("SA")){
            rate = 150;
        } else if (houseType.equals("SH")){
            rate = 210;
        } else if (houseType.equals("MH")){
            rate = 265;
        } else {
            System.out.println("Invalid house type.");
        }
        if (cleanMaterial == true){
            rate += 100;
        }
        return rate;
    }
}
