public class Resident{
    /**ATTRIBUTES */
    private String name;
    private int unitNo;
    private String phoneNumber;
    private boolean parkingPass;
    private String emailAddress;

    /**CONSTURCTORS */
    //Default constructor
    Resident(){
        name = "Nafisah Amin";
        unitNo = 1001;
        phoneNumber = "016-307-5755";
        parkingPass = false;
        emailAddress = "nafisah.amin@gmail.com";
    }
    //Normal constructor
    Resident(String newName, int newUnitNo, String newPhoneNumber, boolean newParkingPass, String newEmailAddress){
        name = newName;
        unitNo = newUnitNo;
        phoneNumber = newPhoneNumber;
        parkingPass = newParkingPass;
        emailAddress = newEmailAddress;
    }

    /**METHODS */
    //Accessor method to EACH attributes (get)
    public String getName(){
        return name;
    }
    public int getUnitNo(){
        return unitNo;
    }
    public String getPhoneNum(){
        return phoneNumber;
    }
    public boolean getParkingPass(){
        return parkingPass;
    }
    public String getEmailAddress(){
        return emailAddress;
    }

    //Mutator method to EACH attributes (set)
    public void setName(String newName){
        name = newName;
    }
    public void setUnitNo(int newUnitNo){
        unitNo = newUnitNo;
    }
    public void setPhoneNum(String newPhoneNumber){
        phoneNumber = newPhoneNumber;
    }
    public void setParkingPass(boolean newParkingPass){
        parkingPass = newParkingPass;
    }
    public void setEmailAddress(String newEmailAddress){
        emailAddress = newEmailAddress;
    }

    //UML method
    public double parkingPass(){
        if (parkingPass == true){
            return 200.00;
        } else{
            return 0;
        }
    }

    //toString/Printer method
    public String toString(){
        return "\n----TENANT DETAILS----\nName: " + name + "\nUnit Number: " + unitNo + "\nPhone Number: " + phoneNumber + "\nParking Pass: " + parkingPass + "\nEmail Address: " + emailAddress + "\nParking Pass Charge: RM" + parkingPass();
    }
}