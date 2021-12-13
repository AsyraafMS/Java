import java.util.Scanner;
public class Main
{
    public static void main (String [] args)
    {
        Order order[] = new Order[10];
        Scanner input = new Scanner(System.in);
        
        for ( int i = 0; i <10; i++)
        {
            order[i] = new Order();
            System.out.println("Order Data " + (i+1) + ": ");
            order[i].setData();
        }
        
        for (int j = 0; j<10; j++)
        {
            System.out.println("Enter promotion period:");
            boolean promotion = input.nextBoolean();
            
            if (promotion == true )
            {
                double totalPrice = order[j].calcPrice(15);
            }
        }
    }
}