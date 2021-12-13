import java.util.Scanner;
/* private String name;
    private int age;
    private char sex;      // M / F
    private char marital;  // maried/single
    private char jobClass; // industrial / information
    private char health;   // 1 = very good, 2 = good
    private double wage;
    */
public class Application
{
    public static void main ( String [] args){
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();
        
        System.out.println("Enter Name: ");
        String name = input.nextLine();
        
        System.out.println("Enter Age: ");
        int age = input.nextInt();
        
        System.out.println("Enter Sex (M/F):");
        char sex = input.next().charAt(0);
        
        System.out.println("Enter Marital Status (M - Married, S - Single):");
        char marital = input.next().charAt(0);
        
        System.out.println("Enter Job Class (A - Industrial, B - Information:");
        char job = input.next().charAt(0);
        
        System.out.println("Enter Health (1 - Very Good, 2 - Good):");
        char health = input.next().charAt(0);
        
        System.out.println("Enter Wage:");
        double wage = input.nextDouble();
        input.nextLine();
        
        employee.setInfo(name, age, sex, marital, job, health, wage);
        System.out.println(employee.display());
    }
}
