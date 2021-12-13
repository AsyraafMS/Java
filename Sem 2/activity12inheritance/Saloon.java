public class Saloon
{
    //attributes
    protected String customerNumber;    // customer I/C number
    protected String customerName;      // customer name 
    protected boolean member;           // either member or not meber of the saloon centre
    protected String date;              // date of service

    // default const.
    public Saloon(){
        this.customerName = null;
        this.customerNumber = null;
        this.member = false;
        this.date = null;
    }
    // normal const.
    public Saloon(String cNo, String cName, boolean mem, String date){
        this.customerNumber = cNo;
        this.customerName = cName;
        this.member = mem;
        this.date = date;
    }

    // accessor methods for each
    public String getCustomerNumber(){ return customerNumber;}
    public String getCustomerName(){ return customerName;}
    public boolean getMember(){ return member;}
    public String getDate(){ return date;}

    // processor method

    // toString
    public String toString(){
        return "Customer Number: " + customerNumber + "\nCustomer Name: " + customerName + "\nMember: " + member + "\nDate: " + date;
    }
}
