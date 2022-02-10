
import java.util.Scanner;

public class testPersonQ
{
   public static void main (String [] args)
   {
       Scanner in = new Scanner(System.in);

       Queue persons = new Queue();

       for (int i = 0; i < 2; i++) // sample size 5
       {
           System.out.print("Name : ");
           String name = in.next();

           System.out.print("Age : ");
           int age = in.nextInt();

           System.out.print("Gender [M/F]: ");
           char gender = in.next().charAt(0);

           Person orang = new Person(name, age, gender);
           persons.enqueue(orang);
       }
       in.close();

       System.out.println("======================================================================");
       int femaleCount = 0;
       // make temp queue
       Queue tempQ = new Queue();
       // count all Female persons
       while ( persons.isEmpty() == false ) // !persons.isEmpty()
       {
            Person temp = (Person) persons.dequeue();

            if ( temp.getGender() == ('F') ){ 
               femaleCount++; 
            }
            tempQ.enqueue(temp); //insert removed element in temp queue to reinsert into the base queue
       }

       while (!tempQ.isEmpty()){
           persons.enqueue(tempQ.dequeue());
       }

       System.out.println("No. of female : " + femaleCount);
       System.out.println("======================================================================");


       
       // Display detail of all persons age above 60

       int ageCount = 0; // output count
       //temp queuue
       //Queue tempQ2 = new Queue();
       while (!persons.isEmpty()){
           Person temp = (Person) persons.dequeue(); //removing front

           if (temp.getAge() > 60){
               ageCount++;
               System.out.println("["+ageCount+"] "+temp.toString());
           }
           tempQ.enqueue(temp); //temp queue for reinserting
       }
       while (!tempQ.isEmpty()){
           persons.enqueue(tempQ.dequeue()); //reinserting
       }
       System.out.println("======================================================================");
       //create two queues that would copy all person with name starts with letter A and other letters in another queue
       Queue queueA = new Queue();
       Queue queueBZ = new Queue();
 
       while (!persons.isEmpty())
       {
           Person temp = (Person) persons.dequeue(); // removing front

           if (temp.getName().startsWith("A")){
                queueA.enqueue(temp);
            } else {
               queueBZ.enqueue(temp);
           }
           tempQ.enqueue(temp); // to reinsert
       }

       while(!tempQ.isEmpty())
       {
           persons.enqueue(tempQ.dequeue()); // reinserting
       }
   }
}
