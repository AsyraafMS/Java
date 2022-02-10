/**
 * MilkLive Program (Group Assignment)
 * 
 * @ Created by (Aiman Afzan, Sarra Aisya, Nur Syahirah)
 * @ Version : 16/1/2022
 */
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;

public class MilkLiveAppMain
{
   public static void main (String[] args){
       try{
           FileReader inFile = new FileReader("milkLiveOrder.txt");
           BufferedReader inReader = new BufferedReader(inFile);
           
           String inData = null;
           
           LinkedList cupsOrderedLL = new LinkedList();
           
           while((inData = inReader.readLine()) != null){
                StringTokenizer input = new StringTokenizer(inData, ";");
                
                String custName = input.nextToken();
                String cupSize = input.nextToken();
                boolean membership = Boolean.parseBoolean(input.nextToken());
                boolean addOn = Boolean.parseBoolean(input.nextToken());
                String flavour = input.nextToken();
                double price = Double.parseDouble(input.nextToken());
                
                MilkLive orderList = new MilkLive(custName, cupSize, membership, addOn, flavour, price);
                cupsOrderedLL.addLast(orderList);
                
                inData = inReader.readLine();
            }
            
            // Table Template For The Output
            System.out.println("===========================================================================================================================");
            System.out.println("\t\t\t\t\t\tMILKLIVE PROGRAM");
            System.out.println("===========================================================================================================================");
            System.out.println("CUSTOMER NAME\t\tCUP SIZE\t\tMEMBERSHIP\tADD ON\t\tFLAVOUR\t\tPRICE (RM)");
            
            for (int i = 0; i < cupsOrderedLL.size(); i++){
                System.out.println(cupsOrderedLL.get(i).toString());
            }
            
            System.out.println("===========================================================================================================================");
    
            inReader.close();
        }
        
        catch(FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
        }
        catch(IOException io){
            System.out.println(io.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
          
    }
}
