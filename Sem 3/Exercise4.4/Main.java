import java.util.Scanner;
public class Main
{
    public static void main (String [] args){
       Scanner in = new Scanner(System.in);

       // a
       Queue houseQ = new Queue();

       for (int i = 0; i < 20; i++) // sample size 20
       {
           System.out.print("lotNo : ");
           int lotNo = in.nextInt();

           System.out.print("Type : ");
           String type = in.next();

           System.out.print("Price: ");
           Double price = in.nextDouble();

           // inputting stuff

           House temp = new House(lotNo, type, price);
           houseQ.enqueue(temp);
       }
       in.close();

       // b
       Queue tempQ = new Queue();
       while ( !houseQ.isEmpty() )
       {
            House temp = (House) houseQ.dequeue();

            if ( temp.getPrice() > 70000 ){ 
                double price = 0;
                price = 0.7 * temp.getPrice();
               temp.setPrice(price);
            }
            tempQ.enqueue(temp);
       }
       while (!tempQ.isEmpty()){
           houseQ.enqueue(tempQ.dequeue());
       }
     // idk

    // c)
    Queue bunglowQ = new Queue();
    Queue doubleQ = new Queue();
    while ( !houseQ.isEmpty() )
       {
            House temp = (House) houseQ.dequeue();

            if ( temp.theType().equalsIgnoreCase("bungalow" ) ){ 
                bunglowQ.enqueue(temp); // temp is not a queue, its an object, hence no need to .dequeue()
            } else if ( temp.theType().equalsIgnoreCase("doublestorey")){
                doubleQ.enqueue(temp);
            }
            tempQ.enqueue(temp);
       }
       while (!tempQ.isEmpty()){
           houseQ.enqueue(tempQ.dequeue());
       }// idk

       // d) 
       int count = 1;
       System.out.println("No.\t\tLot Number\t\tNew Price");
       while ( !doubleQ.isEmpty() )
       {
            House temp = (House) houseQ.dequeue();

            System.out.println("["+count+"] "+temp.toString());
            count++;
            tempQ.enqueue(temp);
       }
       while (!tempQ.isEmpty()){
           houseQ.enqueue(tempQ.dequeue());
       }

       count = 1;
       System.out.println("No.\t\tLot Number\t\tNew Price");
       while ( !bunglowQ.isEmpty() )
       {
            House temp = (House) houseQ.dequeue();

            System.out.println("["+count+"] "+temp.toString());
            count++;
            tempQ.enqueue(temp);
       }
       while (!tempQ.isEmpty()){
           houseQ.enqueue(tempQ.dequeue());
       }
    }
}
