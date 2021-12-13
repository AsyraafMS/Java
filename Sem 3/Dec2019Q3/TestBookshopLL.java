
import java.util.*;
public class TestBookshopLL
{
    public static void main (String [] args){
        try {
            BookshopLinkedList bList1 = new BookshopLinkedList();
            Scanner in = new Scanner(System.in);

            int loop = 1;

            for(int i = 0; i<3; i++){
                System.out.println("Input :" + loop);
                System.out.print("["+loop+"]"+"Enter title: ");
                String title = in.nextLine();
    
                System.out.print("["+loop+"]"+"Author: ");
                String author = in.nextLine();
    
                System.out.print("["+loop+"]"+"Year Published: ");
                int year = in.nextInt();
                in.nextLine();
                System.out.println("");
    
                Book obj = new Book(title, author, year);
                bList1.addFirst(obj);
                loop++;
            }
            in.close();

            // b) Count and siplay the total number of Book objects
            // in the bList1 that are published in the year 2019
            System.out.println("--- COUNT AND DISPLAY ---");
            Book num = bList1.getFirst();
            int count = 1;

            while (num != null){
                if (num.getYear() == 2019){
                    System.out.println("["+count+"] "+ num.toString());
                    count++;
                }
                num = bList1.getNext();
            }
            count--;
            System.out.println("Total Books in 2019: "+ count);

            // --- cari min sat ---
            // num = bList1.getFirst();
            // int min = num.getYear();
            // while (num != null){
            //     if (num.getYear() < min){
            //         min = num.getYear();
            //     }
            //     num = bList1.getNext();
            // }

            //Search and display the title of the first book 
            //(smallest value of pubYear) written by
            //"James Gosling" in the bListl.
            System.out.println("\n--- SEARCH AND DISPLAY ---");
            num = bList1.getFirst();
            int min = num.getYear();
            while (num != null){
                if (num.getYear() <= min && num.getAuthor().equalsIgnoreCase("james gosling")){
                    System.out.println(num.toString());
                }
                num = bList1.getNext();
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
