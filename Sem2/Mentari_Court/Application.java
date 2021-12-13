import java.util.Scanner;
public class Application {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
      //input.useDelimiter("\n"); //for some reason this breaks the scanner code (line 13,14 & 20,21)

        System.out.println("Enter Name: ");
        String name = input.nextLine();

        System.out.println("Enter Unit Number: ");
        int unitNo = input.nextInt();  //line 13
        input.nextLine();

        System.out.println("Enter Phone Number: ");
        String phoneNum = input.nextLine();

        System.out.println("Enter Parking Pass (true/false): ");
        boolean parkingPass = input.nextBoolean();  //line 20
        input.nextLine();

        System.out.println("Enter Email Address: ");
        String emailAddress = input.nextLine();

        Resident tenantBlockA = new Resident(name,unitNo,phoneNum,parkingPass,emailAddress);
        Resident tenantBlockB = new Resident();
        
        System.out.println(tenantBlockA.toString());
        System.out.println(tenantBlockB.toString());
 
    }
}
