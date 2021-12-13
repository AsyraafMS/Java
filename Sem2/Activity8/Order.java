import java.util.Scanner;
public class Order
{
    private String name;
    private String phoneNo;
    private Date date;
    private char packages;
    private int numCustomer;

    public Order()
    {
        name = null;
        phoneNo = null;
        date = null;
        packages = 0;
        numCustomer = 0;
    }
    
    public void setData()
    {
        Scanner input = new Scanner(System.in);
        Date date1 = new Date();
        System.out.println("\nEnter Name: ");
        name = input.nextLine();
        System.out.println("Enter Phone No: ");
        phoneNo = input.nextLine();
        date = date1.promptDate();
        System.out.println("Enter package: ");
        packages = input.next().charAt(0);
        System.out.println("Enter pax: ");
        numCustomer = input.nextInt();
    }
    
    public int getCustomer()
    {
        return numCustomer;
    }
    
    public double calcPrice()
    {
        double totalPrice = 0;
        if (packages == 'A' )
        {
            if (numCustomer < 1000)
            {
                totalPrice = 25.00 * numCustomer;  
            } else if (numCustomer > 1000)
            {
                totalPrice = 25.00 * numCustomer * 0.9;
            }
        } else if (packages == 'B')
        {
            if (numCustomer < 1000)
            {
                totalPrice = 35.00 * numCustomer;  
            } else if (numCustomer > 1000)
            {
                totalPrice = 35.00 * numCustomer * 0.9;
            }
        } else if (packages == 'C')
        {
            if (numCustomer < 1000)
            {
                totalPrice = 45.00 * numCustomer;  
            } else if (numCustomer > 1000)
            {
                totalPrice = 45.00 * numCustomer * 0.9;
            }
        }
        return totalPrice;
    }
    
    public double test()
    {
        double price = 0; // initialize
        if (packages == 'A')
        {
            price = 25;  // set variable
        }
        return price; // return
    }
    
    public double calcPrice(double disc)
    {
        double totalPrice = 0;
         if (packages == 'A' )
        {
            totalPrice = 25.00 * numCustomer * (1 - (disc/100));
        }  else if (packages == 'B' )
        {
            totalPrice = 35.00 * numCustomer * (1 - (disc/100));
        }   else if (packages == 'C' )
        {
            totalPrice = 45.00 * numCustomer * (1 - (disc/100));
        } 
        return totalPrice;
    }
    
    public boolean isExpensive (Order order)
    {

        if (calcPrice() > order.calcPrice())
        {
            return true;
        } else {
            return false;
        }
    }
    
    public String toString()
    {
        return
         ("\nName: " +name 
        + "\nPhone No: " + phoneNo 
        + "\nDate: "  + date.toString()
        + "\nPackage: " + packages 
        + "\nPax: " + numCustomer);
    }
}
