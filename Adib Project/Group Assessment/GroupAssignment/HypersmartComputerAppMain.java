/**
 * Group Assignment Hypersmart Computer Shop Class HypersmartComputerAppMain.
 *
 * @author (Akif Irfan & Adib Fikri & Ilyas)
 * @version (6/12/2021)
 */
import java.util.*;
import java.io.*;
import java.text.*;
public class HypersmartComputerAppMain
{
    public static void main(String [] args)
    {
        try
        {
            DecimalFormat df = new DecimalFormat("0.00");

            FileReader inFile = new FileReader("hypersmart.txt");
            BufferedReader inReader = new BufferedReader(inFile);

            String inData = null;
            Queue listComputer = new Queue();
            HypersmartComputer obj;
            Queue temp = new Queue();

            while ((inData = inReader.readLine()) != null)
            {
                StringTokenizer input = new StringTokenizer(inData,";");
                String computerBrand = input.nextToken();
                String computerModel = input.nextToken();
                String computerCPU = input.nextToken();
                int cpuNumberOfCores = Integer.parseInt(input.nextToken());
                int computerRam = Integer.parseInt(input.nextToken());
                int computerStorage = Integer.parseInt(input.nextToken());
                String computerGPU = input.nextToken();
                double computerPrice = Double.parseDouble(input.nextToken());

                HypersmartComputer list = new HypersmartComputer(computerBrand, computerModel, computerCPU, cpuNumberOfCores, computerRam, computerStorage, computerGPU, computerPrice);
                listComputer.enqueue(list);
            }

            /**TABLE TEMPLATE FOR OUTPUT*/
            System.out.println("===========================================================================================================================");
            System.out.println("\t\t\t\t\t\tHYPERSMART COMPUTER");
            System.out.println("===========================================================================================================================");
            System.out.println("BRAND\t\tMODEL\t\tCPU\tNumber Of Cores\t\tRAM\t\tStorage\t\tGPU\t\tPrice (RM)");
            System.out.println("===========================================================================================================================");
            while (!listComputer.isEmpty())
            {
                obj = (HypersmartComputer)listComputer.dequeue();
                System.out.println(obj.toString());
                temp.enqueue(obj);
            }
            System.out.println("===========================================================================================================================");

            while (!temp.isEmpty())
            {
                listComputer.enqueue(temp.dequeue());
            }

            /**Separate the computer that has Intel and AMD CPU into two different linkedList named listIntel and listAMD*/
            LinkedList listIntel = new LinkedList();
            LinkedList listAMD = new LinkedList();
            while (!listComputer.isEmpty())
            {
                obj = (HypersmartComputer)listComputer.dequeue();
                if (obj.getComputerCPU().equalsIgnoreCase("Intel"))
                {
                    listIntel.insertAtFront(obj);
                }
                else if (obj.getComputerCPU().equalsIgnoreCase("AMD"))
                {
                    listAMD.insertAtFront(obj);
                }
                temp.enqueue(obj);
            }

            while (!temp.isEmpty())
            {
                listComputer.enqueue(temp.dequeue());
            }

            System.out.println();
            System.out.println("===========================================================================================================================");
            System.out.println("\t\t\t\t\tHYPERSMART COMPUTER WITH INTEL CPU LIST");
            System.out.println("===========================================================================================================================");
            System.out.println("BRAND\t\tMODEL\t\tCPU\tNumber Of Cores\t\tRAM\t\tStorage\t\tGPU\t\tPrice (RM)");
            System.out.println("===========================================================================================================================");
            obj = (HypersmartComputer)listIntel.getFirst();
            while (obj != null)
            {
                System.out.println(obj.toString());
                obj = (HypersmartComputer)listIntel.getNext();
            }
            System.out.println("===========================================================================================================================");

            System.out.println();
            System.out.println("===========================================================================================================================");
            System.out.println("\t\t\t\t\tHYPERSMART COMPUTER WITH AMD CPU LIST");
            System.out.println("===========================================================================================================================");
            System.out.println("BRAND\t\tMODEL\t\tCPU\tNumber Of Cores\t\tRAM\t\tStorage\t\tGPU\t\tPrice (RM)");
            System.out.println("===========================================================================================================================");
            obj = (HypersmartComputer)listAMD.getFirst();
            while (obj != null)
            {
                System.out.println(obj.toString());
                obj = (HypersmartComputer)listAMD.getNext();
            }
            System.out.println("===========================================================================================================================");

            System.out.println();
            System.out.println("===========================================================================================================================");
            System.out.println("\t\t\t\t\t\tHYPERSMART COMPUTER DETAILS");
            /**Calculate total price for each type of computers based on the CPU*/
            obj = (HypersmartComputer)listIntel.getFirst();
            double sumIntel = 0;
            while (obj != null)
            {
                sumIntel = sumIntel + obj.getComputerPrice();
                obj = (HypersmartComputer)listIntel.getNext();
            }
            System.out.println("===========================================================================================================================");
            System.out.println("Total price for computers that use Intel CPU is : RM" + df.format(sumIntel));

            obj = (HypersmartComputer)listAMD.getFirst();
            double sumAMD = 0;
            while (obj != null)
            {
                sumAMD = sumAMD + obj.getComputerPrice();
                obj = (HypersmartComputer)listAMD.getNext();
            }
            System.out.println("Total price for computers that use AMD CPU is : RM" + df.format(sumAMD));
            System.out.println("===========================================================================================================================");

            /**Count each type of the computers based on the CPU*/
            obj = (HypersmartComputer)listIntel.getFirst();
            int countIntel = 0;
            while (obj != null)
            {
                countIntel = countIntel + 1;
                obj = (HypersmartComputer)listIntel.getNext();
            }
            System.out.println("Total of computers that use Intel CPU is : " + countIntel);

            obj = (HypersmartComputer)listAMD.getFirst();
            int countAMD = 0;
            while (obj != null)
            {
                countAMD = countAMD + 1;
                obj = (HypersmartComputer)listAMD.getNext();
            }
            System.out.println("Total of computers that use AMD CPU is : " + countAMD);
            System.out.println("===========================================================================================================================");

            /**Calculate average price for each type of computers.*/
            double averageIntel = 0;
            averageIntel = sumIntel / countIntel;
            double averageAMD = 0;
            averageAMD = sumAMD / countAMD;
            System.out.println("Average price for computers that use Intel CPU is : RM" + df.format(averageIntel));
            System.out.println("Average price for computers that use AMD CPU is : RM" + df.format(averageAMD));
            System.out.println("===========================================================================================================================");

            /**Find the highest price and lowest price for each type of computers*/
            HypersmartComputer lowestIntel = (HypersmartComputer)listIntel.getFirst();
            obj = (HypersmartComputer)listIntel.getFirst();
            while (obj != null)
            {
                if (obj.getComputerPrice() < lowestIntel.getComputerPrice())
                {
                    lowestIntel = obj;
                }
                obj = (HypersmartComputer)listIntel.getNext();
            }
            System.out.println("Lowest price for computer that use Intel CPU is : RM" + df.format(lowestIntel.getComputerPrice()));

            HypersmartComputer highestIntel = (HypersmartComputer)listIntel.getFirst();
            obj = (HypersmartComputer)listIntel.getFirst();
            while (obj != null)
            {
                if (obj.getComputerPrice() > highestIntel.getComputerPrice())
                {
                    highestIntel = obj;
                }
                obj = (HypersmartComputer)listIntel.getNext();
            }
            System.out.println("Highest price for computer that use Intel CPU is : RM" + df.format(highestIntel.getComputerPrice()));

            HypersmartComputer lowestAMD = (HypersmartComputer)listAMD.getFirst();
            obj = (HypersmartComputer)listAMD.getFirst();
            while (obj != null)
            {
                if (obj.getComputerPrice() < lowestAMD.getComputerPrice())
                {
                    lowestAMD = obj;
                }
                obj = (HypersmartComputer)listAMD.getNext();
            }
            System.out.println("Lowest price for computer that use AMD CPU is : RM" + df.format(lowestAMD.getComputerPrice()));

            HypersmartComputer highestAMD = (HypersmartComputer)listAMD.getFirst();
            obj = (HypersmartComputer)listAMD.getFirst();
            while (obj != null)
            {
                if (obj.getComputerPrice() > highestAMD.getComputerPrice())
                {
                    highestAMD = obj;
                }
                obj = (HypersmartComputer)listAMD.getNext();
            }
            System.out.println("Highest price for computer that use AMD CPU is : RM" + df.format(highestAMD.getComputerPrice()));
            System.out.println("===========================================================================================================================");

            /**Search for computer that use Intel CPU and have a price of RM3250*/
            System.out.println();
            System.out.println("===========================================================================================================================");
            System.out.println("\t\t\t SEARCHING FOR COMPUTER THAT USE INTEL CPU AND HAVE A PRICE OF RM3250");
            obj = (HypersmartComputer)listIntel.getFirst();
            double searchPrice = 3250;
            boolean found = false;
            HypersmartComputer search = obj;

            while (obj != null)
            {
                if (obj.getComputerPrice() == searchPrice)
                {
                    found = true;
                    search = obj;
                }
                obj = (HypersmartComputer)listIntel.getNext();
            }

            if (found == true)
            {
                System.out.println("===========================================================================================================================");
                System.out.println("\t\t\t\t\t     THE COMPUTER INFORMATIONS");
                System.out.println("===========================================================================================================================");
                System.out.println("BRAND\t\tMODEL\t\tCPU\tNumber Of Cores\t\tRAM\t\tStorage\t\tGPU\t\tPrice (RM)");
                System.out.println("===========================================================================================================================");
                System.out.println(search.toString());
                System.out.println("===========================================================================================================================");
            }
            else
            {
                System.out.println("===========================================================================================================================");
                System.out.println("\t\t     THE COMPUTER THAT USE INTEL CPU AND HAVE A PRICE OF RM3250 IS NOT AVAILABLE");
                System.out.println("===========================================================================================================================");
            }

            inReader.close();
        }

        catch(FileNotFoundException fnfe)
        {
            System.out.println(fnfe.getMessage());
        }
        catch(IOException io)
        {
            System.out.println(io.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
