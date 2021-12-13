public class Main {
    public static void main (String [] args)
    {
        Person pList[] = new Person[10];
        double totalFee = 0;

        for (int i = 0; i < pList.length; i++)
        {
            totalFee = ((Citizen) pList[i]).calcFee() + ((NonCitizen) pList[i]).calcFee();
        }
        System.out.println("Total fee collected from Citizen and NonCitizen Objects: " + totalFee);
    }
}
