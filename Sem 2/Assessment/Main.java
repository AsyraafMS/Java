import java.util.Scanner;

public class Main
{
      public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        
        int [] goals = new int [4];
        int [] yellowCard = new int [4];
        String [] names = new String [4];
        
        for (int i = 0; i < 4; i++)
        {
            System.out.println("Enter player name: ");
            names[i] = input.next();
            System.out.println("Enter goals scored: ");
            goals[i] = input.nextInt();
            System.out.println("Enter yellow cards issued: ");
            yellowCard[i] = input.nextInt();
        }
        
        Bola league = new Bola(goals, yellowCard, names);
        System.out.println("The player with the highest goals: \n" + league.findHighestGoals(goals));
        System.out.println("The player to be banned in the next 3 match: \n" + league.findNames(yellowCard, names));
        
    }
}
