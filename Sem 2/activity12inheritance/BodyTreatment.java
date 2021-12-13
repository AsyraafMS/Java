public class BodyTreatment extends Saloon
{
    //attributes
    private String treatmentType;        // the customer must choose either several parts of body or all

    final double severalPartsOfBody;       // total cost of treatment for several body parts

    final double allPartsOfBody;       // total cost of treatment for all body parts

    //normal constructor
    BodyTreatment(String cNo, String cName, boolean mem, String date, String type){
        super(cNo, cName, mem, date);
        this.treatmentType = type;
        allPartsOfBody = 600.00;
        severalPartsOfBody = 320.00;
    }

    // accessor methods for each
    public String getTreatmentType(){ return treatmentType;}
    public double getSeveralParts(){ return severalPartsOfBody;}
    public double getAllParts(){return allPartsOfBody;}

    // processor method
    public double calcTreatment(){
        double total = 0;
        if (getTreatmentType().equalsIgnoreCase("several")){
            total = severalPartsOfBody;
        } else if (getTreatmentType().equalsIgnoreCase("all")){
            total = allPartsOfBody;
        }

        if (getMember() == true){
            return total * 0.75;
        } else if (getMember() == false){
            return total;
        } else{
            return 0;
        }
    }

    // toString
    public String toString(){
        return super.toString() + "\nTreatment type: " + treatmentType 
        + "\nTotal Body Treatment: RM" + calcTreatment();
    }
}
