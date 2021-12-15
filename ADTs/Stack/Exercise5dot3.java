import java.util.Scanner;
import java.util.Stack;

public class Exercise5dot3
{
    public static void main(String [] args){

        //b)
            //i. inserting the books object into stack

        Scanner in = new Scanner(System.in);
        Stack bookStack = new Stack();

        for (int i = 0; i < 2; i++) // sample size
        {
            System.out.print("Serial Number : ");
            String serial = in.next();

            System.out.print("Author : ");
            String author = in.next();

            System.out.print("Title: ");
            String title = in.next();

            System.out.print("Price : RM");
            double price = in.nextDouble();

            Book bookObj = new Book(serial, author, title, price);
            bookStack.push(bookObj);
        }
        in.close();

            //ii. displaying the book that is at the top of the stack

        System.out.println("Book at the top of the stack: " + bookStack.peek().toString() );

            //iii. calculating the total price of the books

        Stack tempStack = new Stack();
        double sum = 0;
        while (!bookStack.isEmpty()){
            Book tempObj = (Book) bookStack.pop();

            sum += tempObj.getPrice();

            tempStack.push(tempObj);
        }
        System.out.println("Total Price: RM" + sum);

        while (!tempStack.isEmpty()){
            bookStack.push(tempStack.pop());
        }

            //iv. replace calc with display detail of the most expensive and the cheapest 
        
        Book min = (Book) bookStack.pop(); // get first data (removed from book stack)
        bookStack.push(min); // reinserting into book stack

        while (!bookStack.isEmpty()){
            Book tempObj = (Book) bookStack.pop();

            if (tempObj.getPrice() < min.getPrice()){ // comparing min
                min = tempObj;
            }

            tempStack.push(tempObj);
        }
        System.out.println("Cheapest Book: "+ min.toString());

        while (!tempStack.isEmpty()){
            bookStack.push(tempStack.pop());
        }

        Book max = (Book) bookStack.pop(); // get first data (removed from book stack)
        bookStack.push(max); // reinserting into book stack

        while (!bookStack.isEmpty()){
            Book tempObj = (Book) bookStack.pop();

            if (tempObj.getPrice() > max.getPrice()){ // comparing max
                max = tempObj;
            }

            tempStack.push(tempObj);
        }
        System.out.println("Most Expensive Book: "+ max.toString());

        while (!tempStack.isEmpty()){
            bookStack.push(tempStack.pop());
        }

    }
}
