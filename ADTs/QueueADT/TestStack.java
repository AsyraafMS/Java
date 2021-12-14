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

        while (!personStack.isEmpty()){
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
        while ( !personStack.isEmpty()){
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




    }
}
