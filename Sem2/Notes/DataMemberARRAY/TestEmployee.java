import java.util.Scanner;

public class TestEmployee
{
    public static void main(String [] args)
    {
        
        Scanner data = new Scanner(System.in);
        data.useDelimiter("\n");
        String name,grade;
        double [] commission = new double [3];
        
        System.out.println("Enter name ");
        name = data.next();
        System.out.println("Enter grade ");
        grade = data.next();
        
        for(int i = 0; i<commission.length; i++){
            System.out.println("Comission month " +(i+1)+" : ");
            commission[i] = data.nextDouble(); 
        }
        
        Employee input = new Employee(name, grade, commission);
        System.out.println(input.toString());
    }
    
}
