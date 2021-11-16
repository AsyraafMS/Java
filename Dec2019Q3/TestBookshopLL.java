
import java.util.*;
public class TestBookshopLL
{
    public static void main (String [] args){
        try {
            BookshopLinkedList bList1 = new BookshopLinkedList();
            Scanner in = new Scanner(System.in);

            int loop = 1;

            for(int i = 0; i<2; i++){
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

            //Search and display the title of the first book 
            //(smallest value of pubYear) written by
            //"James Gosling" in the bListl.
            loop = 1;
            //String key = "James Gosling";
            System.out.println("\n--- SEARCH AND DISPLAY ---");
            num = bList1.getFirst();
            while (num != null){
                System.out.println(num.getAuthor()+ "  "+ loop);
                if (num.getAuthor() == "James Gosling"){
                    System.out.println(num.toString());
                }
                num = bList1.getNext();
                loop++;
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
