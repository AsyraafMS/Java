import java.util.Scanner;

public class TestNum
{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        LinkedList intList = new LinkedList();

        for (int i = 0; i < 5; i++){
            System.out.print("Enter 5 integers: ");
            Integer data = scan.nextInt();
            
            intList.insertAtBack(data);
        }
        scan.close();

        System.out.println("\n--- DISPLAY ALL DATA ---");
        Integer num = intList.getFirst();
        int loop = 1;
        while (num != null){
            System.out.println("["+loop+"] : "+ num);
            loop++;
            num = intList.getNext();
        }
        System.out.println("-------------------------");

        // 1) total of all numbers
        System.out.println("\n--- TOTAL ALL NUMBERS ---");
        num = intList.getFirst();
        Integer sum = 0;

        while ( num != null){
            sum += num;
            num = intList.getNext();
        }
        System.out.println("Sum of intList: " + sum);
        System.out.println("-------------------------");


        // 2) remove the last node
        System.out.println("\n--- REMOVE LAST NODE ---");
        Integer last = intList.removeAtBack();
        num = intList.getFirst();
        loop = 1;

        while ( num != null){
            System.out.println("["+loop+"]"+" intList: "+ num);
            loop++;
            num = intList.getNext();
        }
        System.out.println("Removed Integer: " + last);
        System.out.println("-------------------------");

        //3 
        int count = 0, sumEven = 0;
        num = intList.getFirst();
        while( num != null){
            if( num % 2 == 0){
                count++;
                sumEven += num;
            }
            num = intList.getNext();
        }
        System.out.println("\n--- TOTAL EVEN NUMBERS ---");
        System.out.println("Count even number(s): " + count + "\nSum of even numbers: " + sumEven + "\n-------------------------");
    }

     

     
}