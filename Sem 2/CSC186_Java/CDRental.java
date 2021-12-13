//Your first object class
public class CDRental{
    private String name;
    private String address;
    private String phoneNum;
    private String serialID;
    private String title;
    private double price;
    
    //default contructor
    CDRental(){
        name = "Asyraaf MS";
        address = "JOHOR";
        phoneNum = "01128721176";
        serialID = "2020882888";
        title = "Hello World";
        price = 12.00;
    }
    
    //Accessor method
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
        public String getPhoneNum(){
        return phoneNum;
    }
    
    public String getSerialID(){
        return serialID;
    }
    
        public String getTitle(){
        return title;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String toString(){
        return "\nName : " +name +"\nPhone Number : " +phoneNum + "\nAddress : " +address +"\nSerial ID : " +serialID + "\nTitle : " +title +"\nPrice : " +price;
    
    }
}