//adib
import java.util.Scanner;
public class Client{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        
        System.out.println("Enter size of customer");
        int size = input.nextInt();
        
        Saloon saloon [] = new Saloon[size];
        
        for(int i = 0; i<saloon.length; i++){
            System.out.println("\nEnter your IC number");
            String ic = input.next();
            System.out.println("Enter your name");
            String name = input.next();
            System.out.println("Do you have a member (true/false)");
            boolean member = input.nextBoolean();
            System.out.println("Enter date (dd/mm/yyyy)");
            String date = input.next();
            System.out.println("Choose option \n(1. Body Treatment 2. HairTreatment)");
            int option = input.nextInt();
            
            if(option == 1){
                System.out.println("Enter your treatment type (Several/All)");  
                String type = input.next();
                saloon[i] = new BodyTreatment(ic, name, member, date, type);
                System.out.println(saloon[i].toString());
            }else{
                System.out.println("Rebonding?(true/false)");
                boolean rebonding = input.nextBoolean();
                System.out.println("Cutting?(true/false)");
                boolean cutting = input.nextBoolean();
                System.out.println("Washing?(true/false)");
                boolean washing = input.nextBoolean();
                System.out.println("Dyeing?(true/false)");
                boolean dyeing = input.nextBoolean();
                saloon[i] = new HairTreatment(ic, name, member, date, rebonding, cutting, washing, dyeing);
                System.out.println(saloon[i].toString());
            }
        }
    }
}