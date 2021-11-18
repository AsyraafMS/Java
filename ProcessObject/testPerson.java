import java.util.Scanner;
public class testPerson{
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        // create object of linked list

        LinkedList personLL = new LinkedList();

        for(int i = 0; i<5; i++){
            System.out.print("Enter name: ");
            String name = in.next();

            System.out.print("Age: ");
            int age = in.nextInt();

            System.out.print("Gender (F/M): ");
            char gender = in.next().charAt(0);

            Person obj = new Person(name, age, gender);
            personLL.insertAtFront(obj);
            }
            
            //calculate and display average of all persons in the list
            System.out.println("\n--- AVERAGE ---");
            Person num = personLL.getFirst();
            int sumAge = 0;
            int size = personLL.size();
            double avg = 0;

            while ( num != null){
                sumAge += num.getAge();
                num = personLL.getNext();
            }
            
            avg = sumAge/size;
            System.out.println("PersonLL Average: " + avg);
            System.out.println("-------------------------");

            
            //count and display all female persons
            System.out.println("\n--- DISPLAY ALL F ---");
            num = personLL.getFirst();
            int count = 0;

            while (num != null){
                if (num.getGender() == 'F'){
                    System.out.println("["+(count+1)+"] "+num.toString());
                    count++;
                }
                num = personLL.getNext();
            } 
            System.out.println("Total Count: "+ (count));

    }
}