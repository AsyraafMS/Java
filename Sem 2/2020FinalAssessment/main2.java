import java.util.*;
public class main2 {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        CleaningService service [] = new CleaningService[100];

        System.out.print("----Total Charges for Clients in Johor Zone----");
        for (int i = 0; i < service.length; i++){
            if (service[i].getClientZone().equalsIgnoreCase("Johor")){
                System.out.println("Client "+(i+1)+" : RM"+service[i].calcCleaningCharges());
            }
        }

        int count = 0;
        for (int i = 0; i < service.length; i++){
            if (((SpringCleaning) service[i]).getCleanMaterial() == true){
                count++;
            }
        }
        System.out.println("Number of clients requesting cleaning materials: "+ count);
    }
}
