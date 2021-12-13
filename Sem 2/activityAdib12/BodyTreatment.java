//adib
public class BodyTreatment extends Saloon{
    private String treatmentType;
    final double severalPartsOfBody;
    final double allPartsOfBody;
    
    BodyTreatment(String num, String name, boolean member, String date, String type/*, double sevBody, double allBody*/){
        super(num, name, member, date);
        treatmentType = type;
        severalPartsOfBody = 320.00; 
        allPartsOfBody = 600.00;
    }
    
    public String getTreatmentType(){
        return treatmentType;
    }
    
    public double calcBodyTreatment(){
        double totalTreatmentBody = 0;
        if(getTreatmentType().equalsIgnoreCase("Several")){
            totalTreatmentBody = severalPartsOfBody;
        }else if(getTreatmentType().equalsIgnoreCase("All")){
            totalTreatmentBody = allPartsOfBody;
        }
        
        if(getMember() == true){
            return (totalTreatmentBody) * 0.75;
        }else if(getMember() == false){
            return totalTreatmentBody;
        }else{
            return 0;
        }
    }
    
    public String toString(){
        return super.toString() + "\nTreatment Type: " + treatmentType + "\nTotal Body Treatment: RM" + calcBodyTreatment();    
    }
}