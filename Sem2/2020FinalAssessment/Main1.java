import java.util.*;
public class Main1 {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        System.out.print("Enter size: ");
        int cshake = input.nextInt();

        RHDrink CoconutShake [] = new CoconutShake[cshake];
        double specialReq [] = new double[cshake];

        for (int i = 0; i < CoconutShake.length; i++){
            System.out.println("\n---Object "+(i+1)+"---");

            System.out.print("Enter customer no: ");
            String custNo = input.next();

            System.out.print("Enter customer name: ");
            String custName = input.next();

            System.out.print("Enter number of order: ");
            int numOrder = input.nextInt();

            System.out.print("Enter cup size: ");
            char nutSize = input.next().charAt(0);

            CoconutShake[i] = new CoconutShake(custNo, custName, numOrder, nutSize);
            specialReq[i] = ((CoconutShake) CoconutShake[i]).specialRequest();
       
            CoconutShake[i].getCustNo();
       
        }
        
        System.out.println("\n---ORDER DETAILS---");
        System.out.print("No.     Customer No.    Total Price (RM)\n====    ============    ================");
        for (int count = 0; count < CoconutShake.length; count++){
            System.out.print("\n"+String.format("%04d", count+1) +"    "+ String.format("%012d", Integer.parseInt(CoconutShake[count].getCustNo())) +"    "+specialReq[count]);
        }
    }
}
