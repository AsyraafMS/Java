import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class CSC248Assessment1
{
    public static void main (String[] args)
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("maintenance.txt"));
            String indata = null;

            // 1) Declare an object of ArrayList named maintList
            ArrayList maintList = new ArrayList();
            

            while((indata=br.readLine())!=null)
            {
                StringTokenizer st = new StringTokenizer(indata, ";");
                String phoneNo = st.nextToken();
                String plateNo = st.nextToken();
                int serviceType = Integer.parseInt(st.nextToken());
                boolean aircond = Boolean.parseBoolean(st.nextToken());

                // 2) Insert data of Maintenance objects into maintList
                Maintenance obj = new Maintenance(phoneNo, plateNo, serviceType, aircond);
                maintList.add(obj);
            }
            System.out.println("===== Diplay maintList  =====");
            for (int i = 0; i < maintList.size(); i++){
                System.out.println(maintList.get(i).toString());
            }

            // 3) Calculate total charge of all type 5 service. (sum for all type 5 services maybe?)
            double sum = 0, charge = 0;
            for (int i = 0; i < maintList.size(); i++){
                if (((Maintenance)maintList.get(i)).getType() == 5){
                    //System.out.println(maintList.get(i).toString());
                    charge = ((Maintenance)maintList.get(i)).calcCharge();
                    sum += charge;
                }
            }
            System.out.println("\n===== Display total charge of all type 5 services. ====="); //should be 2600?
            System.out.println("Total charge for type 5 services: RM" + String.format("%.2f",sum));

            // 4) Move all Maintenance that needs aircond service into another list named aircondList. (remove old)
            ArrayList aircondList = new ArrayList();

            for (int i = 0; i < maintList.size(); i++){
                if (((Maintenance)maintList.get(i)).getAircond() == true){
                    aircondList.add(maintList.remove(i));
                    i--;
                }
            }
            System.out.println("\n===== Diplay maintList (After moving) =====");
            for (int i = 0; i < maintList.size(); i++){
                System.out.println(maintList.get(i).toString());
            }
            System.out.println("\n===== Diplay AircondList (After moving) =====");
            for (int i = 0; i < aircondList.size(); i++){
                System.out.println(aircondList.get(i).toString());
            }
            
        // 5) Sort maintList based on plate number in ascending order and display the sorted list.
            sortPlateNum(maintList);
            System.out.println("\n===== Diplay maintList (Sorted List) =====");
            for (int i = 0; i < maintList.size(); i++){
                System.out.println(maintList.get(i).toString());
            }

        // 6) Search for “JBX98” in maintList and change it’s aircond status to true. Please apply binary search algorithm.
            binarySearch(maintList, 0, maintList.size()-1, "JBX98");

            System.out.println("\n===== Diplay maintList (Sorted List) =====");
            for (int i = 0; i < maintList.size(); i++){
                System.out.println(maintList.get(i).toString());
            }
        }
        catch (Exception ex)
        {System.err.println(ex.getMessage());}
    }

    //Bubble Sort and Binary Search method algorithms
	public static void sortPlateNum(ArrayList arrList)
    {
        int n = arrList.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (((Maintenance)arrList.get(j)).getPlateNo().compareToIgnoreCase(((Maintenance)arrList.get(j+1)).getPlateNo())>0)//ascending; <0 (descending)
                {
                    Maintenance temp = (Maintenance)arrList.get(j);
                    arrList.set(j,arrList.get(j+1));
                    arrList.set(j+1, temp);
                }
    }
    public static void binarySearch(ArrayList arr, int first, int last, String key){  
        int mid = (first + last)/2;  
        while( first <= last ){  
            if ( ((Maintenance)arr.get(mid)).getPlateNo().compareToIgnoreCase(key)<0){  
                first = mid + 1;     
            }else if ( ((Maintenance)arr.get(mid)).getPlateNo().compareToIgnoreCase(key)==0 ){  
                //System.out.println("Element is found at index: " + mid);
                // create temp Maintenance obj with the value you want to change and replace into the list
                Maintenance temp = new Maintenance(((Maintenance)arr.get(mid)).getPhoneNo(),((Maintenance)arr.get(mid)).getPlateNo(),((Maintenance)arr.get(mid)).getType(), true);
                arr.remove(mid);
                arr.add(mid, temp);
                break;  
            }else{  
                last = mid - 1;  
            }   
            mid = (first + last)/2;  
        }  
        if ( first > last ){  
            System.out.println("Element is not found!");
        }  
    } 

	// 1) Declare an object of ArrayList named maintList (DAH)
	// 2) Insert data of Maintenance objects into maintList (DAH)
	// 3) Calculate total charge of all type 5 service. (DAH)
	// 4) Move all Maintenance that needs aircond service into another list named aircondList. (remove old) (DAH)
	// 5) Sort maintList based on plate number in ascending order and display the sorted list. (DAH)
	// 6) Search for “JBX98” in maintList and change it’s aircond status to true. Please apply binary search algorithm. (DAH)
     

}