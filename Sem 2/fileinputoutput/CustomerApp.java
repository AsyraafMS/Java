import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CustomerApp{
    public static void main (String [] args)
    {
        try {
            FileReader fr = new FileReader("order.txt");
            BufferedReader in = new BufferedReader(fr);

            FileWriter fwStaff = new FileWriter("staff.txt");
            BufferedWriter outStaff = new BufferedWriter(fwStaff);
            PrintWriter printStaff = new PrintWriter(outStaff);
            
            FileWriter fwStud = new FileWriter("student.txt");
            BufferedWriter outStud = new BufferedWriter(fwStud);
            PrintWriter printStud = new PrintWriter(outStud);

            double price, subtotal, grandttl, deliveryCharge = 11;
            String custName, custAddress, custPackage;
            int productID, quantity, total;

            Customer c;

            StringTokenizer input = null;
            String data = in.readLine();
            while(data != null)
            {
                input = new StringTokenizer(data,":");

                //***a***
                custName = input.nextToken();
                custAddress = input.nextToken();
                productID = Integer.parseInt(input.nextToken());
                quantity = Integer.parseInt(input.nextToken());
                custPackage = input.nextToken();

                c = new Customer(custName, custAddress, productID, quantity, custPackage);

                //***b***
                if (c.getProductID() == 101){
                    price = 200;
                } else if (c.getProductID() == 102){
                    price = 170;
                } else if (c.getProductID() == 103){
                    price = 350;
                } else if (c.getProductID() == 104){
                    price = 500;
                } else {
                    price = 0;
                }
                subtotal = price * c.getQuantity();
                grandttl = subtotal + deliveryCharge;

                //***c***
                if(c.getPakej().equalsIgnoreCase("Student")){
                    grandttl = grandttl - (grandttl * 0.1);
                    printStud.println(c.getName() + ":" + c.getAddress() + ":" + c.getProductID() + ":" + c.getQuantity() + ":" + c.getPakej() + ":" + grandttl);
                } else {
                    grandttl = grandttl;
                    printStaff.println(c.getName() + ":" + c.getAddress() + ":" + c.getProductID() + ":" + c.getQuantity() + ":" + c.getPakej() + ":" + grandttl);
                }
                data = in.readLine();
            }
            printStaff.close();
            printStud.close();
            
        } catch (IOException iox) {
            System.out.println("Problem reading " + iox.getMessage());
        }
    }
}