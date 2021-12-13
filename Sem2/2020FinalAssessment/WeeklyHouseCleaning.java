public class WeeklyHouseCleaning extends CleaningService{
    //attrivutes
    private char weeklyPackage;
    private String weeklySession;

    //methods
    //normal constructor
    public WeeklyHouseCleaning(String ic, String name, String phone, String zone, char wkPackage, String session){
        super(ic, name, phone, zone);
        this.weeklyPackage = wkPackage;
        this.weeklySession = session;
    }
    public char getWeeklyPakcage(){return weeklyPackage;}
    public String getWeeklySession(){return weeklySession;}
    public String toString(){return "Weekly Package: "+weeklyPackage+"\nWeekly Session: "+weeklySession;}

    public double calcCleaningCharges(){
        double rate = 0;
        if (weeklyPackage == 'A'){
            if (weeklySession.equalsIgnoreCase("One-Time")){
                rate = 200;
            } else if(weeklySession.equalsIgnoreCase("Bi-Weekly")){
                rate = 150;
            } else if(weeklySession.equalsIgnoreCase("Weekly")){
                rate = 100;
            } else {
                System.out.println("Invalid Session.");
            }
        } else if (weeklyPackage == 'B'){
            if (weeklySession.equalsIgnoreCase("One-Time")){
                rate = 120;
            } else if(weeklySession.equalsIgnoreCase("Bi-Weekly")){
                rate = 100;
            } else if(weeklySession.equalsIgnoreCase("Weekly")){
                rate = 80;
            } else {
                System.out.println("Invalid Session.");
            }
        } else {
            System.out.println("Invalid package.");
        }
        return rate;
    }
    

}
