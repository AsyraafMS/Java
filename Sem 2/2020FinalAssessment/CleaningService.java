public abstract class CleaningService {
    //attrivutes
    protected String clientIC;
    protected String clientName;
    protected String clientPhoneNo;
    protected String clientZone;

    // methods
        //normal constructor
    public CleaningService(String ic, String name, String no, String zone){
        this.clientIC = ic;
        this.clientName = name;
        this.clientPhoneNo = no;
        this.clientZone = zone;
    }
    public String getClientIC(){return clientIC;}
    public String getClientPhoneNo(){return clientPhoneNo;}
    public String getClientZone(){return clientZone;}
    public String toString(){return "Client IC: "+clientIC+"\nClient Name: "+clientName+"\nClient Phone No: "+clientPhoneNo+"\nClient Zone: "+clientZone;}

    abstract double calcCleaningCharges();
}
