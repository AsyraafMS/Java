import java.util.Scanner;

public class TestEmployee
{
    public static void main(String [] args)
    {
        
        Scanner data = new Scanner(System.in);
        data.useDelimiter("\n");
        String name,grade;
        double [] commission = new double [3];
        
        /**
         *1.  Added here
         */
        
        System.out.println("Please enter the number of employee :");
        int size = data.nextInt();
        Employee  data1 []= new Employee[size];
        /** 
         * Repeating loop needed
         */
        for(int i = 0; i<data1.length;i++){
            System.out.println("Enter name ");
            name = data.next();
            System.out.println("Enter grade ");
            grade = data.next();
             /**
              * i change the index variable with k
              */
            for(int k = 0; k<commission.length; k++){
                System.out.println("Comission month " +(k+1)+" : ");
                commission[k] = data.nextDouble(); 
            }
        
        /**    
         * fix here as data1  array
         */
         data1[i] = new Employee(name, grade, commission);
         /**
          * and here
          */
            System.out.println(data1[i].toString());
        }
    }
    
}
