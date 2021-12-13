import java.util.*;
public class Main {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        //input.useDelimiter("\n");  risaj

        LongJump athleteJump[] = new LongJump[10];

        for (int i = 0; i < athleteJump.length; i++){

            System.out.println("("+(i+1)+")"+" Enter athlete ID: ");
            String id = input.nextLine();

            System.out.println("("+(i+1)+")"+" Enter athlete name: ");
            String name = input.nextLine();

            System.out.println("("+(i+1)+")"+" Enter Team Code: ");
            String teamCode = input.nextLine();

            System.out.println("("+(i+1)+")"+" Enter Jump 1: ");
            double[] distance = new double[2];
            distance[0] = input.nextDouble();

            System.out.println("("+(i+1)+")"+" Enter Jump 2: ");
            distance[1] = input.nextDouble();
            
            //System.out.println(id + name + teamCode + Arrays.toString(distance));

            athleteJump[i] = new LongJump(id, name, teamCode, distance);
        }
        
        for (int j = 0; j < athleteJump.length; j++){
            System.out.println("("+(j+1)+")"+athleteJump[j].toString());
        }
    input.close();
    }
}
