import java.util.Scanner;
public class ForInput{
    public static void main(String [] args){
        //Using scanner
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        
        String name;
        System.out.println("Please insert your name");
        name = input.next();
        System.out.println("Hello " + name);
        
        double weight;
        System.out.println("Please insert your weight.");
        weight = input.nextDouble();
    }
}