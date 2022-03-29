import java.io.*;
import java.util.*;
public class TestBst
{
    public static void main(String[] args)
    {
        try{
            BufferedReader br = new BufferedReader(new FileReader("Customer.txt"));

            String indata = null;
            BSTElectricity bstE = new BSTElectricity();

            while((indata=br.readLine())!=null)
            {
                StringTokenizer st = new StringTokenizer(indata,";");
                int id = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                char type = st.nextToken().charAt(0);
                String location = st.nextToken();
                double amt = Double.parseDouble(st.nextToken());

                Electricity e = new Electricity(id, name, type, location, amt);

                bstE.insertNode(e);
            }
            
            //count number of industrial building bills in Pahang
            System.out.println("No.of Industrial bills in Pahang " + bstE.countIndBuilding("Pahang"));
            
            //calculate total bill amount of all house in Johor
            System.out.println("Total bill of all house in Johor " + bstE.totalBill());
            
            //display all bills in ascending order
            System.out.println("List of all bills in ascending order");
            System.out.println("-------------------------------------------------");
            bstE.displayAscending();
            

            br.close();

        }
        catch (FileNotFoundException fnfe){System.out.println(fnfe.getMessage());}
        catch (IOException io){System.out.println(io.getMessage());}
        catch (Exception e){System.out.println(e.getMessage());} 
    }
}