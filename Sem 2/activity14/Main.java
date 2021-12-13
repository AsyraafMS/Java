import java.util.*;
public class Main {
    public static void main (String [] args){
        
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        System.out.print("Enter number of products: ");
        int products = input.nextInt();

        Product arrProducts [] = new Product[products];

        for (int i = 0; i < arrProducts.length; i++){
            System.out.println("\n----ORDER " + (i+1) +"----");
            System.out.print("Choose category\n---------------\n1. Equipment\n2. Medicine\n---------------\nType: ");
            int type = input.nextInt();
            System.out.print("Enter product name: ");
            String pName = input.next();

            System.out.print("Enter product price: RM");
            double pPrice = input.nextDouble();

            if (type == 1){
              arrProducts[i] = new MedicalEquip(pName, pPrice);
            
            } else if (type == 2){
                System.out.print("Enter expiration date: ");
                String expiration = input.next();

                arrProducts[i] = new Medicine(pName, pPrice, expiration);
            }
        }

        // i
        System.out.println("\nMost Expensive Equipment:");
        for (int count = 0; count < arrProducts.length; count++){
            if (arrProducts[count] instanceof MedicalEquip){
                double max = arrProducts[count].calcPayment(5);
                int holder = 0;
                for (int i = (count+1); i < arrProducts.length; i++){
                    if (arrProducts[i].calcPayment(5) > max){
                        max = arrProducts[i].calcPayment(5);
                        holder = i;
                    }
                }
                System.out.println(arrProducts[holder]);
                break;
            }
        }
        
        // ii
        System.out.println("\nMedicine Product List:");
        for (int count = 0, list = 0; count < arrProducts.length; count++){
            if (arrProducts[count] instanceof Medicine){
                if (arrProducts[count].getExpiry().equalsIgnoreCase("Dec 2019")){
                    list++;
                    System.out.println("("+list+")" + arrProducts[count]);
                }
            }
        }
    }
}
