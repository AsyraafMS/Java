public class User{
    /** properties/field/attributes */
    private String userId = "admin123";
    private String password = "admin123";
    //For user input
    private String uInput;
    private String pInput;

    /** constructor*/
    public User(){
    }

    public void setCredentials(String Id, String pass){
        pInput = pass;
        uInput = Id;
    }

    /**method */
    public boolean verifyLogin(){
        if (uInput.equals(userId) && pInput.equals(password)){
            return true;
        } else{
            return false;
        }
    }

}
