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

        // Integer temp = intList.removeAtBack();
        // System.out.println(temp);

        intList.removeAtBack();
        num = intList.getFirst();
        loop = 1;

        while ( num != null){
            System.out.println("["+loop+"]"+" intList: "+ num);
            loop++;
            num = intList.getNext();
        }
        System.out.println("-------------------------");


        // 2) remove all odd numbers
        System.out.println("\n--- REMOVE ALL ODD NUMBERS ---");
        intList.removeOdd();
        num = intList.getFirst();
        loop = 1;

        while ( num != null){
            System.out.println("["+loop+"]"+" intList: "+ num);
            loop++;
            num = intList.getNext();
        }
        System.out.println("-------------------------");
    }
}