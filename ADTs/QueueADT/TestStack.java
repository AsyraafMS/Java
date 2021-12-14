import java.time.temporal.Temporal;
import java.util.Scanner;
import java.util.Stack;

public class TestStack {
    public static void main (String [] args){
       Scanner in = new Scanner(System.in);

       Stack personStack = new Stack();

       for (int i = 0; i < 2; i++) // sample size 5
       {
           System.out.print("Name : ");
           String name = in.next();

           System.out.print("Age : ");
           int age = in.nextInt();

           System.out.print("Gender [M/F]: ");
           char gender = in.next().charAt(0);

           Person orang = new Person(name, age, gender);
           personStack.push(orang);
       }
       in.close();

       // count all female persons

       int count = 0;

       Stack tempStack = new Stack();

       while (!personStack.isEmpty()){
            Person tempObj = (Person) personStack.pop();

            if (tempObj.getGender() == 'F'){
                count++;
            }

            tempStack.push(tempObj);
        }
        System.out.println("No. of female : " + count);

        while (!tempStack.isEmpty()){
            personStack.push(tempStack.pop());
        }

        //display details of all person age over 60

        while (!personStack.isEmpty()){
            Person tempObj = (Person) personStack.pop();

            if ( tempObj.getAge() > 60 ){
                System.out.println(tempObj.toString());
            }

            tempStack.push(tempObj);
        }
        while ( !tempStack.isEmpty()){
            personStack.push(tempStack.pop());
        }

        // create two queues that would store all person with name starts wil letter A and the other to store person with name starts with other letters
        Stack queueA = new Stack();
        Stack queueBZ = new Stack();
 
        while (!personStack.isEmpty())
        {
            Person tempObj = (Person) personStack.pop(); // removing front
 
            if (tempObj.getName().startsWith("A")){
                 queueA.push(tempObj);
             } else {
                queueBZ.push(tempObj);
            }
            tempStack.push(tempObj); // to reinsert
        }
 
        while(!tempStack.isEmpty())
        {
            personStack.push(tempStack.pop()); // reinserting
        }
        personStack.peek().toString();

        // 5.2, 5.3, 5.4
        //replace calc with display detail of the most expensive and the cheapest 

        //Exercise 5.2 (tracing the stack program)
        /*
        4 -> 3 -> 2 -> 1


        The top element in the stack is 4
        The size of the stack is 3
        Data in the stack: 1 2 3

        */

        //Exercise 5.3 
        /*
        a)
        public class Book{
            private String serial_number;
            private String author;
            private String title;
            private double price;

            //constructor
            public Book(String serial_number, String author, String title, double price){
                this.serial_number = serial_number;
                this.author = author;
                this.title = title;
                this.price = price;
            }

            //accessor
            public String getSerialNum(){ return serial_number;}
            public String getAuthor(){ return author;}
            public String getTitle(){ return title;}
            public double getPrice(){ return price;}

            //mutator
            public void setSerialNum(){ this.serial_number = serial_number;}
            public void setAuthor(){  this.author = author;}
            public void setTitle(){  this.title =  title;}
            public void setPrice(){  this.price = price;}

            //display
            public String toString(){
                return "Serial Number: " + serial_number + "\nAuthor: " + author + "\nTitle: " + title
                + "\nPrice: RM" + price; 
            }
        }

        b)
            i. inserting the books object into stack

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

            ii. displaying the book that is at the top of the stack

        System.out.println("Book at the top of the stack: " + bookStack.peek().toString() );

            iii. calculating the total price of the books

        Stack tempStack = new Stack();
        double sum = 0;
        while (!bookStack.isEmpty()){
            Book tempObj = (Book) bookStack.pop();

            sum += tempObj.getPrice();

            tempStack.push(tempObj);
        }
        System.out.println("Total Price: RM" + sum);

        while (!tempStack.isEmpty()){
            personStack.push(tempStack.pop());
        }

            iv. replace calc with display detail of the most expensive and the cheapest 
        
        Book min = (Book) bookStack.pop(); // get first data (removed from book stack)
        personStack.push(min); // reinserting into book stack

        while (!bookStack.isEmpty()){
            Book tempObj = (Book) bookStack.pop();

            if (tempObj.getPrice() < min.getPrice()){
                min = tempObj;
            }

            tempStack.push(tempObj);
        }
        System.out.println("Cheapest Book: "+ min.toString();)

        while (!tempStack.isEmpty()){
            personStack.push(tempStack.pop());
        }

        Book max = (Book) bookStack.pop(); // get first data (removed from book stack)
        personStack.push(min); // reinserting into book stack

        while (!bookStack.isEmpty()){
            Book tempObj = (Book) bookStack.pop();

            if (tempObj.getPrice() > min.getPrice()){
                max = tempObj;
            }

            tempStack.push(tempObj);
        }
        System.out.println("Most Expensive Book: "+ max.toString();)

        while (!tempStack.isEmpty()){
            personStack.push(tempStack.pop());
        }
        
        */




    }
}
