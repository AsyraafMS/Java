import java.util.Scanner;
public class UserTester {
    public static void main(String[] args){
        User user = new User();
        Scanner input = new Scanner(System.in);
        
        System.out.println("User ID: ");
        String username = input.nextLine();
        System.out.println("Password: ");
        String password = input.nextLine();
        
        user.setCredentials(username, password);
        System.out.println("Status: " + user.verifyLogin());
    }
}