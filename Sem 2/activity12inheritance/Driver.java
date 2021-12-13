import java.util.*;
public class Driver {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        System.out.println("Enter customer count: ");
        int customer = input.nextInt();

        Saloon saloon [] = new Saloon[customer];

        for (int i = 0; i < saloon.length; i++){
            System.out.println("\n----CUSTOMER " + (i+1) + " ----");
            System.out.println("\nEnter IC number: ");
            String ic = input.next();
            
            System.out.println("\nEnter name: ");
            String name = input.next();

            System.out.println("\nEnter membership: ");
            boolean memship = input.nextBoolean();

            System.out.println("\nEnter date: ");
            String date = input.next();
            System.out.println("Choose treatment:" + "\n1. Body Treatment" + "\n2. Hair Treatment");
            int treatment = input.nextInt();

            if(treatment == 1){
                System.out.println("Enter your treatment type (Several/All)");  
                String type = input.next();
                saloon[i] = new BodyTreatment(ic, name, memship, date, type);
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
                saloon[i] = new HairTreatment(ic, name, memship, date, rebonding, cutting, washing, dyeing);
                System.out.println(saloon[i].toString());
            }
        }
    }
}

