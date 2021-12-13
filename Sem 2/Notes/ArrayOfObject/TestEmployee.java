import java.util.Scanner;

public class TestEmployee
{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    input.useDelimiter("\n");
    /** 
     * declare and create array of object
     * 
     */
    System.out.println("Please enter the number of employee :");
    int size = input.nextInt();
    Employee  data []= new Employee[size];
    /** 
     * Repeating loop needed
     */
    for(int i = 0; i<data.length;i++){
        System.out.println("Enter name");
        String name = input.next();
        System.out.println("Enter grade");
        String grade = input.next();
        //to initilize value at index number
        data[i] = new Employee(name,grade);
    
        System.out.println(data[i].toString());
    }
 }
    
}
