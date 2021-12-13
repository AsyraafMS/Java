import java.util.Scanner;

public class Application{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        //input.useDelimiter("\n");
        
        String[] menu = {"Salmon","Catfish","Trout"};
        
        
        System.out.println("Enter Name: ");
        String name = input.nextLine();
        
        System.out.println("Enter Contact Number: ");
        String contactNum = input.nextLine();
        
        System.out.println("Enter Order Type (Broiler/Fryer): ");
        String orderType = input.nextLine();
        orderType.toLowerCase();
        
        System.out.println("Enter Order Menu: ");
        System.out.println(
        "____________MENU__________________"+
        "\n| --BROILER-- |    --FRYER--     |"+
        "\n|   Salmon    |    Fish plate    |"+
        "\n|   Catfish   |  Calamari plate  |"+
        "\n|    Trout    |  Fish and Chips  |"+
        "\n__________________________________");
        String orderMenu = input.nextLine();
        orderMenu.toLowerCase();
        
        System.out.println("Enter Quantity: ");
        int quantity = input.nextInt();
        input.nextLine();
        
        System.out.println("Enter Delivery Mode (R - Take Away / W - Delivery: ");
        char delivery = input.next().charAt(0);
        delivery = Character.toUpperCase(delivery);
        
        Customer details = new Customer(name, contactNum, orderType, orderMenu, quantity, delivery);
        System.out.println(details.toString());

    }
}


