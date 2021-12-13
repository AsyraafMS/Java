//adib
public class Saloon{
    private String customerNumber;
    private String customerName;
    private boolean member;
    private String date;
    
    Saloon(String customerNumber, String customerName, boolean member, String date){
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.member = member;
        this.date = date;
    }
    
    public String getCustomerNumber(){
        return customerNumber;
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public boolean getMember(){
        return member;
    }
    
    public String getDate(){
        return date;
    }
    
    public String toString(){
        return "\nIc number: " + customerNumber + "\nName: " + customerName + "\nMember: " + member + "\nDate: " + date;   
    }
}