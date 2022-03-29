public class Electricity
{
    private int ID;
    private String name;
    private char custType;
    private String location;
    private double billAmt;

    public Electricity(int ID, String name, char custType, String location, double billAmt)
    {
        this.ID = ID;
        this.name = name;
        this.custType = custType;
        this.location = location;
        this.billAmt = billAmt;
    }

    public int getID(){return ID;}

    public String getName(){return name;}

    public char getType(){return custType;}

    public String getLocation(){return location;}

    public double getBillAmt(){return billAmt;}
    
    public String toString()
    {
        return ID+"\t"+name+"\t"+custType+"\t"+location+"\t"+billAmt;
    }

}
