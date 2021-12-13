import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class CustomerApp {
    
    public static void main(String [] args) {
        
        try {
            FileReader fr = new FileReader("order.txt");
            BufferedReader in = new BufferedReader(fr);
            
            FileWriter fwStaff = new FileWriter("staff.txt");
            BufferedWriter outStaff = new BufferedWriter(fwStaff);
            PrintWriter printStaff = new PrintWriter(outStaff);
            
            FileWriter fwStud = new FileWriter("student.txt");
            BufferedWriter outStud = new BufferedWriter(fwStud);
            PrintWriter printStud = new PrintWriter(outStud);
            
            String custName, custAddress, custPackage;
            int productID, quantity, total;
            double subtotal,gtotal,price;
            final double delivery = 11.00;
            Customer c;
            
            StringTokenizer input = null;
            String data = in.readLine();
            
            while(data != null) {
                input = new StringTokenizer(data, ":");
                
                //**a **/
                custName = input.nextToken();
                custAddress = input.nextToken();
                productID = Integer.parseInt(input.nextToken());
                quantity = Integer.parseInt(input.nextToken());
                custPackage = input.nextToken();
                
                c = new Customer(custName,custAddress,productID,quantity,custPackage);
                
                switch(c.getProductID()) {
                    case 101:
                        price = 200;
                        break;
                    case 102:
                        price = 170;
                        break;
                    case 103:
                        price = 350;
                        break;
                    case 104:
                        price = 500;
                        break;
                    default:
                        price = 0;
                }
                
                subtotal = price * c.getQuantity();
                gtotal = subtotal + delivery;
                
                if(c.getPakej().equalsIgnoreCase("Student")) {
                    gtotal = gtotal - (gtotal * 0.1);
                    printStud.println(c.getCustName() + ":" + c.getCustAddress() + ":" + c.getProductID() + ":" + c.getQuantity() + ":" + c.getPakej() + ":" + gtotal);
                } else {
                    gtotal = gtotal;
                    printStaff.println(c.getCustName() + ":" + c.getCustAddress() + ":" + c.getProductID() + ":" + c.getQuantity() + ":" + c.getPakej() + ":" + gtotal);
                }
                data = in.readLine();
            }
            printStaff.close();
            printStud.close();
        }
        catch(IOException iox){
            System.out.println("Problem reading " + iox.getMessage());
        }
    }
}
