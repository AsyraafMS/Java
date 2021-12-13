import java.util.Scanner;
public class Main
{
    public static void main (String [] args){ 
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        int minIndex = 0;
        int maxIndex = 0;
        System.out.println("Enter amount of cities to check:");
        int amt = input.nextInt();
        
        City[] cityinJohor;
        cityinJohor = new City[amt]; 
        
        String name;
        int check = 0;
        double [] monthlyRain = new double [12];
        for (int i = 0; i < cityinJohor.length; i++){
            System.out.println("("+(i+1)+")" + "Enter City Name: ");
            name = input.next();
                
            for (int j = 0; j < monthlyRain.length; j++){
                System.out.println("Month " + (j+1) + ": ");
                monthlyRain[j] = input.nextDouble();
            }
            
            cityinJohor[i] = new City();
            cityinJohor[i].setName(name);
            cityinJohor[i].setMonthlyRain(monthlyRain);
            
        }
        
        for (int k = 1; k <cityinJohor.length; k++){
            if (cityinJohor[k].yearlyRainAverage() < cityinJohor[minIndex].yearlyRainAverage())
                minIndex = k;
            else if (cityinJohor[k].yearlyRainAverage() > cityinJohor[maxIndex].yearlyRainAverage())
                maxIndex = k;
        }
        
        System.out.println(cityinJohor[0]);
        System.out.println(cityinJohor[1]);
        
        System.out.println("\nHighest average of rain for a year: " + cityinJohor[maxIndex]);
        
    }
    
}
