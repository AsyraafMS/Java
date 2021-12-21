import java.util.Stack;
import java.util.ArrayList;
import java.util.Scanner;
public class Q2 {
    public static void main (String [] args){
        Stack toyStack = new Stack();

        // TODO: a) Create educationStack and entertainmentStack and store respectively from toyStack
        
        Stack educationStack = new Stack();
        Stack entertainmentStack = new Stack();

        while (!toyStack.isEmpty()){
            Toys temp = toyStack.pop(); // no need to cast

            if ( temp.getToyType().equalsIgnoreCase("entertainment") ){
                entertainmentStack.push(temp);
            } else if ( temp.getToyType().equalsIgnoreCase("educational") ){
                educationStack.push(temp);
            }
        }

        // TODO: b) count toys in each category in educationStack, display the preferred toy category (highest num)

        Stack moving = new Stack();
        int infant = 0, toddler = 0, preschool = 0;

        while (!educationStack.isEmpty()){
            Toys temp = educationStack.pop();

            if (temp.getCategory().equalsIgnoreCase("infant")){
                infant++;
            } else if (temp.getCategory().equalsIgnoreCase("toddler")){
                toddler++;
            } else if (temp.getCategory().equalsIgnoreCase("preschool")){
                preschool++;
            }

            moving.push(temp);
        }
        while (!moving.isEmpty()){
            educationStack.push(moving.pop());
        }

        if (infant > toddler && infant > preschool){
            System.out.println("Preferred toy category: Infant with " + infant + " count." );
        } else if ( toddler > infant && toddler > preschool){
            System.out.println("Preferred toy category: Toddler with " + toddler + " count." );
        } else if ( preschool > infant && preschool < toddler)
        System.out.println("Preferred toy category: Preschool with " + preschool + " count." );

        // #2 jalan sesad
        Stack counts = new Stack();
        counts.push(infant);    // 3
        counts.push(toddler);   // 2
        counts.push(preschool); // 1

        int max = 0;
        int index = 0;
        while (!counts.isEmpty()){
            int temp = (int) counts.pop();
            if(temp > max){
                max = temp;
                index++;
            }
        }

        if (index == 1){
            System.out.println("Preferred toy category: Preschool with " + max + " count." );
        } else if (index == 2){
            System.out.println("Preferred toy category: Toddler with " + max + " count." );
        } else if (index == 3){
            System.out.println("Preferred toy category: Infant with " + max + " count." );
        }

        // TODO: c) Search and display toy info in entertainmentStack, toyname starts with letter entered by user
        Scanner in = new Scanner(System.in);

        System.out.println("Enter letter to search");
        String findThis = in.next();

        in.close();
        
        int count = 0;
        while (!entertainmentStack.isEmpty()){
            Toys temp = entertainmentStack.pop();

            if (temp.getToyName().equalsIgnoreCase(findThis)){
                System.out.println("Toy Information: "+ (count+1) + temp.toString());
            }
            count++;
            moving.push(temp);  
        }
        while (!moving.isEmpty()){
            entertainmentStack.push(moving.pop());
        }

        
    
    
    }
}
