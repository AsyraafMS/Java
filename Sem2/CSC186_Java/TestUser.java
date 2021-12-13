/*import java.util.Scanner; //Import the Scanner class
public class TestUser{
    public static void main(String[] args){
        Scanner identity = new Scanner(System.in); // Create a Scanner oibject
        System.out.println("Enter user ID: ");
        
        String userName = identity.nextLine(); //Read user input
        
        System.out.println("Enter password: ");
        
        String password = identity.nextLine(); //Read user input
        
        //System.out.println("Username is: " + userName);
        //System.out.println("Password is: " + password);
        
        String realId = "admin123";
        String realPass = "admin123";
        
        //Without boolean
        /**
        if (realId.equals(userName) && realPass.equals(password)){
            System.out.println("\nLogin Successful.\n");
        } else {
            System.out.println("\nLogin Failed, Wrong username/password.\n");
        }
        */
       /*
       //With boolean
        boolean verifyLogin = false;
        
        if (realId.equals(userName) && realPass.equals(password)){
            verifyLogin = true;
        }
        
        if (verifyLogin == true){
            System.out.println("\nLogin Successful.\n");
        } else {
            System.out.println("\nLogin Failed, Wrong username/password.\n");
        }
    }
}
*/