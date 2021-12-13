import java.util.Arrays;
public class Bola
{
    int [] goals = new int [4];
    int [] yellowCard = new int [4];
    String [] playerNames = new String [4];
    int size = yellowCard.length;
    public Bola(int [] g, int [] y, String [] n){
        goals = g;
        yellowCard = y;
        playerNames = n;
    }
    
    public int findHighestGoals(int [] goalScored)
    {
        Arrays.sort(goals);
        int highestGoal = goals[goals.length-1];
        return highestGoal;
    }
    
    public String findNames(int [] yellowCard, String [] playerNames)
    {
        Arrays.sort(yellowCard);
        int highestCard = yellowCard[size-1];
        String foundName = playerNames[size-1];
        return foundName;
    }
}
