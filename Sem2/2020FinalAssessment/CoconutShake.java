import java.util.*;
public class CoconutShake extends RHDrink{
    //data members
    private char size;

    //normal constructor
    public CoconutShake(String no, String name, int orderNum, char size){
        super(no, name, orderNum);
        this.size = size;
    }

    //methods
    public double calcPrice(){
        double price = 0.0;

        switch (size){
            case 'S':
                price = 3.50;
                break;

            case 'M':
                price = 4.50;
                break;

            case 'L':
                price = 6.00;
                break;
        }
        return price * super.getNumOfOrder();
    }

    public double specialRequest(){
        double price = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Add toppings? [Y/N] : ");
        char opt = input.next().charAt(0);

        if (super.addTopping(opt) == true){
            System.out.println("---TOPPING VARIETY---\n[1] - Ice Cream\n[2] - Whipped Cream");
            System.out.print("Choice: ");
            int opt2 = input.nextInt();
            input.close();
            switch (opt2){
                case 1:
                    price = 5.50;
                    break;
                case 2:
                    price = 4.50;
                    break;
            }
        }
        price = ( price* super.getNumOfOrder() ) + calcPrice();
        return price;
    }

    public String toString(){
        return "Coconut Shake Size: " + size + "\nTotal Price: RM" + specialRequest();
    }
}
